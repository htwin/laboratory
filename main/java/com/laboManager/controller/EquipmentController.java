package com.laboManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.laboManager.entity.PageResult;
import com.laboManager.entity.Result;
import com.laboManager.pojo.TbEquipment;
import com.laboManager.pojo.TbRepair;
import com.laboManager.pojo.TbScrap;
import com.laboManager.service.EquipmentService;

@Controller
@RequestMapping("/equipment")
public class EquipmentController {

	@Autowired
	private EquipmentService equipmentService;
	
	@RequestMapping("/search")
	@ResponseBody
	public PageResult search(int pages,int rows,@RequestBody TbEquipment equipment) {
		return equipmentService.search(pages, rows, equipment);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public Result add(@RequestBody TbEquipment equipment) {
		try {
			//0 完好  1 报修 2报废
			equipment.setStatus(0);
			equipmentService.add(equipment);
			return new Result(true,"添加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false,"添加失败");
		}
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public Result update(@RequestBody TbEquipment equipment) {
		try {
			//0 完好  1 报修 2报废
			equipment.setStatus(0);
			equipmentService.update(equipment);
			return new Result(true,"修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false,"修改失败");
		}
	}
	
	@RequestMapping("/findEquipmentById")
	@ResponseBody 
	public TbEquipment findEquipmentById(int id) {
		return equipmentService.findEquipmentById(id);
	}
	
	@RequestMapping("/repair")
	@ResponseBody
	public Result repair(@RequestBody TbRepair tbrepair) {
		try {
			equipmentService.repair(tbrepair);
			return new Result(true,"操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false,"操作失败");
		}
	}
	
	@RequestMapping("/scrap")
	@ResponseBody
	public Result scrap(@RequestBody TbScrap scrap) {
		try {
			equipmentService.scrap(scrap);
			return new Result(true,"操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false,"操作失败");
		}
	}
	
}
