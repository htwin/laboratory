package com.laboManager.service;


import com.laboManager.entity.PageResult;
import com.laboManager.entity.RepairVo;
import com.laboManager.pojo.TbRepair;
import com.laboManager.pojo.TbScrap;

public interface RepairService {
	/**
	 * 查询报修的设备
	 * @param pages
	 * @param rows
	 * @param repair
	 * @return
	 */
	public PageResult search(int pages,int rows,RepairVo repair);
	
	/**
	 * 报废
	 * @param scrap
	 */
	public void scrap(TbScrap scrap);
	
	/**
	 * 修理成功处理
	 */
	
	public void repairSuccess(TbRepair repair);
}
