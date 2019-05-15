package com.laboManager.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class TbApply {
    private Integer id;

    private String applicant;

    private Date applyDate;

    private String applyEName;

    private String applyEAmount;

    private String applyEFactory;

    private String applyEType;

    private BigDecimal price;

    private String reason;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant == null ? null : applicant.trim();
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplyEName() {
        return applyEName;
    }

    public void setApplyEName(String applyEName) {
        this.applyEName = applyEName == null ? null : applyEName.trim();
    }

    public String getApplyEAmount() {
        return applyEAmount;
    }

    public void setApplyEAmount(String applyEAmount) {
        this.applyEAmount = applyEAmount == null ? null : applyEAmount.trim();
    }

    public String getApplyEFactory() {
        return applyEFactory;
    }

    public void setApplyEFactory(String applyEFactory) {
        this.applyEFactory = applyEFactory == null ? null : applyEFactory.trim();
    }

    public String getApplyEType() {
        return applyEType;
    }

    public void setApplyEType(String applyEType) {
        this.applyEType = applyEType == null ? null : applyEType.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}