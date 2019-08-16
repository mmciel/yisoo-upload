package com.yisoo.bean;

import java.util.ArrayList;
import java.util.List;

public class GroupDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupDataExample() {
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

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
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

        public Criteria andGNameIsNull() {
            addCriterion("g_name is null");
            return (Criteria) this;
        }

        public Criteria andGNameIsNotNull() {
            addCriterion("g_name is not null");
            return (Criteria) this;
        }

        public Criteria andGNameEqualTo(String value) {
            addCriterion("g_name =", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotEqualTo(String value) {
            addCriterion("g_name <>", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThan(String value) {
            addCriterion("g_name >", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThanOrEqualTo(String value) {
            addCriterion("g_name >=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThan(String value) {
            addCriterion("g_name <", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThanOrEqualTo(String value) {
            addCriterion("g_name <=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLike(String value) {
            addCriterion("g_name like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotLike(String value) {
            addCriterion("g_name not like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameIn(List<String> values) {
            addCriterion("g_name in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotIn(List<String> values) {
            addCriterion("g_name not in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameBetween(String value1, String value2) {
            addCriterion("g_name between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotBetween(String value1, String value2) {
            addCriterion("g_name not between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andIsNumIsNull() {
            addCriterion("is_num is null");
            return (Criteria) this;
        }

        public Criteria andIsNumIsNotNull() {
            addCriterion("is_num is not null");
            return (Criteria) this;
        }

        public Criteria andIsNumEqualTo(Byte value) {
            addCriterion("is_num =", value, "isNum");
            return (Criteria) this;
        }

        public Criteria andIsNumNotEqualTo(Byte value) {
            addCriterion("is_num <>", value, "isNum");
            return (Criteria) this;
        }

        public Criteria andIsNumGreaterThan(Byte value) {
            addCriterion("is_num >", value, "isNum");
            return (Criteria) this;
        }

        public Criteria andIsNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_num >=", value, "isNum");
            return (Criteria) this;
        }

        public Criteria andIsNumLessThan(Byte value) {
            addCriterion("is_num <", value, "isNum");
            return (Criteria) this;
        }

        public Criteria andIsNumLessThanOrEqualTo(Byte value) {
            addCriterion("is_num <=", value, "isNum");
            return (Criteria) this;
        }

        public Criteria andIsNumIn(List<Byte> values) {
            addCriterion("is_num in", values, "isNum");
            return (Criteria) this;
        }

        public Criteria andIsNumNotIn(List<Byte> values) {
            addCriterion("is_num not in", values, "isNum");
            return (Criteria) this;
        }

        public Criteria andIsNumBetween(Byte value1, Byte value2) {
            addCriterion("is_num between", value1, value2, "isNum");
            return (Criteria) this;
        }

        public Criteria andIsNumNotBetween(Byte value1, Byte value2) {
            addCriterion("is_num not between", value1, value2, "isNum");
            return (Criteria) this;
        }

        public Criteria andIsNameIsNull() {
            addCriterion("is_name is null");
            return (Criteria) this;
        }

        public Criteria andIsNameIsNotNull() {
            addCriterion("is_name is not null");
            return (Criteria) this;
        }

        public Criteria andIsNameEqualTo(Byte value) {
            addCriterion("is_name =", value, "isName");
            return (Criteria) this;
        }

        public Criteria andIsNameNotEqualTo(Byte value) {
            addCriterion("is_name <>", value, "isName");
            return (Criteria) this;
        }

        public Criteria andIsNameGreaterThan(Byte value) {
            addCriterion("is_name >", value, "isName");
            return (Criteria) this;
        }

        public Criteria andIsNameGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_name >=", value, "isName");
            return (Criteria) this;
        }

        public Criteria andIsNameLessThan(Byte value) {
            addCriterion("is_name <", value, "isName");
            return (Criteria) this;
        }

        public Criteria andIsNameLessThanOrEqualTo(Byte value) {
            addCriterion("is_name <=", value, "isName");
            return (Criteria) this;
        }

        public Criteria andIsNameIn(List<Byte> values) {
            addCriterion("is_name in", values, "isName");
            return (Criteria) this;
        }

        public Criteria andIsNameNotIn(List<Byte> values) {
            addCriterion("is_name not in", values, "isName");
            return (Criteria) this;
        }

        public Criteria andIsNameBetween(Byte value1, Byte value2) {
            addCriterion("is_name between", value1, value2, "isName");
            return (Criteria) this;
        }

        public Criteria andIsNameNotBetween(Byte value1, Byte value2) {
            addCriterion("is_name not between", value1, value2, "isName");
            return (Criteria) this;
        }

        public Criteria andIsClassIsNull() {
            addCriterion("is_class is null");
            return (Criteria) this;
        }

        public Criteria andIsClassIsNotNull() {
            addCriterion("is_class is not null");
            return (Criteria) this;
        }

        public Criteria andIsClassEqualTo(Byte value) {
            addCriterion("is_class =", value, "isClass");
            return (Criteria) this;
        }

        public Criteria andIsClassNotEqualTo(Byte value) {
            addCriterion("is_class <>", value, "isClass");
            return (Criteria) this;
        }

        public Criteria andIsClassGreaterThan(Byte value) {
            addCriterion("is_class >", value, "isClass");
            return (Criteria) this;
        }

        public Criteria andIsClassGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_class >=", value, "isClass");
            return (Criteria) this;
        }

        public Criteria andIsClassLessThan(Byte value) {
            addCriterion("is_class <", value, "isClass");
            return (Criteria) this;
        }

        public Criteria andIsClassLessThanOrEqualTo(Byte value) {
            addCriterion("is_class <=", value, "isClass");
            return (Criteria) this;
        }

        public Criteria andIsClassIn(List<Byte> values) {
            addCriterion("is_class in", values, "isClass");
            return (Criteria) this;
        }

        public Criteria andIsClassNotIn(List<Byte> values) {
            addCriterion("is_class not in", values, "isClass");
            return (Criteria) this;
        }

        public Criteria andIsClassBetween(Byte value1, Byte value2) {
            addCriterion("is_class between", value1, value2, "isClass");
            return (Criteria) this;
        }

        public Criteria andIsClassNotBetween(Byte value1, Byte value2) {
            addCriterion("is_class not between", value1, value2, "isClass");
            return (Criteria) this;
        }

        public Criteria andIsEmailIsNull() {
            addCriterion("is_email is null");
            return (Criteria) this;
        }

        public Criteria andIsEmailIsNotNull() {
            addCriterion("is_email is not null");
            return (Criteria) this;
        }

        public Criteria andIsEmailEqualTo(Byte value) {
            addCriterion("is_email =", value, "isEmail");
            return (Criteria) this;
        }

        public Criteria andIsEmailNotEqualTo(Byte value) {
            addCriterion("is_email <>", value, "isEmail");
            return (Criteria) this;
        }

        public Criteria andIsEmailGreaterThan(Byte value) {
            addCriterion("is_email >", value, "isEmail");
            return (Criteria) this;
        }

        public Criteria andIsEmailGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_email >=", value, "isEmail");
            return (Criteria) this;
        }

        public Criteria andIsEmailLessThan(Byte value) {
            addCriterion("is_email <", value, "isEmail");
            return (Criteria) this;
        }

        public Criteria andIsEmailLessThanOrEqualTo(Byte value) {
            addCriterion("is_email <=", value, "isEmail");
            return (Criteria) this;
        }

        public Criteria andIsEmailIn(List<Byte> values) {
            addCriterion("is_email in", values, "isEmail");
            return (Criteria) this;
        }

        public Criteria andIsEmailNotIn(List<Byte> values) {
            addCriterion("is_email not in", values, "isEmail");
            return (Criteria) this;
        }

        public Criteria andIsEmailBetween(Byte value1, Byte value2) {
            addCriterion("is_email between", value1, value2, "isEmail");
            return (Criteria) this;
        }

        public Criteria andIsEmailNotBetween(Byte value1, Byte value2) {
            addCriterion("is_email not between", value1, value2, "isEmail");
            return (Criteria) this;
        }

        public Criteria andRootFilePathIsNull() {
            addCriterion("root_file_path is null");
            return (Criteria) this;
        }

        public Criteria andRootFilePathIsNotNull() {
            addCriterion("root_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andRootFilePathEqualTo(String value) {
            addCriterion("root_file_path =", value, "rootFilePath");
            return (Criteria) this;
        }

        public Criteria andRootFilePathNotEqualTo(String value) {
            addCriterion("root_file_path <>", value, "rootFilePath");
            return (Criteria) this;
        }

        public Criteria andRootFilePathGreaterThan(String value) {
            addCriterion("root_file_path >", value, "rootFilePath");
            return (Criteria) this;
        }

        public Criteria andRootFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("root_file_path >=", value, "rootFilePath");
            return (Criteria) this;
        }

        public Criteria andRootFilePathLessThan(String value) {
            addCriterion("root_file_path <", value, "rootFilePath");
            return (Criteria) this;
        }

        public Criteria andRootFilePathLessThanOrEqualTo(String value) {
            addCriterion("root_file_path <=", value, "rootFilePath");
            return (Criteria) this;
        }

        public Criteria andRootFilePathLike(String value) {
            addCriterion("root_file_path like", value, "rootFilePath");
            return (Criteria) this;
        }

        public Criteria andRootFilePathNotLike(String value) {
            addCriterion("root_file_path not like", value, "rootFilePath");
            return (Criteria) this;
        }

        public Criteria andRootFilePathIn(List<String> values) {
            addCriterion("root_file_path in", values, "rootFilePath");
            return (Criteria) this;
        }

        public Criteria andRootFilePathNotIn(List<String> values) {
            addCriterion("root_file_path not in", values, "rootFilePath");
            return (Criteria) this;
        }

        public Criteria andRootFilePathBetween(String value1, String value2) {
            addCriterion("root_file_path between", value1, value2, "rootFilePath");
            return (Criteria) this;
        }

        public Criteria andRootFilePathNotBetween(String value1, String value2) {
            addCriterion("root_file_path not between", value1, value2, "rootFilePath");
            return (Criteria) this;
        }

        public Criteria andRootFileNameIsNull() {
            addCriterion("root_file_name is null");
            return (Criteria) this;
        }

        public Criteria andRootFileNameIsNotNull() {
            addCriterion("root_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andRootFileNameEqualTo(String value) {
            addCriterion("root_file_name =", value, "rootFileName");
            return (Criteria) this;
        }

        public Criteria andRootFileNameNotEqualTo(String value) {
            addCriterion("root_file_name <>", value, "rootFileName");
            return (Criteria) this;
        }

        public Criteria andRootFileNameGreaterThan(String value) {
            addCriterion("root_file_name >", value, "rootFileName");
            return (Criteria) this;
        }

        public Criteria andRootFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("root_file_name >=", value, "rootFileName");
            return (Criteria) this;
        }

        public Criteria andRootFileNameLessThan(String value) {
            addCriterion("root_file_name <", value, "rootFileName");
            return (Criteria) this;
        }

        public Criteria andRootFileNameLessThanOrEqualTo(String value) {
            addCriterion("root_file_name <=", value, "rootFileName");
            return (Criteria) this;
        }

        public Criteria andRootFileNameLike(String value) {
            addCriterion("root_file_name like", value, "rootFileName");
            return (Criteria) this;
        }

        public Criteria andRootFileNameNotLike(String value) {
            addCriterion("root_file_name not like", value, "rootFileName");
            return (Criteria) this;
        }

        public Criteria andRootFileNameIn(List<String> values) {
            addCriterion("root_file_name in", values, "rootFileName");
            return (Criteria) this;
        }

        public Criteria andRootFileNameNotIn(List<String> values) {
            addCriterion("root_file_name not in", values, "rootFileName");
            return (Criteria) this;
        }

        public Criteria andRootFileNameBetween(String value1, String value2) {
            addCriterion("root_file_name between", value1, value2, "rootFileName");
            return (Criteria) this;
        }

        public Criteria andRootFileNameNotBetween(String value1, String value2) {
            addCriterion("root_file_name not between", value1, value2, "rootFileName");
            return (Criteria) this;
        }

        public Criteria andRootFileTypeIsNull() {
            addCriterion("root_file_type is null");
            return (Criteria) this;
        }

        public Criteria andRootFileTypeIsNotNull() {
            addCriterion("root_file_type is not null");
            return (Criteria) this;
        }

        public Criteria andRootFileTypeEqualTo(String value) {
            addCriterion("root_file_type =", value, "rootFileType");
            return (Criteria) this;
        }

        public Criteria andRootFileTypeNotEqualTo(String value) {
            addCriterion("root_file_type <>", value, "rootFileType");
            return (Criteria) this;
        }

        public Criteria andRootFileTypeGreaterThan(String value) {
            addCriterion("root_file_type >", value, "rootFileType");
            return (Criteria) this;
        }

        public Criteria andRootFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("root_file_type >=", value, "rootFileType");
            return (Criteria) this;
        }

        public Criteria andRootFileTypeLessThan(String value) {
            addCriterion("root_file_type <", value, "rootFileType");
            return (Criteria) this;
        }

        public Criteria andRootFileTypeLessThanOrEqualTo(String value) {
            addCriterion("root_file_type <=", value, "rootFileType");
            return (Criteria) this;
        }

        public Criteria andRootFileTypeLike(String value) {
            addCriterion("root_file_type like", value, "rootFileType");
            return (Criteria) this;
        }

        public Criteria andRootFileTypeNotLike(String value) {
            addCriterion("root_file_type not like", value, "rootFileType");
            return (Criteria) this;
        }

        public Criteria andRootFileTypeIn(List<String> values) {
            addCriterion("root_file_type in", values, "rootFileType");
            return (Criteria) this;
        }

        public Criteria andRootFileTypeNotIn(List<String> values) {
            addCriterion("root_file_type not in", values, "rootFileType");
            return (Criteria) this;
        }

        public Criteria andRootFileTypeBetween(String value1, String value2) {
            addCriterion("root_file_type between", value1, value2, "rootFileType");
            return (Criteria) this;
        }

        public Criteria andRootFileTypeNotBetween(String value1, String value2) {
            addCriterion("root_file_type not between", value1, value2, "rootFileType");
            return (Criteria) this;
        }

        public Criteria andRootFileMd5IsNull() {
            addCriterion("root_file_md5 is null");
            return (Criteria) this;
        }

        public Criteria andRootFileMd5IsNotNull() {
            addCriterion("root_file_md5 is not null");
            return (Criteria) this;
        }

        public Criteria andRootFileMd5EqualTo(String value) {
            addCriterion("root_file_md5 =", value, "rootFileMd5");
            return (Criteria) this;
        }

        public Criteria andRootFileMd5NotEqualTo(String value) {
            addCriterion("root_file_md5 <>", value, "rootFileMd5");
            return (Criteria) this;
        }

        public Criteria andRootFileMd5GreaterThan(String value) {
            addCriterion("root_file_md5 >", value, "rootFileMd5");
            return (Criteria) this;
        }

        public Criteria andRootFileMd5GreaterThanOrEqualTo(String value) {
            addCriterion("root_file_md5 >=", value, "rootFileMd5");
            return (Criteria) this;
        }

        public Criteria andRootFileMd5LessThan(String value) {
            addCriterion("root_file_md5 <", value, "rootFileMd5");
            return (Criteria) this;
        }

        public Criteria andRootFileMd5LessThanOrEqualTo(String value) {
            addCriterion("root_file_md5 <=", value, "rootFileMd5");
            return (Criteria) this;
        }

        public Criteria andRootFileMd5Like(String value) {
            addCriterion("root_file_md5 like", value, "rootFileMd5");
            return (Criteria) this;
        }

        public Criteria andRootFileMd5NotLike(String value) {
            addCriterion("root_file_md5 not like", value, "rootFileMd5");
            return (Criteria) this;
        }

        public Criteria andRootFileMd5In(List<String> values) {
            addCriterion("root_file_md5 in", values, "rootFileMd5");
            return (Criteria) this;
        }

        public Criteria andRootFileMd5NotIn(List<String> values) {
            addCriterion("root_file_md5 not in", values, "rootFileMd5");
            return (Criteria) this;
        }

        public Criteria andRootFileMd5Between(String value1, String value2) {
            addCriterion("root_file_md5 between", value1, value2, "rootFileMd5");
            return (Criteria) this;
        }

        public Criteria andRootFileMd5NotBetween(String value1, String value2) {
            addCriterion("root_file_md5 not between", value1, value2, "rootFileMd5");
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