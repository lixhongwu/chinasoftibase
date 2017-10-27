package com.chinasofti.common.py.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PyTicketBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PyTicketBaseExample() {
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

        public Criteria andTicketCodeIsNull() {
            addCriterion("ticket_code is null");
            return (Criteria) this;
        }

        public Criteria andTicketCodeIsNotNull() {
            addCriterion("ticket_code is not null");
            return (Criteria) this;
        }

        public Criteria andTicketCodeEqualTo(String value) {
            addCriterion("ticket_code =", value, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeNotEqualTo(String value) {
            addCriterion("ticket_code <>", value, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeGreaterThan(String value) {
            addCriterion("ticket_code >", value, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_code >=", value, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeLessThan(String value) {
            addCriterion("ticket_code <", value, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeLessThanOrEqualTo(String value) {
            addCriterion("ticket_code <=", value, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeLike(String value) {
            addCriterion("ticket_code like", value, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeNotLike(String value) {
            addCriterion("ticket_code not like", value, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeIn(List<String> values) {
            addCriterion("ticket_code in", values, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeNotIn(List<String> values) {
            addCriterion("ticket_code not in", values, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeBetween(String value1, String value2) {
            addCriterion("ticket_code between", value1, value2, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketCodeNotBetween(String value1, String value2) {
            addCriterion("ticket_code not between", value1, value2, "ticketCode");
            return (Criteria) this;
        }

        public Criteria andTicketNameIsNull() {
            addCriterion("ticket_name is null");
            return (Criteria) this;
        }

        public Criteria andTicketNameIsNotNull() {
            addCriterion("ticket_name is not null");
            return (Criteria) this;
        }

        public Criteria andTicketNameEqualTo(String value) {
            addCriterion("ticket_name =", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotEqualTo(String value) {
            addCriterion("ticket_name <>", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameGreaterThan(String value) {
            addCriterion("ticket_name >", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_name >=", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameLessThan(String value) {
            addCriterion("ticket_name <", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameLessThanOrEqualTo(String value) {
            addCriterion("ticket_name <=", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameLike(String value) {
            addCriterion("ticket_name like", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotLike(String value) {
            addCriterion("ticket_name not like", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameIn(List<String> values) {
            addCriterion("ticket_name in", values, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotIn(List<String> values) {
            addCriterion("ticket_name not in", values, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameBetween(String value1, String value2) {
            addCriterion("ticket_name between", value1, value2, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotBetween(String value1, String value2) {
            addCriterion("ticket_name not between", value1, value2, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIsNull() {
            addCriterion("ticket_type is null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIsNotNull() {
            addCriterion("ticket_type is not null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeEqualTo(String value) {
            addCriterion("ticket_type =", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotEqualTo(String value) {
            addCriterion("ticket_type <>", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThan(String value) {
            addCriterion("ticket_type >", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_type >=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThan(String value) {
            addCriterion("ticket_type <", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThanOrEqualTo(String value) {
            addCriterion("ticket_type <=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLike(String value) {
            addCriterion("ticket_type like", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotLike(String value) {
            addCriterion("ticket_type not like", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIn(List<String> values) {
            addCriterion("ticket_type in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotIn(List<String> values) {
            addCriterion("ticket_type not in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeBetween(String value1, String value2) {
            addCriterion("ticket_type between", value1, value2, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotBetween(String value1, String value2) {
            addCriterion("ticket_type not between", value1, value2, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketValueIsNull() {
            addCriterion("ticket_value is null");
            return (Criteria) this;
        }

        public Criteria andTicketValueIsNotNull() {
            addCriterion("ticket_value is not null");
            return (Criteria) this;
        }

        public Criteria andTicketValueEqualTo(BigDecimal value) {
            addCriterion("ticket_value =", value, "ticketValue");
            return (Criteria) this;
        }

        public Criteria andTicketValueNotEqualTo(BigDecimal value) {
            addCriterion("ticket_value <>", value, "ticketValue");
            return (Criteria) this;
        }

        public Criteria andTicketValueGreaterThan(BigDecimal value) {
            addCriterion("ticket_value >", value, "ticketValue");
            return (Criteria) this;
        }

        public Criteria andTicketValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ticket_value >=", value, "ticketValue");
            return (Criteria) this;
        }

        public Criteria andTicketValueLessThan(BigDecimal value) {
            addCriterion("ticket_value <", value, "ticketValue");
            return (Criteria) this;
        }

        public Criteria andTicketValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ticket_value <=", value, "ticketValue");
            return (Criteria) this;
        }

        public Criteria andTicketValueIn(List<BigDecimal> values) {
            addCriterion("ticket_value in", values, "ticketValue");
            return (Criteria) this;
        }

        public Criteria andTicketValueNotIn(List<BigDecimal> values) {
            addCriterion("ticket_value not in", values, "ticketValue");
            return (Criteria) this;
        }

        public Criteria andTicketValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ticket_value between", value1, value2, "ticketValue");
            return (Criteria) this;
        }

        public Criteria andTicketValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ticket_value not between", value1, value2, "ticketValue");
            return (Criteria) this;
        }

        public Criteria andTicketDescIsNull() {
            addCriterion("ticket_desc is null");
            return (Criteria) this;
        }

        public Criteria andTicketDescIsNotNull() {
            addCriterion("ticket_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTicketDescEqualTo(String value) {
            addCriterion("ticket_desc =", value, "ticketDesc");
            return (Criteria) this;
        }

        public Criteria andTicketDescNotEqualTo(String value) {
            addCriterion("ticket_desc <>", value, "ticketDesc");
            return (Criteria) this;
        }

        public Criteria andTicketDescGreaterThan(String value) {
            addCriterion("ticket_desc >", value, "ticketDesc");
            return (Criteria) this;
        }

        public Criteria andTicketDescGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_desc >=", value, "ticketDesc");
            return (Criteria) this;
        }

        public Criteria andTicketDescLessThan(String value) {
            addCriterion("ticket_desc <", value, "ticketDesc");
            return (Criteria) this;
        }

        public Criteria andTicketDescLessThanOrEqualTo(String value) {
            addCriterion("ticket_desc <=", value, "ticketDesc");
            return (Criteria) this;
        }

        public Criteria andTicketDescLike(String value) {
            addCriterion("ticket_desc like", value, "ticketDesc");
            return (Criteria) this;
        }

        public Criteria andTicketDescNotLike(String value) {
            addCriterion("ticket_desc not like", value, "ticketDesc");
            return (Criteria) this;
        }

        public Criteria andTicketDescIn(List<String> values) {
            addCriterion("ticket_desc in", values, "ticketDesc");
            return (Criteria) this;
        }

        public Criteria andTicketDescNotIn(List<String> values) {
            addCriterion("ticket_desc not in", values, "ticketDesc");
            return (Criteria) this;
        }

        public Criteria andTicketDescBetween(String value1, String value2) {
            addCriterion("ticket_desc between", value1, value2, "ticketDesc");
            return (Criteria) this;
        }

        public Criteria andTicketDescNotBetween(String value1, String value2) {
            addCriterion("ticket_desc not between", value1, value2, "ticketDesc");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNull() {
            addCriterion("delivery_type is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNotNull() {
            addCriterion("delivery_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeEqualTo(String value) {
            addCriterion("delivery_type =", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotEqualTo(String value) {
            addCriterion("delivery_type <>", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThan(String value) {
            addCriterion("delivery_type >", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_type >=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThan(String value) {
            addCriterion("delivery_type <", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThanOrEqualTo(String value) {
            addCriterion("delivery_type <=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLike(String value) {
            addCriterion("delivery_type like", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotLike(String value) {
            addCriterion("delivery_type not like", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIn(List<String> values) {
            addCriterion("delivery_type in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotIn(List<String> values) {
            addCriterion("delivery_type not in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeBetween(String value1, String value2) {
            addCriterion("delivery_type between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotBetween(String value1, String value2) {
            addCriterion("delivery_type not between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTotalCountIsNull() {
            addCriterion("delivery_total_count is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTotalCountIsNotNull() {
            addCriterion("delivery_total_count is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTotalCountEqualTo(Integer value) {
            addCriterion("delivery_total_count =", value, "deliveryTotalCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryTotalCountNotEqualTo(Integer value) {
            addCriterion("delivery_total_count <>", value, "deliveryTotalCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryTotalCountGreaterThan(Integer value) {
            addCriterion("delivery_total_count >", value, "deliveryTotalCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_total_count >=", value, "deliveryTotalCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryTotalCountLessThan(Integer value) {
            addCriterion("delivery_total_count <", value, "deliveryTotalCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_total_count <=", value, "deliveryTotalCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryTotalCountIn(List<Integer> values) {
            addCriterion("delivery_total_count in", values, "deliveryTotalCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryTotalCountNotIn(List<Integer> values) {
            addCriterion("delivery_total_count not in", values, "deliveryTotalCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("delivery_total_count between", value1, value2, "deliveryTotalCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_total_count not between", value1, value2, "deliveryTotalCount");
            return (Criteria) this;
        }

        public Criteria andChannelNoIsNull() {
            addCriterion("channel_no is null");
            return (Criteria) this;
        }

        public Criteria andChannelNoIsNotNull() {
            addCriterion("channel_no is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNoEqualTo(String value) {
            addCriterion("channel_no =", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotEqualTo(String value) {
            addCriterion("channel_no <>", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoGreaterThan(String value) {
            addCriterion("channel_no >", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoGreaterThanOrEqualTo(String value) {
            addCriterion("channel_no >=", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoLessThan(String value) {
            addCriterion("channel_no <", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoLessThanOrEqualTo(String value) {
            addCriterion("channel_no <=", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoLike(String value) {
            addCriterion("channel_no like", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotLike(String value) {
            addCriterion("channel_no not like", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoIn(List<String> values) {
            addCriterion("channel_no in", values, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotIn(List<String> values) {
            addCriterion("channel_no not in", values, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoBetween(String value1, String value2) {
            addCriterion("channel_no between", value1, value2, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotBetween(String value1, String value2) {
            addCriterion("channel_no not between", value1, value2, "channelNo");
            return (Criteria) this;
        }

        public Criteria andDeliverySingleCountIsNull() {
            addCriterion("delivery_single_count is null");
            return (Criteria) this;
        }

        public Criteria andDeliverySingleCountIsNotNull() {
            addCriterion("delivery_single_count is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverySingleCountEqualTo(Integer value) {
            addCriterion("delivery_single_count =", value, "deliverySingleCount");
            return (Criteria) this;
        }

        public Criteria andDeliverySingleCountNotEqualTo(Integer value) {
            addCriterion("delivery_single_count <>", value, "deliverySingleCount");
            return (Criteria) this;
        }

        public Criteria andDeliverySingleCountGreaterThan(Integer value) {
            addCriterion("delivery_single_count >", value, "deliverySingleCount");
            return (Criteria) this;
        }

        public Criteria andDeliverySingleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_single_count >=", value, "deliverySingleCount");
            return (Criteria) this;
        }

        public Criteria andDeliverySingleCountLessThan(Integer value) {
            addCriterion("delivery_single_count <", value, "deliverySingleCount");
            return (Criteria) this;
        }

        public Criteria andDeliverySingleCountLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_single_count <=", value, "deliverySingleCount");
            return (Criteria) this;
        }

        public Criteria andDeliverySingleCountIn(List<Integer> values) {
            addCriterion("delivery_single_count in", values, "deliverySingleCount");
            return (Criteria) this;
        }

        public Criteria andDeliverySingleCountNotIn(List<Integer> values) {
            addCriterion("delivery_single_count not in", values, "deliverySingleCount");
            return (Criteria) this;
        }

        public Criteria andDeliverySingleCountBetween(Integer value1, Integer value2) {
            addCriterion("delivery_single_count between", value1, value2, "deliverySingleCount");
            return (Criteria) this;
        }

        public Criteria andDeliverySingleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_single_count not between", value1, value2, "deliverySingleCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryBeginTimeIsNull() {
            addCriterion("delivery_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryBeginTimeIsNotNull() {
            addCriterion("delivery_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryBeginTimeEqualTo(Date value) {
            addCriterion("delivery_begin_time =", value, "deliveryBeginTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryBeginTimeNotEqualTo(Date value) {
            addCriterion("delivery_begin_time <>", value, "deliveryBeginTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryBeginTimeGreaterThan(Date value) {
            addCriterion("delivery_begin_time >", value, "deliveryBeginTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delivery_begin_time >=", value, "deliveryBeginTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryBeginTimeLessThan(Date value) {
            addCriterion("delivery_begin_time <", value, "deliveryBeginTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("delivery_begin_time <=", value, "deliveryBeginTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryBeginTimeIn(List<Date> values) {
            addCriterion("delivery_begin_time in", values, "deliveryBeginTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryBeginTimeNotIn(List<Date> values) {
            addCriterion("delivery_begin_time not in", values, "deliveryBeginTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryBeginTimeBetween(Date value1, Date value2) {
            addCriterion("delivery_begin_time between", value1, value2, "deliveryBeginTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("delivery_begin_time not between", value1, value2, "deliveryBeginTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeIsNull() {
            addCriterion("delivery_end_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeIsNotNull() {
            addCriterion("delivery_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeEqualTo(Date value) {
            addCriterion("delivery_end_time =", value, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeNotEqualTo(Date value) {
            addCriterion("delivery_end_time <>", value, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeGreaterThan(Date value) {
            addCriterion("delivery_end_time >", value, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delivery_end_time >=", value, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeLessThan(Date value) {
            addCriterion("delivery_end_time <", value, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("delivery_end_time <=", value, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeIn(List<Date> values) {
            addCriterion("delivery_end_time in", values, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeNotIn(List<Date> values) {
            addCriterion("delivery_end_time not in", values, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeBetween(Date value1, Date value2) {
            addCriterion("delivery_end_time between", value1, value2, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("delivery_end_time not between", value1, value2, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andValidBeginDateIsNull() {
            addCriterion("valid_begin_date is null");
            return (Criteria) this;
        }

        public Criteria andValidBeginDateIsNotNull() {
            addCriterion("valid_begin_date is not null");
            return (Criteria) this;
        }

        public Criteria andValidBeginDateEqualTo(Date value) {
            addCriterion("valid_begin_date =", value, "validBeginDate");
            return (Criteria) this;
        }

        public Criteria andValidBeginDateNotEqualTo(Date value) {
            addCriterion("valid_begin_date <>", value, "validBeginDate");
            return (Criteria) this;
        }

        public Criteria andValidBeginDateGreaterThan(Date value) {
            addCriterion("valid_begin_date >", value, "validBeginDate");
            return (Criteria) this;
        }

        public Criteria andValidBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("valid_begin_date >=", value, "validBeginDate");
            return (Criteria) this;
        }

        public Criteria andValidBeginDateLessThan(Date value) {
            addCriterion("valid_begin_date <", value, "validBeginDate");
            return (Criteria) this;
        }

        public Criteria andValidBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("valid_begin_date <=", value, "validBeginDate");
            return (Criteria) this;
        }

        public Criteria andValidBeginDateIn(List<Date> values) {
            addCriterion("valid_begin_date in", values, "validBeginDate");
            return (Criteria) this;
        }

        public Criteria andValidBeginDateNotIn(List<Date> values) {
            addCriterion("valid_begin_date not in", values, "validBeginDate");
            return (Criteria) this;
        }

        public Criteria andValidBeginDateBetween(Date value1, Date value2) {
            addCriterion("valid_begin_date between", value1, value2, "validBeginDate");
            return (Criteria) this;
        }

        public Criteria andValidBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("valid_begin_date not between", value1, value2, "validBeginDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateIsNull() {
            addCriterion("valid_end_date is null");
            return (Criteria) this;
        }

        public Criteria andValidEndDateIsNotNull() {
            addCriterion("valid_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andValidEndDateEqualTo(Date value) {
            addCriterion("valid_end_date =", value, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateNotEqualTo(Date value) {
            addCriterion("valid_end_date <>", value, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateGreaterThan(Date value) {
            addCriterion("valid_end_date >", value, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("valid_end_date >=", value, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateLessThan(Date value) {
            addCriterion("valid_end_date <", value, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateLessThanOrEqualTo(Date value) {
            addCriterion("valid_end_date <=", value, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateIn(List<Date> values) {
            addCriterion("valid_end_date in", values, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateNotIn(List<Date> values) {
            addCriterion("valid_end_date not in", values, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateBetween(Date value1, Date value2) {
            addCriterion("valid_end_date between", value1, value2, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andValidEndDateNotBetween(Date value1, Date value2) {
            addCriterion("valid_end_date not between", value1, value2, "validEndDate");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNull() {
            addCriterion("payway is null");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNotNull() {
            addCriterion("payway is not null");
            return (Criteria) this;
        }

        public Criteria andPaywayEqualTo(String value) {
            addCriterion("payway =", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotEqualTo(String value) {
            addCriterion("payway <>", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThan(String value) {
            addCriterion("payway >", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThanOrEqualTo(String value) {
            addCriterion("payway >=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThan(String value) {
            addCriterion("payway <", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThanOrEqualTo(String value) {
            addCriterion("payway <=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLike(String value) {
            addCriterion("payway like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotLike(String value) {
            addCriterion("payway not like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayIn(List<String> values) {
            addCriterion("payway in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotIn(List<String> values) {
            addCriterion("payway not in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayBetween(String value1, String value2) {
            addCriterion("payway between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotBetween(String value1, String value2) {
            addCriterion("payway not between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andValidDaysIsNull() {
            addCriterion("valid_days is null");
            return (Criteria) this;
        }

        public Criteria andValidDaysIsNotNull() {
            addCriterion("valid_days is not null");
            return (Criteria) this;
        }

        public Criteria andValidDaysEqualTo(Integer value) {
            addCriterion("valid_days =", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysNotEqualTo(Integer value) {
            addCriterion("valid_days <>", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysGreaterThan(Integer value) {
            addCriterion("valid_days >", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid_days >=", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysLessThan(Integer value) {
            addCriterion("valid_days <", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysLessThanOrEqualTo(Integer value) {
            addCriterion("valid_days <=", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysIn(List<Integer> values) {
            addCriterion("valid_days in", values, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysNotIn(List<Integer> values) {
            addCriterion("valid_days not in", values, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysBetween(Integer value1, Integer value2) {
            addCriterion("valid_days between", value1, value2, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("valid_days not between", value1, value2, "validDays");
            return (Criteria) this;
        }

        public Criteria andGrantGroupIsNull() {
            addCriterion("grant_group is null");
            return (Criteria) this;
        }

        public Criteria andGrantGroupIsNotNull() {
            addCriterion("grant_group is not null");
            return (Criteria) this;
        }

        public Criteria andGrantGroupEqualTo(String value) {
            addCriterion("grant_group =", value, "grantGroup");
            return (Criteria) this;
        }

        public Criteria andGrantGroupNotEqualTo(String value) {
            addCriterion("grant_group <>", value, "grantGroup");
            return (Criteria) this;
        }

        public Criteria andGrantGroupGreaterThan(String value) {
            addCriterion("grant_group >", value, "grantGroup");
            return (Criteria) this;
        }

        public Criteria andGrantGroupGreaterThanOrEqualTo(String value) {
            addCriterion("grant_group >=", value, "grantGroup");
            return (Criteria) this;
        }

        public Criteria andGrantGroupLessThan(String value) {
            addCriterion("grant_group <", value, "grantGroup");
            return (Criteria) this;
        }

        public Criteria andGrantGroupLessThanOrEqualTo(String value) {
            addCriterion("grant_group <=", value, "grantGroup");
            return (Criteria) this;
        }

        public Criteria andGrantGroupLike(String value) {
            addCriterion("grant_group like", value, "grantGroup");
            return (Criteria) this;
        }

        public Criteria andGrantGroupNotLike(String value) {
            addCriterion("grant_group not like", value, "grantGroup");
            return (Criteria) this;
        }

        public Criteria andGrantGroupIn(List<String> values) {
            addCriterion("grant_group in", values, "grantGroup");
            return (Criteria) this;
        }

        public Criteria andGrantGroupNotIn(List<String> values) {
            addCriterion("grant_group not in", values, "grantGroup");
            return (Criteria) this;
        }

        public Criteria andGrantGroupBetween(String value1, String value2) {
            addCriterion("grant_group between", value1, value2, "grantGroup");
            return (Criteria) this;
        }

        public Criteria andGrantGroupNotBetween(String value1, String value2) {
            addCriterion("grant_group not between", value1, value2, "grantGroup");
            return (Criteria) this;
        }

        public Criteria andLimitUsedTypeIsNull() {
            addCriterion("limit_used_type is null");
            return (Criteria) this;
        }

        public Criteria andLimitUsedTypeIsNotNull() {
            addCriterion("limit_used_type is not null");
            return (Criteria) this;
        }

        public Criteria andLimitUsedTypeEqualTo(String value) {
            addCriterion("limit_used_type =", value, "limitUsedType");
            return (Criteria) this;
        }

        public Criteria andLimitUsedTypeNotEqualTo(String value) {
            addCriterion("limit_used_type <>", value, "limitUsedType");
            return (Criteria) this;
        }

        public Criteria andLimitUsedTypeGreaterThan(String value) {
            addCriterion("limit_used_type >", value, "limitUsedType");
            return (Criteria) this;
        }

        public Criteria andLimitUsedTypeGreaterThanOrEqualTo(String value) {
            addCriterion("limit_used_type >=", value, "limitUsedType");
            return (Criteria) this;
        }

        public Criteria andLimitUsedTypeLessThan(String value) {
            addCriterion("limit_used_type <", value, "limitUsedType");
            return (Criteria) this;
        }

        public Criteria andLimitUsedTypeLessThanOrEqualTo(String value) {
            addCriterion("limit_used_type <=", value, "limitUsedType");
            return (Criteria) this;
        }

        public Criteria andLimitUsedTypeLike(String value) {
            addCriterion("limit_used_type like", value, "limitUsedType");
            return (Criteria) this;
        }

        public Criteria andLimitUsedTypeNotLike(String value) {
            addCriterion("limit_used_type not like", value, "limitUsedType");
            return (Criteria) this;
        }

        public Criteria andLimitUsedTypeIn(List<String> values) {
            addCriterion("limit_used_type in", values, "limitUsedType");
            return (Criteria) this;
        }

        public Criteria andLimitUsedTypeNotIn(List<String> values) {
            addCriterion("limit_used_type not in", values, "limitUsedType");
            return (Criteria) this;
        }

        public Criteria andLimitUsedTypeBetween(String value1, String value2) {
            addCriterion("limit_used_type between", value1, value2, "limitUsedType");
            return (Criteria) this;
        }

        public Criteria andLimitUsedTypeNotBetween(String value1, String value2) {
            addCriterion("limit_used_type not between", value1, value2, "limitUsedType");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNull() {
            addCriterion("approval_status is null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNotNull() {
            addCriterion("approval_status is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusEqualTo(String value) {
            addCriterion("approval_status =", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotEqualTo(String value) {
            addCriterion("approval_status <>", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThan(String value) {
            addCriterion("approval_status >", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("approval_status >=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThan(String value) {
            addCriterion("approval_status <", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThanOrEqualTo(String value) {
            addCriterion("approval_status <=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLike(String value) {
            addCriterion("approval_status like", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotLike(String value) {
            addCriterion("approval_status not like", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIn(List<String> values) {
            addCriterion("approval_status in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotIn(List<String> values) {
            addCriterion("approval_status not in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusBetween(String value1, String value2) {
            addCriterion("approval_status between", value1, value2, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotBetween(String value1, String value2) {
            addCriterion("approval_status not between", value1, value2, "approvalStatus");
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

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNull() {
            addCriterion("remark3 is null");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNotNull() {
            addCriterion("remark3 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark3EqualTo(String value) {
            addCriterion("remark3 =", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotEqualTo(String value) {
            addCriterion("remark3 <>", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThan(String value) {
            addCriterion("remark3 >", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThanOrEqualTo(String value) {
            addCriterion("remark3 >=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThan(String value) {
            addCriterion("remark3 <", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThanOrEqualTo(String value) {
            addCriterion("remark3 <=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Like(String value) {
            addCriterion("remark3 like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotLike(String value) {
            addCriterion("remark3 not like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3In(List<String> values) {
            addCriterion("remark3 in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotIn(List<String> values) {
            addCriterion("remark3 not in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Between(String value1, String value2) {
            addCriterion("remark3 between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotBetween(String value1, String value2) {
            addCriterion("remark3 not between", value1, value2, "remark3");
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