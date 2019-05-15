package com.laboManager.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.laboManager.entity.PageResult;
import com.laboManager.entity.Result;
import com.laboManager.mapper.TbEquipmentMapper;
import com.laboManager.mapper.TbRepairMapper;
import com.laboManager.mapper.TbScrapMapper;
import com.laboManager.pojo.TbEquipment;
import com.laboManager.pojo.TbEquipmentExample;
import com.laboManager.pojo.TbEquipmentExample.Criteria;
import com.laboManager.pojo.TbRepair;
import com.laboManager.pojo.TbScrap;
import com.laboManager.service.EquipmentService;

@Service
public class EquipmentServiceImpl implements EquipmentService {

	@Autowired
	private TbEquipmentMapper equipmentMapper;
	
	@Autowired
	private TbRepairMapper repairMapper;
	
	@Autowired
	private TbScrapMapper scrapMapper;
	
	public PageResult search(int pages, int rows, TbEquipment equipment) {
		PageHelper.startPage(pages, rows);
		PageHelper.orderBy("createDate desc"); 
		TbEquipmentExample example = new TbEquipmentExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(0);
		if(equipment!=null) {
			if(!StringUtils.isEmpty(equipment.getName())) {
				criteria.andNameLike("%"+equipment.getName()+"%");
			}
		}
		List<TbEquipment> equipmentList = equipmentMapper.selectByExample(example);
		//封装返回值
		PageInfo<TbEquipment> pageInfo = new PageInfo<TbEquipment>(equipmentList);
		PageResult result = new PageResult();
		result.setCurrentPage(pages);
		result.setPageNum(pageInfo.getPages());
		result.setList(equipmentList);
		result.setTotal((int)pageInfo.getTotal());
		return result;
	} 

	public void add(TbEquipment equipment) {
		equipmentMapper.insert(equipment);
	}

	public TbEquipment findEquipmentById(int id) {
		return equipmentMapper.selectByPrimaryKey(id);
	}

	public void update(TbEquipment equipment) {
		equipmentMapper.updateByPrimaryKey(equipment);
	}

	public void repair(TbRepair repair) {
		TbEquipment e = new TbEquipment();
		e.setStatus(1);
		e.setId(repair.getEquipmentId());
		equipmentMapper.updateByPrimaryKeySelective(e);//修改设备状态为1：报修状态
		repair.setCreatedate(new Date());//报修时间
	    repairMapper.insert(repair);
	}

	public void scrap(TbScrap scrap) {
		TbEquipment e = new TbEquipment();
		e.setStatus(2);
		e.setId(scrap.getEquipmentId());
		equipmentMapper.updateByPrimaryKeySelective(e);//修改设备状态为2：报废状态
		scrap.setScrapDate(new Date());//报废时间
		scrapMapper.insert(scrap);//插入报修记录
	}

}
