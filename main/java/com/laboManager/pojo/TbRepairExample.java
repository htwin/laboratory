package com.laboManager.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbRepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbRepairExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRepairNameIsNull() {
            addCriterion("repair_name is null");
            return (Criteria) this;
        }

        public Criteria andRepairNameIsNotNull() {
            addCriterion("repair_name is not null");
            return (Criteria) this;
        }

        public Criteria andRepairNameEqualTo(String value) {
            addCriterion("repair_name =", value, "repairName");
            return (Criteria) this;
        }

        public Criteria andRepairNameNotEqualTo(String value) {
            addCriterion("repair_name <>", value, "repairName");
            return (Criteria) this;
        }

        public Criteria andRepairNameGreaterThan(String value) {
            addCriterion("repair_name >", value, "repairName");
            return (Criteria) this;
        }

        public Criteria andRepairNameGreaterThanOrEqualTo(String value) {
            addCriterion("repair_name >=", value, "repairName");
            return (Criteria) this;
        }

        public Criteria andRepairNameLessThan(String value) {
            addCriterion("repair_name <", value, "repairName");
            return (Criteria) this;
        }

        public Criteria andRepairNameLessThanOrEqualTo(String value) {
            addCriterion("repair_name <=", value, "repairName");
            return (Criteria) this;
        }

        public Criteria andRepairNameLike(String value) {
            addCriterion("repair_name like", value, "repairName");
            return (Criteria) this;
        }

        public Criteria andRepairNameNotLike(String value) {
            addCriterion("repair_name not like", value, "repairName");
            return (Criteria) this;
        }

        public Criteria andRepairNameIn(List<String> values) {
            addCriterion("repair_name in", values, "repairName");
            return (Criteria) this;
        }

        public Criteria andRepairNameNotIn(List<String> values) {
            addCriterion("repair_name not in", values, "repairName");
            return (Criteria) this;
        }

        public Criteria andRepairNameBetween(String value1, String value2) {
            addCriterion("repair_name between", value1, value2, "repairName");
            return (Criteria) this;
        }

        public Criteria andRepairNameNotBetween(String value1, String value2) {
            addCriterion("repair_name not between", value1, value2, "repairName");
            return (Criteria) this;
        }

        public Criteria andRepairDateIsNull() {
            addCriterion("repair_date is null");
            return (Criteria) this;
        }

        public Criteria andRepairDateIsNotNull() {
            addCriterion("repair_date is not null");
            return (Criteria) this;
        }

        public Criteria andRepairDateEqualTo(Date value) {
            addCriterion("repair_date =", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateNotEqualTo(Date value) {
            addCriterion("repair_date <>", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateGreaterThan(Date value) {
            addCriterion("repair_date >", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateGreaterThanOrEqualTo(Date value) {
            addCriterion("repair_date >=", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateLessThan(Date value) {
            addCriterion("repair_date <", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateLessThanOrEqualTo(Date value) {
            addCriterion("repair_date <=", value, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateIn(List<Date> values) {
            addCriterion("repair_date in", values, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateNotIn(List<Date> values) {
            addCriterion("repair_date not in", values, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateBetween(Date value1, Date value2) {
            addCriterion("repair_date between", value1, value2, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairDateNotBetween(Date value1, Date value2) {
            addCriterion("repair_date not between", value1, value2, "repairDate");
            return (Criteria) this;
        }

        public Criteria andRepairPriceIsNull() {
            addCriterion("repair_price is null");
            return (Criteria) this;
        }

        public Criteria andRepairPriceIsNotNull() {
            addCriterion("repair_price is not null");
            return (Criteria) this;
        }

        public Criteria andRepairPriceEqualTo(BigDecimal value) {
            addCriterion("repair_price =", value, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andRepairPriceNotEqualTo(BigDecimal value) {
            addCriterion("repair_price <>", value, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andRepairPriceGreaterThan(BigDecimal value) {
            addCriterion("repair_price >", value, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andRepairPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_price >=", value, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andRepairPriceLessThan(BigDecimal value) {
            addCriterion("repair_price <", value, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andRepairPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_price <=", value, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andRepairPriceIn(List<BigDecimal> values) {
            addCriterion("repair_price in", values, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andRepairPriceNotIn(List<BigDecimal> values) {
            addCriterion("repair_price not in", values, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andRepairPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_price between", value1, value2, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andRepairPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_price not between", value1, value2, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andRepairFactoryIsNull() {
            addCriterion("repair_factory is null");
            return (Criteria) this;
        }

        public Criteria andRepairFactoryIsNotNull() {
            addCriterion("repair_factory is not null");
            return (Criteria) this;
        }

        public Criteria andRepairFactoryEqualTo(String value) {
            addCriterion("repair_factory =", value, "repairFactory");
            return (Criteria) this;
        }

        public Criteria andRepairFactoryNotEqualTo(String value) {
            addCriterion("repair_factory <>", value, "repairFactory");
            return (Criteria) this;
        }

        public Criteria andRepairFactoryGreaterThan(String value) {
            addCriterion("repair_factory >", value, "repairFactory");
            return (Criteria) this;
        }

        public Criteria andRepairFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("repair_factory >=", value, "repairFactory");
            return (Criteria) this;
        }

        public Criteria andRepairFactoryLessThan(String value) {
            addCriterion("repair_factory <", value, "repairFactory");
            return (Criteria) this;
        }

        public Criteria andRepairFactoryLessThanOrEqualTo(String value) {
            addCriterion("repair_factory <=", value, "repairFactory");
            return (Criteria) this;
        }

        public Criteria andRepairFactoryLike(String value) {
            addCriterion("repair_factory like", value, "repairFactory");
            return (Criteria) this;
        }

        public Criteria andRepairFactoryNotLike(String value) {
            addCriterion("repair_factory not like", value, "repairFactory");
            return (Criteria) this;
        }

        public Criteria andRepairFactoryIn(List<String> values) {
            addCriterion("repair_factory in", values, "repairFactory");
            return (Criteria) this;
        }

        public Criteria andRepairFactoryNotIn(List<String> values) {
            addCriterion("repair_factory not in", values, "repairFactory");
            return (Criteria) this;
        }

        public Criteria andRepairFactoryBetween(String value1, String value2) {
            addCriterion("repair_factory between", value1, value2, "repairFactory");
            return (Criteria) this;
        }

        public Criteria andRepairFactoryNotBetween(String value1, String value2) {
            addCriterion("repair_factory not between", value1, value2, "repairFactory");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNull() {
            addCriterion("equipment_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNotNull() {
            addCriterion("equipment_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdEqualTo(Integer value) {
            addCriterion("equipment_id =", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotEqualTo(Integer value) {
            addCriterion("equipment_id <>", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThan(Integer value) {
            addCriterion("equipment_id >", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipment_id >=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThan(Integer value) {
            addCriterion("equipment_id <", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("equipment_id <=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIn(List<Integer> values) {
            addCriterion("equipment_id in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotIn(List<Integer> values) {
            addCriterion("equipment_id not in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdBetween(Integer value1, Integer value2) {
            addCriterion("equipment_id between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("equipment_id not between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}