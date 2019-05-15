package com.laboManager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.laboManager.entity.PageResult;
import com.laboManager.entity.ScrapVo;
import com.laboManager.mapper.ScrapVoMapper;
import com.laboManager.mapper.TbEquipmentMapper;
import com.laboManager.mapper.TbScrapMapper;
import com.laboManager.service.ScrapService;

@Service
public class ScrapServiceImpl implements ScrapService {

	@Autowired
	private ScrapVoMapper scrapVoMapper;
	
	@Autowired
	private TbScrapMapper scrapMapper;
	
	@Autowired
	private TbEquipmentMapper equipmentMapper;
	
	public PageResult search(int pages, int rows, ScrapVo scrapVo) {
		PageHelper.startPage(pages,rows);
		PageHelper.orderBy("createDate desc");
		
		List<ScrapVo> list = scrapVoMapper.findScrapList(scrapVo);
		
		PageInfo<ScrapVo> pageInfo = new PageInfo<ScrapVo>(list);
		
		PageResult result = new PageResult();
		result.setCurrentPage(pages);
		result.setPageNum(pageInfo.getPages());
		result.setTotal((int)pageInfo.getTotal());
		result.setList(list);
		
		return result;
	}


	public void delete(int[] ids,int[] equipmentIds) {
		//删除报废列表
		for(int id :ids) {
			scrapMapper.deleteByPrimaryKey(id);
		}
		//删除相应的设备
		for(int id:equipmentIds) {
			equipmentMapper.deleteByPrimaryKey(id);
		}
	}

}
