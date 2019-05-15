package com.laboManager.entity;

import com.laboManager.pojo.TbScrap;

/**
 * 页面展示实体
 * @author 22850
 *
 */
public class ScrapVo extends TbScrap {

	private String equipmentName;//报废设备名字
	
	private String equipmentType;//报废设备型号

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}

}
