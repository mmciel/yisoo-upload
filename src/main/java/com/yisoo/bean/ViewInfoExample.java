package com.yisoo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViewInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewInfoExample() {
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

        public Criteria andViewIdIsNull() {
            addCriterion("view_id is null");
            return (Criteria) this;
        }

        public Criteria andViewIdIsNotNull() {
            addCriterion("view_id is not null");
            return (Criteria) this;
        }

        public Criteria andViewIdEqualTo(Integer value) {
            addCriterion("view_id =", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdNotEqualTo(Integer value) {
            addCriterion("view_id <>", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdGreaterThan(Integer value) {
            addCriterion("view_id >", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("view_id >=", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdLessThan(Integer value) {
            addCriterion("view_id <", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdLessThanOrEqualTo(Integer value) {
            addCriterion("view_id <=", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdIn(List<Integer> values) {
            addCriterion("view_id in", values, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdNotIn(List<Integer> values) {
            addCriterion("view_id not in", values, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdBetween(Integer value1, Integer value2) {
            addCriterion("view_id between", value1, value2, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdNotBetween(Integer value1, Integer value2) {
            addCriterion("view_id not between", value1, value2, "viewId");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Integer value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Integer value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Integer value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Integer value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Integer> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Integer> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Integer value1, Integer value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andPdfNameIsNull() {
            addCriterion("pdf_name is null");
            return (Criteria) this;
        }

        public Criteria andPdfNameIsNotNull() {
            addCriterion("pdf_name is not null");
            return (Criteria) this;
        }

        public Criteria andPdfNameEqualTo(String value) {
            addCriterion("pdf_name =", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameNotEqualTo(String value) {
            addCriterion("pdf_name <>", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameGreaterThan(String value) {
            addCriterion("pdf_name >", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameGreaterThanOrEqualTo(String value) {
            addCriterion("pdf_name >=", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameLessThan(String value) {
            addCriterion("pdf_name <", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameLessThanOrEqualTo(String value) {
            addCriterion("pdf_name <=", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameLike(String value) {
            addCriterion("pdf_name like", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameNotLike(String value) {
            addCriterion("pdf_name not like", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameIn(List<String> values) {
            addCriterion("pdf_name in", values, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameNotIn(List<String> values) {
            addCriterion("pdf_name not in", values, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameBetween(String value1, String value2) {
            addCriterion("pdf_name between", value1, value2, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameNotBetween(String value1, String value2) {
            addCriterion("pdf_name not between", value1, value2, "pdfName");
            return (Criteria) this;
        }

        public Criteria andVTimeIsNull() {
            addCriterion("v_time is null");
            return (Criteria) this;
        }

        public Criteria andVTimeIsNotNull() {
            addCriterion("v_time is not null");
            return (Criteria) this;
        }

        public Criteria andVTimeEqualTo(Date value) {
            addCriterion("v_time =", value, "vTime");
            return (Criteria) this;
        }

        public Criteria andVTimeNotEqualTo(Date value) {
            addCriterion("v_time <>", value, "vTime");
            return (Criteria) this;
        }

        public Criteria andVTimeGreaterThan(Date value) {
            addCriterion("v_time >", value, "vTime");
            return (Criteria) this;
        }

        public Criteria andVTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("v_time >=", value, "vTime");
            return (Criteria) this;
        }

        public Criteria andVTimeLessThan(Date value) {
            addCriterion("v_time <", value, "vTime");
            return (Criteria) this;
        }

        public Criteria andVTimeLessThanOrEqualTo(Date value) {
            addCriterion("v_time <=", value, "vTime");
            return (Criteria) this;
        }

        public Criteria andVTimeIn(List<Date> values) {
            addCriterion("v_time in", values, "vTime");
            return (Criteria) this;
        }

        public Criteria andVTimeNotIn(List<Date> values) {
            addCriterion("v_time not in", values, "vTime");
            return (Criteria) this;
        }

        public Criteria andVTimeBetween(Date value1, Date value2) {
            addCriterion("v_time between", value1, value2, "vTime");
            return (Criteria) this;
        }

        public Criteria andVTimeNotBetween(Date value1, Date value2) {
            addCriterion("v_time not between", value1, value2, "vTime");
            return (Criteria) this;
        }

        public Criteria andVIpIsNull() {
            addCriterion("v_ip is null");
            return (Criteria) this;
        }

        public Criteria andVIpIsNotNull() {
            addCriterion("v_ip is not null");
            return (Criteria) this;
        }

        public Criteria andVIpEqualTo(String value) {
            addCriterion("v_ip =", value, "vIp");
            return (Criteria) this;
        }

        public Criteria andVIpNotEqualTo(String value) {
            addCriterion("v_ip <>", value, "vIp");
            return (Criteria) this;
        }

        public Criteria andVIpGreaterThan(String value) {
            addCriterion("v_ip >", value, "vIp");
            return (Criteria) this;
        }

        public Criteria andVIpGreaterThanOrEqualTo(String value) {
            addCriterion("v_ip >=", value, "vIp");
            return (Criteria) this;
        }

        public Criteria andVIpLessThan(String value) {
            addCriterion("v_ip <", value, "vIp");
            return (Criteria) this;
        }

        public Criteria andVIpLessThanOrEqualTo(String value) {
            addCriterion("v_ip <=", value, "vIp");
            return (Criteria) this;
        }

        public Criteria andVIpLike(String value) {
            addCriterion("v_ip like", value, "vIp");
            return (Criteria) this;
        }

        public Criteria andVIpNotLike(String value) {
            addCriterion("v_ip not like", value, "vIp");
            return (Criteria) this;
        }

        public Criteria andVIpIn(List<String> values) {
            addCriterion("v_ip in", values, "vIp");
            return (Criteria) this;
        }

        public Criteria andVIpNotIn(List<String> values) {
            addCriterion("v_ip not in", values, "vIp");
            return (Criteria) this;
        }

        public Criteria andVIpBetween(String value1, String value2) {
            addCriterion("v_ip between", value1, value2, "vIp");
            return (Criteria) this;
        }

        public Criteria andVIpNotBetween(String value1, String value2) {
            addCriterion("v_ip not between", value1, value2, "vIp");
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