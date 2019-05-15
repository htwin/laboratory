package com.laboManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.laboManager.entity.PageResult;
import com.laboManager.entity.Result;
import com.laboManager.entity.ScrapVo;
import com.laboManager.service.ScrapService;

@Controller
@RequestMapping("/scrap")
public class ScrapController {
	
	@Autowired
	private ScrapService scrapService;
	
	@RequestMapping("/search")
	@ResponseBody
	public PageResult search(int pages,int rows,@RequestBody ScrapVo scrapVo) {
		return scrapService.search(pages, rows, scrapVo);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public Result delete(int ids[],int[] equipmentIds) {
		try {
			scrapService.delete(ids,equipmentIds);
			return new Result(true, "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(true, "删除失败");
		}
	}
	
}
