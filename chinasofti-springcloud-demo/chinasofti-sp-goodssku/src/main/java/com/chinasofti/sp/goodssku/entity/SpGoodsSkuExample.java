package com.chinasofti.sp.goodssku.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SpGoodsSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpGoodsSkuExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andSkuCodeIsNull() {
            addCriterion("sku_code is null");
            return (Criteria) this;
        }

        public Criteria andSkuCodeIsNotNull() {
            addCriterion("sku_code is not null");
            return (Criteria) this;
        }

        public Criteria andSkuCodeEqualTo(String value) {
            addCriterion("sku_code =", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotEqualTo(String value) {
            addCriterion("sku_code <>", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeGreaterThan(String value) {
            addCriterion("sku_code >", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sku_code >=", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeLessThan(String value) {
            addCriterion("sku_code <", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeLessThanOrEqualTo(String value) {
            addCriterion("sku_code <=", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeLike(String value) {
            addCriterion("sku_code like", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotLike(String value) {
            addCriterion("sku_code not like", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeIn(List<String> values) {
            addCriterion("sku_code in", values, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotIn(List<String> values) {
            addCriterion("sku_code not in", values, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeBetween(String value1, String value2) {
            addCriterion("sku_code between", value1, value2, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotBetween(String value1, String value2) {
            addCriterion("sku_code not between", value1, value2, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceIsNull() {
            addCriterion("sku_sale_Price is null");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceIsNotNull() {
            addCriterion("sku_sale_Price is not null");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceEqualTo(BigDecimal value) {
            addCriterion("sku_sale_Price =", value, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceNotEqualTo(BigDecimal value) {
            addCriterion("sku_sale_Price <>", value, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceGreaterThan(BigDecimal value) {
            addCriterion("sku_sale_Price >", value, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sku_sale_Price >=", value, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceLessThan(BigDecimal value) {
            addCriterion("sku_sale_Price <", value, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sku_sale_Price <=", value, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceIn(List<BigDecimal> values) {
            addCriterion("sku_sale_Price in", values, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceNotIn(List<BigDecimal> values) {
            addCriterion("sku_sale_Price not in", values, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sku_sale_Price between", value1, value2, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sku_sale_Price not between", value1, value2, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceIsNull() {
            addCriterion("sku_market_price is null");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceIsNotNull() {
            addCriterion("sku_market_price is not null");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceEqualTo(BigDecimal value) {
            addCriterion("sku_market_price =", value, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("sku_market_price <>", value, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("sku_market_price >", value, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sku_market_price >=", value, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceLessThan(BigDecimal value) {
            addCriterion("sku_market_price <", value, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sku_market_price <=", value, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceIn(List<BigDecimal> values) {
            addCriterion("sku_market_price in", values, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("sku_market_price not in", values, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sku_market_price between", value1, value2, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sku_market_price not between", value1, value2, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuCostPriceIsNull() {
            addCriterion("sku_cost_price is null");
            return (Criteria) this;
        }

        public Criteria andSkuCostPriceIsNotNull() {
            addCriterion("sku_cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andSkuCostPriceEqualTo(BigDecimal value) {
            addCriterion("sku_cost_price =", value, "skuCostPrice");
            return (Criteria) this;
        }

        public Criteria andSkuCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("sku_cost_price <>", value, "skuCostPrice");
            return (Criteria) this;
        }

        public Criteria andSkuCostPriceGreaterThan(BigDecimal value) {
            addCriterion("sku_cost_price >", value, "skuCostPrice");
            return (Criteria) this;
        }

        public Criteria andSkuCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sku_cost_price >=", value, "skuCostPrice");
            return (Criteria) this;
        }

        public Criteria andSkuCostPriceLessThan(BigDecimal value) {
            addCriterion("sku_cost_price <", value, "skuCostPrice");
            return (Criteria) this;
        }

        public Criteria andSkuCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sku_cost_price <=", value, "skuCostPrice");
            return (Criteria) this;
        }

        public Criteria andSkuCostPriceIn(List<BigDecimal> values) {
            addCriterion("sku_cost_price in", values, "skuCostPrice");
            return (Criteria) this;
        }

        public Criteria andSkuCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("sku_cost_price not in", values, "skuCostPrice");
            return (Criteria) this;
        }

        public Criteria andSkuCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sku_cost_price between", value1, value2, "skuCostPrice");
            return (Criteria) this;
        }

        public Criteria andSkuCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sku_cost_price not between", value1, value2, "skuCostPrice");
            return (Criteria) this;
        }

        public Criteria andSkuOptionIdsIsNull() {
            addCriterion("sku_option_ids is null");
            return (Criteria) this;
        }

        public Criteria andSkuOptionIdsIsNotNull() {
            addCriterion("sku_option_ids is not null");
            return (Criteria) this;
        }

        public Criteria andSkuOptionIdsEqualTo(String value) {
            addCriterion("sku_option_ids =", value, "skuOptionIds");
            return (Criteria) this;
        }

        public Criteria andSkuOptionIdsNotEqualTo(String value) {
            addCriterion("sku_option_ids <>", value, "skuOptionIds");
            return (Criteria) this;
        }

        public Criteria andSkuOptionIdsGreaterThan(String value) {
            addCriterion("sku_option_ids >", value, "skuOptionIds");
            return (Criteria) this;
        }

        public Criteria andSkuOptionIdsGreaterThanOrEqualTo(String value) {
            addCriterion("sku_option_ids >=", value, "skuOptionIds");
            return (Criteria) this;
        }

        public Criteria andSkuOptionIdsLessThan(String value) {
            addCriterion("sku_option_ids <", value, "skuOptionIds");
            return (Criteria) this;
        }

        public Criteria andSkuOptionIdsLessThanOrEqualTo(String value) {
            addCriterion("sku_option_ids <=", value, "skuOptionIds");
            return (Criteria) this;
        }

        public Criteria andSkuOptionIdsLike(String value) {
            addCriterion("sku_option_ids like", value, "skuOptionIds");
            return (Criteria) this;
        }

        public Criteria andSkuOptionIdsNotLike(String value) {
            addCriterion("sku_option_ids not like", value, "skuOptionIds");
            return (Criteria) this;
        }

        public Criteria andSkuOptionIdsIn(List<String> values) {
            addCriterion("sku_option_ids in", values, "skuOptionIds");
            return (Criteria) this;
        }

        public Criteria andSkuOptionIdsNotIn(List<String> values) {
            addCriterion("sku_option_ids not in", values, "skuOptionIds");
            return (Criteria) this;
        }

        public Criteria andSkuOptionIdsBetween(String value1, String value2) {
            addCriterion("sku_option_ids between", value1, value2, "skuOptionIds");
            return (Criteria) this;
        }

        public Criteria andSkuOptionIdsNotBetween(String value1, String value2) {
            addCriterion("sku_option_ids not between", value1, value2, "skuOptionIds");
            return (Criteria) this;
        }

        public Criteria andSkuOptionNamesIsNull() {
            addCriterion("sku_option_names is null");
            return (Criteria) this;
        }

        public Criteria andSkuOptionNamesIsNotNull() {
            addCriterion("sku_option_names is not null");
            return (Criteria) this;
        }

        public Criteria andSkuOptionNamesEqualTo(String value) {
            addCriterion("sku_option_names =", value, "skuOptionNames");
            return (Criteria) this;
        }

        public Criteria andSkuOptionNamesNotEqualTo(String value) {
            addCriterion("sku_option_names <>", value, "skuOptionNames");
            return (Criteria) this;
        }

        public Criteria andSkuOptionNamesGreaterThan(String value) {
            addCriterion("sku_option_names >", value, "skuOptionNames");
            return (Criteria) this;
        }

        public Criteria andSkuOptionNamesGreaterThanOrEqualTo(String value) {
            addCriterion("sku_option_names >=", value, "skuOptionNames");
            return (Criteria) this;
        }

        public Criteria andSkuOptionNamesLessThan(String value) {
            addCriterion("sku_option_names <", value, "skuOptionNames");
            return (Criteria) this;
        }

        public Criteria andSkuOptionNamesLessThanOrEqualTo(String value) {
            addCriterion("sku_option_names <=", value, "skuOptionNames");
            return (Criteria) this;
        }

        public Criteria andSkuOptionNamesLike(String value) {
            addCriterion("sku_option_names like", value, "skuOptionNames");
            return (Criteria) this;
        }

        public Criteria andSkuOptionNamesNotLike(String value) {
            addCriterion("sku_option_names not like", value, "skuOptionNames");
            return (Criteria) this;
        }

        public Criteria andSkuOptionNamesIn(List<String> values) {
            addCriterion("sku_option_names in", values, "skuOptionNames");
            return (Criteria) this;
        }

        public Criteria andSkuOptionNamesNotIn(List<String> values) {
            addCriterion("sku_option_names not in", values, "skuOptionNames");
            return (Criteria) this;
        }

        public Criteria andSkuOptionNamesBetween(String value1, String value2) {
            addCriterion("sku_option_names between", value1, value2, "skuOptionNames");
            return (Criteria) this;
        }

        public Criteria andSkuOptionNamesNotBetween(String value1, String value2) {
            addCriterion("sku_option_names not between", value1, value2, "skuOptionNames");
            return (Criteria) this;
        }

        public Criteria andSkuStockIsNull() {
            addCriterion("sku_stock is null");
            return (Criteria) this;
        }

        public Criteria andSkuStockIsNotNull() {
            addCriterion("sku_stock is not null");
            return (Criteria) this;
        }

        public Criteria andSkuStockEqualTo(Integer value) {
            addCriterion("sku_stock =", value, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuStockNotEqualTo(Integer value) {
            addCriterion("sku_stock <>", value, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuStockGreaterThan(Integer value) {
            addCriterion("sku_stock >", value, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_stock >=", value, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuStockLessThan(Integer value) {
            addCriterion("sku_stock <", value, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuStockLessThanOrEqualTo(Integer value) {
            addCriterion("sku_stock <=", value, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuStockIn(List<Integer> values) {
            addCriterion("sku_stock in", values, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuStockNotIn(List<Integer> values) {
            addCriterion("sku_stock not in", values, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuStockBetween(Integer value1, Integer value2) {
            addCriterion("sku_stock between", value1, value2, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuStockNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_stock not between", value1, value2, "skuStock");
            return (Criteria) this;
        }

        public Criteria andSkuSalesIsNull() {
            addCriterion("sku_sales is null");
            return (Criteria) this;
        }

        public Criteria andSkuSalesIsNotNull() {
            addCriterion("sku_sales is not null");
            return (Criteria) this;
        }

        public Criteria andSkuSalesEqualTo(Integer value) {
            addCriterion("sku_sales =", value, "skuSales");
            return (Criteria) this;
        }

        public Criteria andSkuSalesNotEqualTo(Integer value) {
            addCriterion("sku_sales <>", value, "skuSales");
            return (Criteria) this;
        }

        public Criteria andSkuSalesGreaterThan(Integer value) {
            addCriterion("sku_sales >", value, "skuSales");
            return (Criteria) this;
        }

        public Criteria andSkuSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_sales >=", value, "skuSales");
            return (Criteria) this;
        }

        public Criteria andSkuSalesLessThan(Integer value) {
            addCriterion("sku_sales <", value, "skuSales");
            return (Criteria) this;
        }

        public Criteria andSkuSalesLessThanOrEqualTo(Integer value) {
            addCriterion("sku_sales <=", value, "skuSales");
            return (Criteria) this;
        }

        public Criteria andSkuSalesIn(List<Integer> values) {
            addCriterion("sku_sales in", values, "skuSales");
            return (Criteria) this;
        }

        public Criteria andSkuSalesNotIn(List<Integer> values) {
            addCriterion("sku_sales not in", values, "skuSales");
            return (Criteria) this;
        }

        public Criteria andSkuSalesBetween(Integer value1, Integer value2) {
            addCriterion("sku_sales between", value1, value2, "skuSales");
            return (Criteria) this;
        }

        public Criteria andSkuSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_sales not between", value1, value2, "skuSales");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
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

        public Criteria andModifyUserIsNull() {
            addCriterion("modify_user is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNotNull() {
            addCriterion("modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserEqualTo(String value) {
            addCriterion("modify_user =", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotEqualTo(String value) {
            addCriterion("modify_user <>", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThan(String value) {
            addCriterion("modify_user >", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("modify_user >=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThan(String value) {
            addCriterion("modify_user <", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThanOrEqualTo(String value) {
            addCriterion("modify_user <=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLike(String value) {
            addCriterion("modify_user like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotLike(String value) {
            addCriterion("modify_user not like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserIn(List<String> values) {
            addCriterion("modify_user in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotIn(List<String> values) {
            addCriterion("modify_user not in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserBetween(String value1, String value2) {
            addCriterion("modify_user between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotBetween(String value1, String value2) {
            addCriterion("modify_user not between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(String value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(String value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(String value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(String value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(String value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLike(String value) {
            addCriterion("modify_time like", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotLike(String value) {
            addCriterion("modify_time not like", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<String> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<String> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(String value1, String value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(String value1, String value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
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

        public Criteria andMyskuCodeIsNull() {
            addCriterion("MYSKU_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMyskuCodeIsNotNull() {
            addCriterion("MYSKU_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMyskuCodeEqualTo(String value) {
            addCriterion("MYSKU_CODE =", value, "myskuCode");
            return (Criteria) this;
        }

        public Criteria andMyskuCodeNotEqualTo(String value) {
            addCriterion("MYSKU_CODE <>", value, "myskuCode");
            return (Criteria) this;
        }

        public Criteria andMyskuCodeGreaterThan(String value) {
            addCriterion("MYSKU_CODE >", value, "myskuCode");
            return (Criteria) this;
        }

        public Criteria andMyskuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MYSKU_CODE >=", value, "myskuCode");
            return (Criteria) this;
        }

        public Criteria andMyskuCodeLessThan(String value) {
            addCriterion("MYSKU_CODE <", value, "myskuCode");
            return (Criteria) this;
        }

        public Criteria andMyskuCodeLessThanOrEqualTo(String value) {
            addCriterion("MYSKU_CODE <=", value, "myskuCode");
            return (Criteria) this;
        }

        public Criteria andMyskuCodeLike(String value) {
            addCriterion("MYSKU_CODE like", value, "myskuCode");
            return (Criteria) this;
        }

        public Criteria andMyskuCodeNotLike(String value) {
            addCriterion("MYSKU_CODE not like", value, "myskuCode");
            return (Criteria) this;
        }

        public Criteria andMyskuCodeIn(List<String> values) {
            addCriterion("MYSKU_CODE in", values, "myskuCode");
            return (Criteria) this;
        }

        public Criteria andMyskuCodeNotIn(List<String> values) {
            addCriterion("MYSKU_CODE not in", values, "myskuCode");
            return (Criteria) this;
        }

        public Criteria andMyskuCodeBetween(String value1, String value2) {
            addCriterion("MYSKU_CODE between", value1, value2, "myskuCode");
            return (Criteria) this;
        }

        public Criteria andMyskuCodeNotBetween(String value1, String value2) {
            addCriterion("MYSKU_CODE not between", value1, value2, "myskuCode");
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