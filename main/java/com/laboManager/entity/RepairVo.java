package com.laboManager.entity;

import com.laboManager.pojo.TbRepair;

public class RepairVo extends TbRepair {
	
	private String equipmentName;//报修设备名字
	
	private String equipmentType;//报修设备型号

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
