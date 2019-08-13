package com.yisoo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPermIsNull() {
            addCriterion("user_perm is null");
            return (Criteria) this;
        }

        public Criteria andUserPermIsNotNull() {
            addCriterion("user_perm is not null");
            return (Criteria) this;
        }

        public Criteria andUserPermEqualTo(Integer value) {
            addCriterion("user_perm =", value, "userPerm");
            return (Criteria) this;
        }

        public Criteria andUserPermNotEqualTo(Integer value) {
            addCriterion("user_perm <>", value, "userPerm");
            return (Criteria) this;
        }

        public Criteria andUserPermGreaterThan(Integer value) {
            addCriterion("user_perm >", value, "userPerm");
            return (Criteria) this;
        }

        public Criteria andUserPermGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_perm >=", value, "userPerm");
            return (Criteria) this;
        }

        public Criteria andUserPermLessThan(Integer value) {
            addCriterion("user_perm <", value, "userPerm");
            return (Criteria) this;
        }

        public Criteria andUserPermLessThanOrEqualTo(Integer value) {
            addCriterion("user_perm <=", value, "userPerm");
            return (Criteria) this;
        }

        public Criteria andUserPermIn(List<Integer> values) {
            addCriterion("user_perm in", values, "userPerm");
            return (Criteria) this;
        }

        public Criteria andUserPermNotIn(List<Integer> values) {
            addCriterion("user_perm not in", values, "userPerm");
            return (Criteria) this;
        }

        public Criteria andUserPermBetween(Integer value1, Integer value2) {
            addCriterion("user_perm between", value1, value2, "userPerm");
            return (Criteria) this;
        }

        public Criteria andUserPermNotBetween(Integer value1, Integer value2) {
            addCriterion("user_perm not between", value1, value2, "userPerm");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNull() {
            addCriterion("reg_time is null");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNotNull() {
            addCriterion("reg_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegTimeEqualTo(Date value) {
            addCriterion("reg_time =", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotEqualTo(Date value) {
            addCriterion("reg_time <>", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThan(Date value) {
            addCriterion("reg_time >", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reg_time >=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThan(Date value) {
            addCriterion("reg_time <", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThanOrEqualTo(Date value) {
            addCriterion("reg_time <=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeIn(List<Date> values) {
            addCriterion("reg_time in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotIn(List<Date> values) {
            addCriterion("reg_time not in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeBetween(Date value1, Date value2) {
            addCriterion("reg_time between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotBetween(Date value1, Date value2) {
            addCriterion("reg_time not between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andImgPathIsNull() {
            addCriterion("img_path is null");
            return (Criteria) this;
        }

        public Criteria andImgPathIsNotNull() {
            addCriterion("img_path is not null");
            return (Criteria) this;
        }

        public Criteria andImgPathEqualTo(String value) {
            addCriterion("img_path =", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotEqualTo(String value) {
            addCriterion("img_path <>", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathGreaterThan(String value) {
            addCriterion("img_path >", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("img_path >=", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathLessThan(String value) {
            addCriterion("img_path <", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathLessThanOrEqualTo(String value) {
            addCriterion("img_path <=", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathLike(String value) {
            addCriterion("img_path like", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotLike(String value) {
            addCriterion("img_path not like", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathIn(List<String> values) {
            addCriterion("img_path in", values, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotIn(List<String> values) {
            addCriterion("img_path not in", values, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathBetween(String value1, String value2) {
            addCriterion("img_path between", value1, value2, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotBetween(String value1, String value2) {
            addCriterion("img_path not between", value1, value2, "imgPath");
            return (Criteria) this;
        }

        public Criteria andOther1IsNull() {
            addCriterion("other_1 is null");
            return (Criteria) this;
        }

        public Criteria andOther1IsNotNull() {
            addCriterion("other_1 is not null");
            return (Criteria) this;
        }

        public Criteria andOther1EqualTo(String value) {
            addCriterion("other_1 =", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotEqualTo(String value) {
            addCriterion("other_1 <>", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1GreaterThan(String value) {
            addCriterion("other_1 >", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1GreaterThanOrEqualTo(String value) {
            addCriterion("other_1 >=", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1LessThan(String value) {
            addCriterion("other_1 <", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1LessThanOrEqualTo(String value) {
            addCriterion("other_1 <=", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1Like(String value) {
            addCriterion("other_1 like", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotLike(String value) {
            addCriterion("other_1 not like", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1In(List<String> values) {
            addCriterion("other_1 in", values, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotIn(List<String> values) {
            addCriterion("other_1 not in", values, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1Between(String value1, String value2) {
            addCriterion("other_1 between", value1, value2, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotBetween(String value1, String value2) {
            addCriterion("other_1 not between", value1, value2, "other1");
            return (Criteria) this;
        }

        public Criteria andOther2IsNull() {
            addCriterion("other_2 is null");
            return (Criteria) this;
        }

        public Criteria andOther2IsNotNull() {
            addCriterion("other_2 is not null");
            return (Criteria) this;
        }

        public Criteria andOther2EqualTo(String value) {
            addCriterion("other_2 =", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotEqualTo(String value) {
            addCriterion("other_2 <>", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2GreaterThan(String value) {
            addCriterion("other_2 >", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2GreaterThanOrEqualTo(String value) {
            addCriterion("other_2 >=", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2LessThan(String value) {
            addCriterion("other_2 <", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2LessThanOrEqualTo(String value) {
            addCriterion("other_2 <=", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2Like(String value) {
            addCriterion("other_2 like", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotLike(String value) {
            addCriterion("other_2 not like", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2In(List<String> values) {
            addCriterion("other_2 in", values, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotIn(List<String> values) {
            addCriterion("other_2 not in", values, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2Between(String value1, String value2) {
            addCriterion("other_2 between", value1, value2, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotBetween(String value1, String value2) {
            addCriterion("other_2 not between", value1, value2, "other2");
            return (Criteria) this;
        }

        public Criteria andOther3IsNull() {
            addCriterion("other_3 is null");
            return (Criteria) this;
        }

        public Criteria andOther3IsNotNull() {
            addCriterion("other_3 is not null");
            return (Criteria) this;
        }

        public Criteria andOther3EqualTo(String value) {
            addCriterion("other_3 =", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3NotEqualTo(String value) {
            addCriterion("other_3 <>", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3GreaterThan(String value) {
            addCriterion("other_3 >", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3GreaterThanOrEqualTo(String value) {
            addCriterion("other_3 >=", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3LessThan(String value) {
            addCriterion("other_3 <", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3LessThanOrEqualTo(String value) {
            addCriterion("other_3 <=", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3Like(String value) {
            addCriterion("other_3 like", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3NotLike(String value) {
            addCriterion("other_3 not like", value, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3In(List<String> values) {
            addCriterion("other_3 in", values, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3NotIn(List<String> values) {
            addCriterion("other_3 not in", values, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3Between(String value1, String value2) {
            addCriterion("other_3 between", value1, value2, "other3");
            return (Criteria) this;
        }

        public Criteria andOther3NotBetween(String value1, String value2) {
            addCriterion("other_3 not between", value1, value2, "other3");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIsNull() {
            addCriterion("login_status is null");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIsNotNull() {
            addCriterion("login_status is not null");
            return (Criteria) this;
        }

        public Criteria andLoginStatusEqualTo(Integer value) {
            addCriterion("login_status =", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotEqualTo(Integer value) {
            addCriterion("login_status <>", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusGreaterThan(Integer value) {
            addCriterion("login_status >", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_status >=", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusLessThan(Integer value) {
            addCriterion("login_status <", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusLessThanOrEqualTo(Integer value) {
            addCriterion("login_status <=", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIn(List<Integer> values) {
            addCriterion("login_status in", values, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotIn(List<Integer> values) {
            addCriterion("login_status not in", values, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusBetween(Integer value1, Integer value2) {
            addCriterion("login_status between", value1, value2, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("login_status not between", value1, value2, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpIsNull() {
            addCriterion("login_last_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpIsNotNull() {
            addCriterion("login_last_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpEqualTo(String value) {
            addCriterion("login_last_ip =", value, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpNotEqualTo(String value) {
            addCriterion("login_last_ip <>", value, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpGreaterThan(String value) {
            addCriterion("login_last_ip >", value, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpGreaterThanOrEqualTo(String value) {
            addCriterion("login_last_ip >=", value, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpLessThan(String value) {
            addCriterion("login_last_ip <", value, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpLessThanOrEqualTo(String value) {
            addCriterion("login_last_ip <=", value, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpLike(String value) {
            addCriterion("login_last_ip like", value, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpNotLike(String value) {
            addCriterion("login_last_ip not like", value, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpIn(List<String> values) {
            addCriterion("login_last_ip in", values, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpNotIn(List<String> values) {
            addCriterion("login_last_ip not in", values, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpBetween(String value1, String value2) {
            addCriterion("login_last_ip between", value1, value2, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastIpNotBetween(String value1, String value2) {
            addCriterion("login_last_ip not between", value1, value2, "loginLastIp");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeIsNull() {
            addCriterion("login_last_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeIsNotNull() {
            addCriterion("login_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeEqualTo(Date value) {
            addCriterion("login_last_time =", value, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeNotEqualTo(Date value) {
            addCriterion("login_last_time <>", value, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeGreaterThan(Date value) {
            addCriterion("login_last_time >", value, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_last_time >=", value, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeLessThan(Date value) {
            addCriterion("login_last_time <", value, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("login_last_time <=", value, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeIn(List<Date> values) {
            addCriterion("login_last_time in", values, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeNotIn(List<Date> values) {
            addCriterion("login_last_time not in", values, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeBetween(Date value1, Date value2) {
            addCriterion("login_last_time between", value1, value2, "loginLastTime");
            return (Criteria) this;
        }

        public Criteria andLoginLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("login_last_time not between", value1, value2, "loginLastTime");
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