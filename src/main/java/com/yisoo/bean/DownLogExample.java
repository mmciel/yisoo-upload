package com.yisoo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DownLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DownLogExample() {
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

        public Criteria andDownIdIsNull() {
            addCriterion("down_id is null");
            return (Criteria) this;
        }

        public Criteria andDownIdIsNotNull() {
            addCriterion("down_id is not null");
            return (Criteria) this;
        }

        public Criteria andDownIdEqualTo(Integer value) {
            addCriterion("down_id =", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdNotEqualTo(Integer value) {
            addCriterion("down_id <>", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdGreaterThan(Integer value) {
            addCriterion("down_id >", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("down_id >=", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdLessThan(Integer value) {
            addCriterion("down_id <", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdLessThanOrEqualTo(Integer value) {
            addCriterion("down_id <=", value, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdIn(List<Integer> values) {
            addCriterion("down_id in", values, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdNotIn(List<Integer> values) {
            addCriterion("down_id not in", values, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdBetween(Integer value1, Integer value2) {
            addCriterion("down_id between", value1, value2, "downId");
            return (Criteria) this;
        }

        public Criteria andDownIdNotBetween(Integer value1, Integer value2) {
            addCriterion("down_id not between", value1, value2, "downId");
            return (Criteria) this;
        }

        public Criteria andDTimeIsNull() {
            addCriterion("d_time is null");
            return (Criteria) this;
        }

        public Criteria andDTimeIsNotNull() {
            addCriterion("d_time is not null");
            return (Criteria) this;
        }

        public Criteria andDTimeEqualTo(Date value) {
            addCriterion("d_time =", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeNotEqualTo(Date value) {
            addCriterion("d_time <>", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeGreaterThan(Date value) {
            addCriterion("d_time >", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("d_time >=", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeLessThan(Date value) {
            addCriterion("d_time <", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeLessThanOrEqualTo(Date value) {
            addCriterion("d_time <=", value, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeIn(List<Date> values) {
            addCriterion("d_time in", values, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeNotIn(List<Date> values) {
            addCriterion("d_time not in", values, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeBetween(Date value1, Date value2) {
            addCriterion("d_time between", value1, value2, "dTime");
            return (Criteria) this;
        }

        public Criteria andDTimeNotBetween(Date value1, Date value2) {
            addCriterion("d_time not between", value1, value2, "dTime");
            return (Criteria) this;
        }

        public Criteria andDFileparentIsNull() {
            addCriterion("d_fileparent is null");
            return (Criteria) this;
        }

        public Criteria andDFileparentIsNotNull() {
            addCriterion("d_fileparent is not null");
            return (Criteria) this;
        }

        public Criteria andDFileparentEqualTo(String value) {
            addCriterion("d_fileparent =", value, "dFileparent");
            return (Criteria) this;
        }

        public Criteria andDFileparentNotEqualTo(String value) {
            addCriterion("d_fileparent <>", value, "dFileparent");
            return (Criteria) this;
        }

        public Criteria andDFileparentGreaterThan(String value) {
            addCriterion("d_fileparent >", value, "dFileparent");
            return (Criteria) this;
        }

        public Criteria andDFileparentGreaterThanOrEqualTo(String value) {
            addCriterion("d_fileparent >=", value, "dFileparent");
            return (Criteria) this;
        }

        public Criteria andDFileparentLessThan(String value) {
            addCriterion("d_fileparent <", value, "dFileparent");
            return (Criteria) this;
        }

        public Criteria andDFileparentLessThanOrEqualTo(String value) {
            addCriterion("d_fileparent <=", value, "dFileparent");
            return (Criteria) this;
        }

        public Criteria andDFileparentLike(String value) {
            addCriterion("d_fileparent like", value, "dFileparent");
            return (Criteria) this;
        }

        public Criteria andDFileparentNotLike(String value) {
            addCriterion("d_fileparent not like", value, "dFileparent");
            return (Criteria) this;
        }

        public Criteria andDFileparentIn(List<String> values) {
            addCriterion("d_fileparent in", values, "dFileparent");
            return (Criteria) this;
        }

        public Criteria andDFileparentNotIn(List<String> values) {
            addCriterion("d_fileparent not in", values, "dFileparent");
            return (Criteria) this;
        }

        public Criteria andDFileparentBetween(String value1, String value2) {
            addCriterion("d_fileparent between", value1, value2, "dFileparent");
            return (Criteria) this;
        }

        public Criteria andDFileparentNotBetween(String value1, String value2) {
            addCriterion("d_fileparent not between", value1, value2, "dFileparent");
            return (Criteria) this;
        }

        public Criteria andDFilenameIsNull() {
            addCriterion("d_filename is null");
            return (Criteria) this;
        }

        public Criteria andDFilenameIsNotNull() {
            addCriterion("d_filename is not null");
            return (Criteria) this;
        }

        public Criteria andDFilenameEqualTo(String value) {
            addCriterion("d_filename =", value, "dFilename");
            return (Criteria) this;
        }

        public Criteria andDFilenameNotEqualTo(String value) {
            addCriterion("d_filename <>", value, "dFilename");
            return (Criteria) this;
        }

        public Criteria andDFilenameGreaterThan(String value) {
            addCriterion("d_filename >", value, "dFilename");
            return (Criteria) this;
        }

        public Criteria andDFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("d_filename >=", value, "dFilename");
            return (Criteria) this;
        }

        public Criteria andDFilenameLessThan(String value) {
            addCriterion("d_filename <", value, "dFilename");
            return (Criteria) this;
        }

        public Criteria andDFilenameLessThanOrEqualTo(String value) {
            addCriterion("d_filename <=", value, "dFilename");
            return (Criteria) this;
        }

        public Criteria andDFilenameLike(String value) {
            addCriterion("d_filename like", value, "dFilename");
            return (Criteria) this;
        }

        public Criteria andDFilenameNotLike(String value) {
            addCriterion("d_filename not like", value, "dFilename");
            return (Criteria) this;
        }

        public Criteria andDFilenameIn(List<String> values) {
            addCriterion("d_filename in", values, "dFilename");
            return (Criteria) this;
        }

        public Criteria andDFilenameNotIn(List<String> values) {
            addCriterion("d_filename not in", values, "dFilename");
            return (Criteria) this;
        }

        public Criteria andDFilenameBetween(String value1, String value2) {
            addCriterion("d_filename between", value1, value2, "dFilename");
            return (Criteria) this;
        }

        public Criteria andDFilenameNotBetween(String value1, String value2) {
            addCriterion("d_filename not between", value1, value2, "dFilename");
            return (Criteria) this;
        }

        public Criteria andDTypeIsNull() {
            addCriterion("d_type is null");
            return (Criteria) this;
        }

        public Criteria andDTypeIsNotNull() {
            addCriterion("d_type is not null");
            return (Criteria) this;
        }

        public Criteria andDTypeEqualTo(String value) {
            addCriterion("d_type =", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotEqualTo(String value) {
            addCriterion("d_type <>", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeGreaterThan(String value) {
            addCriterion("d_type >", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeGreaterThanOrEqualTo(String value) {
            addCriterion("d_type >=", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLessThan(String value) {
            addCriterion("d_type <", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLessThanOrEqualTo(String value) {
            addCriterion("d_type <=", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLike(String value) {
            addCriterion("d_type like", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotLike(String value) {
            addCriterion("d_type not like", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeIn(List<String> values) {
            addCriterion("d_type in", values, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotIn(List<String> values) {
            addCriterion("d_type not in", values, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeBetween(String value1, String value2) {
            addCriterion("d_type between", value1, value2, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotBetween(String value1, String value2) {
            addCriterion("d_type not between", value1, value2, "dType");
            return (Criteria) this;
        }

        public Criteria andDIpIsNull() {
            addCriterion("d_ip is null");
            return (Criteria) this;
        }

        public Criteria andDIpIsNotNull() {
            addCriterion("d_ip is not null");
            return (Criteria) this;
        }

        public Criteria andDIpEqualTo(String value) {
            addCriterion("d_ip =", value, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpNotEqualTo(String value) {
            addCriterion("d_ip <>", value, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpGreaterThan(String value) {
            addCriterion("d_ip >", value, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpGreaterThanOrEqualTo(String value) {
            addCriterion("d_ip >=", value, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpLessThan(String value) {
            addCriterion("d_ip <", value, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpLessThanOrEqualTo(String value) {
            addCriterion("d_ip <=", value, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpLike(String value) {
            addCriterion("d_ip like", value, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpNotLike(String value) {
            addCriterion("d_ip not like", value, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpIn(List<String> values) {
            addCriterion("d_ip in", values, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpNotIn(List<String> values) {
            addCriterion("d_ip not in", values, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpBetween(String value1, String value2) {
            addCriterion("d_ip between", value1, value2, "dIp");
            return (Criteria) this;
        }

        public Criteria andDIpNotBetween(String value1, String value2) {
            addCriterion("d_ip not between", value1, value2, "dIp");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andYisooidIdIsNull() {
            addCriterion("yisooid_id is null");
            return (Criteria) this;
        }

        public Criteria andYisooidIdIsNotNull() {
            addCriterion("yisooid_id is not null");
            return (Criteria) this;
        }

        public Criteria andYisooidIdEqualTo(Integer value) {
            addCriterion("yisooid_id =", value, "yisooidId");
            return (Criteria) this;
        }

        public Criteria andYisooidIdNotEqualTo(Integer value) {
            addCriterion("yisooid_id <>", value, "yisooidId");
            return (Criteria) this;
        }

        public Criteria andYisooidIdGreaterThan(Integer value) {
            addCriterion("yisooid_id >", value, "yisooidId");
            return (Criteria) this;
        }

        public Criteria andYisooidIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yisooid_id >=", value, "yisooidId");
            return (Criteria) this;
        }

        public Criteria andYisooidIdLessThan(Integer value) {
            addCriterion("yisooid_id <", value, "yisooidId");
            return (Criteria) this;
        }

        public Criteria andYisooidIdLessThanOrEqualTo(Integer value) {
            addCriterion("yisooid_id <=", value, "yisooidId");
            return (Criteria) this;
        }

        public Criteria andYisooidIdIn(List<Integer> values) {
            addCriterion("yisooid_id in", values, "yisooidId");
            return (Criteria) this;
        }

        public Criteria andYisooidIdNotIn(List<Integer> values) {
            addCriterion("yisooid_id not in", values, "yisooidId");
            return (Criteria) this;
        }

        public Criteria andYisooidIdBetween(Integer value1, Integer value2) {
            addCriterion("yisooid_id between", value1, value2, "yisooidId");
            return (Criteria) this;
        }

        public Criteria andYisooidIdNotBetween(Integer value1, Integer value2) {
            addCriterion("yisooid_id not between", value1, value2, "yisooidId");
            return (Criteria) this;
        }

        public Criteria andDMd5IsNull() {
            addCriterion("d_md5 is null");
            return (Criteria) this;
        }

        public Criteria andDMd5IsNotNull() {
            addCriterion("d_md5 is not null");
            return (Criteria) this;
        }

        public Criteria andDMd5EqualTo(String value) {
            addCriterion("d_md5 =", value, "dMd5");
            return (Criteria) this;
        }

        public Criteria andDMd5NotEqualTo(String value) {
            addCriterion("d_md5 <>", value, "dMd5");
            return (Criteria) this;
        }

        public Criteria andDMd5GreaterThan(String value) {
            addCriterion("d_md5 >", value, "dMd5");
            return (Criteria) this;
        }

        public Criteria andDMd5GreaterThanOrEqualTo(String value) {
            addCriterion("d_md5 >=", value, "dMd5");
            return (Criteria) this;
        }

        public Criteria andDMd5LessThan(String value) {
            addCriterion("d_md5 <", value, "dMd5");
            return (Criteria) this;
        }

        public Criteria andDMd5LessThanOrEqualTo(String value) {
            addCriterion("d_md5 <=", value, "dMd5");
            return (Criteria) this;
        }

        public Criteria andDMd5Like(String value) {
            addCriterion("d_md5 like", value, "dMd5");
            return (Criteria) this;
        }

        public Criteria andDMd5NotLike(String value) {
            addCriterion("d_md5 not like", value, "dMd5");
            return (Criteria) this;
        }

        public Criteria andDMd5In(List<String> values) {
            addCriterion("d_md5 in", values, "dMd5");
            return (Criteria) this;
        }

        public Criteria andDMd5NotIn(List<String> values) {
            addCriterion("d_md5 not in", values, "dMd5");
            return (Criteria) this;
        }

        public Criteria andDMd5Between(String value1, String value2) {
            addCriterion("d_md5 between", value1, value2, "dMd5");
            return (Criteria) this;
        }

        public Criteria andDMd5NotBetween(String value1, String value2) {
            addCriterion("d_md5 not between", value1, value2, "dMd5");
            return (Criteria) this;
        }

        public Criteria andDHashIsNull() {
            addCriterion("d_hash is null");
            return (Criteria) this;
        }

        public Criteria andDHashIsNotNull() {
            addCriterion("d_hash is not null");
            return (Criteria) this;
        }

        public Criteria andDHashEqualTo(String value) {
            addCriterion("d_hash =", value, "dHash");
            return (Criteria) this;
        }

        public Criteria andDHashNotEqualTo(String value) {
            addCriterion("d_hash <>", value, "dHash");
            return (Criteria) this;
        }

        public Criteria andDHashGreaterThan(String value) {
            addCriterion("d_hash >", value, "dHash");
            return (Criteria) this;
        }

        public Criteria andDHashGreaterThanOrEqualTo(String value) {
            addCriterion("d_hash >=", value, "dHash");
            return (Criteria) this;
        }

        public Criteria andDHashLessThan(String value) {
            addCriterion("d_hash <", value, "dHash");
            return (Criteria) this;
        }

        public Criteria andDHashLessThanOrEqualTo(String value) {
            addCriterion("d_hash <=", value, "dHash");
            return (Criteria) this;
        }

        public Criteria andDHashLike(String value) {
            addCriterion("d_hash like", value, "dHash");
            return (Criteria) this;
        }

        public Criteria andDHashNotLike(String value) {
            addCriterion("d_hash not like", value, "dHash");
            return (Criteria) this;
        }

        public Criteria andDHashIn(List<String> values) {
            addCriterion("d_hash in", values, "dHash");
            return (Criteria) this;
        }

        public Criteria andDHashNotIn(List<String> values) {
            addCriterion("d_hash not in", values, "dHash");
            return (Criteria) this;
        }

        public Criteria andDHashBetween(String value1, String value2) {
            addCriterion("d_hash between", value1, value2, "dHash");
            return (Criteria) this;
        }

        public Criteria andDHashNotBetween(String value1, String value2) {
            addCriterion("d_hash not between", value1, value2, "dHash");
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