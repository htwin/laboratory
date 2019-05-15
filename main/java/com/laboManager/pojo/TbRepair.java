package com.laboManager.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class TbRepair {
    private Integer id;

    private String repairName;

    private Date repairDate;

    private BigDecimal repairPrice;

    private String repairFactory;

    private Integer equipmentId;

    private Date createdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRepairName() {
        return repairName;
    }

    public void setRepairName(String repairName) {
        this.repairName = repairName == null ? null : repairName.trim();
    }

    public Date getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(Date repairDate) {
        this.repairDate = repairDate;
    }

    public BigDecimal getRepairPrice() {
        return repairPrice;
    }

    public void setRepairPrice(BigDecimal repairPrice) {
        this.repairPrice = repairPrice;
    }

    public String getRepairFactory() {
        return repairFactory;
    }

    public void setRepairFactory(String repairFactory) {
        this.repairFactory = repairFactory == null ? null : repairFactory.trim();
    }

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}