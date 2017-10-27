package com.chinasofti.common.sp.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PyMainGoodsorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PyMainGoodsorderExample() {
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

        public Criteria andBigorderIdIsNull() {
            addCriterion("BIGORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBigorderIdIsNotNull() {
            addCriterion("BIGORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBigorderIdEqualTo(String value) {
            addCriterion("BIGORDER_ID =", value, "bigorderId");
            return (Criteria) this;
        }

        public Criteria andBigorderIdNotEqualTo(String value) {
            addCriterion("BIGORDER_ID <>", value, "bigorderId");
            return (Criteria) this;
        }

        public Criteria andBigorderIdGreaterThan(String value) {
            addCriterion("BIGORDER_ID >", value, "bigorderId");
            return (Criteria) this;
        }

        public Criteria andBigorderIdGreaterThanOrEqualTo(String value) {
            addCriterion("BIGORDER_ID >=", value, "bigorderId");
            return (Criteria) this;
        }

        public Criteria andBigorderIdLessThan(String value) {
            addCriterion("BIGORDER_ID <", value, "bigorderId");
            return (Criteria) this;
        }

        public Criteria andBigorderIdLessThanOrEqualTo(String value) {
            addCriterion("BIGORDER_ID <=", value, "bigorderId");
            return (Criteria) this;
        }

        public Criteria andBigorderIdLike(String value) {
            addCriterion("BIGORDER_ID like", value, "bigorderId");
            return (Criteria) this;
        }

        public Criteria andBigorderIdNotLike(String value) {
            addCriterion("BIGORDER_ID not like", value, "bigorderId");
            return (Criteria) this;
        }

        public Criteria andBigorderIdIn(List<String> values) {
            addCriterion("BIGORDER_ID in", values, "bigorderId");
            return (Criteria) this;
        }

        public Criteria andBigorderIdNotIn(List<String> values) {
            addCriterion("BIGORDER_ID not in", values, "bigorderId");
            return (Criteria) this;
        }

        public Criteria andBigorderIdBetween(String value1, String value2) {
            addCriterion("BIGORDER_ID between", value1, value2, "bigorderId");
            return (Criteria) this;
        }

        public Criteria andBigorderIdNotBetween(String value1, String value2) {
            addCriterion("BIGORDER_ID not between", value1, value2, "bigorderId");
            return (Criteria) this;
        }

        public Criteria andVendorIdsIsNull() {
            addCriterion("VENDOR_IDS is null");
            return (Criteria) this;
        }

        public Criteria andVendorIdsIsNotNull() {
            addCriterion("VENDOR_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andVendorIdsEqualTo(String value) {
            addCriterion("VENDOR_IDS =", value, "vendorIds");
            return (Criteria) this;
        }

        public Criteria andVendorIdsNotEqualTo(String value) {
            addCriterion("VENDOR_IDS <>", value, "vendorIds");
            return (Criteria) this;
        }

        public Criteria andVendorIdsGreaterThan(String value) {
            addCriterion("VENDOR_IDS >", value, "vendorIds");
            return (Criteria) this;
        }

        public Criteria andVendorIdsGreaterThanOrEqualTo(String value) {
            addCriterion("VENDOR_IDS >=", value, "vendorIds");
            return (Criteria) this;
        }

        public Criteria andVendorIdsLessThan(String value) {
            addCriterion("VENDOR_IDS <", value, "vendorIds");
            return (Criteria) this;
        }

        public Criteria andVendorIdsLessThanOrEqualTo(String value) {
            addCriterion("VENDOR_IDS <=", value, "vendorIds");
            return (Criteria) this;
        }

        public Criteria andVendorIdsLike(String value) {
            addCriterion("VENDOR_IDS like", value, "vendorIds");
            return (Criteria) this;
        }

        public Criteria andVendorIdsNotLike(String value) {
            addCriterion("VENDOR_IDS not like", value, "vendorIds");
            return (Criteria) this;
        }

        public Criteria andVendorIdsIn(List<String> values) {
            addCriterion("VENDOR_IDS in", values, "vendorIds");
            return (Criteria) this;
        }

        public Criteria andVendorIdsNotIn(List<String> values) {
            addCriterion("VENDOR_IDS not in", values, "vendorIds");
            return (Criteria) this;
        }

        public Criteria andVendorIdsBetween(String value1, String value2) {
            addCriterion("VENDOR_IDS between", value1, value2, "vendorIds");
            return (Criteria) this;
        }

        public Criteria andVendorIdsNotBetween(String value1, String value2) {
            addCriterion("VENDOR_IDS not between", value1, value2, "vendorIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsIsNull() {
            addCriterion("USER_IDS is null");
            return (Criteria) this;
        }

        public Criteria andUserIdsIsNotNull() {
            addCriterion("USER_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdsEqualTo(String value) {
            addCriterion("USER_IDS =", value, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsNotEqualTo(String value) {
            addCriterion("USER_IDS <>", value, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsGreaterThan(String value) {
            addCriterion("USER_IDS >", value, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsGreaterThanOrEqualTo(String value) {
            addCriterion("USER_IDS >=", value, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsLessThan(String value) {
            addCriterion("USER_IDS <", value, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsLessThanOrEqualTo(String value) {
            addCriterion("USER_IDS <=", value, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsLike(String value) {
            addCriterion("USER_IDS like", value, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsNotLike(String value) {
            addCriterion("USER_IDS not like", value, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsIn(List<String> values) {
            addCriterion("USER_IDS in", values, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsNotIn(List<String> values) {
            addCriterion("USER_IDS not in", values, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsBetween(String value1, String value2) {
            addCriterion("USER_IDS between", value1, value2, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsNotBetween(String value1, String value2) {
            addCriterion("USER_IDS not between", value1, value2, "userIds");
            return (Criteria) this;
        }

        public Criteria andContIdentitynoIsNull() {
            addCriterion("CONT_IDENTITYNO is null");
            return (Criteria) this;
        }

        public Criteria andContIdentitynoIsNotNull() {
            addCriterion("CONT_IDENTITYNO is not null");
            return (Criteria) this;
        }

        public Criteria andContIdentitynoEqualTo(String value) {
            addCriterion("CONT_IDENTITYNO =", value, "contIdentityno");
            return (Criteria) this;
        }

        public Criteria andContIdentitynoNotEqualTo(String value) {
            addCriterion("CONT_IDENTITYNO <>", value, "contIdentityno");
            return (Criteria) this;
        }

        public Criteria andContIdentitynoGreaterThan(String value) {
            addCriterion("CONT_IDENTITYNO >", value, "contIdentityno");
            return (Criteria) this;
        }

        public Criteria andContIdentitynoGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_IDENTITYNO >=", value, "contIdentityno");
            return (Criteria) this;
        }

        public Criteria andContIdentitynoLessThan(String value) {
            addCriterion("CONT_IDENTITYNO <", value, "contIdentityno");
            return (Criteria) this;
        }

        public Criteria andContIdentitynoLessThanOrEqualTo(String value) {
            addCriterion("CONT_IDENTITYNO <=", value, "contIdentityno");
            return (Criteria) this;
        }

        public Criteria andContIdentitynoLike(String value) {
            addCriterion("CONT_IDENTITYNO like", value, "contIdentityno");
            return (Criteria) this;
        }

        public Criteria andContIdentitynoNotLike(String value) {
            addCriterion("CONT_IDENTITYNO not like", value, "contIdentityno");
            return (Criteria) this;
        }

        public Criteria andContIdentitynoIn(List<String> values) {
            addCriterion("CONT_IDENTITYNO in", values, "contIdentityno");
            return (Criteria) this;
        }

        public Criteria andContIdentitynoNotIn(List<String> values) {
            addCriterion("CONT_IDENTITYNO not in", values, "contIdentityno");
            return (Criteria) this;
        }

        public Criteria andContIdentitynoBetween(String value1, String value2) {
            addCriterion("CONT_IDENTITYNO between", value1, value2, "contIdentityno");
            return (Criteria) this;
        }

        public Criteria andContIdentitynoNotBetween(String value1, String value2) {
            addCriterion("CONT_IDENTITYNO not between", value1, value2, "contIdentityno");
            return (Criteria) this;
        }

        public Criteria andContPostcodeIsNull() {
            addCriterion("CONT_POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andContPostcodeIsNotNull() {
            addCriterion("CONT_POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andContPostcodeEqualTo(String value) {
            addCriterion("CONT_POSTCODE =", value, "contPostcode");
            return (Criteria) this;
        }

        public Criteria andContPostcodeNotEqualTo(String value) {
            addCriterion("CONT_POSTCODE <>", value, "contPostcode");
            return (Criteria) this;
        }

        public Criteria andContPostcodeGreaterThan(String value) {
            addCriterion("CONT_POSTCODE >", value, "contPostcode");
            return (Criteria) this;
        }

        public Criteria andContPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_POSTCODE >=", value, "contPostcode");
            return (Criteria) this;
        }

        public Criteria andContPostcodeLessThan(String value) {
            addCriterion("CONT_POSTCODE <", value, "contPostcode");
            return (Criteria) this;
        }

        public Criteria andContPostcodeLessThanOrEqualTo(String value) {
            addCriterion("CONT_POSTCODE <=", value, "contPostcode");
            return (Criteria) this;
        }

        public Criteria andContPostcodeLike(String value) {
            addCriterion("CONT_POSTCODE like", value, "contPostcode");
            return (Criteria) this;
        }

        public Criteria andContPostcodeNotLike(String value) {
            addCriterion("CONT_POSTCODE not like", value, "contPostcode");
            return (Criteria) this;
        }

        public Criteria andContPostcodeIn(List<String> values) {
            addCriterion("CONT_POSTCODE in", values, "contPostcode");
            return (Criteria) this;
        }

        public Criteria andContPostcodeNotIn(List<String> values) {
            addCriterion("CONT_POSTCODE not in", values, "contPostcode");
            return (Criteria) this;
        }

        public Criteria andContPostcodeBetween(String value1, String value2) {
            addCriterion("CONT_POSTCODE between", value1, value2, "contPostcode");
            return (Criteria) this;
        }

        public Criteria andContPostcodeNotBetween(String value1, String value2) {
            addCriterion("CONT_POSTCODE not between", value1, value2, "contPostcode");
            return (Criteria) this;
        }

        public Criteria andContAddressIsNull() {
            addCriterion("CONT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andContAddressIsNotNull() {
            addCriterion("CONT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andContAddressEqualTo(String value) {
            addCriterion("CONT_ADDRESS =", value, "contAddress");
            return (Criteria) this;
        }

        public Criteria andContAddressNotEqualTo(String value) {
            addCriterion("CONT_ADDRESS <>", value, "contAddress");
            return (Criteria) this;
        }

        public Criteria andContAddressGreaterThan(String value) {
            addCriterion("CONT_ADDRESS >", value, "contAddress");
            return (Criteria) this;
        }

        public Criteria andContAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_ADDRESS >=", value, "contAddress");
            return (Criteria) this;
        }

        public Criteria andContAddressLessThan(String value) {
            addCriterion("CONT_ADDRESS <", value, "contAddress");
            return (Criteria) this;
        }

        public Criteria andContAddressLessThanOrEqualTo(String value) {
            addCriterion("CONT_ADDRESS <=", value, "contAddress");
            return (Criteria) this;
        }

        public Criteria andContAddressLike(String value) {
            addCriterion("CONT_ADDRESS like", value, "contAddress");
            return (Criteria) this;
        }

        public Criteria andContAddressNotLike(String value) {
            addCriterion("CONT_ADDRESS not like", value, "contAddress");
            return (Criteria) this;
        }

        public Criteria andContAddressIn(List<String> values) {
            addCriterion("CONT_ADDRESS in", values, "contAddress");
            return (Criteria) this;
        }

        public Criteria andContAddressNotIn(List<String> values) {
            addCriterion("CONT_ADDRESS not in", values, "contAddress");
            return (Criteria) this;
        }

        public Criteria andContAddressBetween(String value1, String value2) {
            addCriterion("CONT_ADDRESS between", value1, value2, "contAddress");
            return (Criteria) this;
        }

        public Criteria andContAddressNotBetween(String value1, String value2) {
            addCriterion("CONT_ADDRESS not between", value1, value2, "contAddress");
            return (Criteria) this;
        }

        public Criteria andContMobileIsNull() {
            addCriterion("CONT_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andContMobileIsNotNull() {
            addCriterion("CONT_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andContMobileEqualTo(String value) {
            addCriterion("CONT_MOBILE =", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileNotEqualTo(String value) {
            addCriterion("CONT_MOBILE <>", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileGreaterThan(String value) {
            addCriterion("CONT_MOBILE >", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_MOBILE >=", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileLessThan(String value) {
            addCriterion("CONT_MOBILE <", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileLessThanOrEqualTo(String value) {
            addCriterion("CONT_MOBILE <=", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileLike(String value) {
            addCriterion("CONT_MOBILE like", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileNotLike(String value) {
            addCriterion("CONT_MOBILE not like", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileIn(List<String> values) {
            addCriterion("CONT_MOBILE in", values, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileNotIn(List<String> values) {
            addCriterion("CONT_MOBILE not in", values, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileBetween(String value1, String value2) {
            addCriterion("CONT_MOBILE between", value1, value2, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileNotBetween(String value1, String value2) {
            addCriterion("CONT_MOBILE not between", value1, value2, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContPhoneIsNull() {
            addCriterion("CONT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andContPhoneIsNotNull() {
            addCriterion("CONT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andContPhoneEqualTo(String value) {
            addCriterion("CONT_PHONE =", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneNotEqualTo(String value) {
            addCriterion("CONT_PHONE <>", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneGreaterThan(String value) {
            addCriterion("CONT_PHONE >", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_PHONE >=", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneLessThan(String value) {
            addCriterion("CONT_PHONE <", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneLessThanOrEqualTo(String value) {
            addCriterion("CONT_PHONE <=", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneLike(String value) {
            addCriterion("CONT_PHONE like", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneNotLike(String value) {
            addCriterion("CONT_PHONE not like", value, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneIn(List<String> values) {
            addCriterion("CONT_PHONE in", values, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneNotIn(List<String> values) {
            addCriterion("CONT_PHONE not in", values, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneBetween(String value1, String value2) {
            addCriterion("CONT_PHONE between", value1, value2, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContPhoneNotBetween(String value1, String value2) {
            addCriterion("CONT_PHONE not between", value1, value2, "contPhone");
            return (Criteria) this;
        }

        public Criteria andContProvinceIsNull() {
            addCriterion("CONT_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andContProvinceIsNotNull() {
            addCriterion("CONT_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andContProvinceEqualTo(String value) {
            addCriterion("CONT_PROVINCE =", value, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceNotEqualTo(String value) {
            addCriterion("CONT_PROVINCE <>", value, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceGreaterThan(String value) {
            addCriterion("CONT_PROVINCE >", value, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_PROVINCE >=", value, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceLessThan(String value) {
            addCriterion("CONT_PROVINCE <", value, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceLessThanOrEqualTo(String value) {
            addCriterion("CONT_PROVINCE <=", value, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceLike(String value) {
            addCriterion("CONT_PROVINCE like", value, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceNotLike(String value) {
            addCriterion("CONT_PROVINCE not like", value, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceIn(List<String> values) {
            addCriterion("CONT_PROVINCE in", values, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceNotIn(List<String> values) {
            addCriterion("CONT_PROVINCE not in", values, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceBetween(String value1, String value2) {
            addCriterion("CONT_PROVINCE between", value1, value2, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceNotBetween(String value1, String value2) {
            addCriterion("CONT_PROVINCE not between", value1, value2, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContCityIsNull() {
            addCriterion("CONT_CITY is null");
            return (Criteria) this;
        }

        public Criteria andContCityIsNotNull() {
            addCriterion("CONT_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andContCityEqualTo(String value) {
            addCriterion("CONT_CITY =", value, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityNotEqualTo(String value) {
            addCriterion("CONT_CITY <>", value, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityGreaterThan(String value) {
            addCriterion("CONT_CITY >", value, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_CITY >=", value, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityLessThan(String value) {
            addCriterion("CONT_CITY <", value, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityLessThanOrEqualTo(String value) {
            addCriterion("CONT_CITY <=", value, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityLike(String value) {
            addCriterion("CONT_CITY like", value, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityNotLike(String value) {
            addCriterion("CONT_CITY not like", value, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityIn(List<String> values) {
            addCriterion("CONT_CITY in", values, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityNotIn(List<String> values) {
            addCriterion("CONT_CITY not in", values, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityBetween(String value1, String value2) {
            addCriterion("CONT_CITY between", value1, value2, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityNotBetween(String value1, String value2) {
            addCriterion("CONT_CITY not between", value1, value2, "contCity");
            return (Criteria) this;
        }

        public Criteria andContDistrictIsNull() {
            addCriterion("CONT_DISTRICT is null");
            return (Criteria) this;
        }

        public Criteria andContDistrictIsNotNull() {
            addCriterion("CONT_DISTRICT is not null");
            return (Criteria) this;
        }

        public Criteria andContDistrictEqualTo(String value) {
            addCriterion("CONT_DISTRICT =", value, "contDistrict");
            return (Criteria) this;
        }

        public Criteria andContDistrictNotEqualTo(String value) {
            addCriterion("CONT_DISTRICT <>", value, "contDistrict");
            return (Criteria) this;
        }

        public Criteria andContDistrictGreaterThan(String value) {
            addCriterion("CONT_DISTRICT >", value, "contDistrict");
            return (Criteria) this;
        }

        public Criteria andContDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_DISTRICT >=", value, "contDistrict");
            return (Criteria) this;
        }

        public Criteria andContDistrictLessThan(String value) {
            addCriterion("CONT_DISTRICT <", value, "contDistrict");
            return (Criteria) this;
        }

        public Criteria andContDistrictLessThanOrEqualTo(String value) {
            addCriterion("CONT_DISTRICT <=", value, "contDistrict");
            return (Criteria) this;
        }

        public Criteria andContDistrictLike(String value) {
            addCriterion("CONT_DISTRICT like", value, "contDistrict");
            return (Criteria) this;
        }

        public Criteria andContDistrictNotLike(String value) {
            addCriterion("CONT_DISTRICT not like", value, "contDistrict");
            return (Criteria) this;
        }

        public Criteria andContDistrictIn(List<String> values) {
            addCriterion("CONT_DISTRICT in", values, "contDistrict");
            return (Criteria) this;
        }

        public Criteria andContDistrictNotIn(List<String> values) {
            addCriterion("CONT_DISTRICT not in", values, "contDistrict");
            return (Criteria) this;
        }

        public Criteria andContDistrictBetween(String value1, String value2) {
            addCriterion("CONT_DISTRICT between", value1, value2, "contDistrict");
            return (Criteria) this;
        }

        public Criteria andContDistrictNotBetween(String value1, String value2) {
            addCriterion("CONT_DISTRICT not between", value1, value2, "contDistrict");
            return (Criteria) this;
        }

        public Criteria andContStreetIsNull() {
            addCriterion("CONT_STREET is null");
            return (Criteria) this;
        }

        public Criteria andContStreetIsNotNull() {
            addCriterion("CONT_STREET is not null");
            return (Criteria) this;
        }

        public Criteria andContStreetEqualTo(String value) {
            addCriterion("CONT_STREET =", value, "contStreet");
            return (Criteria) this;
        }

        public Criteria andContStreetNotEqualTo(String value) {
            addCriterion("CONT_STREET <>", value, "contStreet");
            return (Criteria) this;
        }

        public Criteria andContStreetGreaterThan(String value) {
            addCriterion("CONT_STREET >", value, "contStreet");
            return (Criteria) this;
        }

        public Criteria andContStreetGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_STREET >=", value, "contStreet");
            return (Criteria) this;
        }

        public Criteria andContStreetLessThan(String value) {
            addCriterion("CONT_STREET <", value, "contStreet");
            return (Criteria) this;
        }

        public Criteria andContStreetLessThanOrEqualTo(String value) {
            addCriterion("CONT_STREET <=", value, "contStreet");
            return (Criteria) this;
        }

        public Criteria andContStreetLike(String value) {
            addCriterion("CONT_STREET like", value, "contStreet");
            return (Criteria) this;
        }

        public Criteria andContStreetNotLike(String value) {
            addCriterion("CONT_STREET not like", value, "contStreet");
            return (Criteria) this;
        }

        public Criteria andContStreetIn(List<String> values) {
            addCriterion("CONT_STREET in", values, "contStreet");
            return (Criteria) this;
        }

        public Criteria andContStreetNotIn(List<String> values) {
            addCriterion("CONT_STREET not in", values, "contStreet");
            return (Criteria) this;
        }

        public Criteria andContStreetBetween(String value1, String value2) {
            addCriterion("CONT_STREET between", value1, value2, "contStreet");
            return (Criteria) this;
        }

        public Criteria andContStreetNotBetween(String value1, String value2) {
            addCriterion("CONT_STREET not between", value1, value2, "contStreet");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("DELIVERY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("DELIVERY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(String value) {
            addCriterion("DELIVERY_TIME =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(String value) {
            addCriterion("DELIVERY_TIME <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(String value) {
            addCriterion("DELIVERY_TIME >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_TIME >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(String value) {
            addCriterion("DELIVERY_TIME <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_TIME <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLike(String value) {
            addCriterion("DELIVERY_TIME like", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotLike(String value) {
            addCriterion("DELIVERY_TIME not like", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<String> values) {
            addCriterion("DELIVERY_TIME in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<String> values) {
            addCriterion("DELIVERY_TIME not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(String value1, String value2) {
            addCriterion("DELIVERY_TIME between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_TIME not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayIsNull() {
            addCriterion("DELIVERY_WAY is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayIsNotNull() {
            addCriterion("DELIVERY_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayEqualTo(String value) {
            addCriterion("DELIVERY_WAY =", value, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayNotEqualTo(String value) {
            addCriterion("DELIVERY_WAY <>", value, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayGreaterThan(String value) {
            addCriterion("DELIVERY_WAY >", value, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_WAY >=", value, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayLessThan(String value) {
            addCriterion("DELIVERY_WAY <", value, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_WAY <=", value, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayLike(String value) {
            addCriterion("DELIVERY_WAY like", value, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayNotLike(String value) {
            addCriterion("DELIVERY_WAY not like", value, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayIn(List<String> values) {
            addCriterion("DELIVERY_WAY in", values, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayNotIn(List<String> values) {
            addCriterion("DELIVERY_WAY not in", values, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayBetween(String value1, String value2) {
            addCriterion("DELIVERY_WAY between", value1, value2, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_WAY not between", value1, value2, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andBuyersMessageIsNull() {
            addCriterion("BUYERS_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andBuyersMessageIsNotNull() {
            addCriterion("BUYERS_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andBuyersMessageEqualTo(String value) {
            addCriterion("BUYERS_MESSAGE =", value, "buyersMessage");
            return (Criteria) this;
        }

        public Criteria andBuyersMessageNotEqualTo(String value) {
            addCriterion("BUYERS_MESSAGE <>", value, "buyersMessage");
            return (Criteria) this;
        }

        public Criteria andBuyersMessageGreaterThan(String value) {
            addCriterion("BUYERS_MESSAGE >", value, "buyersMessage");
            return (Criteria) this;
        }

        public Criteria andBuyersMessageGreaterThanOrEqualTo(String value) {
            addCriterion("BUYERS_MESSAGE >=", value, "buyersMessage");
            return (Criteria) this;
        }

        public Criteria andBuyersMessageLessThan(String value) {
            addCriterion("BUYERS_MESSAGE <", value, "buyersMessage");
            return (Criteria) this;
        }

        public Criteria andBuyersMessageLessThanOrEqualTo(String value) {
            addCriterion("BUYERS_MESSAGE <=", value, "buyersMessage");
            return (Criteria) this;
        }

        public Criteria andBuyersMessageLike(String value) {
            addCriterion("BUYERS_MESSAGE like", value, "buyersMessage");
            return (Criteria) this;
        }

        public Criteria andBuyersMessageNotLike(String value) {
            addCriterion("BUYERS_MESSAGE not like", value, "buyersMessage");
            return (Criteria) this;
        }

        public Criteria andBuyersMessageIn(List<String> values) {
            addCriterion("BUYERS_MESSAGE in", values, "buyersMessage");
            return (Criteria) this;
        }

        public Criteria andBuyersMessageNotIn(List<String> values) {
            addCriterion("BUYERS_MESSAGE not in", values, "buyersMessage");
            return (Criteria) this;
        }

        public Criteria andBuyersMessageBetween(String value1, String value2) {
            addCriterion("BUYERS_MESSAGE between", value1, value2, "buyersMessage");
            return (Criteria) this;
        }

        public Criteria andBuyersMessageNotBetween(String value1, String value2) {
            addCriterion("BUYERS_MESSAGE not between", value1, value2, "buyersMessage");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("ORDER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("ORDER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(String value) {
            addCriterion("ORDER_TIME =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(String value) {
            addCriterion("ORDER_TIME <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(String value) {
            addCriterion("ORDER_TIME >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TIME >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(String value) {
            addCriterion("ORDER_TIME <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TIME <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLike(String value) {
            addCriterion("ORDER_TIME like", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotLike(String value) {
            addCriterion("ORDER_TIME not like", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<String> values) {
            addCriterion("ORDER_TIME in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<String> values) {
            addCriterion("ORDER_TIME not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(String value1, String value2) {
            addCriterion("ORDER_TIME between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(String value1, String value2) {
            addCriterion("ORDER_TIME not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIsNull() {
            addCriterion("SETTLE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIsNotNull() {
            addCriterion("SETTLE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSettleTimeEqualTo(String value) {
            addCriterion("SETTLE_TIME =", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotEqualTo(String value) {
            addCriterion("SETTLE_TIME <>", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeGreaterThan(String value) {
            addCriterion("SETTLE_TIME >", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_TIME >=", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeLessThan(String value) {
            addCriterion("SETTLE_TIME <", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_TIME <=", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeLike(String value) {
            addCriterion("SETTLE_TIME like", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotLike(String value) {
            addCriterion("SETTLE_TIME not like", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIn(List<String> values) {
            addCriterion("SETTLE_TIME in", values, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotIn(List<String> values) {
            addCriterion("SETTLE_TIME not in", values, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeBetween(String value1, String value2) {
            addCriterion("SETTLE_TIME between", value1, value2, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotBetween(String value1, String value2) {
            addCriterion("SETTLE_TIME not between", value1, value2, "settleTime");
            return (Criteria) this;
        }

        public Criteria andIsevaluateIsNull() {
            addCriterion("ISEVALUATE is null");
            return (Criteria) this;
        }

        public Criteria andIsevaluateIsNotNull() {
            addCriterion("ISEVALUATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsevaluateEqualTo(String value) {
            addCriterion("ISEVALUATE =", value, "isevaluate");
            return (Criteria) this;
        }

        public Criteria andIsevaluateNotEqualTo(String value) {
            addCriterion("ISEVALUATE <>", value, "isevaluate");
            return (Criteria) this;
        }

        public Criteria andIsevaluateGreaterThan(String value) {
            addCriterion("ISEVALUATE >", value, "isevaluate");
            return (Criteria) this;
        }

        public Criteria andIsevaluateGreaterThanOrEqualTo(String value) {
            addCriterion("ISEVALUATE >=", value, "isevaluate");
            return (Criteria) this;
        }

        public Criteria andIsevaluateLessThan(String value) {
            addCriterion("ISEVALUATE <", value, "isevaluate");
            return (Criteria) this;
        }

        public Criteria andIsevaluateLessThanOrEqualTo(String value) {
            addCriterion("ISEVALUATE <=", value, "isevaluate");
            return (Criteria) this;
        }

        public Criteria andIsevaluateLike(String value) {
            addCriterion("ISEVALUATE like", value, "isevaluate");
            return (Criteria) this;
        }

        public Criteria andIsevaluateNotLike(String value) {
            addCriterion("ISEVALUATE not like", value, "isevaluate");
            return (Criteria) this;
        }

        public Criteria andIsevaluateIn(List<String> values) {
            addCriterion("ISEVALUATE in", values, "isevaluate");
            return (Criteria) this;
        }

        public Criteria andIsevaluateNotIn(List<String> values) {
            addCriterion("ISEVALUATE not in", values, "isevaluate");
            return (Criteria) this;
        }

        public Criteria andIsevaluateBetween(String value1, String value2) {
            addCriterion("ISEVALUATE between", value1, value2, "isevaluate");
            return (Criteria) this;
        }

        public Criteria andIsevaluateNotBetween(String value1, String value2) {
            addCriterion("ISEVALUATE not between", value1, value2, "isevaluate");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNT >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("DISCOUNT <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmtIsNull() {
            addCriterion("ORDER_TOTAL_AMT is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmtIsNotNull() {
            addCriterion("ORDER_TOTAL_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmtEqualTo(BigDecimal value) {
            addCriterion("ORDER_TOTAL_AMT =", value, "orderTotalAmt");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmtNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_TOTAL_AMT <>", value, "orderTotalAmt");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmtGreaterThan(BigDecimal value) {
            addCriterion("ORDER_TOTAL_AMT >", value, "orderTotalAmt");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_TOTAL_AMT >=", value, "orderTotalAmt");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmtLessThan(BigDecimal value) {
            addCriterion("ORDER_TOTAL_AMT <", value, "orderTotalAmt");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_TOTAL_AMT <=", value, "orderTotalAmt");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmtIn(List<BigDecimal> values) {
            addCriterion("ORDER_TOTAL_AMT in", values, "orderTotalAmt");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmtNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_TOTAL_AMT not in", values, "orderTotalAmt");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_TOTAL_AMT between", value1, value2, "orderTotalAmt");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_TOTAL_AMT not between", value1, value2, "orderTotalAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtIsNull() {
            addCriterion("ORDER_AMT is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmtIsNotNull() {
            addCriterion("ORDER_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmtEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMT =", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMT <>", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtGreaterThan(BigDecimal value) {
            addCriterion("ORDER_AMT >", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMT >=", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtLessThan(BigDecimal value) {
            addCriterion("ORDER_AMT <", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMT <=", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtIn(List<BigDecimal> values) {
            addCriterion("ORDER_AMT in", values, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_AMT not in", values, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_AMT between", value1, value2, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_AMT not between", value1, value2, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtIsNull() {
            addCriterion("SETTLE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andSettleAmtIsNotNull() {
            addCriterion("SETTLE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andSettleAmtEqualTo(BigDecimal value) {
            addCriterion("SETTLE_AMT =", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtNotEqualTo(BigDecimal value) {
            addCriterion("SETTLE_AMT <>", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtGreaterThan(BigDecimal value) {
            addCriterion("SETTLE_AMT >", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLE_AMT >=", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtLessThan(BigDecimal value) {
            addCriterion("SETTLE_AMT <", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLE_AMT <=", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtIn(List<BigDecimal> values) {
            addCriterion("SETTLE_AMT in", values, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtNotIn(List<BigDecimal> values) {
            addCriterion("SETTLE_AMT not in", values, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLE_AMT between", value1, value2, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLE_AMT not between", value1, value2, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleStatuesIsNull() {
            addCriterion("SETTLE_STATUES is null");
            return (Criteria) this;
        }

        public Criteria andSettleStatuesIsNotNull() {
            addCriterion("SETTLE_STATUES is not null");
            return (Criteria) this;
        }

        public Criteria andSettleStatuesEqualTo(String value) {
            addCriterion("SETTLE_STATUES =", value, "settleStatues");
            return (Criteria) this;
        }

        public Criteria andSettleStatuesNotEqualTo(String value) {
            addCriterion("SETTLE_STATUES <>", value, "settleStatues");
            return (Criteria) this;
        }

        public Criteria andSettleStatuesGreaterThan(String value) {
            addCriterion("SETTLE_STATUES >", value, "settleStatues");
            return (Criteria) this;
        }

        public Criteria andSettleStatuesGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_STATUES >=", value, "settleStatues");
            return (Criteria) this;
        }

        public Criteria andSettleStatuesLessThan(String value) {
            addCriterion("SETTLE_STATUES <", value, "settleStatues");
            return (Criteria) this;
        }

        public Criteria andSettleStatuesLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_STATUES <=", value, "settleStatues");
            return (Criteria) this;
        }

        public Criteria andSettleStatuesLike(String value) {
            addCriterion("SETTLE_STATUES like", value, "settleStatues");
            return (Criteria) this;
        }

        public Criteria andSettleStatuesNotLike(String value) {
            addCriterion("SETTLE_STATUES not like", value, "settleStatues");
            return (Criteria) this;
        }

        public Criteria andSettleStatuesIn(List<String> values) {
            addCriterion("SETTLE_STATUES in", values, "settleStatues");
            return (Criteria) this;
        }

        public Criteria andSettleStatuesNotIn(List<String> values) {
            addCriterion("SETTLE_STATUES not in", values, "settleStatues");
            return (Criteria) this;
        }

        public Criteria andSettleStatuesBetween(String value1, String value2) {
            addCriterion("SETTLE_STATUES between", value1, value2, "settleStatues");
            return (Criteria) this;
        }

        public Criteria andSettleStatuesNotBetween(String value1, String value2) {
            addCriterion("SETTLE_STATUES not between", value1, value2, "settleStatues");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("PAY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("PAY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(String value) {
            addCriterion("PAY_STATUS =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(String value) {
            addCriterion("PAY_STATUS <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(String value) {
            addCriterion("PAY_STATUS >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_STATUS >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(String value) {
            addCriterion("PAY_STATUS <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(String value) {
            addCriterion("PAY_STATUS <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLike(String value) {
            addCriterion("PAY_STATUS like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotLike(String value) {
            addCriterion("PAY_STATUS not like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<String> values) {
            addCriterion("PAY_STATUS in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<String> values) {
            addCriterion("PAY_STATUS not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(String value1, String value2) {
            addCriterion("PAY_STATUS between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(String value1, String value2) {
            addCriterion("PAY_STATUS not between", value1, value2, "payStatus");
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

        public Criteria andApproveStatusIsNull() {
            addCriterion("APPROVE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andApproveStatusIsNotNull() {
            addCriterion("APPROVE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andApproveStatusEqualTo(String value) {
            addCriterion("APPROVE_STATUS =", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusNotEqualTo(String value) {
            addCriterion("APPROVE_STATUS <>", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusGreaterThan(String value) {
            addCriterion("APPROVE_STATUS >", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVE_STATUS >=", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusLessThan(String value) {
            addCriterion("APPROVE_STATUS <", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusLessThanOrEqualTo(String value) {
            addCriterion("APPROVE_STATUS <=", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusLike(String value) {
            addCriterion("APPROVE_STATUS like", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusNotLike(String value) {
            addCriterion("APPROVE_STATUS not like", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusIn(List<String> values) {
            addCriterion("APPROVE_STATUS in", values, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusNotIn(List<String> values) {
            addCriterion("APPROVE_STATUS not in", values, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusBetween(String value1, String value2) {
            addCriterion("APPROVE_STATUS between", value1, value2, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusNotBetween(String value1, String value2) {
            addCriterion("APPROVE_STATUS not between", value1, value2, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNull() {
            addCriterion("PAYWAY is null");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNotNull() {
            addCriterion("PAYWAY is not null");
            return (Criteria) this;
        }

        public Criteria andPaywayEqualTo(String value) {
            addCriterion("PAYWAY =", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotEqualTo(String value) {
            addCriterion("PAYWAY <>", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThan(String value) {
            addCriterion("PAYWAY >", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThanOrEqualTo(String value) {
            addCriterion("PAYWAY >=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThan(String value) {
            addCriterion("PAYWAY <", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThanOrEqualTo(String value) {
            addCriterion("PAYWAY <=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLike(String value) {
            addCriterion("PAYWAY like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotLike(String value) {
            addCriterion("PAYWAY not like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayIn(List<String> values) {
            addCriterion("PAYWAY in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotIn(List<String> values) {
            addCriterion("PAYWAY not in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayBetween(String value1, String value2) {
            addCriterion("PAYWAY between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotBetween(String value1, String value2) {
            addCriterion("PAYWAY not between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andTransactionidIsNull() {
            addCriterion("TRANSACTIONID is null");
            return (Criteria) this;
        }

        public Criteria andTransactionidIsNotNull() {
            addCriterion("TRANSACTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionidEqualTo(String value) {
            addCriterion("TRANSACTIONID =", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotEqualTo(String value) {
            addCriterion("TRANSACTIONID <>", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidGreaterThan(String value) {
            addCriterion("TRANSACTIONID >", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTIONID >=", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLessThan(String value) {
            addCriterion("TRANSACTIONID <", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTIONID <=", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLike(String value) {
            addCriterion("TRANSACTIONID like", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotLike(String value) {
            addCriterion("TRANSACTIONID not like", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidIn(List<String> values) {
            addCriterion("TRANSACTIONID in", values, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotIn(List<String> values) {
            addCriterion("TRANSACTIONID not in", values, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidBetween(String value1, String value2) {
            addCriterion("TRANSACTIONID between", value1, value2, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotBetween(String value1, String value2) {
            addCriterion("TRANSACTIONID not between", value1, value2, "transactionid");
            return (Criteria) this;
        }

        public Criteria andContNameIsNull() {
            addCriterion("CONT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andContNameIsNotNull() {
            addCriterion("CONT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andContNameEqualTo(String value) {
            addCriterion("CONT_NAME =", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotEqualTo(String value) {
            addCriterion("CONT_NAME <>", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameGreaterThan(String value) {
            addCriterion("CONT_NAME >", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_NAME >=", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameLessThan(String value) {
            addCriterion("CONT_NAME <", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameLessThanOrEqualTo(String value) {
            addCriterion("CONT_NAME <=", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameLike(String value) {
            addCriterion("CONT_NAME like", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotLike(String value) {
            addCriterion("CONT_NAME not like", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameIn(List<String> values) {
            addCriterion("CONT_NAME in", values, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotIn(List<String> values) {
            addCriterion("CONT_NAME not in", values, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameBetween(String value1, String value2) {
            addCriterion("CONT_NAME between", value1, value2, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotBetween(String value1, String value2) {
            addCriterion("CONT_NAME not between", value1, value2, "contName");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoIsNull() {
            addCriterion("SETTLE_BATCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoIsNotNull() {
            addCriterion("SETTLE_BATCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoEqualTo(String value) {
            addCriterion("SETTLE_BATCH_NO =", value, "settleBatchNo");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoNotEqualTo(String value) {
            addCriterion("SETTLE_BATCH_NO <>", value, "settleBatchNo");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoGreaterThan(String value) {
            addCriterion("SETTLE_BATCH_NO >", value, "settleBatchNo");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_BATCH_NO >=", value, "settleBatchNo");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoLessThan(String value) {
            addCriterion("SETTLE_BATCH_NO <", value, "settleBatchNo");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_BATCH_NO <=", value, "settleBatchNo");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoLike(String value) {
            addCriterion("SETTLE_BATCH_NO like", value, "settleBatchNo");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoNotLike(String value) {
            addCriterion("SETTLE_BATCH_NO not like", value, "settleBatchNo");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoIn(List<String> values) {
            addCriterion("SETTLE_BATCH_NO in", values, "settleBatchNo");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoNotIn(List<String> values) {
            addCriterion("SETTLE_BATCH_NO not in", values, "settleBatchNo");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoBetween(String value1, String value2) {
            addCriterion("SETTLE_BATCH_NO between", value1, value2, "settleBatchNo");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoNotBetween(String value1, String value2) {
            addCriterion("SETTLE_BATCH_NO not between", value1, value2, "settleBatchNo");
            return (Criteria) this;
        }

        public Criteria andWxFeeIsNull() {
            addCriterion("WX_FEE is null");
            return (Criteria) this;
        }

        public Criteria andWxFeeIsNotNull() {
            addCriterion("WX_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andWxFeeEqualTo(BigDecimal value) {
            addCriterion("WX_FEE =", value, "wxFee");
            return (Criteria) this;
        }

        public Criteria andWxFeeNotEqualTo(BigDecimal value) {
            addCriterion("WX_FEE <>", value, "wxFee");
            return (Criteria) this;
        }

        public Criteria andWxFeeGreaterThan(BigDecimal value) {
            addCriterion("WX_FEE >", value, "wxFee");
            return (Criteria) this;
        }

        public Criteria andWxFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WX_FEE >=", value, "wxFee");
            return (Criteria) this;
        }

        public Criteria andWxFeeLessThan(BigDecimal value) {
            addCriterion("WX_FEE <", value, "wxFee");
            return (Criteria) this;
        }

        public Criteria andWxFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WX_FEE <=", value, "wxFee");
            return (Criteria) this;
        }

        public Criteria andWxFeeIn(List<BigDecimal> values) {
            addCriterion("WX_FEE in", values, "wxFee");
            return (Criteria) this;
        }

        public Criteria andWxFeeNotIn(List<BigDecimal> values) {
            addCriterion("WX_FEE not in", values, "wxFee");
            return (Criteria) this;
        }

        public Criteria andWxFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WX_FEE between", value1, value2, "wxFee");
            return (Criteria) this;
        }

        public Criteria andWxFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WX_FEE not between", value1, value2, "wxFee");
            return (Criteria) this;
        }

        public Criteria andSettleStatusFeeIsNull() {
            addCriterion("SETTLE_STATUS_FEE is null");
            return (Criteria) this;
        }

        public Criteria andSettleStatusFeeIsNotNull() {
            addCriterion("SETTLE_STATUS_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andSettleStatusFeeEqualTo(String value) {
            addCriterion("SETTLE_STATUS_FEE =", value, "settleStatusFee");
            return (Criteria) this;
        }

        public Criteria andSettleStatusFeeNotEqualTo(String value) {
            addCriterion("SETTLE_STATUS_FEE <>", value, "settleStatusFee");
            return (Criteria) this;
        }

        public Criteria andSettleStatusFeeGreaterThan(String value) {
            addCriterion("SETTLE_STATUS_FEE >", value, "settleStatusFee");
            return (Criteria) this;
        }

        public Criteria andSettleStatusFeeGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_STATUS_FEE >=", value, "settleStatusFee");
            return (Criteria) this;
        }

        public Criteria andSettleStatusFeeLessThan(String value) {
            addCriterion("SETTLE_STATUS_FEE <", value, "settleStatusFee");
            return (Criteria) this;
        }

        public Criteria andSettleStatusFeeLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_STATUS_FEE <=", value, "settleStatusFee");
            return (Criteria) this;
        }

        public Criteria andSettleStatusFeeLike(String value) {
            addCriterion("SETTLE_STATUS_FEE like", value, "settleStatusFee");
            return (Criteria) this;
        }

        public Criteria andSettleStatusFeeNotLike(String value) {
            addCriterion("SETTLE_STATUS_FEE not like", value, "settleStatusFee");
            return (Criteria) this;
        }

        public Criteria andSettleStatusFeeIn(List<String> values) {
            addCriterion("SETTLE_STATUS_FEE in", values, "settleStatusFee");
            return (Criteria) this;
        }

        public Criteria andSettleStatusFeeNotIn(List<String> values) {
            addCriterion("SETTLE_STATUS_FEE not in", values, "settleStatusFee");
            return (Criteria) this;
        }

        public Criteria andSettleStatusFeeBetween(String value1, String value2) {
            addCriterion("SETTLE_STATUS_FEE between", value1, value2, "settleStatusFee");
            return (Criteria) this;
        }

        public Criteria andSettleStatusFeeNotBetween(String value1, String value2) {
            addCriterion("SETTLE_STATUS_FEE not between", value1, value2, "settleStatusFee");
            return (Criteria) this;
        }

        public Criteria andSettleTimeFeeIsNull() {
            addCriterion("SETTLE_TIME_FEE is null");
            return (Criteria) this;
        }

        public Criteria andSettleTimeFeeIsNotNull() {
            addCriterion("SETTLE_TIME_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andSettleTimeFeeEqualTo(String value) {
            addCriterion("SETTLE_TIME_FEE =", value, "settleTimeFee");
            return (Criteria) this;
        }

        public Criteria andSettleTimeFeeNotEqualTo(String value) {
            addCriterion("SETTLE_TIME_FEE <>", value, "settleTimeFee");
            return (Criteria) this;
        }

        public Criteria andSettleTimeFeeGreaterThan(String value) {
            addCriterion("SETTLE_TIME_FEE >", value, "settleTimeFee");
            return (Criteria) this;
        }

        public Criteria andSettleTimeFeeGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_TIME_FEE >=", value, "settleTimeFee");
            return (Criteria) this;
        }

        public Criteria andSettleTimeFeeLessThan(String value) {
            addCriterion("SETTLE_TIME_FEE <", value, "settleTimeFee");
            return (Criteria) this;
        }

        public Criteria andSettleTimeFeeLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_TIME_FEE <=", value, "settleTimeFee");
            return (Criteria) this;
        }

        public Criteria andSettleTimeFeeLike(String value) {
            addCriterion("SETTLE_TIME_FEE like", value, "settleTimeFee");
            return (Criteria) this;
        }

        public Criteria andSettleTimeFeeNotLike(String value) {
            addCriterion("SETTLE_TIME_FEE not like", value, "settleTimeFee");
            return (Criteria) this;
        }

        public Criteria andSettleTimeFeeIn(List<String> values) {
            addCriterion("SETTLE_TIME_FEE in", values, "settleTimeFee");
            return (Criteria) this;
        }

        public Criteria andSettleTimeFeeNotIn(List<String> values) {
            addCriterion("SETTLE_TIME_FEE not in", values, "settleTimeFee");
            return (Criteria) this;
        }

        public Criteria andSettleTimeFeeBetween(String value1, String value2) {
            addCriterion("SETTLE_TIME_FEE between", value1, value2, "settleTimeFee");
            return (Criteria) this;
        }

        public Criteria andSettleTimeFeeNotBetween(String value1, String value2) {
            addCriterion("SETTLE_TIME_FEE not between", value1, value2, "settleTimeFee");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoFeeIsNull() {
            addCriterion("SETTLE_BATCH_NO_FEE is null");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoFeeIsNotNull() {
            addCriterion("SETTLE_BATCH_NO_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoFeeEqualTo(String value) {
            addCriterion("SETTLE_BATCH_NO_FEE =", value, "settleBatchNoFee");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoFeeNotEqualTo(String value) {
            addCriterion("SETTLE_BATCH_NO_FEE <>", value, "settleBatchNoFee");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoFeeGreaterThan(String value) {
            addCriterion("SETTLE_BATCH_NO_FEE >", value, "settleBatchNoFee");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoFeeGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_BATCH_NO_FEE >=", value, "settleBatchNoFee");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoFeeLessThan(String value) {
            addCriterion("SETTLE_BATCH_NO_FEE <", value, "settleBatchNoFee");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoFeeLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_BATCH_NO_FEE <=", value, "settleBatchNoFee");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoFeeLike(String value) {
            addCriterion("SETTLE_BATCH_NO_FEE like", value, "settleBatchNoFee");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoFeeNotLike(String value) {
            addCriterion("SETTLE_BATCH_NO_FEE not like", value, "settleBatchNoFee");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoFeeIn(List<String> values) {
            addCriterion("SETTLE_BATCH_NO_FEE in", values, "settleBatchNoFee");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoFeeNotIn(List<String> values) {
            addCriterion("SETTLE_BATCH_NO_FEE not in", values, "settleBatchNoFee");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoFeeBetween(String value1, String value2) {
            addCriterion("SETTLE_BATCH_NO_FEE between", value1, value2, "settleBatchNoFee");
            return (Criteria) this;
        }

        public Criteria andSettleBatchNoFeeNotBetween(String value1, String value2) {
            addCriterion("SETTLE_BATCH_NO_FEE not between", value1, value2, "settleBatchNoFee");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("PAY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("PAY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(String value) {
            addCriterion("PAY_TIME =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(String value) {
            addCriterion("PAY_TIME <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(String value) {
            addCriterion("PAY_TIME >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_TIME >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(String value) {
            addCriterion("PAY_TIME <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(String value) {
            addCriterion("PAY_TIME <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLike(String value) {
            addCriterion("PAY_TIME like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotLike(String value) {
            addCriterion("PAY_TIME not like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<String> values) {
            addCriterion("PAY_TIME in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<String> values) {
            addCriterion("PAY_TIME not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(String value1, String value2) {
            addCriterion("PAY_TIME between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(String value1, String value2) {
            addCriterion("PAY_TIME not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNull() {
            addCriterion("Sign_time is null");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNotNull() {
            addCriterion("Sign_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignTimeEqualTo(String value) {
            addCriterion("Sign_time =", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotEqualTo(String value) {
            addCriterion("Sign_time <>", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThan(String value) {
            addCriterion("Sign_time >", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThanOrEqualTo(String value) {
            addCriterion("Sign_time >=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThan(String value) {
            addCriterion("Sign_time <", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThanOrEqualTo(String value) {
            addCriterion("Sign_time <=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLike(String value) {
            addCriterion("Sign_time like", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotLike(String value) {
            addCriterion("Sign_time not like", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIn(List<String> values) {
            addCriterion("Sign_time in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotIn(List<String> values) {
            addCriterion("Sign_time not in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeBetween(String value1, String value2) {
            addCriterion("Sign_time between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotBetween(String value1, String value2) {
            addCriterion("Sign_time not between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andIsTicketIsNull() {
            addCriterion("IS_TICKET is null");
            return (Criteria) this;
        }

        public Criteria andIsTicketIsNotNull() {
            addCriterion("IS_TICKET is not null");
            return (Criteria) this;
        }

        public Criteria andIsTicketEqualTo(String value) {
            addCriterion("IS_TICKET =", value, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketNotEqualTo(String value) {
            addCriterion("IS_TICKET <>", value, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketGreaterThan(String value) {
            addCriterion("IS_TICKET >", value, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketGreaterThanOrEqualTo(String value) {
            addCriterion("IS_TICKET >=", value, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketLessThan(String value) {
            addCriterion("IS_TICKET <", value, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketLessThanOrEqualTo(String value) {
            addCriterion("IS_TICKET <=", value, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketLike(String value) {
            addCriterion("IS_TICKET like", value, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketNotLike(String value) {
            addCriterion("IS_TICKET not like", value, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketIn(List<String> values) {
            addCriterion("IS_TICKET in", values, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketNotIn(List<String> values) {
            addCriterion("IS_TICKET not in", values, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketBetween(String value1, String value2) {
            addCriterion("IS_TICKET between", value1, value2, "isTicket");
            return (Criteria) this;
        }

        public Criteria andIsTicketNotBetween(String value1, String value2) {
            addCriterion("IS_TICKET not between", value1, value2, "isTicket");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdIsNull() {
            addCriterion("logistics_company_id is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdIsNotNull() {
            addCriterion("logistics_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdEqualTo(String value) {
            addCriterion("logistics_company_id =", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdNotEqualTo(String value) {
            addCriterion("logistics_company_id <>", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdGreaterThan(String value) {
            addCriterion("logistics_company_id >", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_company_id >=", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdLessThan(String value) {
            addCriterion("logistics_company_id <", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("logistics_company_id <=", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdLike(String value) {
            addCriterion("logistics_company_id like", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdNotLike(String value) {
            addCriterion("logistics_company_id not like", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdIn(List<String> values) {
            addCriterion("logistics_company_id in", values, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdNotIn(List<String> values) {
            addCriterion("logistics_company_id not in", values, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdBetween(String value1, String value2) {
            addCriterion("logistics_company_id between", value1, value2, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdNotBetween(String value1, String value2) {
            addCriterion("logistics_company_id not between", value1, value2, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameIsNull() {
            addCriterion("logistics_company_name is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameIsNotNull() {
            addCriterion("logistics_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameEqualTo(String value) {
            addCriterion("logistics_company_name =", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameNotEqualTo(String value) {
            addCriterion("logistics_company_name <>", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameGreaterThan(String value) {
            addCriterion("logistics_company_name >", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_company_name >=", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameLessThan(String value) {
            addCriterion("logistics_company_name <", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("logistics_company_name <=", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameLike(String value) {
            addCriterion("logistics_company_name like", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameNotLike(String value) {
            addCriterion("logistics_company_name not like", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameIn(List<String> values) {
            addCriterion("logistics_company_name in", values, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameNotIn(List<String> values) {
            addCriterion("logistics_company_name not in", values, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameBetween(String value1, String value2) {
            addCriterion("logistics_company_name between", value1, value2, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameNotBetween(String value1, String value2) {
            addCriterion("logistics_company_name not between", value1, value2, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andExpressNoIsNull() {
            addCriterion("express_no is null");
            return (Criteria) this;
        }

        public Criteria andExpressNoIsNotNull() {
            addCriterion("express_no is not null");
            return (Criteria) this;
        }

        public Criteria andExpressNoEqualTo(String value) {
            addCriterion("express_no =", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotEqualTo(String value) {
            addCriterion("express_no <>", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoGreaterThan(String value) {
            addCriterion("express_no >", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoGreaterThanOrEqualTo(String value) {
            addCriterion("express_no >=", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoLessThan(String value) {
            addCriterion("express_no <", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoLessThanOrEqualTo(String value) {
            addCriterion("express_no <=", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoLike(String value) {
            addCriterion("express_no like", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotLike(String value) {
            addCriterion("express_no not like", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoIn(List<String> values) {
            addCriterion("express_no in", values, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotIn(List<String> values) {
            addCriterion("express_no not in", values, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoBetween(String value1, String value2) {
            addCriterion("express_no between", value1, value2, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotBetween(String value1, String value2) {
            addCriterion("express_no not between", value1, value2, "expressNo");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIsNull() {
            addCriterion("IS_INVOICE is null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIsNotNull() {
            addCriterion("IS_INVOICE is not null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceEqualTo(String value) {
            addCriterion("IS_INVOICE =", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotEqualTo(String value) {
            addCriterion("IS_INVOICE <>", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThan(String value) {
            addCriterion("IS_INVOICE >", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("IS_INVOICE >=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThan(String value) {
            addCriterion("IS_INVOICE <", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThanOrEqualTo(String value) {
            addCriterion("IS_INVOICE <=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLike(String value) {
            addCriterion("IS_INVOICE like", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotLike(String value) {
            addCriterion("IS_INVOICE not like", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIn(List<String> values) {
            addCriterion("IS_INVOICE in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotIn(List<String> values) {
            addCriterion("IS_INVOICE not in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceBetween(String value1, String value2) {
            addCriterion("IS_INVOICE between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotBetween(String value1, String value2) {
            addCriterion("IS_INVOICE not between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("INVOICE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("INVOICE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(String value) {
            addCriterion("INVOICE =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(String value) {
            addCriterion("INVOICE <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(String value) {
            addCriterion("INVOICE >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(String value) {
            addCriterion("INVOICE <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(String value) {
            addCriterion("INVOICE <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLike(String value) {
            addCriterion("INVOICE like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotLike(String value) {
            addCriterion("INVOICE not like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<String> values) {
            addCriterion("INVOICE in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<String> values) {
            addCriterion("INVOICE not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(String value1, String value2) {
            addCriterion("INVOICE between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(String value1, String value2) {
            addCriterion("INVOICE not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIsNull() {
            addCriterion("INVOICE_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIsNotNull() {
            addCriterion("INVOICE_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentEqualTo(String value) {
            addCriterion("INVOICE_CONTENT =", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotEqualTo(String value) {
            addCriterion("INVOICE_CONTENT <>", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentGreaterThan(String value) {
            addCriterion("INVOICE_CONTENT >", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_CONTENT >=", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentLessThan(String value) {
            addCriterion("INVOICE_CONTENT <", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_CONTENT <=", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentLike(String value) {
            addCriterion("INVOICE_CONTENT like", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotLike(String value) {
            addCriterion("INVOICE_CONTENT not like", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIn(List<String> values) {
            addCriterion("INVOICE_CONTENT in", values, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotIn(List<String> values) {
            addCriterion("INVOICE_CONTENT not in", values, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentBetween(String value1, String value2) {
            addCriterion("INVOICE_CONTENT between", value1, value2, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotBetween(String value1, String value2) {
            addCriterion("INVOICE_CONTENT not between", value1, value2, "invoiceContent");
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

        public Criteria andCustomerphoneIsNull() {
            addCriterion("customerPhone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneIsNotNull() {
            addCriterion("customerPhone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneEqualTo(String value) {
            addCriterion("customerPhone =", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotEqualTo(String value) {
            addCriterion("customerPhone <>", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneGreaterThan(String value) {
            addCriterion("customerPhone >", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("customerPhone >=", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneLessThan(String value) {
            addCriterion("customerPhone <", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneLessThanOrEqualTo(String value) {
            addCriterion("customerPhone <=", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneLike(String value) {
            addCriterion("customerPhone like", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotLike(String value) {
            addCriterion("customerPhone not like", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneIn(List<String> values) {
            addCriterion("customerPhone in", values, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotIn(List<String> values) {
            addCriterion("customerPhone not in", values, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneBetween(String value1, String value2) {
            addCriterion("customerPhone between", value1, value2, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotBetween(String value1, String value2) {
            addCriterion("customerPhone not between", value1, value2, "customerphone");
            return (Criteria) this;
        }

        public Criteria andIsSendIsNull() {
            addCriterion("is_send is null");
            return (Criteria) this;
        }

        public Criteria andIsSendIsNotNull() {
            addCriterion("is_send is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendEqualTo(String value) {
            addCriterion("is_send =", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotEqualTo(String value) {
            addCriterion("is_send <>", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThan(String value) {
            addCriterion("is_send >", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThanOrEqualTo(String value) {
            addCriterion("is_send >=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThan(String value) {
            addCriterion("is_send <", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThanOrEqualTo(String value) {
            addCriterion("is_send <=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLike(String value) {
            addCriterion("is_send like", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotLike(String value) {
            addCriterion("is_send not like", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendIn(List<String> values) {
            addCriterion("is_send in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotIn(List<String> values) {
            addCriterion("is_send not in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendBetween(String value1, String value2) {
            addCriterion("is_send between", value1, value2, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotBetween(String value1, String value2) {
            addCriterion("is_send not between", value1, value2, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsMakeloanIsNull() {
            addCriterion("is_makeloan is null");
            return (Criteria) this;
        }

        public Criteria andIsMakeloanIsNotNull() {
            addCriterion("is_makeloan is not null");
            return (Criteria) this;
        }

        public Criteria andIsMakeloanEqualTo(String value) {
            addCriterion("is_makeloan =", value, "isMakeloan");
            return (Criteria) this;
        }

        public Criteria andIsMakeloanNotEqualTo(String value) {
            addCriterion("is_makeloan <>", value, "isMakeloan");
            return (Criteria) this;
        }

        public Criteria andIsMakeloanGreaterThan(String value) {
            addCriterion("is_makeloan >", value, "isMakeloan");
            return (Criteria) this;
        }

        public Criteria andIsMakeloanGreaterThanOrEqualTo(String value) {
            addCriterion("is_makeloan >=", value, "isMakeloan");
            return (Criteria) this;
        }

        public Criteria andIsMakeloanLessThan(String value) {
            addCriterion("is_makeloan <", value, "isMakeloan");
            return (Criteria) this;
        }

        public Criteria andIsMakeloanLessThanOrEqualTo(String value) {
            addCriterion("is_makeloan <=", value, "isMakeloan");
            return (Criteria) this;
        }

        public Criteria andIsMakeloanLike(String value) {
            addCriterion("is_makeloan like", value, "isMakeloan");
            return (Criteria) this;
        }

        public Criteria andIsMakeloanNotLike(String value) {
            addCriterion("is_makeloan not like", value, "isMakeloan");
            return (Criteria) this;
        }

        public Criteria andIsMakeloanIn(List<String> values) {
            addCriterion("is_makeloan in", values, "isMakeloan");
            return (Criteria) this;
        }

        public Criteria andIsMakeloanNotIn(List<String> values) {
            addCriterion("is_makeloan not in", values, "isMakeloan");
            return (Criteria) this;
        }

        public Criteria andIsMakeloanBetween(String value1, String value2) {
            addCriterion("is_makeloan between", value1, value2, "isMakeloan");
            return (Criteria) this;
        }

        public Criteria andIsMakeloanNotBetween(String value1, String value2) {
            addCriterion("is_makeloan not between", value1, value2, "isMakeloan");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("CUSTOMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("CUSTOMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("CUSTOMER_NAME =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("CUSTOMER_NAME >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("CUSTOMER_NAME <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("CUSTOMER_NAME like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("CUSTOMER_NAME not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("CUSTOMER_NAME in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("CUSTOMER_NAME not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andRefundstatusIsNull() {
            addCriterion("REFUNDSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andRefundstatusIsNotNull() {
            addCriterion("REFUNDSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRefundstatusEqualTo(String value) {
            addCriterion("REFUNDSTATUS =", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotEqualTo(String value) {
            addCriterion("REFUNDSTATUS <>", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusGreaterThan(String value) {
            addCriterion("REFUNDSTATUS >", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusGreaterThanOrEqualTo(String value) {
            addCriterion("REFUNDSTATUS >=", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusLessThan(String value) {
            addCriterion("REFUNDSTATUS <", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusLessThanOrEqualTo(String value) {
            addCriterion("REFUNDSTATUS <=", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusLike(String value) {
            addCriterion("REFUNDSTATUS like", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotLike(String value) {
            addCriterion("REFUNDSTATUS not like", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusIn(List<String> values) {
            addCriterion("REFUNDSTATUS in", values, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotIn(List<String> values) {
            addCriterion("REFUNDSTATUS not in", values, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusBetween(String value1, String value2) {
            addCriterion("REFUNDSTATUS between", value1, value2, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotBetween(String value1, String value2) {
            addCriterion("REFUNDSTATUS not between", value1, value2, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefunduserIsNull() {
            addCriterion("REFUNDUSER is null");
            return (Criteria) this;
        }

        public Criteria andRefunduserIsNotNull() {
            addCriterion("REFUNDUSER is not null");
            return (Criteria) this;
        }

        public Criteria andRefunduserEqualTo(String value) {
            addCriterion("REFUNDUSER =", value, "refunduser");
            return (Criteria) this;
        }

        public Criteria andRefunduserNotEqualTo(String value) {
            addCriterion("REFUNDUSER <>", value, "refunduser");
            return (Criteria) this;
        }

        public Criteria andRefunduserGreaterThan(String value) {
            addCriterion("REFUNDUSER >", value, "refunduser");
            return (Criteria) this;
        }

        public Criteria andRefunduserGreaterThanOrEqualTo(String value) {
            addCriterion("REFUNDUSER >=", value, "refunduser");
            return (Criteria) this;
        }

        public Criteria andRefunduserLessThan(String value) {
            addCriterion("REFUNDUSER <", value, "refunduser");
            return (Criteria) this;
        }

        public Criteria andRefunduserLessThanOrEqualTo(String value) {
            addCriterion("REFUNDUSER <=", value, "refunduser");
            return (Criteria) this;
        }

        public Criteria andRefunduserLike(String value) {
            addCriterion("REFUNDUSER like", value, "refunduser");
            return (Criteria) this;
        }

        public Criteria andRefunduserNotLike(String value) {
            addCriterion("REFUNDUSER not like", value, "refunduser");
            return (Criteria) this;
        }

        public Criteria andRefunduserIn(List<String> values) {
            addCriterion("REFUNDUSER in", values, "refunduser");
            return (Criteria) this;
        }

        public Criteria andRefunduserNotIn(List<String> values) {
            addCriterion("REFUNDUSER not in", values, "refunduser");
            return (Criteria) this;
        }

        public Criteria andRefunduserBetween(String value1, String value2) {
            addCriterion("REFUNDUSER between", value1, value2, "refunduser");
            return (Criteria) this;
        }

        public Criteria andRefunduserNotBetween(String value1, String value2) {
            addCriterion("REFUNDUSER not between", value1, value2, "refunduser");
            return (Criteria) this;
        }

        public Criteria andStockstatusIsNull() {
            addCriterion("STOCKSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andStockstatusIsNotNull() {
            addCriterion("STOCKSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStockstatusEqualTo(String value) {
            addCriterion("STOCKSTATUS =", value, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusNotEqualTo(String value) {
            addCriterion("STOCKSTATUS <>", value, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusGreaterThan(String value) {
            addCriterion("STOCKSTATUS >", value, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusGreaterThanOrEqualTo(String value) {
            addCriterion("STOCKSTATUS >=", value, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusLessThan(String value) {
            addCriterion("STOCKSTATUS <", value, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusLessThanOrEqualTo(String value) {
            addCriterion("STOCKSTATUS <=", value, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusLike(String value) {
            addCriterion("STOCKSTATUS like", value, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusNotLike(String value) {
            addCriterion("STOCKSTATUS not like", value, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusIn(List<String> values) {
            addCriterion("STOCKSTATUS in", values, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusNotIn(List<String> values) {
            addCriterion("STOCKSTATUS not in", values, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusBetween(String value1, String value2) {
            addCriterion("STOCKSTATUS between", value1, value2, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusNotBetween(String value1, String value2) {
            addCriterion("STOCKSTATUS not between", value1, value2, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andIslockIsNull() {
            addCriterion("ISLOCK is null");
            return (Criteria) this;
        }

        public Criteria andIslockIsNotNull() {
            addCriterion("ISLOCK is not null");
            return (Criteria) this;
        }

        public Criteria andIslockEqualTo(String value) {
            addCriterion("ISLOCK =", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotEqualTo(String value) {
            addCriterion("ISLOCK <>", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockGreaterThan(String value) {
            addCriterion("ISLOCK >", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockGreaterThanOrEqualTo(String value) {
            addCriterion("ISLOCK >=", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockLessThan(String value) {
            addCriterion("ISLOCK <", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockLessThanOrEqualTo(String value) {
            addCriterion("ISLOCK <=", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockLike(String value) {
            addCriterion("ISLOCK like", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotLike(String value) {
            addCriterion("ISLOCK not like", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockIn(List<String> values) {
            addCriterion("ISLOCK in", values, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotIn(List<String> values) {
            addCriterion("ISLOCK not in", values, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockBetween(String value1, String value2) {
            addCriterion("ISLOCK between", value1, value2, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotBetween(String value1, String value2) {
            addCriterion("ISLOCK not between", value1, value2, "islock");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
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

        public Criteria andMarkIsNull() {
            addCriterion("MARK is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("MARK is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("MARK =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("MARK <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("MARK >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("MARK >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("MARK <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("MARK <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("MARK like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("MARK not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("MARK in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("MARK not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("MARK between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("MARK not between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNull() {
            addCriterion("REFUND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNotNull() {
            addCriterion("REFUND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeEqualTo(String value) {
            addCriterion("REFUND_TIME =", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotEqualTo(String value) {
            addCriterion("REFUND_TIME <>", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThan(String value) {
            addCriterion("REFUND_TIME >", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_TIME >=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThan(String value) {
            addCriterion("REFUND_TIME <", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThanOrEqualTo(String value) {
            addCriterion("REFUND_TIME <=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLike(String value) {
            addCriterion("REFUND_TIME like", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotLike(String value) {
            addCriterion("REFUND_TIME not like", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIn(List<String> values) {
            addCriterion("REFUND_TIME in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotIn(List<String> values) {
            addCriterion("REFUND_TIME not in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeBetween(String value1, String value2) {
            addCriterion("REFUND_TIME between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotBetween(String value1, String value2) {
            addCriterion("REFUND_TIME not between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIsNull() {
            addCriterion("SETTLEMENT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIsNotNull() {
            addCriterion("SETTLEMENT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeEqualTo(String value) {
            addCriterion("SETTLEMENT_TIME =", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotEqualTo(String value) {
            addCriterion("SETTLEMENT_TIME <>", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeGreaterThan(String value) {
            addCriterion("SETTLEMENT_TIME >", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_TIME >=", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeLessThan(String value) {
            addCriterion("SETTLEMENT_TIME <", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_TIME <=", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeLike(String value) {
            addCriterion("SETTLEMENT_TIME like", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotLike(String value) {
            addCriterion("SETTLEMENT_TIME not like", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIn(List<String> values) {
            addCriterion("SETTLEMENT_TIME in", values, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotIn(List<String> values) {
            addCriterion("SETTLEMENT_TIME not in", values, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_TIME between", value1, value2, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_TIME not between", value1, value2, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementIdsIsNull() {
            addCriterion("SETTLEMENT_IDS is null");
            return (Criteria) this;
        }

        public Criteria andSettlementIdsIsNotNull() {
            addCriterion("SETTLEMENT_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementIdsEqualTo(String value) {
            addCriterion("SETTLEMENT_IDS =", value, "settlementIds");
            return (Criteria) this;
        }

        public Criteria andSettlementIdsNotEqualTo(String value) {
            addCriterion("SETTLEMENT_IDS <>", value, "settlementIds");
            return (Criteria) this;
        }

        public Criteria andSettlementIdsGreaterThan(String value) {
            addCriterion("SETTLEMENT_IDS >", value, "settlementIds");
            return (Criteria) this;
        }

        public Criteria andSettlementIdsGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_IDS >=", value, "settlementIds");
            return (Criteria) this;
        }

        public Criteria andSettlementIdsLessThan(String value) {
            addCriterion("SETTLEMENT_IDS <", value, "settlementIds");
            return (Criteria) this;
        }

        public Criteria andSettlementIdsLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_IDS <=", value, "settlementIds");
            return (Criteria) this;
        }

        public Criteria andSettlementIdsLike(String value) {
            addCriterion("SETTLEMENT_IDS like", value, "settlementIds");
            return (Criteria) this;
        }

        public Criteria andSettlementIdsNotLike(String value) {
            addCriterion("SETTLEMENT_IDS not like", value, "settlementIds");
            return (Criteria) this;
        }

        public Criteria andSettlementIdsIn(List<String> values) {
            addCriterion("SETTLEMENT_IDS in", values, "settlementIds");
            return (Criteria) this;
        }

        public Criteria andSettlementIdsNotIn(List<String> values) {
            addCriterion("SETTLEMENT_IDS not in", values, "settlementIds");
            return (Criteria) this;
        }

        public Criteria andSettlementIdsBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_IDS between", value1, value2, "settlementIds");
            return (Criteria) this;
        }

        public Criteria andSettlementIdsNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_IDS not between", value1, value2, "settlementIds");
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