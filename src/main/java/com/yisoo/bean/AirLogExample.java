package com.yisoo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AirLogExample() {
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

        public Criteria andAirIdIsNull() {
            addCriterion("air_id is null");
            return (Criteria) this;
        }

        public Criteria andAirIdIsNotNull() {
            addCriterion("air_id is not null");
            return (Criteria) this;
        }

        public Criteria andAirIdEqualTo(Integer value) {
            addCriterion("air_id =", value, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdNotEqualTo(Integer value) {
            addCriterion("air_id <>", value, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdGreaterThan(Integer value) {
            addCriterion("air_id >", value, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("air_id >=", value, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdLessThan(Integer value) {
            addCriterion("air_id <", value, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdLessThanOrEqualTo(Integer value) {
            addCriterion("air_id <=", value, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdIn(List<Integer> values) {
            addCriterion("air_id in", values, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdNotIn(List<Integer> values) {
            addCriterion("air_id not in", values, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdBetween(Integer value1, Integer value2) {
            addCriterion("air_id between", value1, value2, "airId");
            return (Criteria) this;
        }

        public Criteria andAirIdNotBetween(Integer value1, Integer value2) {
            addCriterion("air_id not between", value1, value2, "airId");
            return (Criteria) this;
        }

        public Criteria andAirAdressIsNull() {
            addCriterion("air_adress is null");
            return (Criteria) this;
        }

        public Criteria andAirAdressIsNotNull() {
            addCriterion("air_adress is not null");
            return (Criteria) this;
        }

        public Criteria andAirAdressEqualTo(String value) {
            addCriterion("air_adress =", value, "airAdress");
            return (Criteria) this;
        }

        public Criteria andAirAdressNotEqualTo(String value) {
            addCriterion("air_adress <>", value, "airAdress");
            return (Criteria) this;
        }

        public Criteria andAirAdressGreaterThan(String value) {
            addCriterion("air_adress >", value, "airAdress");
            return (Criteria) this;
        }

        public Criteria andAirAdressGreaterThanOrEqualTo(String value) {
            addCriterion("air_adress >=", value, "airAdress");
            return (Criteria) this;
        }

        public Criteria andAirAdressLessThan(String value) {
            addCriterion("air_adress <", value, "airAdress");
            return (Criteria) this;
        }

        public Criteria andAirAdressLessThanOrEqualTo(String value) {
            addCriterion("air_adress <=", value, "airAdress");
            return (Criteria) this;
        }

        public Criteria andAirAdressLike(String value) {
            addCriterion("air_adress like", value, "airAdress");
            return (Criteria) this;
        }

        public Criteria andAirAdressNotLike(String value) {
            addCriterion("air_adress not like", value, "airAdress");
            return (Criteria) this;
        }

        public Criteria andAirAdressIn(List<String> values) {
            addCriterion("air_adress in", values, "airAdress");
            return (Criteria) this;
        }

        public Criteria andAirAdressNotIn(List<String> values) {
            addCriterion("air_adress not in", values, "airAdress");
            return (Criteria) this;
        }

        public Criteria andAirAdressBetween(String value1, String value2) {
            addCriterion("air_adress between", value1, value2, "airAdress");
            return (Criteria) this;
        }

        public Criteria andAirAdressNotBetween(String value1, String value2) {
            addCriterion("air_adress not between", value1, value2, "airAdress");
            return (Criteria) this;
        }

        public Criteria andAirTimeIsNull() {
            addCriterion("air_time is null");
            return (Criteria) this;
        }

        public Criteria andAirTimeIsNotNull() {
            addCriterion("air_time is not null");
            return (Criteria) this;
        }

        public Criteria andAirTimeEqualTo(Date value) {
            addCriterion("air_time =", value, "airTime");
            return (Criteria) this;
        }

        public Criteria andAirTimeNotEqualTo(Date value) {
            addCriterion("air_time <>", value, "airTime");
            return (Criteria) this;
        }

        public Criteria andAirTimeGreaterThan(Date value) {
            addCriterion("air_time >", value, "airTime");
            return (Criteria) this;
        }

        public Criteria andAirTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("air_time >=", value, "airTime");
            return (Criteria) this;
        }

        public Criteria andAirTimeLessThan(Date value) {
            addCriterion("air_time <", value, "airTime");
            return (Criteria) this;
        }

        public Criteria andAirTimeLessThanOrEqualTo(Date value) {
            addCriterion("air_time <=", value, "airTime");
            return (Criteria) this;
        }

        public Criteria andAirTimeIn(List<Date> values) {
            addCriterion("air_time in", values, "airTime");
            return (Criteria) this;
        }

        public Criteria andAirTimeNotIn(List<Date> values) {
            addCriterion("air_time not in", values, "airTime");
            return (Criteria) this;
        }

        public Criteria andAirTimeBetween(Date value1, Date value2) {
            addCriterion("air_time between", value1, value2, "airTime");
            return (Criteria) this;
        }

        public Criteria andAirTimeNotBetween(Date value1, Date value2) {
            addCriterion("air_time not between", value1, value2, "airTime");
            return (Criteria) this;
        }

        public Criteria andAirFlagIsNull() {
            addCriterion("air_flag is null");
            return (Criteria) this;
        }

        public Criteria andAirFlagIsNotNull() {
            addCriterion("air_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAirFlagEqualTo(String value) {
            addCriterion("air_flag =", value, "airFlag");
            return (Criteria) this;
        }

        public Criteria andAirFlagNotEqualTo(String value) {
            addCriterion("air_flag <>", value, "airFlag");
            return (Criteria) this;
        }

        public Criteria andAirFlagGreaterThan(String value) {
            addCriterion("air_flag >", value, "airFlag");
            return (Criteria) this;
        }

        public Criteria andAirFlagGreaterThanOrEqualTo(String value) {
            addCriterion("air_flag >=", value, "airFlag");
            return (Criteria) this;
        }

        public Criteria andAirFlagLessThan(String value) {
            addCriterion("air_flag <", value, "airFlag");
            return (Criteria) this;
        }

        public Criteria andAirFlagLessThanOrEqualTo(String value) {
            addCriterion("air_flag <=", value, "airFlag");
            return (Criteria) this;
        }

        public Criteria andAirFlagLike(String value) {
            addCriterion("air_flag like", value, "airFlag");
            return (Criteria) this;
        }

        public Criteria andAirFlagNotLike(String value) {
            addCriterion("air_flag not like", value, "airFlag");
            return (Criteria) this;
        }

        public Criteria andAirFlagIn(List<String> values) {
            addCriterion("air_flag in", values, "airFlag");
            return (Criteria) this;
        }

        public Criteria andAirFlagNotIn(List<String> values) {
            addCriterion("air_flag not in", values, "airFlag");
            return (Criteria) this;
        }

        public Criteria andAirFlagBetween(String value1, String value2) {
            addCriterion("air_flag between", value1, value2, "airFlag");
            return (Criteria) this;
        }

        public Criteria andAirFlagNotBetween(String value1, String value2) {
            addCriterion("air_flag not between", value1, value2, "airFlag");
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