package com.chinasofti.sp.goods.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpGoodsinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpGoodsinfoExample() {
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

        public Criteria andGoodsTypeIsNull() {
            addCriterion("GOODS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("GOODS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(String value) {
            addCriterion("GOODS_TYPE =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(String value) {
            addCriterion("GOODS_TYPE <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(String value) {
            addCriterion("GOODS_TYPE >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_TYPE >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(String value) {
            addCriterion("GOODS_TYPE <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("GOODS_TYPE <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLike(String value) {
            addCriterion("GOODS_TYPE like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotLike(String value) {
            addCriterion("GOODS_TYPE not like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<String> values) {
            addCriterion("GOODS_TYPE in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<String> values) {
            addCriterion("GOODS_TYPE not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(String value1, String value2) {
            addCriterion("GOODS_TYPE between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("GOODS_TYPE not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNull() {
            addCriterion("goods_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("goods_code =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("goods_code <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("goods_code >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_code >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("goods_code <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_code <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("goods_code like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("goods_code not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("goods_code in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("goods_code not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("goods_code between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("goods_code not between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andVendoridsIsNull() {
            addCriterion("VENDORIDS is null");
            return (Criteria) this;
        }

        public Criteria andVendoridsIsNotNull() {
            addCriterion("VENDORIDS is not null");
            return (Criteria) this;
        }

        public Criteria andVendoridsEqualTo(String value) {
            addCriterion("VENDORIDS =", value, "vendorids");
            return (Criteria) this;
        }

        public Criteria andVendoridsNotEqualTo(String value) {
            addCriterion("VENDORIDS <>", value, "vendorids");
            return (Criteria) this;
        }

        public Criteria andVendoridsGreaterThan(String value) {
            addCriterion("VENDORIDS >", value, "vendorids");
            return (Criteria) this;
        }

        public Criteria andVendoridsGreaterThanOrEqualTo(String value) {
            addCriterion("VENDORIDS >=", value, "vendorids");
            return (Criteria) this;
        }

        public Criteria andVendoridsLessThan(String value) {
            addCriterion("VENDORIDS <", value, "vendorids");
            return (Criteria) this;
        }

        public Criteria andVendoridsLessThanOrEqualTo(String value) {
            addCriterion("VENDORIDS <=", value, "vendorids");
            return (Criteria) this;
        }

        public Criteria andVendoridsLike(String value) {
            addCriterion("VENDORIDS like", value, "vendorids");
            return (Criteria) this;
        }

        public Criteria andVendoridsNotLike(String value) {
            addCriterion("VENDORIDS not like", value, "vendorids");
            return (Criteria) this;
        }

        public Criteria andVendoridsIn(List<String> values) {
            addCriterion("VENDORIDS in", values, "vendorids");
            return (Criteria) this;
        }

        public Criteria andVendoridsNotIn(List<String> values) {
            addCriterion("VENDORIDS not in", values, "vendorids");
            return (Criteria) this;
        }

        public Criteria andVendoridsBetween(String value1, String value2) {
            addCriterion("VENDORIDS between", value1, value2, "vendorids");
            return (Criteria) this;
        }

        public Criteria andVendoridsNotBetween(String value1, String value2) {
            addCriterion("VENDORIDS not between", value1, value2, "vendorids");
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

        public Criteria andMouthTradeIsNull() {
            addCriterion("MOUTH_TRADE is null");
            return (Criteria) this;
        }

        public Criteria andMouthTradeIsNotNull() {
            addCriterion("MOUTH_TRADE is not null");
            return (Criteria) this;
        }

        public Criteria andMouthTradeEqualTo(Integer value) {
            addCriterion("MOUTH_TRADE =", value, "mouthTrade");
            return (Criteria) this;
        }

        public Criteria andMouthTradeNotEqualTo(Integer value) {
            addCriterion("MOUTH_TRADE <>", value, "mouthTrade");
            return (Criteria) this;
        }

        public Criteria andMouthTradeGreaterThan(Integer value) {
            addCriterion("MOUTH_TRADE >", value, "mouthTrade");
            return (Criteria) this;
        }

        public Criteria andMouthTradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MOUTH_TRADE >=", value, "mouthTrade");
            return (Criteria) this;
        }

        public Criteria andMouthTradeLessThan(Integer value) {
            addCriterion("MOUTH_TRADE <", value, "mouthTrade");
            return (Criteria) this;
        }

        public Criteria andMouthTradeLessThanOrEqualTo(Integer value) {
            addCriterion("MOUTH_TRADE <=", value, "mouthTrade");
            return (Criteria) this;
        }

        public Criteria andMouthTradeIn(List<Integer> values) {
            addCriterion("MOUTH_TRADE in", values, "mouthTrade");
            return (Criteria) this;
        }

        public Criteria andMouthTradeNotIn(List<Integer> values) {
            addCriterion("MOUTH_TRADE not in", values, "mouthTrade");
            return (Criteria) this;
        }

        public Criteria andMouthTradeBetween(Integer value1, Integer value2) {
            addCriterion("MOUTH_TRADE between", value1, value2, "mouthTrade");
            return (Criteria) this;
        }

        public Criteria andMouthTradeNotBetween(Integer value1, Integer value2) {
            addCriterion("MOUTH_TRADE not between", value1, value2, "mouthTrade");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNull() {
            addCriterion("SUBTITLE is null");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNotNull() {
            addCriterion("SUBTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitleEqualTo(String value) {
            addCriterion("SUBTITLE =", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotEqualTo(String value) {
            addCriterion("SUBTITLE <>", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThan(String value) {
            addCriterion("SUBTITLE >", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("SUBTITLE >=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThan(String value) {
            addCriterion("SUBTITLE <", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThanOrEqualTo(String value) {
            addCriterion("SUBTITLE <=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLike(String value) {
            addCriterion("SUBTITLE like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotLike(String value) {
            addCriterion("SUBTITLE not like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleIn(List<String> values) {
            addCriterion("SUBTITLE in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotIn(List<String> values) {
            addCriterion("SUBTITLE not in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleBetween(String value1, String value2) {
            addCriterion("SUBTITLE between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotBetween(String value1, String value2) {
            addCriterion("SUBTITLE not between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andCommonIsNull() {
            addCriterion("COMMON is null");
            return (Criteria) this;
        }

        public Criteria andCommonIsNotNull() {
            addCriterion("COMMON is not null");
            return (Criteria) this;
        }

        public Criteria andCommonEqualTo(String value) {
            addCriterion("COMMON =", value, "common");
            return (Criteria) this;
        }

        public Criteria andCommonNotEqualTo(String value) {
            addCriterion("COMMON <>", value, "common");
            return (Criteria) this;
        }

        public Criteria andCommonGreaterThan(String value) {
            addCriterion("COMMON >", value, "common");
            return (Criteria) this;
        }

        public Criteria andCommonGreaterThanOrEqualTo(String value) {
            addCriterion("COMMON >=", value, "common");
            return (Criteria) this;
        }

        public Criteria andCommonLessThan(String value) {
            addCriterion("COMMON <", value, "common");
            return (Criteria) this;
        }

        public Criteria andCommonLessThanOrEqualTo(String value) {
            addCriterion("COMMON <=", value, "common");
            return (Criteria) this;
        }

        public Criteria andCommonLike(String value) {
            addCriterion("COMMON like", value, "common");
            return (Criteria) this;
        }

        public Criteria andCommonNotLike(String value) {
            addCriterion("COMMON not like", value, "common");
            return (Criteria) this;
        }

        public Criteria andCommonIn(List<String> values) {
            addCriterion("COMMON in", values, "common");
            return (Criteria) this;
        }

        public Criteria andCommonNotIn(List<String> values) {
            addCriterion("COMMON not in", values, "common");
            return (Criteria) this;
        }

        public Criteria andCommonBetween(String value1, String value2) {
            addCriterion("COMMON between", value1, value2, "common");
            return (Criteria) this;
        }

        public Criteria andCommonNotBetween(String value1, String value2) {
            addCriterion("COMMON not between", value1, value2, "common");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDisPriceIsNull() {
            addCriterion("DIS_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andDisPriceIsNotNull() {
            addCriterion("DIS_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andDisPriceEqualTo(BigDecimal value) {
            addCriterion("DIS_PRICE =", value, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceNotEqualTo(BigDecimal value) {
            addCriterion("DIS_PRICE <>", value, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceGreaterThan(BigDecimal value) {
            addCriterion("DIS_PRICE >", value, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DIS_PRICE >=", value, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceLessThan(BigDecimal value) {
            addCriterion("DIS_PRICE <", value, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DIS_PRICE <=", value, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceIn(List<BigDecimal> values) {
            addCriterion("DIS_PRICE in", values, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceNotIn(List<BigDecimal> values) {
            addCriterion("DIS_PRICE not in", values, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIS_PRICE between", value1, value2, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIS_PRICE not between", value1, value2, "disPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsClassIdsIsNull() {
            addCriterion("GOODS_CLASS_IDS is null");
            return (Criteria) this;
        }

        public Criteria andGoodsClassIdsIsNotNull() {
            addCriterion("GOODS_CLASS_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsClassIdsEqualTo(String value) {
            addCriterion("GOODS_CLASS_IDS =", value, "goodsClassIds");
            return (Criteria) this;
        }

        public Criteria andGoodsClassIdsNotEqualTo(String value) {
            addCriterion("GOODS_CLASS_IDS <>", value, "goodsClassIds");
            return (Criteria) this;
        }

        public Criteria andGoodsClassIdsGreaterThan(String value) {
            addCriterion("GOODS_CLASS_IDS >", value, "goodsClassIds");
            return (Criteria) this;
        }

        public Criteria andGoodsClassIdsGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_CLASS_IDS >=", value, "goodsClassIds");
            return (Criteria) this;
        }

        public Criteria andGoodsClassIdsLessThan(String value) {
            addCriterion("GOODS_CLASS_IDS <", value, "goodsClassIds");
            return (Criteria) this;
        }

        public Criteria andGoodsClassIdsLessThanOrEqualTo(String value) {
            addCriterion("GOODS_CLASS_IDS <=", value, "goodsClassIds");
            return (Criteria) this;
        }

        public Criteria andGoodsClassIdsLike(String value) {
            addCriterion("GOODS_CLASS_IDS like", value, "goodsClassIds");
            return (Criteria) this;
        }

        public Criteria andGoodsClassIdsNotLike(String value) {
            addCriterion("GOODS_CLASS_IDS not like", value, "goodsClassIds");
            return (Criteria) this;
        }

        public Criteria andGoodsClassIdsIn(List<String> values) {
            addCriterion("GOODS_CLASS_IDS in", values, "goodsClassIds");
            return (Criteria) this;
        }

        public Criteria andGoodsClassIdsNotIn(List<String> values) {
            addCriterion("GOODS_CLASS_IDS not in", values, "goodsClassIds");
            return (Criteria) this;
        }

        public Criteria andGoodsClassIdsBetween(String value1, String value2) {
            addCriterion("GOODS_CLASS_IDS between", value1, value2, "goodsClassIds");
            return (Criteria) this;
        }

        public Criteria andGoodsClassIdsNotBetween(String value1, String value2) {
            addCriterion("GOODS_CLASS_IDS not between", value1, value2, "goodsClassIds");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("STANDARD is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("STANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("STANDARD =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("STANDARD <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("STANDARD >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("STANDARD >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("STANDARD <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("STANDARD <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("STANDARD like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("STANDARD not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("STANDARD in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("STANDARD not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("STANDARD between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("STANDARD not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andStoreNumIsNull() {
            addCriterion("STORE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andStoreNumIsNotNull() {
            addCriterion("STORE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNumEqualTo(Integer value) {
            addCriterion("STORE_NUM =", value, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumNotEqualTo(Integer value) {
            addCriterion("STORE_NUM <>", value, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumGreaterThan(Integer value) {
            addCriterion("STORE_NUM >", value, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("STORE_NUM >=", value, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumLessThan(Integer value) {
            addCriterion("STORE_NUM <", value, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumLessThanOrEqualTo(Integer value) {
            addCriterion("STORE_NUM <=", value, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumIn(List<Integer> values) {
            addCriterion("STORE_NUM in", values, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumNotIn(List<Integer> values) {
            addCriterion("STORE_NUM not in", values, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumBetween(Integer value1, Integer value2) {
            addCriterion("STORE_NUM between", value1, value2, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumNotBetween(Integer value1, Integer value2) {
            addCriterion("STORE_NUM not between", value1, value2, "storeNum");
            return (Criteria) this;
        }

        public Criteria andReviewDescIsNull() {
            addCriterion("REVIEW_DESC is null");
            return (Criteria) this;
        }

        public Criteria andReviewDescIsNotNull() {
            addCriterion("REVIEW_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andReviewDescEqualTo(String value) {
            addCriterion("REVIEW_DESC =", value, "reviewDesc");
            return (Criteria) this;
        }

        public Criteria andReviewDescNotEqualTo(String value) {
            addCriterion("REVIEW_DESC <>", value, "reviewDesc");
            return (Criteria) this;
        }

        public Criteria andReviewDescGreaterThan(String value) {
            addCriterion("REVIEW_DESC >", value, "reviewDesc");
            return (Criteria) this;
        }

        public Criteria andReviewDescGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_DESC >=", value, "reviewDesc");
            return (Criteria) this;
        }

        public Criteria andReviewDescLessThan(String value) {
            addCriterion("REVIEW_DESC <", value, "reviewDesc");
            return (Criteria) this;
        }

        public Criteria andReviewDescLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_DESC <=", value, "reviewDesc");
            return (Criteria) this;
        }

        public Criteria andReviewDescLike(String value) {
            addCriterion("REVIEW_DESC like", value, "reviewDesc");
            return (Criteria) this;
        }

        public Criteria andReviewDescNotLike(String value) {
            addCriterion("REVIEW_DESC not like", value, "reviewDesc");
            return (Criteria) this;
        }

        public Criteria andReviewDescIn(List<String> values) {
            addCriterion("REVIEW_DESC in", values, "reviewDesc");
            return (Criteria) this;
        }

        public Criteria andReviewDescNotIn(List<String> values) {
            addCriterion("REVIEW_DESC not in", values, "reviewDesc");
            return (Criteria) this;
        }

        public Criteria andReviewDescBetween(String value1, String value2) {
            addCriterion("REVIEW_DESC between", value1, value2, "reviewDesc");
            return (Criteria) this;
        }

        public Criteria andReviewDescNotBetween(String value1, String value2) {
            addCriterion("REVIEW_DESC not between", value1, value2, "reviewDesc");
            return (Criteria) this;
        }

        public Criteria andReviewStatuesIsNull() {
            addCriterion("REVIEW_STATUES is null");
            return (Criteria) this;
        }

        public Criteria andReviewStatuesIsNotNull() {
            addCriterion("REVIEW_STATUES is not null");
            return (Criteria) this;
        }

        public Criteria andReviewStatuesEqualTo(String value) {
            addCriterion("REVIEW_STATUES =", value, "reviewStatues");
            return (Criteria) this;
        }

        public Criteria andReviewStatuesNotEqualTo(String value) {
            addCriterion("REVIEW_STATUES <>", value, "reviewStatues");
            return (Criteria) this;
        }

        public Criteria andReviewStatuesGreaterThan(String value) {
            addCriterion("REVIEW_STATUES >", value, "reviewStatues");
            return (Criteria) this;
        }

        public Criteria andReviewStatuesGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_STATUES >=", value, "reviewStatues");
            return (Criteria) this;
        }

        public Criteria andReviewStatuesLessThan(String value) {
            addCriterion("REVIEW_STATUES <", value, "reviewStatues");
            return (Criteria) this;
        }

        public Criteria andReviewStatuesLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_STATUES <=", value, "reviewStatues");
            return (Criteria) this;
        }

        public Criteria andReviewStatuesLike(String value) {
            addCriterion("REVIEW_STATUES like", value, "reviewStatues");
            return (Criteria) this;
        }

        public Criteria andReviewStatuesNotLike(String value) {
            addCriterion("REVIEW_STATUES not like", value, "reviewStatues");
            return (Criteria) this;
        }

        public Criteria andReviewStatuesIn(List<String> values) {
            addCriterion("REVIEW_STATUES in", values, "reviewStatues");
            return (Criteria) this;
        }

        public Criteria andReviewStatuesNotIn(List<String> values) {
            addCriterion("REVIEW_STATUES not in", values, "reviewStatues");
            return (Criteria) this;
        }

        public Criteria andReviewStatuesBetween(String value1, String value2) {
            addCriterion("REVIEW_STATUES between", value1, value2, "reviewStatues");
            return (Criteria) this;
        }

        public Criteria andReviewStatuesNotBetween(String value1, String value2) {
            addCriterion("REVIEW_STATUES not between", value1, value2, "reviewStatues");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("UPDATE_BY =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("UPDATE_BY <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("UPDATE_BY >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("UPDATE_BY <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("UPDATE_BY like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("UPDATE_BY not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("UPDATE_BY in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("UPDATE_BY not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("UPDATE_BY between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("UPDATE_BY not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("UPDATE_TIME like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("UPDATE_TIME not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("CREATE_BY =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("CREATE_BY like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("CREATE_BY not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("CREATE_BY in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("CREATE_BY not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("CREATE_BY between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCollNumIsNull() {
            addCriterion("COLL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCollNumIsNotNull() {
            addCriterion("COLL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCollNumEqualTo(Integer value) {
            addCriterion("COLL_NUM =", value, "collNum");
            return (Criteria) this;
        }

        public Criteria andCollNumNotEqualTo(Integer value) {
            addCriterion("COLL_NUM <>", value, "collNum");
            return (Criteria) this;
        }

        public Criteria andCollNumGreaterThan(Integer value) {
            addCriterion("COLL_NUM >", value, "collNum");
            return (Criteria) this;
        }

        public Criteria andCollNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("COLL_NUM >=", value, "collNum");
            return (Criteria) this;
        }

        public Criteria andCollNumLessThan(Integer value) {
            addCriterion("COLL_NUM <", value, "collNum");
            return (Criteria) this;
        }

        public Criteria andCollNumLessThanOrEqualTo(Integer value) {
            addCriterion("COLL_NUM <=", value, "collNum");
            return (Criteria) this;
        }

        public Criteria andCollNumIn(List<Integer> values) {
            addCriterion("COLL_NUM in", values, "collNum");
            return (Criteria) this;
        }

        public Criteria andCollNumNotIn(List<Integer> values) {
            addCriterion("COLL_NUM not in", values, "collNum");
            return (Criteria) this;
        }

        public Criteria andCollNumBetween(Integer value1, Integer value2) {
            addCriterion("COLL_NUM between", value1, value2, "collNum");
            return (Criteria) this;
        }

        public Criteria andCollNumNotBetween(Integer value1, Integer value2) {
            addCriterion("COLL_NUM not between", value1, value2, "collNum");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("START_TIME like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("START_TIME not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("END_TIME like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("END_TIME not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIsNull() {
            addCriterion("ONLINE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIsNotNull() {
            addCriterion("ONLINE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeEqualTo(String value) {
            addCriterion("ONLINE_TIME =", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotEqualTo(String value) {
            addCriterion("ONLINE_TIME <>", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeGreaterThan(String value) {
            addCriterion("ONLINE_TIME >", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ONLINE_TIME >=", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeLessThan(String value) {
            addCriterion("ONLINE_TIME <", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeLessThanOrEqualTo(String value) {
            addCriterion("ONLINE_TIME <=", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeLike(String value) {
            addCriterion("ONLINE_TIME like", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotLike(String value) {
            addCriterion("ONLINE_TIME not like", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIn(List<String> values) {
            addCriterion("ONLINE_TIME in", values, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotIn(List<String> values) {
            addCriterion("ONLINE_TIME not in", values, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeBetween(String value1, String value2) {
            addCriterion("ONLINE_TIME between", value1, value2, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotBetween(String value1, String value2) {
            addCriterion("ONLINE_TIME not between", value1, value2, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("LEAVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("LEAVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(String value) {
            addCriterion("LEAVE_TIME =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(String value) {
            addCriterion("LEAVE_TIME <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(String value) {
            addCriterion("LEAVE_TIME >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LEAVE_TIME >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(String value) {
            addCriterion("LEAVE_TIME <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(String value) {
            addCriterion("LEAVE_TIME <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLike(String value) {
            addCriterion("LEAVE_TIME like", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotLike(String value) {
            addCriterion("LEAVE_TIME not like", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<String> values) {
            addCriterion("LEAVE_TIME in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<String> values) {
            addCriterion("LEAVE_TIME not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(String value1, String value2) {
            addCriterion("LEAVE_TIME between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(String value1, String value2) {
            addCriterion("LEAVE_TIME not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andBrandIdsIsNull() {
            addCriterion("BRAND_IDS is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdsIsNotNull() {
            addCriterion("BRAND_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdsEqualTo(String value) {
            addCriterion("BRAND_IDS =", value, "brandIds");
            return (Criteria) this;
        }

        public Criteria andBrandIdsNotEqualTo(String value) {
            addCriterion("BRAND_IDS <>", value, "brandIds");
            return (Criteria) this;
        }

        public Criteria andBrandIdsGreaterThan(String value) {
            addCriterion("BRAND_IDS >", value, "brandIds");
            return (Criteria) this;
        }

        public Criteria andBrandIdsGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND_IDS >=", value, "brandIds");
            return (Criteria) this;
        }

        public Criteria andBrandIdsLessThan(String value) {
            addCriterion("BRAND_IDS <", value, "brandIds");
            return (Criteria) this;
        }

        public Criteria andBrandIdsLessThanOrEqualTo(String value) {
            addCriterion("BRAND_IDS <=", value, "brandIds");
            return (Criteria) this;
        }

        public Criteria andBrandIdsLike(String value) {
            addCriterion("BRAND_IDS like", value, "brandIds");
            return (Criteria) this;
        }

        public Criteria andBrandIdsNotLike(String value) {
            addCriterion("BRAND_IDS not like", value, "brandIds");
            return (Criteria) this;
        }

        public Criteria andBrandIdsIn(List<String> values) {
            addCriterion("BRAND_IDS in", values, "brandIds");
            return (Criteria) this;
        }

        public Criteria andBrandIdsNotIn(List<String> values) {
            addCriterion("BRAND_IDS not in", values, "brandIds");
            return (Criteria) this;
        }

        public Criteria andBrandIdsBetween(String value1, String value2) {
            addCriterion("BRAND_IDS between", value1, value2, "brandIds");
            return (Criteria) this;
        }

        public Criteria andBrandIdsNotBetween(String value1, String value2) {
            addCriterion("BRAND_IDS not between", value1, value2, "brandIds");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Float value) {
            addCriterion("WEIGHT =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Float value) {
            addCriterion("WEIGHT <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Float value) {
            addCriterion("WEIGHT >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("WEIGHT >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Float value) {
            addCriterion("WEIGHT <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Float value) {
            addCriterion("WEIGHT <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Float> values) {
            addCriterion("WEIGHT in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Float> values) {
            addCriterion("WEIGHT not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Float value1, Float value2) {
            addCriterion("WEIGHT between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Float value1, Float value2) {
            addCriterion("WEIGHT not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andDeliveWayIsNull() {
            addCriterion("DELIVE_WAY is null");
            return (Criteria) this;
        }

        public Criteria andDeliveWayIsNotNull() {
            addCriterion("DELIVE_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveWayEqualTo(String value) {
            addCriterion("DELIVE_WAY =", value, "deliveWay");
            return (Criteria) this;
        }

        public Criteria andDeliveWayNotEqualTo(String value) {
            addCriterion("DELIVE_WAY <>", value, "deliveWay");
            return (Criteria) this;
        }

        public Criteria andDeliveWayGreaterThan(String value) {
            addCriterion("DELIVE_WAY >", value, "deliveWay");
            return (Criteria) this;
        }

        public Criteria andDeliveWayGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVE_WAY >=", value, "deliveWay");
            return (Criteria) this;
        }

        public Criteria andDeliveWayLessThan(String value) {
            addCriterion("DELIVE_WAY <", value, "deliveWay");
            return (Criteria) this;
        }

        public Criteria andDeliveWayLessThanOrEqualTo(String value) {
            addCriterion("DELIVE_WAY <=", value, "deliveWay");
            return (Criteria) this;
        }

        public Criteria andDeliveWayLike(String value) {
            addCriterion("DELIVE_WAY like", value, "deliveWay");
            return (Criteria) this;
        }

        public Criteria andDeliveWayNotLike(String value) {
            addCriterion("DELIVE_WAY not like", value, "deliveWay");
            return (Criteria) this;
        }

        public Criteria andDeliveWayIn(List<String> values) {
            addCriterion("DELIVE_WAY in", values, "deliveWay");
            return (Criteria) this;
        }

        public Criteria andDeliveWayNotIn(List<String> values) {
            addCriterion("DELIVE_WAY not in", values, "deliveWay");
            return (Criteria) this;
        }

        public Criteria andDeliveWayBetween(String value1, String value2) {
            addCriterion("DELIVE_WAY between", value1, value2, "deliveWay");
            return (Criteria) this;
        }

        public Criteria andDeliveWayNotBetween(String value1, String value2) {
            addCriterion("DELIVE_WAY not between", value1, value2, "deliveWay");
            return (Criteria) this;
        }

        public Criteria andIsDisVerdornameIsNull() {
            addCriterion("IS_DIS_VERDORNAME is null");
            return (Criteria) this;
        }

        public Criteria andIsDisVerdornameIsNotNull() {
            addCriterion("IS_DIS_VERDORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisVerdornameEqualTo(String value) {
            addCriterion("IS_DIS_VERDORNAME =", value, "isDisVerdorname");
            return (Criteria) this;
        }

        public Criteria andIsDisVerdornameNotEqualTo(String value) {
            addCriterion("IS_DIS_VERDORNAME <>", value, "isDisVerdorname");
            return (Criteria) this;
        }

        public Criteria andIsDisVerdornameGreaterThan(String value) {
            addCriterion("IS_DIS_VERDORNAME >", value, "isDisVerdorname");
            return (Criteria) this;
        }

        public Criteria andIsDisVerdornameGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DIS_VERDORNAME >=", value, "isDisVerdorname");
            return (Criteria) this;
        }

        public Criteria andIsDisVerdornameLessThan(String value) {
            addCriterion("IS_DIS_VERDORNAME <", value, "isDisVerdorname");
            return (Criteria) this;
        }

        public Criteria andIsDisVerdornameLessThanOrEqualTo(String value) {
            addCriterion("IS_DIS_VERDORNAME <=", value, "isDisVerdorname");
            return (Criteria) this;
        }

        public Criteria andIsDisVerdornameLike(String value) {
            addCriterion("IS_DIS_VERDORNAME like", value, "isDisVerdorname");
            return (Criteria) this;
        }

        public Criteria andIsDisVerdornameNotLike(String value) {
            addCriterion("IS_DIS_VERDORNAME not like", value, "isDisVerdorname");
            return (Criteria) this;
        }

        public Criteria andIsDisVerdornameIn(List<String> values) {
            addCriterion("IS_DIS_VERDORNAME in", values, "isDisVerdorname");
            return (Criteria) this;
        }

        public Criteria andIsDisVerdornameNotIn(List<String> values) {
            addCriterion("IS_DIS_VERDORNAME not in", values, "isDisVerdorname");
            return (Criteria) this;
        }

        public Criteria andIsDisVerdornameBetween(String value1, String value2) {
            addCriterion("IS_DIS_VERDORNAME between", value1, value2, "isDisVerdorname");
            return (Criteria) this;
        }

        public Criteria andIsDisVerdornameNotBetween(String value1, String value2) {
            addCriterion("IS_DIS_VERDORNAME not between", value1, value2, "isDisVerdorname");
            return (Criteria) this;
        }

        public Criteria andIsDisStandardIsNull() {
            addCriterion("IS_DIS_STANDARD is null");
            return (Criteria) this;
        }

        public Criteria andIsDisStandardIsNotNull() {
            addCriterion("IS_DIS_STANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisStandardEqualTo(String value) {
            addCriterion("IS_DIS_STANDARD =", value, "isDisStandard");
            return (Criteria) this;
        }

        public Criteria andIsDisStandardNotEqualTo(String value) {
            addCriterion("IS_DIS_STANDARD <>", value, "isDisStandard");
            return (Criteria) this;
        }

        public Criteria andIsDisStandardGreaterThan(String value) {
            addCriterion("IS_DIS_STANDARD >", value, "isDisStandard");
            return (Criteria) this;
        }

        public Criteria andIsDisStandardGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DIS_STANDARD >=", value, "isDisStandard");
            return (Criteria) this;
        }

        public Criteria andIsDisStandardLessThan(String value) {
            addCriterion("IS_DIS_STANDARD <", value, "isDisStandard");
            return (Criteria) this;
        }

        public Criteria andIsDisStandardLessThanOrEqualTo(String value) {
            addCriterion("IS_DIS_STANDARD <=", value, "isDisStandard");
            return (Criteria) this;
        }

        public Criteria andIsDisStandardLike(String value) {
            addCriterion("IS_DIS_STANDARD like", value, "isDisStandard");
            return (Criteria) this;
        }

        public Criteria andIsDisStandardNotLike(String value) {
            addCriterion("IS_DIS_STANDARD not like", value, "isDisStandard");
            return (Criteria) this;
        }

        public Criteria andIsDisStandardIn(List<String> values) {
            addCriterion("IS_DIS_STANDARD in", values, "isDisStandard");
            return (Criteria) this;
        }

        public Criteria andIsDisStandardNotIn(List<String> values) {
            addCriterion("IS_DIS_STANDARD not in", values, "isDisStandard");
            return (Criteria) this;
        }

        public Criteria andIsDisStandardBetween(String value1, String value2) {
            addCriterion("IS_DIS_STANDARD between", value1, value2, "isDisStandard");
            return (Criteria) this;
        }

        public Criteria andIsDisStandardNotBetween(String value1, String value2) {
            addCriterion("IS_DIS_STANDARD not between", value1, value2, "isDisStandard");
            return (Criteria) this;
        }

        public Criteria andIsDisStoreIsNull() {
            addCriterion("IS_DIS_STORE is null");
            return (Criteria) this;
        }

        public Criteria andIsDisStoreIsNotNull() {
            addCriterion("IS_DIS_STORE is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisStoreEqualTo(String value) {
            addCriterion("IS_DIS_STORE =", value, "isDisStore");
            return (Criteria) this;
        }

        public Criteria andIsDisStoreNotEqualTo(String value) {
            addCriterion("IS_DIS_STORE <>", value, "isDisStore");
            return (Criteria) this;
        }

        public Criteria andIsDisStoreGreaterThan(String value) {
            addCriterion("IS_DIS_STORE >", value, "isDisStore");
            return (Criteria) this;
        }

        public Criteria andIsDisStoreGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DIS_STORE >=", value, "isDisStore");
            return (Criteria) this;
        }

        public Criteria andIsDisStoreLessThan(String value) {
            addCriterion("IS_DIS_STORE <", value, "isDisStore");
            return (Criteria) this;
        }

        public Criteria andIsDisStoreLessThanOrEqualTo(String value) {
            addCriterion("IS_DIS_STORE <=", value, "isDisStore");
            return (Criteria) this;
        }

        public Criteria andIsDisStoreLike(String value) {
            addCriterion("IS_DIS_STORE like", value, "isDisStore");
            return (Criteria) this;
        }

        public Criteria andIsDisStoreNotLike(String value) {
            addCriterion("IS_DIS_STORE not like", value, "isDisStore");
            return (Criteria) this;
        }

        public Criteria andIsDisStoreIn(List<String> values) {
            addCriterion("IS_DIS_STORE in", values, "isDisStore");
            return (Criteria) this;
        }

        public Criteria andIsDisStoreNotIn(List<String> values) {
            addCriterion("IS_DIS_STORE not in", values, "isDisStore");
            return (Criteria) this;
        }

        public Criteria andIsDisStoreBetween(String value1, String value2) {
            addCriterion("IS_DIS_STORE between", value1, value2, "isDisStore");
            return (Criteria) this;
        }

        public Criteria andIsDisStoreNotBetween(String value1, String value2) {
            addCriterion("IS_DIS_STORE not between", value1, value2, "isDisStore");
            return (Criteria) this;
        }

        public Criteria andLimitOrderNumIsNull() {
            addCriterion("LIMIT_ORDER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andLimitOrderNumIsNotNull() {
            addCriterion("LIMIT_ORDER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andLimitOrderNumEqualTo(Integer value) {
            addCriterion("LIMIT_ORDER_NUM =", value, "limitOrderNum");
            return (Criteria) this;
        }

        public Criteria andLimitOrderNumNotEqualTo(Integer value) {
            addCriterion("LIMIT_ORDER_NUM <>", value, "limitOrderNum");
            return (Criteria) this;
        }

        public Criteria andLimitOrderNumGreaterThan(Integer value) {
            addCriterion("LIMIT_ORDER_NUM >", value, "limitOrderNum");
            return (Criteria) this;
        }

        public Criteria andLimitOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIMIT_ORDER_NUM >=", value, "limitOrderNum");
            return (Criteria) this;
        }

        public Criteria andLimitOrderNumLessThan(Integer value) {
            addCriterion("LIMIT_ORDER_NUM <", value, "limitOrderNum");
            return (Criteria) this;
        }

        public Criteria andLimitOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("LIMIT_ORDER_NUM <=", value, "limitOrderNum");
            return (Criteria) this;
        }

        public Criteria andLimitOrderNumIn(List<Integer> values) {
            addCriterion("LIMIT_ORDER_NUM in", values, "limitOrderNum");
            return (Criteria) this;
        }

        public Criteria andLimitOrderNumNotIn(List<Integer> values) {
            addCriterion("LIMIT_ORDER_NUM not in", values, "limitOrderNum");
            return (Criteria) this;
        }

        public Criteria andLimitOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("LIMIT_ORDER_NUM between", value1, value2, "limitOrderNum");
            return (Criteria) this;
        }

        public Criteria andLimitOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("LIMIT_ORDER_NUM not between", value1, value2, "limitOrderNum");
            return (Criteria) this;
        }

        public Criteria andReviewByIsNull() {
            addCriterion("REVIEW_BY is null");
            return (Criteria) this;
        }

        public Criteria andReviewByIsNotNull() {
            addCriterion("REVIEW_BY is not null");
            return (Criteria) this;
        }

        public Criteria andReviewByEqualTo(String value) {
            addCriterion("REVIEW_BY =", value, "reviewBy");
            return (Criteria) this;
        }

        public Criteria andReviewByNotEqualTo(String value) {
            addCriterion("REVIEW_BY <>", value, "reviewBy");
            return (Criteria) this;
        }

        public Criteria andReviewByGreaterThan(String value) {
            addCriterion("REVIEW_BY >", value, "reviewBy");
            return (Criteria) this;
        }

        public Criteria andReviewByGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_BY >=", value, "reviewBy");
            return (Criteria) this;
        }

        public Criteria andReviewByLessThan(String value) {
            addCriterion("REVIEW_BY <", value, "reviewBy");
            return (Criteria) this;
        }

        public Criteria andReviewByLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_BY <=", value, "reviewBy");
            return (Criteria) this;
        }

        public Criteria andReviewByLike(String value) {
            addCriterion("REVIEW_BY like", value, "reviewBy");
            return (Criteria) this;
        }

        public Criteria andReviewByNotLike(String value) {
            addCriterion("REVIEW_BY not like", value, "reviewBy");
            return (Criteria) this;
        }

        public Criteria andReviewByIn(List<String> values) {
            addCriterion("REVIEW_BY in", values, "reviewBy");
            return (Criteria) this;
        }

        public Criteria andReviewByNotIn(List<String> values) {
            addCriterion("REVIEW_BY not in", values, "reviewBy");
            return (Criteria) this;
        }

        public Criteria andReviewByBetween(String value1, String value2) {
            addCriterion("REVIEW_BY between", value1, value2, "reviewBy");
            return (Criteria) this;
        }

        public Criteria andReviewByNotBetween(String value1, String value2) {
            addCriterion("REVIEW_BY not between", value1, value2, "reviewBy");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIsNull() {
            addCriterion("REVIEW_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIsNotNull() {
            addCriterion("REVIEW_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReviewTimeEqualTo(String value) {
            addCriterion("REVIEW_TIME =", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotEqualTo(String value) {
            addCriterion("REVIEW_TIME <>", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThan(String value) {
            addCriterion("REVIEW_TIME >", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_TIME >=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThan(String value) {
            addCriterion("REVIEW_TIME <", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_TIME <=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLike(String value) {
            addCriterion("REVIEW_TIME like", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotLike(String value) {
            addCriterion("REVIEW_TIME not like", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIn(List<String> values) {
            addCriterion("REVIEW_TIME in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotIn(List<String> values) {
            addCriterion("REVIEW_TIME not in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeBetween(String value1, String value2) {
            addCriterion("REVIEW_TIME between", value1, value2, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotBetween(String value1, String value2) {
            addCriterion("REVIEW_TIME not between", value1, value2, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andTotalTradeIsNull() {
            addCriterion("TOTAL_TRADE is null");
            return (Criteria) this;
        }

        public Criteria andTotalTradeIsNotNull() {
            addCriterion("TOTAL_TRADE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTradeEqualTo(Long value) {
            addCriterion("TOTAL_TRADE =", value, "totalTrade");
            return (Criteria) this;
        }

        public Criteria andTotalTradeNotEqualTo(Long value) {
            addCriterion("TOTAL_TRADE <>", value, "totalTrade");
            return (Criteria) this;
        }

        public Criteria andTotalTradeGreaterThan(Long value) {
            addCriterion("TOTAL_TRADE >", value, "totalTrade");
            return (Criteria) this;
        }

        public Criteria andTotalTradeGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_TRADE >=", value, "totalTrade");
            return (Criteria) this;
        }

        public Criteria andTotalTradeLessThan(Long value) {
            addCriterion("TOTAL_TRADE <", value, "totalTrade");
            return (Criteria) this;
        }

        public Criteria andTotalTradeLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_TRADE <=", value, "totalTrade");
            return (Criteria) this;
        }

        public Criteria andTotalTradeIn(List<Long> values) {
            addCriterion("TOTAL_TRADE in", values, "totalTrade");
            return (Criteria) this;
        }

        public Criteria andTotalTradeNotIn(List<Long> values) {
            addCriterion("TOTAL_TRADE not in", values, "totalTrade");
            return (Criteria) this;
        }

        public Criteria andTotalTradeBetween(Long value1, Long value2) {
            addCriterion("TOTAL_TRADE between", value1, value2, "totalTrade");
            return (Criteria) this;
        }

        public Criteria andTotalTradeNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_TRADE not between", value1, value2, "totalTrade");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("PAY_WAY is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("PAY_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(String value) {
            addCriterion("PAY_WAY =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(String value) {
            addCriterion("PAY_WAY <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(String value) {
            addCriterion("PAY_WAY >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_WAY >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(String value) {
            addCriterion("PAY_WAY <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(String value) {
            addCriterion("PAY_WAY <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLike(String value) {
            addCriterion("PAY_WAY like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotLike(String value) {
            addCriterion("PAY_WAY not like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<String> values) {
            addCriterion("PAY_WAY in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<String> values) {
            addCriterion("PAY_WAY not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(String value1, String value2) {
            addCriterion("PAY_WAY between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(String value1, String value2) {
            addCriterion("PAY_WAY not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayAttrIsNull() {
            addCriterion("PAY_WAY_ATTR is null");
            return (Criteria) this;
        }

        public Criteria andPayWayAttrIsNotNull() {
            addCriterion("PAY_WAY_ATTR is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayAttrEqualTo(String value) {
            addCriterion("PAY_WAY_ATTR =", value, "payWayAttr");
            return (Criteria) this;
        }

        public Criteria andPayWayAttrNotEqualTo(String value) {
            addCriterion("PAY_WAY_ATTR <>", value, "payWayAttr");
            return (Criteria) this;
        }

        public Criteria andPayWayAttrGreaterThan(String value) {
            addCriterion("PAY_WAY_ATTR >", value, "payWayAttr");
            return (Criteria) this;
        }

        public Criteria andPayWayAttrGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_WAY_ATTR >=", value, "payWayAttr");
            return (Criteria) this;
        }

        public Criteria andPayWayAttrLessThan(String value) {
            addCriterion("PAY_WAY_ATTR <", value, "payWayAttr");
            return (Criteria) this;
        }

        public Criteria andPayWayAttrLessThanOrEqualTo(String value) {
            addCriterion("PAY_WAY_ATTR <=", value, "payWayAttr");
            return (Criteria) this;
        }

        public Criteria andPayWayAttrLike(String value) {
            addCriterion("PAY_WAY_ATTR like", value, "payWayAttr");
            return (Criteria) this;
        }

        public Criteria andPayWayAttrNotLike(String value) {
            addCriterion("PAY_WAY_ATTR not like", value, "payWayAttr");
            return (Criteria) this;
        }

        public Criteria andPayWayAttrIn(List<String> values) {
            addCriterion("PAY_WAY_ATTR in", values, "payWayAttr");
            return (Criteria) this;
        }

        public Criteria andPayWayAttrNotIn(List<String> values) {
            addCriterion("PAY_WAY_ATTR not in", values, "payWayAttr");
            return (Criteria) this;
        }

        public Criteria andPayWayAttrBetween(String value1, String value2) {
            addCriterion("PAY_WAY_ATTR between", value1, value2, "payWayAttr");
            return (Criteria) this;
        }

        public Criteria andPayWayAttrNotBetween(String value1, String value2) {
            addCriterion("PAY_WAY_ATTR not between", value1, value2, "payWayAttr");
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

        public Criteria andStoreNumDelWayIsNull() {
            addCriterion("store_num_del_way is null");
            return (Criteria) this;
        }

        public Criteria andStoreNumDelWayIsNotNull() {
            addCriterion("store_num_del_way is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNumDelWayEqualTo(String value) {
            addCriterion("store_num_del_way =", value, "storeNumDelWay");
            return (Criteria) this;
        }

        public Criteria andStoreNumDelWayNotEqualTo(String value) {
            addCriterion("store_num_del_way <>", value, "storeNumDelWay");
            return (Criteria) this;
        }

        public Criteria andStoreNumDelWayGreaterThan(String value) {
            addCriterion("store_num_del_way >", value, "storeNumDelWay");
            return (Criteria) this;
        }

        public Criteria andStoreNumDelWayGreaterThanOrEqualTo(String value) {
            addCriterion("store_num_del_way >=", value, "storeNumDelWay");
            return (Criteria) this;
        }

        public Criteria andStoreNumDelWayLessThan(String value) {
            addCriterion("store_num_del_way <", value, "storeNumDelWay");
            return (Criteria) this;
        }

        public Criteria andStoreNumDelWayLessThanOrEqualTo(String value) {
            addCriterion("store_num_del_way <=", value, "storeNumDelWay");
            return (Criteria) this;
        }

        public Criteria andStoreNumDelWayLike(String value) {
            addCriterion("store_num_del_way like", value, "storeNumDelWay");
            return (Criteria) this;
        }

        public Criteria andStoreNumDelWayNotLike(String value) {
            addCriterion("store_num_del_way not like", value, "storeNumDelWay");
            return (Criteria) this;
        }

        public Criteria andStoreNumDelWayIn(List<String> values) {
            addCriterion("store_num_del_way in", values, "storeNumDelWay");
            return (Criteria) this;
        }

        public Criteria andStoreNumDelWayNotIn(List<String> values) {
            addCriterion("store_num_del_way not in", values, "storeNumDelWay");
            return (Criteria) this;
        }

        public Criteria andStoreNumDelWayBetween(String value1, String value2) {
            addCriterion("store_num_del_way between", value1, value2, "storeNumDelWay");
            return (Criteria) this;
        }

        public Criteria andStoreNumDelWayNotBetween(String value1, String value2) {
            addCriterion("store_num_del_way not between", value1, value2, "storeNumDelWay");
            return (Criteria) this;
        }

        public Criteria andCdnSourceUrlIsNull() {
            addCriterion("CDN_SOURCE_URL is null");
            return (Criteria) this;
        }

        public Criteria andCdnSourceUrlIsNotNull() {
            addCriterion("CDN_SOURCE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCdnSourceUrlEqualTo(String value) {
            addCriterion("CDN_SOURCE_URL =", value, "cdnSourceUrl");
            return (Criteria) this;
        }

        public Criteria andCdnSourceUrlNotEqualTo(String value) {
            addCriterion("CDN_SOURCE_URL <>", value, "cdnSourceUrl");
            return (Criteria) this;
        }

        public Criteria andCdnSourceUrlGreaterThan(String value) {
            addCriterion("CDN_SOURCE_URL >", value, "cdnSourceUrl");
            return (Criteria) this;
        }

        public Criteria andCdnSourceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CDN_SOURCE_URL >=", value, "cdnSourceUrl");
            return (Criteria) this;
        }

        public Criteria andCdnSourceUrlLessThan(String value) {
            addCriterion("CDN_SOURCE_URL <", value, "cdnSourceUrl");
            return (Criteria) this;
        }

        public Criteria andCdnSourceUrlLessThanOrEqualTo(String value) {
            addCriterion("CDN_SOURCE_URL <=", value, "cdnSourceUrl");
            return (Criteria) this;
        }

        public Criteria andCdnSourceUrlLike(String value) {
            addCriterion("CDN_SOURCE_URL like", value, "cdnSourceUrl");
            return (Criteria) this;
        }

        public Criteria andCdnSourceUrlNotLike(String value) {
            addCriterion("CDN_SOURCE_URL not like", value, "cdnSourceUrl");
            return (Criteria) this;
        }

        public Criteria andCdnSourceUrlIn(List<String> values) {
            addCriterion("CDN_SOURCE_URL in", values, "cdnSourceUrl");
            return (Criteria) this;
        }

        public Criteria andCdnSourceUrlNotIn(List<String> values) {
            addCriterion("CDN_SOURCE_URL not in", values, "cdnSourceUrl");
            return (Criteria) this;
        }

        public Criteria andCdnSourceUrlBetween(String value1, String value2) {
            addCriterion("CDN_SOURCE_URL between", value1, value2, "cdnSourceUrl");
            return (Criteria) this;
        }

        public Criteria andCdnSourceUrlNotBetween(String value1, String value2) {
            addCriterion("CDN_SOURCE_URL not between", value1, value2, "cdnSourceUrl");
            return (Criteria) this;
        }

        public Criteria andIsZipIsNull() {
            addCriterion("IS_ZIP is null");
            return (Criteria) this;
        }

        public Criteria andIsZipIsNotNull() {
            addCriterion("IS_ZIP is not null");
            return (Criteria) this;
        }

        public Criteria andIsZipEqualTo(String value) {
            addCriterion("IS_ZIP =", value, "isZip");
            return (Criteria) this;
        }

        public Criteria andIsZipNotEqualTo(String value) {
            addCriterion("IS_ZIP <>", value, "isZip");
            return (Criteria) this;
        }

        public Criteria andIsZipGreaterThan(String value) {
            addCriterion("IS_ZIP >", value, "isZip");
            return (Criteria) this;
        }

        public Criteria andIsZipGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ZIP >=", value, "isZip");
            return (Criteria) this;
        }

        public Criteria andIsZipLessThan(String value) {
            addCriterion("IS_ZIP <", value, "isZip");
            return (Criteria) this;
        }

        public Criteria andIsZipLessThanOrEqualTo(String value) {
            addCriterion("IS_ZIP <=", value, "isZip");
            return (Criteria) this;
        }

        public Criteria andIsZipLike(String value) {
            addCriterion("IS_ZIP like", value, "isZip");
            return (Criteria) this;
        }

        public Criteria andIsZipNotLike(String value) {
            addCriterion("IS_ZIP not like", value, "isZip");
            return (Criteria) this;
        }

        public Criteria andIsZipIn(List<String> values) {
            addCriterion("IS_ZIP in", values, "isZip");
            return (Criteria) this;
        }

        public Criteria andIsZipNotIn(List<String> values) {
            addCriterion("IS_ZIP not in", values, "isZip");
            return (Criteria) this;
        }

        public Criteria andIsZipBetween(String value1, String value2) {
            addCriterion("IS_ZIP between", value1, value2, "isZip");
            return (Criteria) this;
        }

        public Criteria andIsZipNotBetween(String value1, String value2) {
            addCriterion("IS_ZIP not between", value1, value2, "isZip");
            return (Criteria) this;
        }

        public Criteria andExtColumn1IsNull() {
            addCriterion("ext_column1 is null");
            return (Criteria) this;
        }

        public Criteria andExtColumn1IsNotNull() {
            addCriterion("ext_column1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtColumn1EqualTo(Integer value) {
            addCriterion("ext_column1 =", value, "extColumn1");
            return (Criteria) this;
        }

        public Criteria andExtColumn1NotEqualTo(Integer value) {
            addCriterion("ext_column1 <>", value, "extColumn1");
            return (Criteria) this;
        }

        public Criteria andExtColumn1GreaterThan(Integer value) {
            addCriterion("ext_column1 >", value, "extColumn1");
            return (Criteria) this;
        }

        public Criteria andExtColumn1GreaterThanOrEqualTo(Integer value) {
            addCriterion("ext_column1 >=", value, "extColumn1");
            return (Criteria) this;
        }

        public Criteria andExtColumn1LessThan(Integer value) {
            addCriterion("ext_column1 <", value, "extColumn1");
            return (Criteria) this;
        }

        public Criteria andExtColumn1LessThanOrEqualTo(Integer value) {
            addCriterion("ext_column1 <=", value, "extColumn1");
            return (Criteria) this;
        }

        public Criteria andExtColumn1In(List<Integer> values) {
            addCriterion("ext_column1 in", values, "extColumn1");
            return (Criteria) this;
        }

        public Criteria andExtColumn1NotIn(List<Integer> values) {
            addCriterion("ext_column1 not in", values, "extColumn1");
            return (Criteria) this;
        }

        public Criteria andExtColumn1Between(Integer value1, Integer value2) {
            addCriterion("ext_column1 between", value1, value2, "extColumn1");
            return (Criteria) this;
        }

        public Criteria andExtColumn1NotBetween(Integer value1, Integer value2) {
            addCriterion("ext_column1 not between", value1, value2, "extColumn1");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(BigDecimal value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(BigDecimal value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<BigDecimal> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andSaleTagIsNull() {
            addCriterion("sale_tag is null");
            return (Criteria) this;
        }

        public Criteria andSaleTagIsNotNull() {
            addCriterion("sale_tag is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTagEqualTo(String value) {
            addCriterion("sale_tag =", value, "saleTag");
            return (Criteria) this;
        }

        public Criteria andSaleTagNotEqualTo(String value) {
            addCriterion("sale_tag <>", value, "saleTag");
            return (Criteria) this;
        }

        public Criteria andSaleTagGreaterThan(String value) {
            addCriterion("sale_tag >", value, "saleTag");
            return (Criteria) this;
        }

        public Criteria andSaleTagGreaterThanOrEqualTo(String value) {
            addCriterion("sale_tag >=", value, "saleTag");
            return (Criteria) this;
        }

        public Criteria andSaleTagLessThan(String value) {
            addCriterion("sale_tag <", value, "saleTag");
            return (Criteria) this;
        }

        public Criteria andSaleTagLessThanOrEqualTo(String value) {
            addCriterion("sale_tag <=", value, "saleTag");
            return (Criteria) this;
        }

        public Criteria andSaleTagLike(String value) {
            addCriterion("sale_tag like", value, "saleTag");
            return (Criteria) this;
        }

        public Criteria andSaleTagNotLike(String value) {
            addCriterion("sale_tag not like", value, "saleTag");
            return (Criteria) this;
        }

        public Criteria andSaleTagIn(List<String> values) {
            addCriterion("sale_tag in", values, "saleTag");
            return (Criteria) this;
        }

        public Criteria andSaleTagNotIn(List<String> values) {
            addCriterion("sale_tag not in", values, "saleTag");
            return (Criteria) this;
        }

        public Criteria andSaleTagBetween(String value1, String value2) {
            addCriterion("sale_tag between", value1, value2, "saleTag");
            return (Criteria) this;
        }

        public Criteria andSaleTagNotBetween(String value1, String value2) {
            addCriterion("sale_tag not between", value1, value2, "saleTag");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIsNull() {
            addCriterion("effective_time is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIsNotNull() {
            addCriterion("effective_time is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeEqualTo(String value) {
            addCriterion("effective_time =", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotEqualTo(String value) {
            addCriterion("effective_time <>", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeGreaterThan(String value) {
            addCriterion("effective_time >", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("effective_time >=", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeLessThan(String value) {
            addCriterion("effective_time <", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeLessThanOrEqualTo(String value) {
            addCriterion("effective_time <=", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeLike(String value) {
            addCriterion("effective_time like", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotLike(String value) {
            addCriterion("effective_time not like", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIn(List<String> values) {
            addCriterion("effective_time in", values, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotIn(List<String> values) {
            addCriterion("effective_time not in", values, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeBetween(String value1, String value2) {
            addCriterion("effective_time between", value1, value2, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotBetween(String value1, String value2) {
            addCriterion("effective_time not between", value1, value2, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andSloganIsNull() {
            addCriterion("slogan is null");
            return (Criteria) this;
        }

        public Criteria andSloganIsNotNull() {
            addCriterion("slogan is not null");
            return (Criteria) this;
        }

        public Criteria andSloganEqualTo(String value) {
            addCriterion("slogan =", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganNotEqualTo(String value) {
            addCriterion("slogan <>", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganGreaterThan(String value) {
            addCriterion("slogan >", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganGreaterThanOrEqualTo(String value) {
            addCriterion("slogan >=", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganLessThan(String value) {
            addCriterion("slogan <", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganLessThanOrEqualTo(String value) {
            addCriterion("slogan <=", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganLike(String value) {
            addCriterion("slogan like", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganNotLike(String value) {
            addCriterion("slogan not like", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganIn(List<String> values) {
            addCriterion("slogan in", values, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganNotIn(List<String> values) {
            addCriterion("slogan not in", values, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganBetween(String value1, String value2) {
            addCriterion("slogan between", value1, value2, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganNotBetween(String value1, String value2) {
            addCriterion("slogan not between", value1, value2, "slogan");
            return (Criteria) this;
        }

        public Criteria andPvIsNull() {
            addCriterion("pv is null");
            return (Criteria) this;
        }

        public Criteria andPvIsNotNull() {
            addCriterion("pv is not null");
            return (Criteria) this;
        }

        public Criteria andPvEqualTo(Integer value) {
            addCriterion("pv =", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotEqualTo(Integer value) {
            addCriterion("pv <>", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThan(Integer value) {
            addCriterion("pv >", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThanOrEqualTo(Integer value) {
            addCriterion("pv >=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThan(Integer value) {
            addCriterion("pv <", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThanOrEqualTo(Integer value) {
            addCriterion("pv <=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvIn(List<Integer> values) {
            addCriterion("pv in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotIn(List<Integer> values) {
            addCriterion("pv not in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvBetween(Integer value1, Integer value2) {
            addCriterion("pv between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotBetween(Integer value1, Integer value2) {
            addCriterion("pv not between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andDropPirceIsNull() {
            addCriterion("drop_pirce is null");
            return (Criteria) this;
        }

        public Criteria andDropPirceIsNotNull() {
            addCriterion("drop_pirce is not null");
            return (Criteria) this;
        }

        public Criteria andDropPirceEqualTo(Integer value) {
            addCriterion("drop_pirce =", value, "dropPirce");
            return (Criteria) this;
        }

        public Criteria andDropPirceNotEqualTo(Integer value) {
            addCriterion("drop_pirce <>", value, "dropPirce");
            return (Criteria) this;
        }

        public Criteria andDropPirceGreaterThan(Integer value) {
            addCriterion("drop_pirce >", value, "dropPirce");
            return (Criteria) this;
        }

        public Criteria andDropPirceGreaterThanOrEqualTo(Integer value) {
            addCriterion("drop_pirce >=", value, "dropPirce");
            return (Criteria) this;
        }

        public Criteria andDropPirceLessThan(Integer value) {
            addCriterion("drop_pirce <", value, "dropPirce");
            return (Criteria) this;
        }

        public Criteria andDropPirceLessThanOrEqualTo(Integer value) {
            addCriterion("drop_pirce <=", value, "dropPirce");
            return (Criteria) this;
        }

        public Criteria andDropPirceIn(List<Integer> values) {
            addCriterion("drop_pirce in", values, "dropPirce");
            return (Criteria) this;
        }

        public Criteria andDropPirceNotIn(List<Integer> values) {
            addCriterion("drop_pirce not in", values, "dropPirce");
            return (Criteria) this;
        }

        public Criteria andDropPirceBetween(Integer value1, Integer value2) {
            addCriterion("drop_pirce between", value1, value2, "dropPirce");
            return (Criteria) this;
        }

        public Criteria andDropPirceNotBetween(Integer value1, Integer value2) {
            addCriterion("drop_pirce not between", value1, value2, "dropPirce");
            return (Criteria) this;
        }

        public Criteria andActivityIdsIsNull() {
            addCriterion("activity_ids is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdsIsNotNull() {
            addCriterion("activity_ids is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdsEqualTo(String value) {
            addCriterion("activity_ids =", value, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsNotEqualTo(String value) {
            addCriterion("activity_ids <>", value, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsGreaterThan(String value) {
            addCriterion("activity_ids >", value, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsGreaterThanOrEqualTo(String value) {
            addCriterion("activity_ids >=", value, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsLessThan(String value) {
            addCriterion("activity_ids <", value, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsLessThanOrEqualTo(String value) {
            addCriterion("activity_ids <=", value, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsLike(String value) {
            addCriterion("activity_ids like", value, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsNotLike(String value) {
            addCriterion("activity_ids not like", value, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsIn(List<String> values) {
            addCriterion("activity_ids in", values, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsNotIn(List<String> values) {
            addCriterion("activity_ids not in", values, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsBetween(String value1, String value2) {
            addCriterion("activity_ids between", value1, value2, "activityIds");
            return (Criteria) this;
        }

        public Criteria andActivityIdsNotBetween(String value1, String value2) {
            addCriterion("activity_ids not between", value1, value2, "activityIds");
            return (Criteria) this;
        }

        public Criteria andBrandInfoIdsIsNull() {
            addCriterion("brand_info_ids is null");
            return (Criteria) this;
        }

        public Criteria andBrandInfoIdsIsNotNull() {
            addCriterion("brand_info_ids is not null");
            return (Criteria) this;
        }

        public Criteria andBrandInfoIdsEqualTo(String value) {
            addCriterion("brand_info_ids =", value, "brandInfoIds");
            return (Criteria) this;
        }

        public Criteria andBrandInfoIdsNotEqualTo(String value) {
            addCriterion("brand_info_ids <>", value, "brandInfoIds");
            return (Criteria) this;
        }

        public Criteria andBrandInfoIdsGreaterThan(String value) {
            addCriterion("brand_info_ids >", value, "brandInfoIds");
            return (Criteria) this;
        }

        public Criteria andBrandInfoIdsGreaterThanOrEqualTo(String value) {
            addCriterion("brand_info_ids >=", value, "brandInfoIds");
            return (Criteria) this;
        }

        public Criteria andBrandInfoIdsLessThan(String value) {
            addCriterion("brand_info_ids <", value, "brandInfoIds");
            return (Criteria) this;
        }

        public Criteria andBrandInfoIdsLessThanOrEqualTo(String value) {
            addCriterion("brand_info_ids <=", value, "brandInfoIds");
            return (Criteria) this;
        }

        public Criteria andBrandInfoIdsLike(String value) {
            addCriterion("brand_info_ids like", value, "brandInfoIds");
            return (Criteria) this;
        }

        public Criteria andBrandInfoIdsNotLike(String value) {
            addCriterion("brand_info_ids not like", value, "brandInfoIds");
            return (Criteria) this;
        }

        public Criteria andBrandInfoIdsIn(List<String> values) {
            addCriterion("brand_info_ids in", values, "brandInfoIds");
            return (Criteria) this;
        }

        public Criteria andBrandInfoIdsNotIn(List<String> values) {
            addCriterion("brand_info_ids not in", values, "brandInfoIds");
            return (Criteria) this;
        }

        public Criteria andBrandInfoIdsBetween(String value1, String value2) {
            addCriterion("brand_info_ids between", value1, value2, "brandInfoIds");
            return (Criteria) this;
        }

        public Criteria andBrandInfoIdsNotBetween(String value1, String value2) {
            addCriterion("brand_info_ids not between", value1, value2, "brandInfoIds");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNull() {
            addCriterion("activity_type is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNotNull() {
            addCriterion("activity_type is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeEqualTo(String value) {
            addCriterion("activity_type =", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotEqualTo(String value) {
            addCriterion("activity_type <>", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThan(String value) {
            addCriterion("activity_type >", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_type >=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThan(String value) {
            addCriterion("activity_type <", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThanOrEqualTo(String value) {
            addCriterion("activity_type <=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLike(String value) {
            addCriterion("activity_type like", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotLike(String value) {
            addCriterion("activity_type not like", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIn(List<String> values) {
            addCriterion("activity_type in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotIn(List<String> values) {
            addCriterion("activity_type not in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeBetween(String value1, String value2) {
            addCriterion("activity_type between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotBetween(String value1, String value2) {
            addCriterion("activity_type not between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andExtColumn2IsNull() {
            addCriterion("ext_column2 is null");
            return (Criteria) this;
        }

        public Criteria andExtColumn2IsNotNull() {
            addCriterion("ext_column2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtColumn2EqualTo(String value) {
            addCriterion("ext_column2 =", value, "extColumn2");
            return (Criteria) this;
        }

        public Criteria andExtColumn2NotEqualTo(String value) {
            addCriterion("ext_column2 <>", value, "extColumn2");
            return (Criteria) this;
        }

        public Criteria andExtColumn2GreaterThan(String value) {
            addCriterion("ext_column2 >", value, "extColumn2");
            return (Criteria) this;
        }

        public Criteria andExtColumn2GreaterThanOrEqualTo(String value) {
            addCriterion("ext_column2 >=", value, "extColumn2");
            return (Criteria) this;
        }

        public Criteria andExtColumn2LessThan(String value) {
            addCriterion("ext_column2 <", value, "extColumn2");
            return (Criteria) this;
        }

        public Criteria andExtColumn2LessThanOrEqualTo(String value) {
            addCriterion("ext_column2 <=", value, "extColumn2");
            return (Criteria) this;
        }

        public Criteria andExtColumn2Like(String value) {
            addCriterion("ext_column2 like", value, "extColumn2");
            return (Criteria) this;
        }

        public Criteria andExtColumn2NotLike(String value) {
            addCriterion("ext_column2 not like", value, "extColumn2");
            return (Criteria) this;
        }

        public Criteria andExtColumn2In(List<String> values) {
            addCriterion("ext_column2 in", values, "extColumn2");
            return (Criteria) this;
        }

        public Criteria andExtColumn2NotIn(List<String> values) {
            addCriterion("ext_column2 not in", values, "extColumn2");
            return (Criteria) this;
        }

        public Criteria andExtColumn2Between(String value1, String value2) {
            addCriterion("ext_column2 between", value1, value2, "extColumn2");
            return (Criteria) this;
        }

        public Criteria andExtColumn2NotBetween(String value1, String value2) {
            addCriterion("ext_column2 not between", value1, value2, "extColumn2");
            return (Criteria) this;
        }

        public Criteria andSaleLabelIsNull() {
            addCriterion("SALE_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andSaleLabelIsNotNull() {
            addCriterion("SALE_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andSaleLabelEqualTo(String value) {
            addCriterion("SALE_LABEL =", value, "saleLabel");
            return (Criteria) this;
        }

        public Criteria andSaleLabelNotEqualTo(String value) {
            addCriterion("SALE_LABEL <>", value, "saleLabel");
            return (Criteria) this;
        }

        public Criteria andSaleLabelGreaterThan(String value) {
            addCriterion("SALE_LABEL >", value, "saleLabel");
            return (Criteria) this;
        }

        public Criteria andSaleLabelGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_LABEL >=", value, "saleLabel");
            return (Criteria) this;
        }

        public Criteria andSaleLabelLessThan(String value) {
            addCriterion("SALE_LABEL <", value, "saleLabel");
            return (Criteria) this;
        }

        public Criteria andSaleLabelLessThanOrEqualTo(String value) {
            addCriterion("SALE_LABEL <=", value, "saleLabel");
            return (Criteria) this;
        }

        public Criteria andSaleLabelLike(String value) {
            addCriterion("SALE_LABEL like", value, "saleLabel");
            return (Criteria) this;
        }

        public Criteria andSaleLabelNotLike(String value) {
            addCriterion("SALE_LABEL not like", value, "saleLabel");
            return (Criteria) this;
        }

        public Criteria andSaleLabelIn(List<String> values) {
            addCriterion("SALE_LABEL in", values, "saleLabel");
            return (Criteria) this;
        }

        public Criteria andSaleLabelNotIn(List<String> values) {
            addCriterion("SALE_LABEL not in", values, "saleLabel");
            return (Criteria) this;
        }

        public Criteria andSaleLabelBetween(String value1, String value2) {
            addCriterion("SALE_LABEL between", value1, value2, "saleLabel");
            return (Criteria) this;
        }

        public Criteria andSaleLabelNotBetween(String value1, String value2) {
            addCriterion("SALE_LABEL not between", value1, value2, "saleLabel");
            return (Criteria) this;
        }

        public Criteria andSaleContentIsNull() {
            addCriterion("SALE_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andSaleContentIsNotNull() {
            addCriterion("SALE_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andSaleContentEqualTo(String value) {
            addCriterion("SALE_CONTENT =", value, "saleContent");
            return (Criteria) this;
        }

        public Criteria andSaleContentNotEqualTo(String value) {
            addCriterion("SALE_CONTENT <>", value, "saleContent");
            return (Criteria) this;
        }

        public Criteria andSaleContentGreaterThan(String value) {
            addCriterion("SALE_CONTENT >", value, "saleContent");
            return (Criteria) this;
        }

        public Criteria andSaleContentGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_CONTENT >=", value, "saleContent");
            return (Criteria) this;
        }

        public Criteria andSaleContentLessThan(String value) {
            addCriterion("SALE_CONTENT <", value, "saleContent");
            return (Criteria) this;
        }

        public Criteria andSaleContentLessThanOrEqualTo(String value) {
            addCriterion("SALE_CONTENT <=", value, "saleContent");
            return (Criteria) this;
        }

        public Criteria andSaleContentLike(String value) {
            addCriterion("SALE_CONTENT like", value, "saleContent");
            return (Criteria) this;
        }

        public Criteria andSaleContentNotLike(String value) {
            addCriterion("SALE_CONTENT not like", value, "saleContent");
            return (Criteria) this;
        }

        public Criteria andSaleContentIn(List<String> values) {
            addCriterion("SALE_CONTENT in", values, "saleContent");
            return (Criteria) this;
        }

        public Criteria andSaleContentNotIn(List<String> values) {
            addCriterion("SALE_CONTENT not in", values, "saleContent");
            return (Criteria) this;
        }

        public Criteria andSaleContentBetween(String value1, String value2) {
            addCriterion("SALE_CONTENT between", value1, value2, "saleContent");
            return (Criteria) this;
        }

        public Criteria andSaleContentNotBetween(String value1, String value2) {
            addCriterion("SALE_CONTENT not between", value1, value2, "saleContent");
            return (Criteria) this;
        }

        public Criteria andPayerIsNull() {
            addCriterion("PAYER is null");
            return (Criteria) this;
        }

        public Criteria andPayerIsNotNull() {
            addCriterion("PAYER is not null");
            return (Criteria) this;
        }

        public Criteria andPayerEqualTo(String value) {
            addCriterion("PAYER =", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotEqualTo(String value) {
            addCriterion("PAYER <>", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThan(String value) {
            addCriterion("PAYER >", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER >=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThan(String value) {
            addCriterion("PAYER <", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThanOrEqualTo(String value) {
            addCriterion("PAYER <=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLike(String value) {
            addCriterion("PAYER like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotLike(String value) {
            addCriterion("PAYER not like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerIn(List<String> values) {
            addCriterion("PAYER in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotIn(List<String> values) {
            addCriterion("PAYER not in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerBetween(String value1, String value2) {
            addCriterion("PAYER between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotBetween(String value1, String value2) {
            addCriterion("PAYER not between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andFeePayerIsNull() {
            addCriterion("FEE_PAYER is null");
            return (Criteria) this;
        }

        public Criteria andFeePayerIsNotNull() {
            addCriterion("FEE_PAYER is not null");
            return (Criteria) this;
        }

        public Criteria andFeePayerEqualTo(String value) {
            addCriterion("FEE_PAYER =", value, "feePayer");
            return (Criteria) this;
        }

        public Criteria andFeePayerNotEqualTo(String value) {
            addCriterion("FEE_PAYER <>", value, "feePayer");
            return (Criteria) this;
        }

        public Criteria andFeePayerGreaterThan(String value) {
            addCriterion("FEE_PAYER >", value, "feePayer");
            return (Criteria) this;
        }

        public Criteria andFeePayerGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_PAYER >=", value, "feePayer");
            return (Criteria) this;
        }

        public Criteria andFeePayerLessThan(String value) {
            addCriterion("FEE_PAYER <", value, "feePayer");
            return (Criteria) this;
        }

        public Criteria andFeePayerLessThanOrEqualTo(String value) {
            addCriterion("FEE_PAYER <=", value, "feePayer");
            return (Criteria) this;
        }

        public Criteria andFeePayerLike(String value) {
            addCriterion("FEE_PAYER like", value, "feePayer");
            return (Criteria) this;
        }

        public Criteria andFeePayerNotLike(String value) {
            addCriterion("FEE_PAYER not like", value, "feePayer");
            return (Criteria) this;
        }

        public Criteria andFeePayerIn(List<String> values) {
            addCriterion("FEE_PAYER in", values, "feePayer");
            return (Criteria) this;
        }

        public Criteria andFeePayerNotIn(List<String> values) {
            addCriterion("FEE_PAYER not in", values, "feePayer");
            return (Criteria) this;
        }

        public Criteria andFeePayerBetween(String value1, String value2) {
            addCriterion("FEE_PAYER between", value1, value2, "feePayer");
            return (Criteria) this;
        }

        public Criteria andFeePayerNotBetween(String value1, String value2) {
            addCriterion("FEE_PAYER not between", value1, value2, "feePayer");
            return (Criteria) this;
        }

        public Criteria andNeedCredentialsIsNull() {
            addCriterion("NEED_CREDENTIALS is null");
            return (Criteria) this;
        }

        public Criteria andNeedCredentialsIsNotNull() {
            addCriterion("NEED_CREDENTIALS is not null");
            return (Criteria) this;
        }

        public Criteria andNeedCredentialsEqualTo(String value) {
            addCriterion("NEED_CREDENTIALS =", value, "needCredentials");
            return (Criteria) this;
        }

        public Criteria andNeedCredentialsNotEqualTo(String value) {
            addCriterion("NEED_CREDENTIALS <>", value, "needCredentials");
            return (Criteria) this;
        }

        public Criteria andNeedCredentialsGreaterThan(String value) {
            addCriterion("NEED_CREDENTIALS >", value, "needCredentials");
            return (Criteria) this;
        }

        public Criteria andNeedCredentialsGreaterThanOrEqualTo(String value) {
            addCriterion("NEED_CREDENTIALS >=", value, "needCredentials");
            return (Criteria) this;
        }

        public Criteria andNeedCredentialsLessThan(String value) {
            addCriterion("NEED_CREDENTIALS <", value, "needCredentials");
            return (Criteria) this;
        }

        public Criteria andNeedCredentialsLessThanOrEqualTo(String value) {
            addCriterion("NEED_CREDENTIALS <=", value, "needCredentials");
            return (Criteria) this;
        }

        public Criteria andNeedCredentialsLike(String value) {
            addCriterion("NEED_CREDENTIALS like", value, "needCredentials");
            return (Criteria) this;
        }

        public Criteria andNeedCredentialsNotLike(String value) {
            addCriterion("NEED_CREDENTIALS not like", value, "needCredentials");
            return (Criteria) this;
        }

        public Criteria andNeedCredentialsIn(List<String> values) {
            addCriterion("NEED_CREDENTIALS in", values, "needCredentials");
            return (Criteria) this;
        }

        public Criteria andNeedCredentialsNotIn(List<String> values) {
            addCriterion("NEED_CREDENTIALS not in", values, "needCredentials");
            return (Criteria) this;
        }

        public Criteria andNeedCredentialsBetween(String value1, String value2) {
            addCriterion("NEED_CREDENTIALS between", value1, value2, "needCredentials");
            return (Criteria) this;
        }

        public Criteria andNeedCredentialsNotBetween(String value1, String value2) {
            addCriterion("NEED_CREDENTIALS not between", value1, value2, "needCredentials");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceIsNull() {
            addCriterion("NEED_INVOICE is null");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceIsNotNull() {
            addCriterion("NEED_INVOICE is not null");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceEqualTo(String value) {
            addCriterion("NEED_INVOICE =", value, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceNotEqualTo(String value) {
            addCriterion("NEED_INVOICE <>", value, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceGreaterThan(String value) {
            addCriterion("NEED_INVOICE >", value, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("NEED_INVOICE >=", value, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceLessThan(String value) {
            addCriterion("NEED_INVOICE <", value, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceLessThanOrEqualTo(String value) {
            addCriterion("NEED_INVOICE <=", value, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceLike(String value) {
            addCriterion("NEED_INVOICE like", value, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceNotLike(String value) {
            addCriterion("NEED_INVOICE not like", value, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceIn(List<String> values) {
            addCriterion("NEED_INVOICE in", values, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceNotIn(List<String> values) {
            addCriterion("NEED_INVOICE not in", values, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceBetween(String value1, String value2) {
            addCriterion("NEED_INVOICE between", value1, value2, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andNeedInvoiceNotBetween(String value1, String value2) {
            addCriterion("NEED_INVOICE not between", value1, value2, "needInvoice");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostIsNull() {
            addCriterion("LOGISTICS_COST is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostIsNotNull() {
            addCriterion("LOGISTICS_COST is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostEqualTo(BigDecimal value) {
            addCriterion("LOGISTICS_COST =", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostNotEqualTo(BigDecimal value) {
            addCriterion("LOGISTICS_COST <>", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostGreaterThan(BigDecimal value) {
            addCriterion("LOGISTICS_COST >", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGISTICS_COST >=", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostLessThan(BigDecimal value) {
            addCriterion("LOGISTICS_COST <", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGISTICS_COST <=", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostIn(List<BigDecimal> values) {
            addCriterion("LOGISTICS_COST in", values, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostNotIn(List<BigDecimal> values) {
            addCriterion("LOGISTICS_COST not in", values, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOGISTICS_COST between", value1, value2, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOGISTICS_COST not between", value1, value2, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andPassFeeIsNull() {
            addCriterion("PASS_FEE is null");
            return (Criteria) this;
        }

        public Criteria andPassFeeIsNotNull() {
            addCriterion("PASS_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andPassFeeEqualTo(BigDecimal value) {
            addCriterion("PASS_FEE =", value, "passFee");
            return (Criteria) this;
        }

        public Criteria andPassFeeNotEqualTo(BigDecimal value) {
            addCriterion("PASS_FEE <>", value, "passFee");
            return (Criteria) this;
        }

        public Criteria andPassFeeGreaterThan(BigDecimal value) {
            addCriterion("PASS_FEE >", value, "passFee");
            return (Criteria) this;
        }

        public Criteria andPassFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PASS_FEE >=", value, "passFee");
            return (Criteria) this;
        }

        public Criteria andPassFeeLessThan(BigDecimal value) {
            addCriterion("PASS_FEE <", value, "passFee");
            return (Criteria) this;
        }

        public Criteria andPassFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PASS_FEE <=", value, "passFee");
            return (Criteria) this;
        }

        public Criteria andPassFeeIn(List<BigDecimal> values) {
            addCriterion("PASS_FEE in", values, "passFee");
            return (Criteria) this;
        }

        public Criteria andPassFeeNotIn(List<BigDecimal> values) {
            addCriterion("PASS_FEE not in", values, "passFee");
            return (Criteria) this;
        }

        public Criteria andPassFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PASS_FEE between", value1, value2, "passFee");
            return (Criteria) this;
        }

        public Criteria andPassFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PASS_FEE not between", value1, value2, "passFee");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("CREATER is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("CREATER is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("CREATER =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("CREATER <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("CREATER >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("CREATER >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("CREATER <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("CREATER <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("CREATER like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("CREATER not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("CREATER in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("CREATER not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("CREATER between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("CREATER not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("MODIFIER =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("MODIFIER <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("MODIFIER >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIER >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("MODIFIER <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("MODIFIER <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("MODIFIER like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("MODIFIER not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("MODIFIER in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("MODIFIER not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("MODIFIER between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("MODIFIER not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andPromotionUrlIsNull() {
            addCriterion("promotion_url is null");
            return (Criteria) this;
        }

        public Criteria andPromotionUrlIsNotNull() {
            addCriterion("promotion_url is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionUrlEqualTo(String value) {
            addCriterion("promotion_url =", value, "promotionUrl");
            return (Criteria) this;
        }

        public Criteria andPromotionUrlNotEqualTo(String value) {
            addCriterion("promotion_url <>", value, "promotionUrl");
            return (Criteria) this;
        }

        public Criteria andPromotionUrlGreaterThan(String value) {
            addCriterion("promotion_url >", value, "promotionUrl");
            return (Criteria) this;
        }

        public Criteria andPromotionUrlGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_url >=", value, "promotionUrl");
            return (Criteria) this;
        }

        public Criteria andPromotionUrlLessThan(String value) {
            addCriterion("promotion_url <", value, "promotionUrl");
            return (Criteria) this;
        }

        public Criteria andPromotionUrlLessThanOrEqualTo(String value) {
            addCriterion("promotion_url <=", value, "promotionUrl");
            return (Criteria) this;
        }

        public Criteria andPromotionUrlLike(String value) {
            addCriterion("promotion_url like", value, "promotionUrl");
            return (Criteria) this;
        }

        public Criteria andPromotionUrlNotLike(String value) {
            addCriterion("promotion_url not like", value, "promotionUrl");
            return (Criteria) this;
        }

        public Criteria andPromotionUrlIn(List<String> values) {
            addCriterion("promotion_url in", values, "promotionUrl");
            return (Criteria) this;
        }

        public Criteria andPromotionUrlNotIn(List<String> values) {
            addCriterion("promotion_url not in", values, "promotionUrl");
            return (Criteria) this;
        }

        public Criteria andPromotionUrlBetween(String value1, String value2) {
            addCriterion("promotion_url between", value1, value2, "promotionUrl");
            return (Criteria) this;
        }

        public Criteria andPromotionUrlNotBetween(String value1, String value2) {
            addCriterion("promotion_url not between", value1, value2, "promotionUrl");
            return (Criteria) this;
        }

        public Criteria andNoviceExclusiveIsNull() {
            addCriterion("novice_exclusive is null");
            return (Criteria) this;
        }

        public Criteria andNoviceExclusiveIsNotNull() {
            addCriterion("novice_exclusive is not null");
            return (Criteria) this;
        }

        public Criteria andNoviceExclusiveEqualTo(String value) {
            addCriterion("novice_exclusive =", value, "noviceExclusive");
            return (Criteria) this;
        }

        public Criteria andNoviceExclusiveNotEqualTo(String value) {
            addCriterion("novice_exclusive <>", value, "noviceExclusive");
            return (Criteria) this;
        }

        public Criteria andNoviceExclusiveGreaterThan(String value) {
            addCriterion("novice_exclusive >", value, "noviceExclusive");
            return (Criteria) this;
        }

        public Criteria andNoviceExclusiveGreaterThanOrEqualTo(String value) {
            addCriterion("novice_exclusive >=", value, "noviceExclusive");
            return (Criteria) this;
        }

        public Criteria andNoviceExclusiveLessThan(String value) {
            addCriterion("novice_exclusive <", value, "noviceExclusive");
            return (Criteria) this;
        }

        public Criteria andNoviceExclusiveLessThanOrEqualTo(String value) {
            addCriterion("novice_exclusive <=", value, "noviceExclusive");
            return (Criteria) this;
        }

        public Criteria andNoviceExclusiveLike(String value) {
            addCriterion("novice_exclusive like", value, "noviceExclusive");
            return (Criteria) this;
        }

        public Criteria andNoviceExclusiveNotLike(String value) {
            addCriterion("novice_exclusive not like", value, "noviceExclusive");
            return (Criteria) this;
        }

        public Criteria andNoviceExclusiveIn(List<String> values) {
            addCriterion("novice_exclusive in", values, "noviceExclusive");
            return (Criteria) this;
        }

        public Criteria andNoviceExclusiveNotIn(List<String> values) {
            addCriterion("novice_exclusive not in", values, "noviceExclusive");
            return (Criteria) this;
        }

        public Criteria andNoviceExclusiveBetween(String value1, String value2) {
            addCriterion("novice_exclusive between", value1, value2, "noviceExclusive");
            return (Criteria) this;
        }

        public Criteria andNoviceExclusiveNotBetween(String value1, String value2) {
            addCriterion("novice_exclusive not between", value1, value2, "noviceExclusive");
            return (Criteria) this;
        }

        public Criteria andVisualFlagIsNull() {
            addCriterion("visual_flag is null");
            return (Criteria) this;
        }

        public Criteria andVisualFlagIsNotNull() {
            addCriterion("visual_flag is not null");
            return (Criteria) this;
        }

        public Criteria andVisualFlagEqualTo(String value) {
            addCriterion("visual_flag =", value, "visualFlag");
            return (Criteria) this;
        }

        public Criteria andVisualFlagNotEqualTo(String value) {
            addCriterion("visual_flag <>", value, "visualFlag");
            return (Criteria) this;
        }

        public Criteria andVisualFlagGreaterThan(String value) {
            addCriterion("visual_flag >", value, "visualFlag");
            return (Criteria) this;
        }

        public Criteria andVisualFlagGreaterThanOrEqualTo(String value) {
            addCriterion("visual_flag >=", value, "visualFlag");
            return (Criteria) this;
        }

        public Criteria andVisualFlagLessThan(String value) {
            addCriterion("visual_flag <", value, "visualFlag");
            return (Criteria) this;
        }

        public Criteria andVisualFlagLessThanOrEqualTo(String value) {
            addCriterion("visual_flag <=", value, "visualFlag");
            return (Criteria) this;
        }

        public Criteria andVisualFlagLike(String value) {
            addCriterion("visual_flag like", value, "visualFlag");
            return (Criteria) this;
        }

        public Criteria andVisualFlagNotLike(String value) {
            addCriterion("visual_flag not like", value, "visualFlag");
            return (Criteria) this;
        }

        public Criteria andVisualFlagIn(List<String> values) {
            addCriterion("visual_flag in", values, "visualFlag");
            return (Criteria) this;
        }

        public Criteria andVisualFlagNotIn(List<String> values) {
            addCriterion("visual_flag not in", values, "visualFlag");
            return (Criteria) this;
        }

        public Criteria andVisualFlagBetween(String value1, String value2) {
            addCriterion("visual_flag between", value1, value2, "visualFlag");
            return (Criteria) this;
        }

        public Criteria andVisualFlagNotBetween(String value1, String value2) {
            addCriterion("visual_flag not between", value1, value2, "visualFlag");
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