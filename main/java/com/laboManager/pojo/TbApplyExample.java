package com.laboManager.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbApplyExample() {
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

        public Criteria andApplicantIsNull() {
            addCriterion("applicant is null");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNotNull() {
            addCriterion("applicant is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantEqualTo(String value) {
            addCriterion("applicant =", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotEqualTo(String value) {
            addCriterion("applicant <>", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThan(String value) {
            addCriterion("applicant >", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThanOrEqualTo(String value) {
            addCriterion("applicant >=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThan(String value) {
            addCriterion("applicant <", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThanOrEqualTo(String value) {
            addCriterion("applicant <=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLike(String value) {
            addCriterion("applicant like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotLike(String value) {
            addCriterion("applicant not like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantIn(List<String> values) {
            addCriterion("applicant in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotIn(List<String> values) {
            addCriterion("applicant not in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantBetween(String value1, String value2) {
            addCriterion("applicant between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotBetween(String value1, String value2) {
            addCriterion("applicant not between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("apply_date is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("apply_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(Date value) {
            addCriterion("apply_date =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(Date value) {
            addCriterion("apply_date <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(Date value) {
            addCriterion("apply_date >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_date >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(Date value) {
            addCriterion("apply_date <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(Date value) {
            addCriterion("apply_date <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<Date> values) {
            addCriterion("apply_date in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<Date> values) {
            addCriterion("apply_date not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(Date value1, Date value2) {
            addCriterion("apply_date between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(Date value1, Date value2) {
            addCriterion("apply_date not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyENameIsNull() {
            addCriterion("apply_e_name is null");
            return (Criteria) this;
        }

        public Criteria andApplyENameIsNotNull() {
            addCriterion("apply_e_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplyENameEqualTo(String value) {
            addCriterion("apply_e_name =", value, "applyEName");
            return (Criteria) this;
        }

        public Criteria andApplyENameNotEqualTo(String value) {
            addCriterion("apply_e_name <>", value, "applyEName");
            return (Criteria) this;
        }

        public Criteria andApplyENameGreaterThan(String value) {
            addCriterion("apply_e_name >", value, "applyEName");
            return (Criteria) this;
        }

        public Criteria andApplyENameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_e_name >=", value, "applyEName");
            return (Criteria) this;
        }

        public Criteria andApplyENameLessThan(String value) {
            addCriterion("apply_e_name <", value, "applyEName");
            return (Criteria) this;
        }

        public Criteria andApplyENameLessThanOrEqualTo(String value) {
            addCriterion("apply_e_name <=", value, "applyEName");
            return (Criteria) this;
        }

        public Criteria andApplyENameLike(String value) {
            addCriterion("apply_e_name like", value, "applyEName");
            return (Criteria) this;
        }

        public Criteria andApplyENameNotLike(String value) {
            addCriterion("apply_e_name not like", value, "applyEName");
            return (Criteria) this;
        }

        public Criteria andApplyENameIn(List<String> values) {
            addCriterion("apply_e_name in", values, "applyEName");
            return (Criteria) this;
        }

        public Criteria andApplyENameNotIn(List<String> values) {
            addCriterion("apply_e_name not in", values, "applyEName");
            return (Criteria) this;
        }

        public Criteria andApplyENameBetween(String value1, String value2) {
            addCriterion("apply_e_name between", value1, value2, "applyEName");
            return (Criteria) this;
        }

        public Criteria andApplyENameNotBetween(String value1, String value2) {
            addCriterion("apply_e_name not between", value1, value2, "applyEName");
            return (Criteria) this;
        }

        public Criteria andApplyEAmountIsNull() {
            addCriterion("apply_e_amount is null");
            return (Criteria) this;
        }

        public Criteria andApplyEAmountIsNotNull() {
            addCriterion("apply_e_amount is not null");
            return (Criteria) this;
        }

        public Criteria andApplyEAmountEqualTo(String value) {
            addCriterion("apply_e_amount =", value, "applyEAmount");
            return (Criteria) this;
        }

        public Criteria andApplyEAmountNotEqualTo(String value) {
            addCriterion("apply_e_amount <>", value, "applyEAmount");
            return (Criteria) this;
        }

        public Criteria andApplyEAmountGreaterThan(String value) {
            addCriterion("apply_e_amount >", value, "applyEAmount");
            return (Criteria) this;
        }

        public Criteria andApplyEAmountGreaterThanOrEqualTo(String value) {
            addCriterion("apply_e_amount >=", value, "applyEAmount");
            return (Criteria) this;
        }

        public Criteria andApplyEAmountLessThan(String value) {
            addCriterion("apply_e_amount <", value, "applyEAmount");
            return (Criteria) this;
        }

        public Criteria andApplyEAmountLessThanOrEqualTo(String value) {
            addCriterion("apply_e_amount <=", value, "applyEAmount");
            return (Criteria) this;
        }

        public Criteria andApplyEAmountLike(String value) {
            addCriterion("apply_e_amount like", value, "applyEAmount");
            return (Criteria) this;
        }

        public Criteria andApplyEAmountNotLike(String value) {
            addCriterion("apply_e_amount not like", value, "applyEAmount");
            return (Criteria) this;
        }

        public Criteria andApplyEAmountIn(List<String> values) {
            addCriterion("apply_e_amount in", values, "applyEAmount");
            return (Criteria) this;
        }

        public Criteria andApplyEAmountNotIn(List<String> values) {
            addCriterion("apply_e_amount not in", values, "applyEAmount");
            return (Criteria) this;
        }

        public Criteria andApplyEAmountBetween(String value1, String value2) {
            addCriterion("apply_e_amount between", value1, value2, "applyEAmount");
            return (Criteria) this;
        }

        public Criteria andApplyEAmountNotBetween(String value1, String value2) {
            addCriterion("apply_e_amount not between", value1, value2, "applyEAmount");
            return (Criteria) this;
        }

        public Criteria andApplyEFactoryIsNull() {
            addCriterion("apply_e_factory is null");
            return (Criteria) this;
        }

        public Criteria andApplyEFactoryIsNotNull() {
            addCriterion("apply_e_factory is not null");
            return (Criteria) this;
        }

        public Criteria andApplyEFactoryEqualTo(String value) {
            addCriterion("apply_e_factory =", value, "applyEFactory");
            return (Criteria) this;
        }

        public Criteria andApplyEFactoryNotEqualTo(String value) {
            addCriterion("apply_e_factory <>", value, "applyEFactory");
            return (Criteria) this;
        }

        public Criteria andApplyEFactoryGreaterThan(String value) {
            addCriterion("apply_e_factory >", value, "applyEFactory");
            return (Criteria) this;
        }

        public Criteria andApplyEFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("apply_e_factory >=", value, "applyEFactory");
            return (Criteria) this;
        }

        public Criteria andApplyEFactoryLessThan(String value) {
            addCriterion("apply_e_factory <", value, "applyEFactory");
            return (Criteria) this;
        }

        public Criteria andApplyEFactoryLessThanOrEqualTo(String value) {
            addCriterion("apply_e_factory <=", value, "applyEFactory");
            return (Criteria) this;
        }

        public Criteria andApplyEFactoryLike(String value) {
            addCriterion("apply_e_factory like", value, "applyEFactory");
            return (Criteria) this;
        }

        public Criteria andApplyEFactoryNotLike(String value) {
            addCriterion("apply_e_factory not like", value, "applyEFactory");
            return (Criteria) this;
        }

        public Criteria andApplyEFactoryIn(List<String> values) {
            addCriterion("apply_e_factory in", values, "applyEFactory");
            return (Criteria) this;
        }

        public Criteria andApplyEFactoryNotIn(List<String> values) {
            addCriterion("apply_e_factory not in", values, "applyEFactory");
            return (Criteria) this;
        }

        public Criteria andApplyEFactoryBetween(String value1, String value2) {
            addCriterion("apply_e_factory between", value1, value2, "applyEFactory");
            return (Criteria) this;
        }

        public Criteria andApplyEFactoryNotBetween(String value1, String value2) {
            addCriterion("apply_e_factory not between", value1, value2, "applyEFactory");
            return (Criteria) this;
        }

        public Criteria andApplyETypeIsNull() {
            addCriterion("apply_e_type is null");
            return (Criteria) this;
        }

        public Criteria andApplyETypeIsNotNull() {
            addCriterion("apply_e_type is not null");
            return (Criteria) this;
        }

        public Criteria andApplyETypeEqualTo(String value) {
            addCriterion("apply_e_type =", value, "applyEType");
            return (Criteria) this;
        }

        public Criteria andApplyETypeNotEqualTo(String value) {
            addCriterion("apply_e_type <>", value, "applyEType");
            return (Criteria) this;
        }

        public Criteria andApplyETypeGreaterThan(String value) {
            addCriterion("apply_e_type >", value, "applyEType");
            return (Criteria) this;
        }

        public Criteria andApplyETypeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_e_type >=", value, "applyEType");
            return (Criteria) this;
        }

        public Criteria andApplyETypeLessThan(String value) {
            addCriterion("apply_e_type <", value, "applyEType");
            return (Criteria) this;
        }

        public Criteria andApplyETypeLessThanOrEqualTo(String value) {
            addCriterion("apply_e_type <=", value, "applyEType");
            return (Criteria) this;
        }

        public Criteria andApplyETypeLike(String value) {
            addCriterion("apply_e_type like", value, "applyEType");
            return (Criteria) this;
        }

        public Criteria andApplyETypeNotLike(String value) {
            addCriterion("apply_e_type not like", value, "applyEType");
            return (Criteria) this;
        }

        public Criteria andApplyETypeIn(List<String> values) {
            addCriterion("apply_e_type in", values, "applyEType");
            return (Criteria) this;
        }

        public Criteria andApplyETypeNotIn(List<String> values) {
            addCriterion("apply_e_type not in", values, "applyEType");
            return (Criteria) this;
        }

        public Criteria andApplyETypeBetween(String value1, String value2) {
            addCriterion("apply_e_type between", value1, value2, "applyEType");
            return (Criteria) this;
        }

        public Criteria andApplyETypeNotBetween(String value1, String value2) {
            addCriterion("apply_e_type not between", value1, value2, "applyEType");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
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