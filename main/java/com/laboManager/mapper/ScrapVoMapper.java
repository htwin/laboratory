package com.laboManager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.laboManager.entity.ScrapVo;

public interface ScrapVoMapper {
	/**
	 * 查询报废列表
	 * @param 
	 * @return
	 */
	public List<ScrapVo> findScrapList(@Param("scrapVo")ScrapVo scrapVo);
}
