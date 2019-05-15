package com.laboManager.service;


import com.laboManager.entity.PageResult;
import com.laboManager.entity.RepairVo;
import com.laboManager.entity.ScrapVo;
import com.laboManager.pojo.TbRepair;
import com.laboManager.pojo.TbScrap;

public interface ScrapService {
	/**
	 * 查询报废的设备
	 * @param pages
	 * @param rows
	 * @param repair
	 * @return
	 */
	public PageResult search(int pages,int rows,ScrapVo scrapVo);

	
	/**
	 * 删除设备
	 */
	
	public void delete(int ids[],int[] equipmentIds);
}
