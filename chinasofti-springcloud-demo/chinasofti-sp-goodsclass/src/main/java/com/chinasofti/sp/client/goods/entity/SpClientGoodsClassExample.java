package com.chinasofti.sp.client.goods.entity;

import java.util.ArrayList;
import java.util.List;

public class SpClientGoodsClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpClientGoodsClassExample() {
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

        public Criteria andIdsIsNull() {
            addCriterion("ids is null");
            return (Criteria) this;
        }

        public Criteria andIdsIsNotNull() {
            addCriterion("ids is not null");
            return (Criteria) this;
        }

        public Criteria andIdsEqualTo(String value) {
            addCriterion("ids =", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsNotEqualTo(String value) {
            addCriterion("ids <>", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsGreaterThan(String value) {
            addCriterion("ids >", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsGreaterThanOrEqualTo(String value) {
            addCriterion("ids >=", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsLessThan(String value) {
            addCriterion("ids <", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsLessThanOrEqualTo(String value) {
            addCriterion("ids <=", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsLike(String value) {
            addCriterion("ids like", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsNotLike(String value) {
            addCriterion("ids not like", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsIn(List<String> values) {
            addCriterion("ids in", values, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsNotIn(List<String> values) {
            addCriterion("ids not in", values, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsBetween(String value1, String value2) {
            addCriterion("ids between", value1, value2, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsNotBetween(String value1, String value2) {
            addCriterion("ids not between", value1, value2, "ids");
            return (Criteria) this;
        }

        public Criteria andPidsIsNull() {
            addCriterion("pids is null");
            return (Criteria) this;
        }

        public Criteria andPidsIsNotNull() {
            addCriterion("pids is not null");
            return (Criteria) this;
        }

        public Criteria andPidsEqualTo(String value) {
            addCriterion("pids =", value, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsNotEqualTo(String value) {
            addCriterion("pids <>", value, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsGreaterThan(String value) {
            addCriterion("pids >", value, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsGreaterThanOrEqualTo(String value) {
            addCriterion("pids >=", value, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsLessThan(String value) {
            addCriterion("pids <", value, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsLessThanOrEqualTo(String value) {
            addCriterion("pids <=", value, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsLike(String value) {
            addCriterion("pids like", value, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsNotLike(String value) {
            addCriterion("pids not like", value, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsIn(List<String> values) {
            addCriterion("pids in", values, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsNotIn(List<String> values) {
            addCriterion("pids not in", values, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsBetween(String value1, String value2) {
            addCriterion("pids between", value1, value2, "pids");
            return (Criteria) this;
        }

        public Criteria andPidsNotBetween(String value1, String value2) {
            addCriterion("pids not between", value1, value2, "pids");
            return (Criteria) this;
        }

        public Criteria andClassStatesIsNull() {
            addCriterion("class_states is null");
            return (Criteria) this;
        }

        public Criteria andClassStatesIsNotNull() {
            addCriterion("class_states is not null");
            return (Criteria) this;
        }

        public Criteria andClassStatesEqualTo(String value) {
            addCriterion("class_states =", value, "classStates");
            return (Criteria) this;
        }

        public Criteria andClassStatesNotEqualTo(String value) {
            addCriterion("class_states <>", value, "classStates");
            return (Criteria) this;
        }

        public Criteria andClassStatesGreaterThan(String value) {
            addCriterion("class_states >", value, "classStates");
            return (Criteria) this;
        }

        public Criteria andClassStatesGreaterThanOrEqualTo(String value) {
            addCriterion("class_states >=", value, "classStates");
            return (Criteria) this;
        }

        public Criteria andClassStatesLessThan(String value) {
            addCriterion("class_states <", value, "classStates");
            return (Criteria) this;
        }

        public Criteria andClassStatesLessThanOrEqualTo(String value) {
            addCriterion("class_states <=", value, "classStates");
            return (Criteria) this;
        }

        public Criteria andClassStatesLike(String value) {
            addCriterion("class_states like", value, "classStates");
            return (Criteria) this;
        }

        public Criteria andClassStatesNotLike(String value) {
            addCriterion("class_states not like", value, "classStates");
            return (Criteria) this;
        }

        public Criteria andClassStatesIn(List<String> values) {
            addCriterion("class_states in", values, "classStates");
            return (Criteria) this;
        }

        public Criteria andClassStatesNotIn(List<String> values) {
            addCriterion("class_states not in", values, "classStates");
            return (Criteria) this;
        }

        public Criteria andClassStatesBetween(String value1, String value2) {
            addCriterion("class_states between", value1, value2, "classStates");
            return (Criteria) this;
        }

        public Criteria andClassStatesNotBetween(String value1, String value2) {
            addCriterion("class_states not between", value1, value2, "classStates");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassDescsIsNull() {
            addCriterion("class_descs is null");
            return (Criteria) this;
        }

        public Criteria andClassDescsIsNotNull() {
            addCriterion("class_descs is not null");
            return (Criteria) this;
        }

        public Criteria andClassDescsEqualTo(String value) {
            addCriterion("class_descs =", value, "classDescs");
            return (Criteria) this;
        }

        public Criteria andClassDescsNotEqualTo(String value) {
            addCriterion("class_descs <>", value, "classDescs");
            return (Criteria) this;
        }

        public Criteria andClassDescsGreaterThan(String value) {
            addCriterion("class_descs >", value, "classDescs");
            return (Criteria) this;
        }

        public Criteria andClassDescsGreaterThanOrEqualTo(String value) {
            addCriterion("class_descs >=", value, "classDescs");
            return (Criteria) this;
        }

        public Criteria andClassDescsLessThan(String value) {
            addCriterion("class_descs <", value, "classDescs");
            return (Criteria) this;
        }

        public Criteria andClassDescsLessThanOrEqualTo(String value) {
            addCriterion("class_descs <=", value, "classDescs");
            return (Criteria) this;
        }

        public Criteria andClassDescsLike(String value) {
            addCriterion("class_descs like", value, "classDescs");
            return (Criteria) this;
        }

        public Criteria andClassDescsNotLike(String value) {
            addCriterion("class_descs not like", value, "classDescs");
            return (Criteria) this;
        }

        public Criteria andClassDescsIn(List<String> values) {
            addCriterion("class_descs in", values, "classDescs");
            return (Criteria) this;
        }

        public Criteria andClassDescsNotIn(List<String> values) {
            addCriterion("class_descs not in", values, "classDescs");
            return (Criteria) this;
        }

        public Criteria andClassDescsBetween(String value1, String value2) {
            addCriterion("class_descs between", value1, value2, "classDescs");
            return (Criteria) this;
        }

        public Criteria andClassDescsNotBetween(String value1, String value2) {
            addCriterion("class_descs not between", value1, value2, "classDescs");
            return (Criteria) this;
        }

        public Criteria andClassCommonsIsNull() {
            addCriterion("class_commons is null");
            return (Criteria) this;
        }

        public Criteria andClassCommonsIsNotNull() {
            addCriterion("class_commons is not null");
            return (Criteria) this;
        }

        public Criteria andClassCommonsEqualTo(String value) {
            addCriterion("class_commons =", value, "classCommons");
            return (Criteria) this;
        }

        public Criteria andClassCommonsNotEqualTo(String value) {
            addCriterion("class_commons <>", value, "classCommons");
            return (Criteria) this;
        }

        public Criteria andClassCommonsGreaterThan(String value) {
            addCriterion("class_commons >", value, "classCommons");
            return (Criteria) this;
        }

        public Criteria andClassCommonsGreaterThanOrEqualTo(String value) {
            addCriterion("class_commons >=", value, "classCommons");
            return (Criteria) this;
        }

        public Criteria andClassCommonsLessThan(String value) {
            addCriterion("class_commons <", value, "classCommons");
            return (Criteria) this;
        }

        public Criteria andClassCommonsLessThanOrEqualTo(String value) {
            addCriterion("class_commons <=", value, "classCommons");
            return (Criteria) this;
        }

        public Criteria andClassCommonsLike(String value) {
            addCriterion("class_commons like", value, "classCommons");
            return (Criteria) this;
        }

        public Criteria andClassCommonsNotLike(String value) {
            addCriterion("class_commons not like", value, "classCommons");
            return (Criteria) this;
        }

        public Criteria andClassCommonsIn(List<String> values) {
            addCriterion("class_commons in", values, "classCommons");
            return (Criteria) this;
        }

        public Criteria andClassCommonsNotIn(List<String> values) {
            addCriterion("class_commons not in", values, "classCommons");
            return (Criteria) this;
        }

        public Criteria andClassCommonsBetween(String value1, String value2) {
            addCriterion("class_commons between", value1, value2, "classCommons");
            return (Criteria) this;
        }

        public Criteria andClassCommonsNotBetween(String value1, String value2) {
            addCriterion("class_commons not between", value1, value2, "classCommons");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
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

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andClassLogoIsNull() {
            addCriterion("class_logo is null");
            return (Criteria) this;
        }

        public Criteria andClassLogoIsNotNull() {
            addCriterion("class_logo is not null");
            return (Criteria) this;
        }

        public Criteria andClassLogoEqualTo(String value) {
            addCriterion("class_logo =", value, "classLogo");
            return (Criteria) this;
        }

        public Criteria andClassLogoNotEqualTo(String value) {
            addCriterion("class_logo <>", value, "classLogo");
            return (Criteria) this;
        }

        public Criteria andClassLogoGreaterThan(String value) {
            addCriterion("class_logo >", value, "classLogo");
            return (Criteria) this;
        }

        public Criteria andClassLogoGreaterThanOrEqualTo(String value) {
            addCriterion("class_logo >=", value, "classLogo");
            return (Criteria) this;
        }

        public Criteria andClassLogoLessThan(String value) {
            addCriterion("class_logo <", value, "classLogo");
            return (Criteria) this;
        }

        public Criteria andClassLogoLessThanOrEqualTo(String value) {
            addCriterion("class_logo <=", value, "classLogo");
            return (Criteria) this;
        }

        public Criteria andClassLogoLike(String value) {
            addCriterion("class_logo like", value, "classLogo");
            return (Criteria) this;
        }

        public Criteria andClassLogoNotLike(String value) {
            addCriterion("class_logo not like", value, "classLogo");
            return (Criteria) this;
        }

        public Criteria andClassLogoIn(List<String> values) {
            addCriterion("class_logo in", values, "classLogo");
            return (Criteria) this;
        }

        public Criteria andClassLogoNotIn(List<String> values) {
            addCriterion("class_logo not in", values, "classLogo");
            return (Criteria) this;
        }

        public Criteria andClassLogoBetween(String value1, String value2) {
            addCriterion("class_logo between", value1, value2, "classLogo");
            return (Criteria) this;
        }

        public Criteria andClassLogoNotBetween(String value1, String value2) {
            addCriterion("class_logo not between", value1, value2, "classLogo");
            return (Criteria) this;
        }

        public Criteria andIsparentIsNull() {
            addCriterion("isparent is null");
            return (Criteria) this;
        }

        public Criteria andIsparentIsNotNull() {
            addCriterion("isparent is not null");
            return (Criteria) this;
        }

        public Criteria andIsparentEqualTo(String value) {
            addCriterion("isparent =", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentNotEqualTo(String value) {
            addCriterion("isparent <>", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentGreaterThan(String value) {
            addCriterion("isparent >", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentGreaterThanOrEqualTo(String value) {
            addCriterion("isparent >=", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentLessThan(String value) {
            addCriterion("isparent <", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentLessThanOrEqualTo(String value) {
            addCriterion("isparent <=", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentLike(String value) {
            addCriterion("isparent like", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentNotLike(String value) {
            addCriterion("isparent not like", value, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentIn(List<String> values) {
            addCriterion("isparent in", values, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentNotIn(List<String> values) {
            addCriterion("isparent not in", values, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentBetween(String value1, String value2) {
            addCriterion("isparent between", value1, value2, "isparent");
            return (Criteria) this;
        }

        public Criteria andIsparentNotBetween(String value1, String value2) {
            addCriterion("isparent not between", value1, value2, "isparent");
            return (Criteria) this;
        }

        public Criteria andShowIndexIsNull() {
            addCriterion("show_index is null");
            return (Criteria) this;
        }

        public Criteria andShowIndexIsNotNull() {
            addCriterion("show_index is not null");
            return (Criteria) this;
        }

        public Criteria andShowIndexEqualTo(String value) {
            addCriterion("show_index =", value, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexNotEqualTo(String value) {
            addCriterion("show_index <>", value, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexGreaterThan(String value) {
            addCriterion("show_index >", value, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexGreaterThanOrEqualTo(String value) {
            addCriterion("show_index >=", value, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexLessThan(String value) {
            addCriterion("show_index <", value, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexLessThanOrEqualTo(String value) {
            addCriterion("show_index <=", value, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexLike(String value) {
            addCriterion("show_index like", value, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexNotLike(String value) {
            addCriterion("show_index not like", value, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexIn(List<String> values) {
            addCriterion("show_index in", values, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexNotIn(List<String> values) {
            addCriterion("show_index not in", values, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexBetween(String value1, String value2) {
            addCriterion("show_index between", value1, value2, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexNotBetween(String value1, String value2) {
            addCriterion("show_index not between", value1, value2, "showIndex");
            return (Criteria) this;
        }

        public Criteria andClassImgIsNull() {
            addCriterion("class_img is null");
            return (Criteria) this;
        }

        public Criteria andClassImgIsNotNull() {
            addCriterion("class_img is not null");
            return (Criteria) this;
        }

        public Criteria andClassImgEqualTo(String value) {
            addCriterion("class_img =", value, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgNotEqualTo(String value) {
            addCriterion("class_img <>", value, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgGreaterThan(String value) {
            addCriterion("class_img >", value, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgGreaterThanOrEqualTo(String value) {
            addCriterion("class_img >=", value, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgLessThan(String value) {
            addCriterion("class_img <", value, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgLessThanOrEqualTo(String value) {
            addCriterion("class_img <=", value, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgLike(String value) {
            addCriterion("class_img like", value, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgNotLike(String value) {
            addCriterion("class_img not like", value, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgIn(List<String> values) {
            addCriterion("class_img in", values, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgNotIn(List<String> values) {
            addCriterion("class_img not in", values, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgBetween(String value1, String value2) {
            addCriterion("class_img between", value1, value2, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgNotBetween(String value1, String value2) {
            addCriterion("class_img not between", value1, value2, "classImg");
            return (Criteria) this;
        }

        public Criteria andXhClassIdsIsNull() {
            addCriterion("xh_class_ids is null");
            return (Criteria) this;
        }

        public Criteria andXhClassIdsIsNotNull() {
            addCriterion("xh_class_ids is not null");
            return (Criteria) this;
        }

        public Criteria andXhClassIdsEqualTo(String value) {
            addCriterion("xh_class_ids =", value, "xhClassIds");
            return (Criteria) this;
        }

        public Criteria andXhClassIdsNotEqualTo(String value) {
            addCriterion("xh_class_ids <>", value, "xhClassIds");
            return (Criteria) this;
        }

        public Criteria andXhClassIdsGreaterThan(String value) {
            addCriterion("xh_class_ids >", value, "xhClassIds");
            return (Criteria) this;
        }

        public Criteria andXhClassIdsGreaterThanOrEqualTo(String value) {
            addCriterion("xh_class_ids >=", value, "xhClassIds");
            return (Criteria) this;
        }

        public Criteria andXhClassIdsLessThan(String value) {
            addCriterion("xh_class_ids <", value, "xhClassIds");
            return (Criteria) this;
        }

        public Criteria andXhClassIdsLessThanOrEqualTo(String value) {
            addCriterion("xh_class_ids <=", value, "xhClassIds");
            return (Criteria) this;
        }

        public Criteria andXhClassIdsLike(String value) {
            addCriterion("xh_class_ids like", value, "xhClassIds");
            return (Criteria) this;
        }

        public Criteria andXhClassIdsNotLike(String value) {
            addCriterion("xh_class_ids not like", value, "xhClassIds");
            return (Criteria) this;
        }

        public Criteria andXhClassIdsIn(List<String> values) {
            addCriterion("xh_class_ids in", values, "xhClassIds");
            return (Criteria) this;
        }

        public Criteria andXhClassIdsNotIn(List<String> values) {
            addCriterion("xh_class_ids not in", values, "xhClassIds");
            return (Criteria) this;
        }

        public Criteria andXhClassIdsBetween(String value1, String value2) {
            addCriterion("xh_class_ids between", value1, value2, "xhClassIds");
            return (Criteria) this;
        }

        public Criteria andXhClassIdsNotBetween(String value1, String value2) {
            addCriterion("xh_class_ids not between", value1, value2, "xhClassIds");
            return (Criteria) this;
        }

        public Criteria andXhClassNameIsNull() {
            addCriterion("xh_class_name is null");
            return (Criteria) this;
        }

        public Criteria andXhClassNameIsNotNull() {
            addCriterion("xh_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andXhClassNameEqualTo(String value) {
            addCriterion("xh_class_name =", value, "xhClassName");
            return (Criteria) this;
        }

        public Criteria andXhClassNameNotEqualTo(String value) {
            addCriterion("xh_class_name <>", value, "xhClassName");
            return (Criteria) this;
        }

        public Criteria andXhClassNameGreaterThan(String value) {
            addCriterion("xh_class_name >", value, "xhClassName");
            return (Criteria) this;
        }

        public Criteria andXhClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("xh_class_name >=", value, "xhClassName");
            return (Criteria) this;
        }

        public Criteria andXhClassNameLessThan(String value) {
            addCriterion("xh_class_name <", value, "xhClassName");
            return (Criteria) this;
        }

        public Criteria andXhClassNameLessThanOrEqualTo(String value) {
            addCriterion("xh_class_name <=", value, "xhClassName");
            return (Criteria) this;
        }

        public Criteria andXhClassNameLike(String value) {
            addCriterion("xh_class_name like", value, "xhClassName");
            return (Criteria) this;
        }

        public Criteria andXhClassNameNotLike(String value) {
            addCriterion("xh_class_name not like", value, "xhClassName");
            return (Criteria) this;
        }

        public Criteria andXhClassNameIn(List<String> values) {
            addCriterion("xh_class_name in", values, "xhClassName");
            return (Criteria) this;
        }

        public Criteria andXhClassNameNotIn(List<String> values) {
            addCriterion("xh_class_name not in", values, "xhClassName");
            return (Criteria) this;
        }

        public Criteria andXhClassNameBetween(String value1, String value2) {
            addCriterion("xh_class_name between", value1, value2, "xhClassName");
            return (Criteria) this;
        }

        public Criteria andXhClassNameNotBetween(String value1, String value2) {
            addCriterion("xh_class_name not between", value1, value2, "xhClassName");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNull() {
            addCriterion("delete_status is null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNotNull() {
            addCriterion("delete_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusEqualTo(String value) {
            addCriterion("delete_status =", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotEqualTo(String value) {
            addCriterion("delete_status <>", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThan(String value) {
            addCriterion("delete_status >", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThanOrEqualTo(String value) {
            addCriterion("delete_status >=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThan(String value) {
            addCriterion("delete_status <", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThanOrEqualTo(String value) {
            addCriterion("delete_status <=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLike(String value) {
            addCriterion("delete_status like", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotLike(String value) {
            addCriterion("delete_status not like", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIn(List<String> values) {
            addCriterion("delete_status in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotIn(List<String> values) {
            addCriterion("delete_status not in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusBetween(String value1, String value2) {
            addCriterion("delete_status between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotBetween(String value1, String value2) {
            addCriterion("delete_status not between", value1, value2, "deleteStatus");
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