package com.laboManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.laboManager.entity.PageResult;
import com.laboManager.entity.RepairVo;
import com.laboManager.entity.Result;
import com.laboManager.pojo.TbRepair;
import com.laboManager.pojo.TbScrap;
import com.laboManager.service.RepairService;

@Controller
@RequestMapping("/repair")
public class RepairController {
	
	@Autowired
	private RepairService repairService;
	
	@RequestMapping("/search")
	@ResponseBody
	public PageResult search(int pages,int rows,@RequestBody RepairVo repairVo) {
		return repairService.search(pages, rows, repairVo);
	}
	
	@RequestMapping("/scrap")
	@ResponseBody
	public Result scrap(@RequestBody TbScrap scrap) {
		try {
			repairService.scrap(scrap);
			return new Result(true,"操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false,"操作失败");
		}
	}
	@RequestMapping("/repairSuccess")
	@ResponseBody
	public Result repairSuccess(@RequestBody TbRepair repair) {
		try {
			repairService.repairSuccess(repair);
			return new Result(true,"操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false,"操作失败");
		}
	}
}
