package com.huateng.wxmgr.common.entity;

import java.util.ArrayList;
import java.util.List;

public class WxMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxMenuExample() {
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
            addCriterion("IDS is null");
            return (Criteria) this;
        }

        public Criteria andIdsIsNotNull() {
            addCriterion("IDS is not null");
            return (Criteria) this;
        }

        public Criteria andIdsEqualTo(String value) {
            addCriterion("IDS =", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsNotEqualTo(String value) {
            addCriterion("IDS <>", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsGreaterThan(String value) {
            addCriterion("IDS >", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsGreaterThanOrEqualTo(String value) {
            addCriterion("IDS >=", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsLessThan(String value) {
            addCriterion("IDS <", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsLessThanOrEqualTo(String value) {
            addCriterion("IDS <=", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsLike(String value) {
            addCriterion("IDS like", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsNotLike(String value) {
            addCriterion("IDS not like", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsIn(List<String> values) {
            addCriterion("IDS in", values, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsNotIn(List<String> values) {
            addCriterion("IDS not in", values, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsBetween(String value1, String value2) {
            addCriterion("IDS between", value1, value2, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsNotBetween(String value1, String value2) {
            addCriterion("IDS not between", value1, value2, "ids");
            return (Criteria) this;
        }

        public Criteria andUrltokenIsNull() {
            addCriterion("URLTOKEN is null");
            return (Criteria) this;
        }

        public Criteria andUrltokenIsNotNull() {
            addCriterion("URLTOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andUrltokenEqualTo(String value) {
            addCriterion("URLTOKEN =", value, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenNotEqualTo(String value) {
            addCriterion("URLTOKEN <>", value, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenGreaterThan(String value) {
            addCriterion("URLTOKEN >", value, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenGreaterThanOrEqualTo(String value) {
            addCriterion("URLTOKEN >=", value, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenLessThan(String value) {
            addCriterion("URLTOKEN <", value, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenLessThanOrEqualTo(String value) {
            addCriterion("URLTOKEN <=", value, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenLike(String value) {
            addCriterion("URLTOKEN like", value, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenNotLike(String value) {
            addCriterion("URLTOKEN not like", value, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenIn(List<String> values) {
            addCriterion("URLTOKEN in", values, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenNotIn(List<String> values) {
            addCriterion("URLTOKEN not in", values, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenBetween(String value1, String value2) {
            addCriterion("URLTOKEN between", value1, value2, "urltoken");
            return (Criteria) this;
        }

        public Criteria andUrltokenNotBetween(String value1, String value2) {
            addCriterion("URLTOKEN not between", value1, value2, "urltoken");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("APPID is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("APPID is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("APPID =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("APPID <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("APPID >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("APPID >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("APPID <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("APPID <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("APPID like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("APPID not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("APPID in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("APPID not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("APPID between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("APPID not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("LEVEL_ is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("LEVEL_ is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Long value) {
            addCriterion("LEVEL_ =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Long value) {
            addCriterion("LEVEL_ <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Long value) {
            addCriterion("LEVEL_ >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Long value) {
            addCriterion("LEVEL_ >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Long value) {
            addCriterion("LEVEL_ <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Long value) {
            addCriterion("LEVEL_ <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Long> values) {
            addCriterion("LEVEL_ in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Long> values) {
            addCriterion("LEVEL_ not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Long value1, Long value2) {
            addCriterion("LEVEL_ between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Long value1, Long value2) {
            addCriterion("LEVEL_ not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("PID like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("PID not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("KEYWORD is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("KEYWORD is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("KEYWORD =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("KEYWORD <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("KEYWORD >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("KEYWORD >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("KEYWORD <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("KEYWORD <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("KEYWORD like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("KEYWORD not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("KEYWORD in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("KEYWORD not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("KEYWORD between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("KEYWORD not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("IS_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("IS_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Long value) {
            addCriterion("IS_SHOW =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Long value) {
            addCriterion("IS_SHOW <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Long value) {
            addCriterion("IS_SHOW >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_SHOW >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Long value) {
            addCriterion("IS_SHOW <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Long value) {
            addCriterion("IS_SHOW <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Long> values) {
            addCriterion("IS_SHOW in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Long> values) {
            addCriterion("IS_SHOW not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Long value1, Long value2) {
            addCriterion("IS_SHOW between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Long value1, Long value2) {
            addCriterion("IS_SHOW not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("SORT is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("SORT is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Long value) {
            addCriterion("SORT =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Long value) {
            addCriterion("SORT <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Long value) {
            addCriterion("SORT >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Long value) {
            addCriterion("SORT >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Long value) {
            addCriterion("SORT <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Long value) {
            addCriterion("SORT <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Long> values) {
            addCriterion("SORT in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Long> values) {
            addCriterion("SORT not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Long value1, Long value2) {
            addCriterion("SORT between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Long value1, Long value2) {
            addCriterion("SORT not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andGidIsNull() {
            addCriterion("GID is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("GID is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(String value) {
            addCriterion("GID =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(String value) {
            addCriterion("GID <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(String value) {
            addCriterion("GID >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(String value) {
            addCriterion("GID >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(String value) {
            addCriterion("GID <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(String value) {
            addCriterion("GID <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLike(String value) {
            addCriterion("GID like", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotLike(String value) {
            addCriterion("GID not like", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<String> values) {
            addCriterion("GID in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<String> values) {
            addCriterion("GID not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(String value1, String value2) {
            addCriterion("GID between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(String value1, String value2) {
            addCriterion("GID not between", value1, value2, "gid");
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