package com.laboManager.service;

import com.laboManager.entity.PageResult;
import com.laboManager.entity.Result;
import com.laboManager.pojo.TbEquipment;
import com.laboManager.pojo.TbRepair;
import com.laboManager.pojo.TbScrap;

public interface EquipmentService {
	
	/**
	 * 查询设备列表
	 * @param pages
	 * @param rows
	 * @param equipment
	 * @return
	 */
	public PageResult search(int pages,int rows,TbEquipment equipment);

	/**
	 * 添加设备
	 * @param equipment
	 */
	public void add(TbEquipment equipment);
	
	/**
	 * 根据id查设备
	 * @param id
	 * @return
	 */
	public TbEquipment findEquipmentById(int id);
	
	/**
	 * 修改
	 * @param equipment
	 */
	public void update(TbEquipment equipment);
	
	/**
	 * 维修,报修设备
	 */
	public void repair(TbRepair repair);

	/**
	 * 报废
	 * @param scrap
	 */
	public void scrap(TbScrap scrap);
}
