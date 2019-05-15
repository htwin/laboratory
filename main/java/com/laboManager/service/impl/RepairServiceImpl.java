package com.laboManager.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.laboManager.entity.PageResult;
import com.laboManager.entity.RepairVo;
import com.laboManager.mapper.RepairVoMapper;
import com.laboManager.mapper.TbEquipmentMapper;
import com.laboManager.mapper.TbRepairMapper;
import com.laboManager.mapper.TbScrapMapper;
import com.laboManager.pojo.TbEquipment;
import com.laboManager.pojo.TbRepair;
import com.laboManager.pojo.TbRepairExample;
import com.laboManager.pojo.TbRepairExample.Criteria;
import com.laboManager.pojo.TbScrap;
import com.laboManager.service.RepairService;

@Service
public class RepairServiceImpl implements RepairService {

	@Autowired
	private TbEquipmentMapper equipmentMapper;
	
	@Autowired
	private RepairVoMapper repairVoMapper;
	
	@Autowired
	private TbScrapMapper scrapMapper;
	
	@Autowired
	private TbRepairMapper repairMapper;
	
	public PageResult search(int pages, int rows, RepairVo repairVo) {
		//分页
		PageHelper.startPage(pages, rows);
		PageHelper.orderBy("createDate desc");
		List<RepairVo> list = repairVoMapper.findRepairList(repairVo);
		PageInfo<RepairVo> pageInfo = new PageInfo<RepairVo>(list);
		
		PageResult result = new PageResult();
		result.setCurrentPage(pages);
		result.setPageNum(pageInfo.getPages());
		result.setTotal((int)pageInfo.getTotal());
		result.setList(list);
		
		
		return result;
	}
	
	public void scrap(TbScrap scrap) {
		TbEquipment e = new TbEquipment();
		e.setStatus(2);
		e.setId(scrap.getEquipmentId());
		equipmentMapper.updateByPrimaryKeySelective(e);//修改设备状态为2：报废状态
		TbRepairExample example = new TbRepairExample();
		Criteria criteria = example.createCriteria();
		criteria.andEquipmentIdEqualTo(scrap.getEquipmentId());
		//删除报修列表该设备
		repairMapper.deleteByExample(example);
		scrap.setScrapDate(new Date());//报废时间
		scrapMapper.insert(scrap);//插入报废记录
	}

	public void repairSuccess(TbRepair repair) {
		//将设备状态改为完好状态    0完好   1修理状态    2报废状态
		TbEquipment e = new TbEquipment();
		e.setId(repair.getEquipmentId());
		e.setStatus(0);
		equipmentMapper.updateByPrimaryKeySelective(e);
		
		//修改修理表
		repairMapper.updateByPrimaryKeySelective(repair);
	}

}
