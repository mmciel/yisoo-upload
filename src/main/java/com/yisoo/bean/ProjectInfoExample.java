package com.yisoo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectInfoExample() {
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

        public Criteria andYisooIdIsNull() {
            addCriterion("yisoo_id is null");
            return (Criteria) this;
        }

        public Criteria andYisooIdIsNotNull() {
            addCriterion("yisoo_id is not null");
            return (Criteria) this;
        }

        public Criteria andYisooIdEqualTo(Integer value) {
            addCriterion("yisoo_id =", value, "yisooId");
            return (Criteria) this;
        }

        public Criteria andYisooIdNotEqualTo(Integer value) {
            addCriterion("yisoo_id <>", value, "yisooId");
            return (Criteria) this;
        }

        public Criteria andYisooIdGreaterThan(Integer value) {
            addCriterion("yisoo_id >", value, "yisooId");
            return (Criteria) this;
        }

        public Criteria andYisooIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yisoo_id >=", value, "yisooId");
            return (Criteria) this;
        }

        public Criteria andYisooIdLessThan(Integer value) {
            addCriterion("yisoo_id <", value, "yisooId");
            return (Criteria) this;
        }

        public Criteria andYisooIdLessThanOrEqualTo(Integer value) {
            addCriterion("yisoo_id <=", value, "yisooId");
            return (Criteria) this;
        }

        public Criteria andYisooIdIn(List<Integer> values) {
            addCriterion("yisoo_id in", values, "yisooId");
            return (Criteria) this;
        }

        public Criteria andYisooIdNotIn(List<Integer> values) {
            addCriterion("yisoo_id not in", values, "yisooId");
            return (Criteria) this;
        }

        public Criteria andYisooIdBetween(Integer value1, Integer value2) {
            addCriterion("yisoo_id between", value1, value2, "yisooId");
            return (Criteria) this;
        }

        public Criteria andYisooIdNotBetween(Integer value1, Integer value2) {
            addCriterion("yisoo_id not between", value1, value2, "yisooId");
            return (Criteria) this;
        }

        public Criteria andPTitleIsNull() {
            addCriterion("p_title is null");
            return (Criteria) this;
        }

        public Criteria andPTitleIsNotNull() {
            addCriterion("p_title is not null");
            return (Criteria) this;
        }

        public Criteria andPTitleEqualTo(String value) {
            addCriterion("p_title =", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleNotEqualTo(String value) {
            addCriterion("p_title <>", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleGreaterThan(String value) {
            addCriterion("p_title >", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleGreaterThanOrEqualTo(String value) {
            addCriterion("p_title >=", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleLessThan(String value) {
            addCriterion("p_title <", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleLessThanOrEqualTo(String value) {
            addCriterion("p_title <=", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleLike(String value) {
            addCriterion("p_title like", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleNotLike(String value) {
            addCriterion("p_title not like", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleIn(List<String> values) {
            addCriterion("p_title in", values, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleNotIn(List<String> values) {
            addCriterion("p_title not in", values, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleBetween(String value1, String value2) {
            addCriterion("p_title between", value1, value2, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleNotBetween(String value1, String value2) {
            addCriterion("p_title not between", value1, value2, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPWordIsNull() {
            addCriterion("p_word is null");
            return (Criteria) this;
        }

        public Criteria andPWordIsNotNull() {
            addCriterion("p_word is not null");
            return (Criteria) this;
        }

        public Criteria andPWordEqualTo(String value) {
            addCriterion("p_word =", value, "pWord");
            return (Criteria) this;
        }

        public Criteria andPWordNotEqualTo(String value) {
            addCriterion("p_word <>", value, "pWord");
            return (Criteria) this;
        }

        public Criteria andPWordGreaterThan(String value) {
            addCriterion("p_word >", value, "pWord");
            return (Criteria) this;
        }

        public Criteria andPWordGreaterThanOrEqualTo(String value) {
            addCriterion("p_word >=", value, "pWord");
            return (Criteria) this;
        }

        public Criteria andPWordLessThan(String value) {
            addCriterion("p_word <", value, "pWord");
            return (Criteria) this;
        }

        public Criteria andPWordLessThanOrEqualTo(String value) {
            addCriterion("p_word <=", value, "pWord");
            return (Criteria) this;
        }

        public Criteria andPWordLike(String value) {
            addCriterion("p_word like", value, "pWord");
            return (Criteria) this;
        }

        public Criteria andPWordNotLike(String value) {
            addCriterion("p_word not like", value, "pWord");
            return (Criteria) this;
        }

        public Criteria andPWordIn(List<String> values) {
            addCriterion("p_word in", values, "pWord");
            return (Criteria) this;
        }

        public Criteria andPWordNotIn(List<String> values) {
            addCriterion("p_word not in", values, "pWord");
            return (Criteria) this;
        }

        public Criteria andPWordBetween(String value1, String value2) {
            addCriterion("p_word between", value1, value2, "pWord");
            return (Criteria) this;
        }

        public Criteria andPWordNotBetween(String value1, String value2) {
            addCriterion("p_word not between", value1, value2, "pWord");
            return (Criteria) this;
        }

        public Criteria andPPathIsNull() {
            addCriterion("p_path is null");
            return (Criteria) this;
        }

        public Criteria andPPathIsNotNull() {
            addCriterion("p_path is not null");
            return (Criteria) this;
        }

        public Criteria andPPathEqualTo(String value) {
            addCriterion("p_path =", value, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathNotEqualTo(String value) {
            addCriterion("p_path <>", value, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathGreaterThan(String value) {
            addCriterion("p_path >", value, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathGreaterThanOrEqualTo(String value) {
            addCriterion("p_path >=", value, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathLessThan(String value) {
            addCriterion("p_path <", value, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathLessThanOrEqualTo(String value) {
            addCriterion("p_path <=", value, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathLike(String value) {
            addCriterion("p_path like", value, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathNotLike(String value) {
            addCriterion("p_path not like", value, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathIn(List<String> values) {
            addCriterion("p_path in", values, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathNotIn(List<String> values) {
            addCriterion("p_path not in", values, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathBetween(String value1, String value2) {
            addCriterion("p_path between", value1, value2, "pPath");
            return (Criteria) this;
        }

        public Criteria andPPathNotBetween(String value1, String value2) {
            addCriterion("p_path not between", value1, value2, "pPath");
            return (Criteria) this;
        }

        public Criteria andPStatusIsNull() {
            addCriterion("p_status is null");
            return (Criteria) this;
        }

        public Criteria andPStatusIsNotNull() {
            addCriterion("p_status is not null");
            return (Criteria) this;
        }

        public Criteria andPStatusEqualTo(Integer value) {
            addCriterion("p_status =", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusNotEqualTo(Integer value) {
            addCriterion("p_status <>", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusGreaterThan(Integer value) {
            addCriterion("p_status >", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_status >=", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusLessThan(Integer value) {
            addCriterion("p_status <", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusLessThanOrEqualTo(Integer value) {
            addCriterion("p_status <=", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusIn(List<Integer> values) {
            addCriterion("p_status in", values, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusNotIn(List<Integer> values) {
            addCriterion("p_status not in", values, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusBetween(Integer value1, Integer value2) {
            addCriterion("p_status between", value1, value2, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("p_status not between", value1, value2, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPGroupIdIsNull() {
            addCriterion("p_group_id is null");
            return (Criteria) this;
        }

        public Criteria andPGroupIdIsNotNull() {
            addCriterion("p_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andPGroupIdEqualTo(Integer value) {
            addCriterion("p_group_id =", value, "pGroupId");
            return (Criteria) this;
        }

        public Criteria andPGroupIdNotEqualTo(Integer value) {
            addCriterion("p_group_id <>", value, "pGroupId");
            return (Criteria) this;
        }

        public Criteria andPGroupIdGreaterThan(Integer value) {
            addCriterion("p_group_id >", value, "pGroupId");
            return (Criteria) this;
        }

        public Criteria andPGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_group_id >=", value, "pGroupId");
            return (Criteria) this;
        }

        public Criteria andPGroupIdLessThan(Integer value) {
            addCriterion("p_group_id <", value, "pGroupId");
            return (Criteria) this;
        }

        public Criteria andPGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_group_id <=", value, "pGroupId");
            return (Criteria) this;
        }

        public Criteria andPGroupIdIn(List<Integer> values) {
            addCriterion("p_group_id in", values, "pGroupId");
            return (Criteria) this;
        }

        public Criteria andPGroupIdNotIn(List<Integer> values) {
            addCriterion("p_group_id not in", values, "pGroupId");
            return (Criteria) this;
        }

        public Criteria andPGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("p_group_id between", value1, value2, "pGroupId");
            return (Criteria) this;
        }

        public Criteria andPGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_group_id not between", value1, value2, "pGroupId");
            return (Criteria) this;
        }

        public Criteria andPGroupIsClassIsNull() {
            addCriterion("p_group_is_class is null");
            return (Criteria) this;
        }

        public Criteria andPGroupIsClassIsNotNull() {
            addCriterion("p_group_is_class is not null");
            return (Criteria) this;
        }

        public Criteria andPGroupIsClassEqualTo(Byte value) {
            addCriterion("p_group_is_class =", value, "pGroupIsClass");
            return (Criteria) this;
        }

        public Criteria andPGroupIsClassNotEqualTo(Byte value) {
            addCriterion("p_group_is_class <>", value, "pGroupIsClass");
            return (Criteria) this;
        }

        public Criteria andPGroupIsClassGreaterThan(Byte value) {
            addCriterion("p_group_is_class >", value, "pGroupIsClass");
            return (Criteria) this;
        }

        public Criteria andPGroupIsClassGreaterThanOrEqualTo(Byte value) {
            addCriterion("p_group_is_class >=", value, "pGroupIsClass");
            return (Criteria) this;
        }

        public Criteria andPGroupIsClassLessThan(Byte value) {
            addCriterion("p_group_is_class <", value, "pGroupIsClass");
            return (Criteria) this;
        }

        public Criteria andPGroupIsClassLessThanOrEqualTo(Byte value) {
            addCriterion("p_group_is_class <=", value, "pGroupIsClass");
            return (Criteria) this;
        }

        public Criteria andPGroupIsClassIn(List<Byte> values) {
            addCriterion("p_group_is_class in", values, "pGroupIsClass");
            return (Criteria) this;
        }

        public Criteria andPGroupIsClassNotIn(List<Byte> values) {
            addCriterion("p_group_is_class not in", values, "pGroupIsClass");
            return (Criteria) this;
        }

        public Criteria andPGroupIsClassBetween(Byte value1, Byte value2) {
            addCriterion("p_group_is_class between", value1, value2, "pGroupIsClass");
            return (Criteria) this;
        }

        public Criteria andPGroupIsClassNotBetween(Byte value1, Byte value2) {
            addCriterion("p_group_is_class not between", value1, value2, "pGroupIsClass");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNameIsNull() {
            addCriterion("p_group_is_name is null");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNameIsNotNull() {
            addCriterion("p_group_is_name is not null");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNameEqualTo(Byte value) {
            addCriterion("p_group_is_name =", value, "pGroupIsName");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNameNotEqualTo(Byte value) {
            addCriterion("p_group_is_name <>", value, "pGroupIsName");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNameGreaterThan(Byte value) {
            addCriterion("p_group_is_name >", value, "pGroupIsName");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNameGreaterThanOrEqualTo(Byte value) {
            addCriterion("p_group_is_name >=", value, "pGroupIsName");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNameLessThan(Byte value) {
            addCriterion("p_group_is_name <", value, "pGroupIsName");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNameLessThanOrEqualTo(Byte value) {
            addCriterion("p_group_is_name <=", value, "pGroupIsName");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNameIn(List<Byte> values) {
            addCriterion("p_group_is_name in", values, "pGroupIsName");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNameNotIn(List<Byte> values) {
            addCriterion("p_group_is_name not in", values, "pGroupIsName");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNameBetween(Byte value1, Byte value2) {
            addCriterion("p_group_is_name between", value1, value2, "pGroupIsName");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNameNotBetween(Byte value1, Byte value2) {
            addCriterion("p_group_is_name not between", value1, value2, "pGroupIsName");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNumIsNull() {
            addCriterion("p_group_is_num is null");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNumIsNotNull() {
            addCriterion("p_group_is_num is not null");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNumEqualTo(Byte value) {
            addCriterion("p_group_is_num =", value, "pGroupIsNum");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNumNotEqualTo(Byte value) {
            addCriterion("p_group_is_num <>", value, "pGroupIsNum");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNumGreaterThan(Byte value) {
            addCriterion("p_group_is_num >", value, "pGroupIsNum");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("p_group_is_num >=", value, "pGroupIsNum");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNumLessThan(Byte value) {
            addCriterion("p_group_is_num <", value, "pGroupIsNum");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNumLessThanOrEqualTo(Byte value) {
            addCriterion("p_group_is_num <=", value, "pGroupIsNum");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNumIn(List<Byte> values) {
            addCriterion("p_group_is_num in", values, "pGroupIsNum");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNumNotIn(List<Byte> values) {
            addCriterion("p_group_is_num not in", values, "pGroupIsNum");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNumBetween(Byte value1, Byte value2) {
            addCriterion("p_group_is_num between", value1, value2, "pGroupIsNum");
            return (Criteria) this;
        }

        public Criteria andPGroupIsNumNotBetween(Byte value1, Byte value2) {
            addCriterion("p_group_is_num not between", value1, value2, "pGroupIsNum");
            return (Criteria) this;
        }

        public Criteria andPGroupIsEmailIsNull() {
            addCriterion("p_group_is_email is null");
            return (Criteria) this;
        }

        public Criteria andPGroupIsEmailIsNotNull() {
            addCriterion("p_group_is_email is not null");
            return (Criteria) this;
        }

        public Criteria andPGroupIsEmailEqualTo(Byte value) {
            addCriterion("p_group_is_email =", value, "pGroupIsEmail");
            return (Criteria) this;
        }

        public Criteria andPGroupIsEmailNotEqualTo(Byte value) {
            addCriterion("p_group_is_email <>", value, "pGroupIsEmail");
            return (Criteria) this;
        }

        public Criteria andPGroupIsEmailGreaterThan(Byte value) {
            addCriterion("p_group_is_email >", value, "pGroupIsEmail");
            return (Criteria) this;
        }

        public Criteria andPGroupIsEmailGreaterThanOrEqualTo(Byte value) {
            addCriterion("p_group_is_email >=", value, "pGroupIsEmail");
            return (Criteria) this;
        }

        public Criteria andPGroupIsEmailLessThan(Byte value) {
            addCriterion("p_group_is_email <", value, "pGroupIsEmail");
            return (Criteria) this;
        }

        public Criteria andPGroupIsEmailLessThanOrEqualTo(Byte value) {
            addCriterion("p_group_is_email <=", value, "pGroupIsEmail");
            return (Criteria) this;
        }

        public Criteria andPGroupIsEmailIn(List<Byte> values) {
            addCriterion("p_group_is_email in", values, "pGroupIsEmail");
            return (Criteria) this;
        }

        public Criteria andPGroupIsEmailNotIn(List<Byte> values) {
            addCriterion("p_group_is_email not in", values, "pGroupIsEmail");
            return (Criteria) this;
        }

        public Criteria andPGroupIsEmailBetween(Byte value1, Byte value2) {
            addCriterion("p_group_is_email between", value1, value2, "pGroupIsEmail");
            return (Criteria) this;
        }

        public Criteria andPGroupIsEmailNotBetween(Byte value1, Byte value2) {
            addCriterion("p_group_is_email not between", value1, value2, "pGroupIsEmail");
            return (Criteria) this;
        }

        public Criteria andIsShareIsNull() {
            addCriterion("is_share is null");
            return (Criteria) this;
        }

        public Criteria andIsShareIsNotNull() {
            addCriterion("is_share is not null");
            return (Criteria) this;
        }

        public Criteria andIsShareEqualTo(Byte value) {
            addCriterion("is_share =", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotEqualTo(Byte value) {
            addCriterion("is_share <>", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareGreaterThan(Byte value) {
            addCriterion("is_share >", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_share >=", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareLessThan(Byte value) {
            addCriterion("is_share <", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareLessThanOrEqualTo(Byte value) {
            addCriterion("is_share <=", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareIn(List<Byte> values) {
            addCriterion("is_share in", values, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotIn(List<Byte> values) {
            addCriterion("is_share not in", values, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareBetween(Byte value1, Byte value2) {
            addCriterion("is_share between", value1, value2, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotBetween(Byte value1, Byte value2) {
            addCriterion("is_share not between", value1, value2, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsViewIsNull() {
            addCriterion("is_view is null");
            return (Criteria) this;
        }

        public Criteria andIsViewIsNotNull() {
            addCriterion("is_view is not null");
            return (Criteria) this;
        }

        public Criteria andIsViewEqualTo(Byte value) {
            addCriterion("is_view =", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewNotEqualTo(Byte value) {
            addCriterion("is_view <>", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewGreaterThan(Byte value) {
            addCriterion("is_view >", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_view >=", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewLessThan(Byte value) {
            addCriterion("is_view <", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewLessThanOrEqualTo(Byte value) {
            addCriterion("is_view <=", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewIn(List<Byte> values) {
            addCriterion("is_view in", values, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewNotIn(List<Byte> values) {
            addCriterion("is_view not in", values, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewBetween(Byte value1, Byte value2) {
            addCriterion("is_view between", value1, value2, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewNotBetween(Byte value1, Byte value2) {
            addCriterion("is_view not between", value1, value2, "isView");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andIsRemoveIsNull() {
            addCriterion("is_remove is null");
            return (Criteria) this;
        }

        public Criteria andIsRemoveIsNotNull() {
            addCriterion("is_remove is not null");
            return (Criteria) this;
        }

        public Criteria andIsRemoveEqualTo(Integer value) {
            addCriterion("is_remove =", value, "isRemove");
            return (Criteria) this;
        }

        public Criteria andIsRemoveNotEqualTo(Integer value) {
            addCriterion("is_remove <>", value, "isRemove");
            return (Criteria) this;
        }

        public Criteria andIsRemoveGreaterThan(Integer value) {
            addCriterion("is_remove >", value, "isRemove");
            return (Criteria) this;
        }

        public Criteria andIsRemoveGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_remove >=", value, "isRemove");
            return (Criteria) this;
        }

        public Criteria andIsRemoveLessThan(Integer value) {
            addCriterion("is_remove <", value, "isRemove");
            return (Criteria) this;
        }

        public Criteria andIsRemoveLessThanOrEqualTo(Integer value) {
            addCriterion("is_remove <=", value, "isRemove");
            return (Criteria) this;
        }

        public Criteria andIsRemoveIn(List<Integer> values) {
            addCriterion("is_remove in", values, "isRemove");
            return (Criteria) this;
        }

        public Criteria andIsRemoveNotIn(List<Integer> values) {
            addCriterion("is_remove not in", values, "isRemove");
            return (Criteria) this;
        }

        public Criteria andIsRemoveBetween(Integer value1, Integer value2) {
            addCriterion("is_remove between", value1, value2, "isRemove");
            return (Criteria) this;
        }

        public Criteria andIsRemoveNotBetween(Integer value1, Integer value2) {
            addCriterion("is_remove not between", value1, value2, "isRemove");
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