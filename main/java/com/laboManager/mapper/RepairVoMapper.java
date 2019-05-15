package com.laboManager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.laboManager.entity.RepairVo;

public interface RepairVoMapper {
	/**
	 * 查询报修列表
	 * @param repairVo
	 * @return
	 */
	public List<RepairVo> findRepairList(@Param("repairVo") RepairVo repairVo);
}
