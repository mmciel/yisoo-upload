package com.yisoo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AirFileExample() {
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

        public Criteria andAirNameIsNull() {
            addCriterion("air_name is null");
            return (Criteria) this;
        }

        public Criteria andAirNameIsNotNull() {
            addCriterion("air_name is not null");
            return (Criteria) this;
        }

        public Criteria andAirNameEqualTo(String value) {
            addCriterion("air_name =", value, "airName");
            return (Criteria) this;
        }

        public Criteria andAirNameNotEqualTo(String value) {
            addCriterion("air_name <>", value, "airName");
            return (Criteria) this;
        }

        public Criteria andAirNameGreaterThan(String value) {
            addCriterion("air_name >", value, "airName");
            return (Criteria) this;
        }

        public Criteria andAirNameGreaterThanOrEqualTo(String value) {
            addCriterion("air_name >=", value, "airName");
            return (Criteria) this;
        }

        public Criteria andAirNameLessThan(String value) {
            addCriterion("air_name <", value, "airName");
            return (Criteria) this;
        }

        public Criteria andAirNameLessThanOrEqualTo(String value) {
            addCriterion("air_name <=", value, "airName");
            return (Criteria) this;
        }

        public Criteria andAirNameLike(String value) {
            addCriterion("air_name like", value, "airName");
            return (Criteria) this;
        }

        public Criteria andAirNameNotLike(String value) {
            addCriterion("air_name not like", value, "airName");
            return (Criteria) this;
        }

        public Criteria andAirNameIn(List<String> values) {
            addCriterion("air_name in", values, "airName");
            return (Criteria) this;
        }

        public Criteria andAirNameNotIn(List<String> values) {
            addCriterion("air_name not in", values, "airName");
            return (Criteria) this;
        }

        public Criteria andAirNameBetween(String value1, String value2) {
            addCriterion("air_name between", value1, value2, "airName");
            return (Criteria) this;
        }

        public Criteria andAirNameNotBetween(String value1, String value2) {
            addCriterion("air_name not between", value1, value2, "airName");
            return (Criteria) this;
        }

        public Criteria andAirMd5IsNull() {
            addCriterion("air_md5 is null");
            return (Criteria) this;
        }

        public Criteria andAirMd5IsNotNull() {
            addCriterion("air_md5 is not null");
            return (Criteria) this;
        }

        public Criteria andAirMd5EqualTo(String value) {
            addCriterion("air_md5 =", value, "airMd5");
            return (Criteria) this;
        }

        public Criteria andAirMd5NotEqualTo(String value) {
            addCriterion("air_md5 <>", value, "airMd5");
            return (Criteria) this;
        }

        public Criteria andAirMd5GreaterThan(String value) {
            addCriterion("air_md5 >", value, "airMd5");
            return (Criteria) this;
        }

        public Criteria andAirMd5GreaterThanOrEqualTo(String value) {
            addCriterion("air_md5 >=", value, "airMd5");
            return (Criteria) this;
        }

        public Criteria andAirMd5LessThan(String value) {
            addCriterion("air_md5 <", value, "airMd5");
            return (Criteria) this;
        }

        public Criteria andAirMd5LessThanOrEqualTo(String value) {
            addCriterion("air_md5 <=", value, "airMd5");
            return (Criteria) this;
        }

        public Criteria andAirMd5Like(String value) {
            addCriterion("air_md5 like", value, "airMd5");
            return (Criteria) this;
        }

        public Criteria andAirMd5NotLike(String value) {
            addCriterion("air_md5 not like", value, "airMd5");
            return (Criteria) this;
        }

        public Criteria andAirMd5In(List<String> values) {
            addCriterion("air_md5 in", values, "airMd5");
            return (Criteria) this;
        }

        public Criteria andAirMd5NotIn(List<String> values) {
            addCriterion("air_md5 not in", values, "airMd5");
            return (Criteria) this;
        }

        public Criteria andAirMd5Between(String value1, String value2) {
            addCriterion("air_md5 between", value1, value2, "airMd5");
            return (Criteria) this;
        }

        public Criteria andAirMd5NotBetween(String value1, String value2) {
            addCriterion("air_md5 not between", value1, value2, "airMd5");
            return (Criteria) this;
        }

        public Criteria andAirNumIsNull() {
            addCriterion("air_num is null");
            return (Criteria) this;
        }

        public Criteria andAirNumIsNotNull() {
            addCriterion("air_num is not null");
            return (Criteria) this;
        }

        public Criteria andAirNumEqualTo(Integer value) {
            addCriterion("air_num =", value, "airNum");
            return (Criteria) this;
        }

        public Criteria andAirNumNotEqualTo(Integer value) {
            addCriterion("air_num <>", value, "airNum");
            return (Criteria) this;
        }

        public Criteria andAirNumGreaterThan(Integer value) {
            addCriterion("air_num >", value, "airNum");
            return (Criteria) this;
        }

        public Criteria andAirNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("air_num >=", value, "airNum");
            return (Criteria) this;
        }

        public Criteria andAirNumLessThan(Integer value) {
            addCriterion("air_num <", value, "airNum");
            return (Criteria) this;
        }

        public Criteria andAirNumLessThanOrEqualTo(Integer value) {
            addCriterion("air_num <=", value, "airNum");
            return (Criteria) this;
        }

        public Criteria andAirNumIn(List<Integer> values) {
            addCriterion("air_num in", values, "airNum");
            return (Criteria) this;
        }

        public Criteria andAirNumNotIn(List<Integer> values) {
            addCriterion("air_num not in", values, "airNum");
            return (Criteria) this;
        }

        public Criteria andAirNumBetween(Integer value1, Integer value2) {
            addCriterion("air_num between", value1, value2, "airNum");
            return (Criteria) this;
        }

        public Criteria andAirNumNotBetween(Integer value1, Integer value2) {
            addCriterion("air_num not between", value1, value2, "airNum");
            return (Criteria) this;
        }

        public Criteria andAirPathIsNull() {
            addCriterion("air_path is null");
            return (Criteria) this;
        }

        public Criteria andAirPathIsNotNull() {
            addCriterion("air_path is not null");
            return (Criteria) this;
        }

        public Criteria andAirPathEqualTo(String value) {
            addCriterion("air_path =", value, "airPath");
            return (Criteria) this;
        }

        public Criteria andAirPathNotEqualTo(String value) {
            addCriterion("air_path <>", value, "airPath");
            return (Criteria) this;
        }

        public Criteria andAirPathGreaterThan(String value) {
            addCriterion("air_path >", value, "airPath");
            return (Criteria) this;
        }

        public Criteria andAirPathGreaterThanOrEqualTo(String value) {
            addCriterion("air_path >=", value, "airPath");
            return (Criteria) this;
        }

        public Criteria andAirPathLessThan(String value) {
            addCriterion("air_path <", value, "airPath");
            return (Criteria) this;
        }

        public Criteria andAirPathLessThanOrEqualTo(String value) {
            addCriterion("air_path <=", value, "airPath");
            return (Criteria) this;
        }

        public Criteria andAirPathLike(String value) {
            addCriterion("air_path like", value, "airPath");
            return (Criteria) this;
        }

        public Criteria andAirPathNotLike(String value) {
            addCriterion("air_path not like", value, "airPath");
            return (Criteria) this;
        }

        public Criteria andAirPathIn(List<String> values) {
            addCriterion("air_path in", values, "airPath");
            return (Criteria) this;
        }

        public Criteria andAirPathNotIn(List<String> values) {
            addCriterion("air_path not in", values, "airPath");
            return (Criteria) this;
        }

        public Criteria andAirPathBetween(String value1, String value2) {
            addCriterion("air_path between", value1, value2, "airPath");
            return (Criteria) this;
        }

        public Criteria andAirPathNotBetween(String value1, String value2) {
            addCriterion("air_path not between", value1, value2, "airPath");
            return (Criteria) this;
        }

        public Criteria andAirDateIsNull() {
            addCriterion("air_date is null");
            return (Criteria) this;
        }

        public Criteria andAirDateIsNotNull() {
            addCriterion("air_date is not null");
            return (Criteria) this;
        }

        public Criteria andAirDateEqualTo(Date value) {
            addCriterion("air_date =", value, "airDate");
            return (Criteria) this;
        }

        public Criteria andAirDateNotEqualTo(Date value) {
            addCriterion("air_date <>", value, "airDate");
            return (Criteria) this;
        }

        public Criteria andAirDateGreaterThan(Date value) {
            addCriterion("air_date >", value, "airDate");
            return (Criteria) this;
        }

        public Criteria andAirDateGreaterThanOrEqualTo(Date value) {
            addCriterion("air_date >=", value, "airDate");
            return (Criteria) this;
        }

        public Criteria andAirDateLessThan(Date value) {
            addCriterion("air_date <", value, "airDate");
            return (Criteria) this;
        }

        public Criteria andAirDateLessThanOrEqualTo(Date value) {
            addCriterion("air_date <=", value, "airDate");
            return (Criteria) this;
        }

        public Criteria andAirDateIn(List<Date> values) {
            addCriterion("air_date in", values, "airDate");
            return (Criteria) this;
        }

        public Criteria andAirDateNotIn(List<Date> values) {
            addCriterion("air_date not in", values, "airDate");
            return (Criteria) this;
        }

        public Criteria andAirDateBetween(Date value1, Date value2) {
            addCriterion("air_date between", value1, value2, "airDate");
            return (Criteria) this;
        }

        public Criteria andAirDateNotBetween(Date value1, Date value2) {
            addCriterion("air_date not between", value1, value2, "airDate");
            return (Criteria) this;
        }

        public Criteria andAirLongIsNull() {
            addCriterion("air_long is null");
            return (Criteria) this;
        }

        public Criteria andAirLongIsNotNull() {
            addCriterion("air_long is not null");
            return (Criteria) this;
        }

        public Criteria andAirLongEqualTo(Integer value) {
            addCriterion("air_long =", value, "airLong");
            return (Criteria) this;
        }

        public Criteria andAirLongNotEqualTo(Integer value) {
            addCriterion("air_long <>", value, "airLong");
            return (Criteria) this;
        }

        public Criteria andAirLongGreaterThan(Integer value) {
            addCriterion("air_long >", value, "airLong");
            return (Criteria) this;
        }

        public Criteria andAirLongGreaterThanOrEqualTo(Integer value) {
            addCriterion("air_long >=", value, "airLong");
            return (Criteria) this;
        }

        public Criteria andAirLongLessThan(Integer value) {
            addCriterion("air_long <", value, "airLong");
            return (Criteria) this;
        }

        public Criteria andAirLongLessThanOrEqualTo(Integer value) {
            addCriterion("air_long <=", value, "airLong");
            return (Criteria) this;
        }

        public Criteria andAirLongIn(List<Integer> values) {
            addCriterion("air_long in", values, "airLong");
            return (Criteria) this;
        }

        public Criteria andAirLongNotIn(List<Integer> values) {
            addCriterion("air_long not in", values, "airLong");
            return (Criteria) this;
        }

        public Criteria andAirLongBetween(Integer value1, Integer value2) {
            addCriterion("air_long between", value1, value2, "airLong");
            return (Criteria) this;
        }

        public Criteria andAirLongNotBetween(Integer value1, Integer value2) {
            addCriterion("air_long not between", value1, value2, "airLong");
            return (Criteria) this;
        }

        public Criteria andAirShareIsNull() {
            addCriterion("air_share is null");
            return (Criteria) this;
        }

        public Criteria andAirShareIsNotNull() {
            addCriterion("air_share is not null");
            return (Criteria) this;
        }

        public Criteria andAirShareEqualTo(String value) {
            addCriterion("air_share =", value, "airShare");
            return (Criteria) this;
        }

        public Criteria andAirShareNotEqualTo(String value) {
            addCriterion("air_share <>", value, "airShare");
            return (Criteria) this;
        }

        public Criteria andAirShareGreaterThan(String value) {
            addCriterion("air_share >", value, "airShare");
            return (Criteria) this;
        }

        public Criteria andAirShareGreaterThanOrEqualTo(String value) {
            addCriterion("air_share >=", value, "airShare");
            return (Criteria) this;
        }

        public Criteria andAirShareLessThan(String value) {
            addCriterion("air_share <", value, "airShare");
            return (Criteria) this;
        }

        public Criteria andAirShareLessThanOrEqualTo(String value) {
            addCriterion("air_share <=", value, "airShare");
            return (Criteria) this;
        }

        public Criteria andAirShareLike(String value) {
            addCriterion("air_share like", value, "airShare");
            return (Criteria) this;
        }

        public Criteria andAirShareNotLike(String value) {
            addCriterion("air_share not like", value, "airShare");
            return (Criteria) this;
        }

        public Criteria andAirShareIn(List<String> values) {
            addCriterion("air_share in", values, "airShare");
            return (Criteria) this;
        }

        public Criteria andAirShareNotIn(List<String> values) {
            addCriterion("air_share not in", values, "airShare");
            return (Criteria) this;
        }

        public Criteria andAirShareBetween(String value1, String value2) {
            addCriterion("air_share between", value1, value2, "airShare");
            return (Criteria) this;
        }

        public Criteria andAirShareNotBetween(String value1, String value2) {
            addCriterion("air_share not between", value1, value2, "airShare");
            return (Criteria) this;
        }

        public Criteria andAirSizeIsNull() {
            addCriterion("air_size is null");
            return (Criteria) this;
        }

        public Criteria andAirSizeIsNotNull() {
            addCriterion("air_size is not null");
            return (Criteria) this;
        }

        public Criteria andAirSizeEqualTo(Integer value) {
            addCriterion("air_size =", value, "airSize");
            return (Criteria) this;
        }

        public Criteria andAirSizeNotEqualTo(Integer value) {
            addCriterion("air_size <>", value, "airSize");
            return (Criteria) this;
        }

        public Criteria andAirSizeGreaterThan(Integer value) {
            addCriterion("air_size >", value, "airSize");
            return (Criteria) this;
        }

        public Criteria andAirSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("air_size >=", value, "airSize");
            return (Criteria) this;
        }

        public Criteria andAirSizeLessThan(Integer value) {
            addCriterion("air_size <", value, "airSize");
            return (Criteria) this;
        }

        public Criteria andAirSizeLessThanOrEqualTo(Integer value) {
            addCriterion("air_size <=", value, "airSize");
            return (Criteria) this;
        }

        public Criteria andAirSizeIn(List<Integer> values) {
            addCriterion("air_size in", values, "airSize");
            return (Criteria) this;
        }

        public Criteria andAirSizeNotIn(List<Integer> values) {
            addCriterion("air_size not in", values, "airSize");
            return (Criteria) this;
        }

        public Criteria andAirSizeBetween(Integer value1, Integer value2) {
            addCriterion("air_size between", value1, value2, "airSize");
            return (Criteria) this;
        }

        public Criteria andAirSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("air_size not between", value1, value2, "airSize");
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