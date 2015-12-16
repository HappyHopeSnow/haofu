package com.haofu.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderMainExample {
    private String tableName;
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderMainExample() {
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

        public Criteria andDbidIsNull() {
            addCriterion("dbid is null");
            return (Criteria) this;
        }

        public Criteria andDbidIsNotNull() {
            addCriterion("dbid is not null");
            return (Criteria) this;
        }

        public Criteria andDbidEqualTo(Long value) {
            addCriterion("dbid =", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidNotEqualTo(Long value) {
            addCriterion("dbid <>", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidGreaterThan(Long value) {
            addCriterion("dbid >", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidGreaterThanOrEqualTo(Long value) {
            addCriterion("dbid >=", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidLessThan(Long value) {
            addCriterion("dbid <", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidLessThanOrEqualTo(Long value) {
            addCriterion("dbid <=", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidIn(List<Long> values) {
            addCriterion("dbid in", values, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidNotIn(List<Long> values) {
            addCriterion("dbid not in", values, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidBetween(Long value1, Long value2) {
            addCriterion("dbid between", value1, value2, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidNotBetween(Long value1, Long value2) {
            addCriterion("dbid not between", value1, value2, "dbid");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("org_id not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andDcIdIsNull() {
            addCriterion("dc_id is null");
            return (Criteria) this;
        }

        public Criteria andDcIdIsNotNull() {
            addCriterion("dc_id is not null");
            return (Criteria) this;
        }

        public Criteria andDcIdEqualTo(String value) {
            addCriterion("dc_id =", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdNotEqualTo(String value) {
            addCriterion("dc_id <>", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdGreaterThan(String value) {
            addCriterion("dc_id >", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdGreaterThanOrEqualTo(String value) {
            addCriterion("dc_id >=", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdLessThan(String value) {
            addCriterion("dc_id <", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdLessThanOrEqualTo(String value) {
            addCriterion("dc_id <=", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdLike(String value) {
            addCriterion("dc_id like", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdNotLike(String value) {
            addCriterion("dc_id not like", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdIn(List<String> values) {
            addCriterion("dc_id in", values, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdNotIn(List<String> values) {
            addCriterion("dc_id not in", values, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdBetween(String value1, String value2) {
            addCriterion("dc_id between", value1, value2, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdNotBetween(String value1, String value2) {
            addCriterion("dc_id not between", value1, value2, "dcId");
            return (Criteria) this;
        }

        public Criteria andWhIdIsNull() {
            addCriterion("wh_id is null");
            return (Criteria) this;
        }

        public Criteria andWhIdIsNotNull() {
            addCriterion("wh_id is not null");
            return (Criteria) this;
        }

        public Criteria andWhIdEqualTo(String value) {
            addCriterion("wh_id =", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdNotEqualTo(String value) {
            addCriterion("wh_id <>", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdGreaterThan(String value) {
            addCriterion("wh_id >", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdGreaterThanOrEqualTo(String value) {
            addCriterion("wh_id >=", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdLessThan(String value) {
            addCriterion("wh_id <", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdLessThanOrEqualTo(String value) {
            addCriterion("wh_id <=", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdLike(String value) {
            addCriterion("wh_id like", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdNotLike(String value) {
            addCriterion("wh_id not like", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdIn(List<String> values) {
            addCriterion("wh_id in", values, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdNotIn(List<String> values) {
            addCriterion("wh_id not in", values, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdBetween(String value1, String value2) {
            addCriterion("wh_id between", value1, value2, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdNotBetween(String value1, String value2) {
            addCriterion("wh_id not between", value1, value2, "whId");
            return (Criteria) this;
        }

        public Criteria andOwnerNoIsNull() {
            addCriterion("owner_no is null");
            return (Criteria) this;
        }

        public Criteria andOwnerNoIsNotNull() {
            addCriterion("owner_no is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerNoEqualTo(String value) {
            addCriterion("owner_no =", value, "ownerNo");
            return (Criteria) this;
        }

        public Criteria andOwnerNoNotEqualTo(String value) {
            addCriterion("owner_no <>", value, "ownerNo");
            return (Criteria) this;
        }

        public Criteria andOwnerNoGreaterThan(String value) {
            addCriterion("owner_no >", value, "ownerNo");
            return (Criteria) this;
        }

        public Criteria andOwnerNoGreaterThanOrEqualTo(String value) {
            addCriterion("owner_no >=", value, "ownerNo");
            return (Criteria) this;
        }

        public Criteria andOwnerNoLessThan(String value) {
            addCriterion("owner_no <", value, "ownerNo");
            return (Criteria) this;
        }

        public Criteria andOwnerNoLessThanOrEqualTo(String value) {
            addCriterion("owner_no <=", value, "ownerNo");
            return (Criteria) this;
        }

        public Criteria andOwnerNoLike(String value) {
            addCriterion("owner_no like", value, "ownerNo");
            return (Criteria) this;
        }

        public Criteria andOwnerNoNotLike(String value) {
            addCriterion("owner_no not like", value, "ownerNo");
            return (Criteria) this;
        }

        public Criteria andOwnerNoIn(List<String> values) {
            addCriterion("owner_no in", values, "ownerNo");
            return (Criteria) this;
        }

        public Criteria andOwnerNoNotIn(List<String> values) {
            addCriterion("owner_no not in", values, "ownerNo");
            return (Criteria) this;
        }

        public Criteria andOwnerNoBetween(String value1, String value2) {
            addCriterion("owner_no between", value1, value2, "ownerNo");
            return (Criteria) this;
        }

        public Criteria andOwnerNoNotBetween(String value1, String value2) {
            addCriterion("owner_no not between", value1, value2, "ownerNo");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNull() {
            addCriterion("owner_name is null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNotNull() {
            addCriterion("owner_name is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameEqualTo(String value) {
            addCriterion("owner_name =", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotEqualTo(String value) {
            addCriterion("owner_name <>", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThan(String value) {
            addCriterion("owner_name >", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("owner_name >=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThan(String value) {
            addCriterion("owner_name <", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThanOrEqualTo(String value) {
            addCriterion("owner_name <=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLike(String value) {
            addCriterion("owner_name like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotLike(String value) {
            addCriterion("owner_name not like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIn(List<String> values) {
            addCriterion("owner_name in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotIn(List<String> values) {
            addCriterion("owner_name not in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameBetween(String value1, String value2) {
            addCriterion("owner_name between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotBetween(String value1, String value2) {
            addCriterion("owner_name not between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIsNull() {
            addCriterion("owner_type is null");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIsNotNull() {
            addCriterion("owner_type is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeEqualTo(Byte value) {
            addCriterion("owner_type =", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotEqualTo(Byte value) {
            addCriterion("owner_type <>", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeGreaterThan(Byte value) {
            addCriterion("owner_type >", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("owner_type >=", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeLessThan(Byte value) {
            addCriterion("owner_type <", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeLessThanOrEqualTo(Byte value) {
            addCriterion("owner_type <=", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIn(List<Byte> values) {
            addCriterion("owner_type in", values, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotIn(List<Byte> values) {
            addCriterion("owner_type not in", values, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeBetween(Byte value1, Byte value2) {
            addCriterion("owner_type between", value1, value2, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("owner_type not between", value1, value2, "ownerType");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIsNull() {
            addCriterion("deliver_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIsNotNull() {
            addCriterion("deliver_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeEqualTo(Date value) {
            addCriterion("deliver_time =", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotEqualTo(Date value) {
            addCriterion("deliver_time <>", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThan(Date value) {
            addCriterion("deliver_time >", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deliver_time >=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThan(Date value) {
            addCriterion("deliver_time <", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThanOrEqualTo(Date value) {
            addCriterion("deliver_time <=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIn(List<Date> values) {
            addCriterion("deliver_time in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotIn(List<Date> values) {
            addCriterion("deliver_time not in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeBetween(Date value1, Date value2) {
            addCriterion("deliver_time between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotBetween(Date value1, Date value2) {
            addCriterion("deliver_time not between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrIsNull() {
            addCriterion("consignee_addr is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrIsNotNull() {
            addCriterion("consignee_addr is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrEqualTo(String value) {
            addCriterion("consignee_addr =", value, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrNotEqualTo(String value) {
            addCriterion("consignee_addr <>", value, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrGreaterThan(String value) {
            addCriterion("consignee_addr >", value, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_addr >=", value, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrLessThan(String value) {
            addCriterion("consignee_addr <", value, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrLessThanOrEqualTo(String value) {
            addCriterion("consignee_addr <=", value, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrLike(String value) {
            addCriterion("consignee_addr like", value, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrNotLike(String value) {
            addCriterion("consignee_addr not like", value, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrIn(List<String> values) {
            addCriterion("consignee_addr in", values, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrNotIn(List<String> values) {
            addCriterion("consignee_addr not in", values, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrBetween(String value1, String value2) {
            addCriterion("consignee_addr between", value1, value2, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddrNotBetween(String value1, String value2) {
            addCriterion("consignee_addr not between", value1, value2, "consigneeAddr");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceIsNull() {
            addCriterion("addr_province is null");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceIsNotNull() {
            addCriterion("addr_province is not null");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceEqualTo(String value) {
            addCriterion("addr_province =", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNotEqualTo(String value) {
            addCriterion("addr_province <>", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceGreaterThan(String value) {
            addCriterion("addr_province >", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("addr_province >=", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceLessThan(String value) {
            addCriterion("addr_province <", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceLessThanOrEqualTo(String value) {
            addCriterion("addr_province <=", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceLike(String value) {
            addCriterion("addr_province like", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNotLike(String value) {
            addCriterion("addr_province not like", value, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceIn(List<String> values) {
            addCriterion("addr_province in", values, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNotIn(List<String> values) {
            addCriterion("addr_province not in", values, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceBetween(String value1, String value2) {
            addCriterion("addr_province between", value1, value2, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNotBetween(String value1, String value2) {
            addCriterion("addr_province not between", value1, value2, "addrProvince");
            return (Criteria) this;
        }

        public Criteria andAddrCityIsNull() {
            addCriterion("addr_city is null");
            return (Criteria) this;
        }

        public Criteria andAddrCityIsNotNull() {
            addCriterion("addr_city is not null");
            return (Criteria) this;
        }

        public Criteria andAddrCityEqualTo(String value) {
            addCriterion("addr_city =", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityNotEqualTo(String value) {
            addCriterion("addr_city <>", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityGreaterThan(String value) {
            addCriterion("addr_city >", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityGreaterThanOrEqualTo(String value) {
            addCriterion("addr_city >=", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityLessThan(String value) {
            addCriterion("addr_city <", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityLessThanOrEqualTo(String value) {
            addCriterion("addr_city <=", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityLike(String value) {
            addCriterion("addr_city like", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityNotLike(String value) {
            addCriterion("addr_city not like", value, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityIn(List<String> values) {
            addCriterion("addr_city in", values, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityNotIn(List<String> values) {
            addCriterion("addr_city not in", values, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityBetween(String value1, String value2) {
            addCriterion("addr_city between", value1, value2, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCityNotBetween(String value1, String value2) {
            addCriterion("addr_city not between", value1, value2, "addrCity");
            return (Criteria) this;
        }

        public Criteria andAddrCountyIsNull() {
            addCriterion("addr_county is null");
            return (Criteria) this;
        }

        public Criteria andAddrCountyIsNotNull() {
            addCriterion("addr_county is not null");
            return (Criteria) this;
        }

        public Criteria andAddrCountyEqualTo(String value) {
            addCriterion("addr_county =", value, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNotEqualTo(String value) {
            addCriterion("addr_county <>", value, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyGreaterThan(String value) {
            addCriterion("addr_county >", value, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyGreaterThanOrEqualTo(String value) {
            addCriterion("addr_county >=", value, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyLessThan(String value) {
            addCriterion("addr_county <", value, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyLessThanOrEqualTo(String value) {
            addCriterion("addr_county <=", value, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyLike(String value) {
            addCriterion("addr_county like", value, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNotLike(String value) {
            addCriterion("addr_county not like", value, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyIn(List<String> values) {
            addCriterion("addr_county in", values, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNotIn(List<String> values) {
            addCriterion("addr_county not in", values, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyBetween(String value1, String value2) {
            addCriterion("addr_county between", value1, value2, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNotBetween(String value1, String value2) {
            addCriterion("addr_county not between", value1, value2, "addrCounty");
            return (Criteria) this;
        }

        public Criteria andAddrTownIsNull() {
            addCriterion("addr_town is null");
            return (Criteria) this;
        }

        public Criteria andAddrTownIsNotNull() {
            addCriterion("addr_town is not null");
            return (Criteria) this;
        }

        public Criteria andAddrTownEqualTo(String value) {
            addCriterion("addr_town =", value, "addrTown");
            return (Criteria) this;
        }

        public Criteria andAddrTownNotEqualTo(String value) {
            addCriterion("addr_town <>", value, "addrTown");
            return (Criteria) this;
        }

        public Criteria andAddrTownGreaterThan(String value) {
            addCriterion("addr_town >", value, "addrTown");
            return (Criteria) this;
        }

        public Criteria andAddrTownGreaterThanOrEqualTo(String value) {
            addCriterion("addr_town >=", value, "addrTown");
            return (Criteria) this;
        }

        public Criteria andAddrTownLessThan(String value) {
            addCriterion("addr_town <", value, "addrTown");
            return (Criteria) this;
        }

        public Criteria andAddrTownLessThanOrEqualTo(String value) {
            addCriterion("addr_town <=", value, "addrTown");
            return (Criteria) this;
        }

        public Criteria andAddrTownLike(String value) {
            addCriterion("addr_town like", value, "addrTown");
            return (Criteria) this;
        }

        public Criteria andAddrTownNotLike(String value) {
            addCriterion("addr_town not like", value, "addrTown");
            return (Criteria) this;
        }

        public Criteria andAddrTownIn(List<String> values) {
            addCriterion("addr_town in", values, "addrTown");
            return (Criteria) this;
        }

        public Criteria andAddrTownNotIn(List<String> values) {
            addCriterion("addr_town not in", values, "addrTown");
            return (Criteria) this;
        }

        public Criteria andAddrTownBetween(String value1, String value2) {
            addCriterion("addr_town between", value1, value2, "addrTown");
            return (Criteria) this;
        }

        public Criteria andAddrTownNotBetween(String value1, String value2) {
            addCriterion("addr_town not between", value1, value2, "addrTown");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNameIsNull() {
            addCriterion("addr_province_name is null");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNameIsNotNull() {
            addCriterion("addr_province_name is not null");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNameEqualTo(String value) {
            addCriterion("addr_province_name =", value, "addrProvinceName");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNameNotEqualTo(String value) {
            addCriterion("addr_province_name <>", value, "addrProvinceName");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNameGreaterThan(String value) {
            addCriterion("addr_province_name >", value, "addrProvinceName");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("addr_province_name >=", value, "addrProvinceName");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNameLessThan(String value) {
            addCriterion("addr_province_name <", value, "addrProvinceName");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("addr_province_name <=", value, "addrProvinceName");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNameLike(String value) {
            addCriterion("addr_province_name like", value, "addrProvinceName");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNameNotLike(String value) {
            addCriterion("addr_province_name not like", value, "addrProvinceName");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNameIn(List<String> values) {
            addCriterion("addr_province_name in", values, "addrProvinceName");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNameNotIn(List<String> values) {
            addCriterion("addr_province_name not in", values, "addrProvinceName");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNameBetween(String value1, String value2) {
            addCriterion("addr_province_name between", value1, value2, "addrProvinceName");
            return (Criteria) this;
        }

        public Criteria andAddrProvinceNameNotBetween(String value1, String value2) {
            addCriterion("addr_province_name not between", value1, value2, "addrProvinceName");
            return (Criteria) this;
        }

        public Criteria andAddrCityNameIsNull() {
            addCriterion("addr_city_name is null");
            return (Criteria) this;
        }

        public Criteria andAddrCityNameIsNotNull() {
            addCriterion("addr_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andAddrCityNameEqualTo(String value) {
            addCriterion("addr_city_name =", value, "addrCityName");
            return (Criteria) this;
        }

        public Criteria andAddrCityNameNotEqualTo(String value) {
            addCriterion("addr_city_name <>", value, "addrCityName");
            return (Criteria) this;
        }

        public Criteria andAddrCityNameGreaterThan(String value) {
            addCriterion("addr_city_name >", value, "addrCityName");
            return (Criteria) this;
        }

        public Criteria andAddrCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("addr_city_name >=", value, "addrCityName");
            return (Criteria) this;
        }

        public Criteria andAddrCityNameLessThan(String value) {
            addCriterion("addr_city_name <", value, "addrCityName");
            return (Criteria) this;
        }

        public Criteria andAddrCityNameLessThanOrEqualTo(String value) {
            addCriterion("addr_city_name <=", value, "addrCityName");
            return (Criteria) this;
        }

        public Criteria andAddrCityNameLike(String value) {
            addCriterion("addr_city_name like", value, "addrCityName");
            return (Criteria) this;
        }

        public Criteria andAddrCityNameNotLike(String value) {
            addCriterion("addr_city_name not like", value, "addrCityName");
            return (Criteria) this;
        }

        public Criteria andAddrCityNameIn(List<String> values) {
            addCriterion("addr_city_name in", values, "addrCityName");
            return (Criteria) this;
        }

        public Criteria andAddrCityNameNotIn(List<String> values) {
            addCriterion("addr_city_name not in", values, "addrCityName");
            return (Criteria) this;
        }

        public Criteria andAddrCityNameBetween(String value1, String value2) {
            addCriterion("addr_city_name between", value1, value2, "addrCityName");
            return (Criteria) this;
        }

        public Criteria andAddrCityNameNotBetween(String value1, String value2) {
            addCriterion("addr_city_name not between", value1, value2, "addrCityName");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNameIsNull() {
            addCriterion("addr_county_name is null");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNameIsNotNull() {
            addCriterion("addr_county_name is not null");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNameEqualTo(String value) {
            addCriterion("addr_county_name =", value, "addrCountyName");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNameNotEqualTo(String value) {
            addCriterion("addr_county_name <>", value, "addrCountyName");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNameGreaterThan(String value) {
            addCriterion("addr_county_name >", value, "addrCountyName");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNameGreaterThanOrEqualTo(String value) {
            addCriterion("addr_county_name >=", value, "addrCountyName");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNameLessThan(String value) {
            addCriterion("addr_county_name <", value, "addrCountyName");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNameLessThanOrEqualTo(String value) {
            addCriterion("addr_county_name <=", value, "addrCountyName");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNameLike(String value) {
            addCriterion("addr_county_name like", value, "addrCountyName");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNameNotLike(String value) {
            addCriterion("addr_county_name not like", value, "addrCountyName");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNameIn(List<String> values) {
            addCriterion("addr_county_name in", values, "addrCountyName");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNameNotIn(List<String> values) {
            addCriterion("addr_county_name not in", values, "addrCountyName");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNameBetween(String value1, String value2) {
            addCriterion("addr_county_name between", value1, value2, "addrCountyName");
            return (Criteria) this;
        }

        public Criteria andAddrCountyNameNotBetween(String value1, String value2) {
            addCriterion("addr_county_name not between", value1, value2, "addrCountyName");
            return (Criteria) this;
        }

        public Criteria andAddrTownNameIsNull() {
            addCriterion("addr_town_name is null");
            return (Criteria) this;
        }

        public Criteria andAddrTownNameIsNotNull() {
            addCriterion("addr_town_name is not null");
            return (Criteria) this;
        }

        public Criteria andAddrTownNameEqualTo(String value) {
            addCriterion("addr_town_name =", value, "addrTownName");
            return (Criteria) this;
        }

        public Criteria andAddrTownNameNotEqualTo(String value) {
            addCriterion("addr_town_name <>", value, "addrTownName");
            return (Criteria) this;
        }

        public Criteria andAddrTownNameGreaterThan(String value) {
            addCriterion("addr_town_name >", value, "addrTownName");
            return (Criteria) this;
        }

        public Criteria andAddrTownNameGreaterThanOrEqualTo(String value) {
            addCriterion("addr_town_name >=", value, "addrTownName");
            return (Criteria) this;
        }

        public Criteria andAddrTownNameLessThan(String value) {
            addCriterion("addr_town_name <", value, "addrTownName");
            return (Criteria) this;
        }

        public Criteria andAddrTownNameLessThanOrEqualTo(String value) {
            addCriterion("addr_town_name <=", value, "addrTownName");
            return (Criteria) this;
        }

        public Criteria andAddrTownNameLike(String value) {
            addCriterion("addr_town_name like", value, "addrTownName");
            return (Criteria) this;
        }

        public Criteria andAddrTownNameNotLike(String value) {
            addCriterion("addr_town_name not like", value, "addrTownName");
            return (Criteria) this;
        }

        public Criteria andAddrTownNameIn(List<String> values) {
            addCriterion("addr_town_name in", values, "addrTownName");
            return (Criteria) this;
        }

        public Criteria andAddrTownNameNotIn(List<String> values) {
            addCriterion("addr_town_name not in", values, "addrTownName");
            return (Criteria) this;
        }

        public Criteria andAddrTownNameBetween(String value1, String value2) {
            addCriterion("addr_town_name between", value1, value2, "addrTownName");
            return (Criteria) this;
        }

        public Criteria andAddrTownNameNotBetween(String value1, String value2) {
            addCriterion("addr_town_name not between", value1, value2, "addrTownName");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeIsNull() {
            addCriterion("consignee_postcode is null");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeIsNotNull() {
            addCriterion("consignee_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeEqualTo(String value) {
            addCriterion("consignee_postcode =", value, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeNotEqualTo(String value) {
            addCriterion("consignee_postcode <>", value, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeGreaterThan(String value) {
            addCriterion("consignee_postcode >", value, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_postcode >=", value, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeLessThan(String value) {
            addCriterion("consignee_postcode <", value, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeLessThanOrEqualTo(String value) {
            addCriterion("consignee_postcode <=", value, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeLike(String value) {
            addCriterion("consignee_postcode like", value, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeNotLike(String value) {
            addCriterion("consignee_postcode not like", value, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeIn(List<String> values) {
            addCriterion("consignee_postcode in", values, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeNotIn(List<String> values) {
            addCriterion("consignee_postcode not in", values, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeBetween(String value1, String value2) {
            addCriterion("consignee_postcode between", value1, value2, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeNotBetween(String value1, String value2) {
            addCriterion("consignee_postcode not between", value1, value2, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileIsNull() {
            addCriterion("consignee_mobile is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileIsNotNull() {
            addCriterion("consignee_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileEqualTo(String value) {
            addCriterion("consignee_mobile =", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileNotEqualTo(String value) {
            addCriterion("consignee_mobile <>", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileGreaterThan(String value) {
            addCriterion("consignee_mobile >", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_mobile >=", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileLessThan(String value) {
            addCriterion("consignee_mobile <", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileLessThanOrEqualTo(String value) {
            addCriterion("consignee_mobile <=", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileLike(String value) {
            addCriterion("consignee_mobile like", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileNotLike(String value) {
            addCriterion("consignee_mobile not like", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileIn(List<String> values) {
            addCriterion("consignee_mobile in", values, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileNotIn(List<String> values) {
            addCriterion("consignee_mobile not in", values, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileBetween(String value1, String value2) {
            addCriterion("consignee_mobile between", value1, value2, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileNotBetween(String value1, String value2) {
            addCriterion("consignee_mobile not between", value1, value2, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneIsNull() {
            addCriterion("consignee_phone is null");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneIsNotNull() {
            addCriterion("consignee_phone is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneEqualTo(String value) {
            addCriterion("consignee_phone =", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneNotEqualTo(String value) {
            addCriterion("consignee_phone <>", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneGreaterThan(String value) {
            addCriterion("consignee_phone >", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_phone >=", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneLessThan(String value) {
            addCriterion("consignee_phone <", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneLessThanOrEqualTo(String value) {
            addCriterion("consignee_phone <=", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneLike(String value) {
            addCriterion("consignee_phone like", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneNotLike(String value) {
            addCriterion("consignee_phone not like", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneIn(List<String> values) {
            addCriterion("consignee_phone in", values, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneNotIn(List<String> values) {
            addCriterion("consignee_phone not in", values, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneBetween(String value1, String value2) {
            addCriterion("consignee_phone between", value1, value2, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneNotBetween(String value1, String value2) {
            addCriterion("consignee_phone not between", value1, value2, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailIsNull() {
            addCriterion("consignee_email is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailIsNotNull() {
            addCriterion("consignee_email is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailEqualTo(String value) {
            addCriterion("consignee_email =", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailNotEqualTo(String value) {
            addCriterion("consignee_email <>", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailGreaterThan(String value) {
            addCriterion("consignee_email >", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_email >=", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailLessThan(String value) {
            addCriterion("consignee_email <", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailLessThanOrEqualTo(String value) {
            addCriterion("consignee_email <=", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailLike(String value) {
            addCriterion("consignee_email like", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailNotLike(String value) {
            addCriterion("consignee_email not like", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailIn(List<String> values) {
            addCriterion("consignee_email in", values, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailNotIn(List<String> values) {
            addCriterion("consignee_email not in", values, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailBetween(String value1, String value2) {
            addCriterion("consignee_email between", value1, value2, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailNotBetween(String value1, String value2) {
            addCriterion("consignee_email not between", value1, value2, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkIsNull() {
            addCriterion("consignee_remark is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkIsNotNull() {
            addCriterion("consignee_remark is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkEqualTo(String value) {
            addCriterion("consignee_remark =", value, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkNotEqualTo(String value) {
            addCriterion("consignee_remark <>", value, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkGreaterThan(String value) {
            addCriterion("consignee_remark >", value, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_remark >=", value, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkLessThan(String value) {
            addCriterion("consignee_remark <", value, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkLessThanOrEqualTo(String value) {
            addCriterion("consignee_remark <=", value, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkLike(String value) {
            addCriterion("consignee_remark like", value, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkNotLike(String value) {
            addCriterion("consignee_remark not like", value, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkIn(List<String> values) {
            addCriterion("consignee_remark in", values, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkNotIn(List<String> values) {
            addCriterion("consignee_remark not in", values, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkBetween(String value1, String value2) {
            addCriterion("consignee_remark between", value1, value2, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkNotBetween(String value1, String value2) {
            addCriterion("consignee_remark not between", value1, value2, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(String value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(String value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(String value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(String value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(String value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLike(String value) {
            addCriterion("payment like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotLike(String value) {
            addCriterion("payment not like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<String> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<String> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(String value1, String value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(String value1, String value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPayRemarkIsNull() {
            addCriterion("pay_remark is null");
            return (Criteria) this;
        }

        public Criteria andPayRemarkIsNotNull() {
            addCriterion("pay_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPayRemarkEqualTo(String value) {
            addCriterion("pay_remark =", value, "payRemark");
            return (Criteria) this;
        }

        public Criteria andPayRemarkNotEqualTo(String value) {
            addCriterion("pay_remark <>", value, "payRemark");
            return (Criteria) this;
        }

        public Criteria andPayRemarkGreaterThan(String value) {
            addCriterion("pay_remark >", value, "payRemark");
            return (Criteria) this;
        }

        public Criteria andPayRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pay_remark >=", value, "payRemark");
            return (Criteria) this;
        }

        public Criteria andPayRemarkLessThan(String value) {
            addCriterion("pay_remark <", value, "payRemark");
            return (Criteria) this;
        }

        public Criteria andPayRemarkLessThanOrEqualTo(String value) {
            addCriterion("pay_remark <=", value, "payRemark");
            return (Criteria) this;
        }

        public Criteria andPayRemarkLike(String value) {
            addCriterion("pay_remark like", value, "payRemark");
            return (Criteria) this;
        }

        public Criteria andPayRemarkNotLike(String value) {
            addCriterion("pay_remark not like", value, "payRemark");
            return (Criteria) this;
        }

        public Criteria andPayRemarkIn(List<String> values) {
            addCriterion("pay_remark in", values, "payRemark");
            return (Criteria) this;
        }

        public Criteria andPayRemarkNotIn(List<String> values) {
            addCriterion("pay_remark not in", values, "payRemark");
            return (Criteria) this;
        }

        public Criteria andPayRemarkBetween(String value1, String value2) {
            addCriterion("pay_remark between", value1, value2, "payRemark");
            return (Criteria) this;
        }

        public Criteria andPayRemarkNotBetween(String value1, String value2) {
            addCriterion("pay_remark not between", value1, value2, "payRemark");
            return (Criteria) this;
        }

        public Criteria andPaySuredateIsNull() {
            addCriterion("pay_suredate is null");
            return (Criteria) this;
        }

        public Criteria andPaySuredateIsNotNull() {
            addCriterion("pay_suredate is not null");
            return (Criteria) this;
        }

        public Criteria andPaySuredateEqualTo(Date value) {
            addCriterion("pay_suredate =", value, "paySuredate");
            return (Criteria) this;
        }

        public Criteria andPaySuredateNotEqualTo(Date value) {
            addCriterion("pay_suredate <>", value, "paySuredate");
            return (Criteria) this;
        }

        public Criteria andPaySuredateGreaterThan(Date value) {
            addCriterion("pay_suredate >", value, "paySuredate");
            return (Criteria) this;
        }

        public Criteria andPaySuredateGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_suredate >=", value, "paySuredate");
            return (Criteria) this;
        }

        public Criteria andPaySuredateLessThan(Date value) {
            addCriterion("pay_suredate <", value, "paySuredate");
            return (Criteria) this;
        }

        public Criteria andPaySuredateLessThanOrEqualTo(Date value) {
            addCriterion("pay_suredate <=", value, "paySuredate");
            return (Criteria) this;
        }

        public Criteria andPaySuredateIn(List<Date> values) {
            addCriterion("pay_suredate in", values, "paySuredate");
            return (Criteria) this;
        }

        public Criteria andPaySuredateNotIn(List<Date> values) {
            addCriterion("pay_suredate not in", values, "paySuredate");
            return (Criteria) this;
        }

        public Criteria andPaySuredateBetween(Date value1, Date value2) {
            addCriterion("pay_suredate between", value1, value2, "paySuredate");
            return (Criteria) this;
        }

        public Criteria andPaySuredateNotBetween(Date value1, Date value2) {
            addCriterion("pay_suredate not between", value1, value2, "paySuredate");
            return (Criteria) this;
        }

        public Criteria andSendpaySimpleIsNull() {
            addCriterion("sendpay_simple is null");
            return (Criteria) this;
        }

        public Criteria andSendpaySimpleIsNotNull() {
            addCriterion("sendpay_simple is not null");
            return (Criteria) this;
        }

        public Criteria andSendpaySimpleEqualTo(String value) {
            addCriterion("sendpay_simple =", value, "sendpaySimple");
            return (Criteria) this;
        }

        public Criteria andSendpaySimpleNotEqualTo(String value) {
            addCriterion("sendpay_simple <>", value, "sendpaySimple");
            return (Criteria) this;
        }

        public Criteria andSendpaySimpleGreaterThan(String value) {
            addCriterion("sendpay_simple >", value, "sendpaySimple");
            return (Criteria) this;
        }

        public Criteria andSendpaySimpleGreaterThanOrEqualTo(String value) {
            addCriterion("sendpay_simple >=", value, "sendpaySimple");
            return (Criteria) this;
        }

        public Criteria andSendpaySimpleLessThan(String value) {
            addCriterion("sendpay_simple <", value, "sendpaySimple");
            return (Criteria) this;
        }

        public Criteria andSendpaySimpleLessThanOrEqualTo(String value) {
            addCriterion("sendpay_simple <=", value, "sendpaySimple");
            return (Criteria) this;
        }

        public Criteria andSendpaySimpleLike(String value) {
            addCriterion("sendpay_simple like", value, "sendpaySimple");
            return (Criteria) this;
        }

        public Criteria andSendpaySimpleNotLike(String value) {
            addCriterion("sendpay_simple not like", value, "sendpaySimple");
            return (Criteria) this;
        }

        public Criteria andSendpaySimpleIn(List<String> values) {
            addCriterion("sendpay_simple in", values, "sendpaySimple");
            return (Criteria) this;
        }

        public Criteria andSendpaySimpleNotIn(List<String> values) {
            addCriterion("sendpay_simple not in", values, "sendpaySimple");
            return (Criteria) this;
        }

        public Criteria andSendpaySimpleBetween(String value1, String value2) {
            addCriterion("sendpay_simple between", value1, value2, "sendpaySimple");
            return (Criteria) this;
        }

        public Criteria andSendpaySimpleNotBetween(String value1, String value2) {
            addCriterion("sendpay_simple not between", value1, value2, "sendpaySimple");
            return (Criteria) this;
        }

        public Criteria andSendpayWholeIsNull() {
            addCriterion("sendpay_whole is null");
            return (Criteria) this;
        }

        public Criteria andSendpayWholeIsNotNull() {
            addCriterion("sendpay_whole is not null");
            return (Criteria) this;
        }

        public Criteria andSendpayWholeEqualTo(String value) {
            addCriterion("sendpay_whole =", value, "sendpayWhole");
            return (Criteria) this;
        }

        public Criteria andSendpayWholeNotEqualTo(String value) {
            addCriterion("sendpay_whole <>", value, "sendpayWhole");
            return (Criteria) this;
        }

        public Criteria andSendpayWholeGreaterThan(String value) {
            addCriterion("sendpay_whole >", value, "sendpayWhole");
            return (Criteria) this;
        }

        public Criteria andSendpayWholeGreaterThanOrEqualTo(String value) {
            addCriterion("sendpay_whole >=", value, "sendpayWhole");
            return (Criteria) this;
        }

        public Criteria andSendpayWholeLessThan(String value) {
            addCriterion("sendpay_whole <", value, "sendpayWhole");
            return (Criteria) this;
        }

        public Criteria andSendpayWholeLessThanOrEqualTo(String value) {
            addCriterion("sendpay_whole <=", value, "sendpayWhole");
            return (Criteria) this;
        }

        public Criteria andSendpayWholeLike(String value) {
            addCriterion("sendpay_whole like", value, "sendpayWhole");
            return (Criteria) this;
        }

        public Criteria andSendpayWholeNotLike(String value) {
            addCriterion("sendpay_whole not like", value, "sendpayWhole");
            return (Criteria) this;
        }

        public Criteria andSendpayWholeIn(List<String> values) {
            addCriterion("sendpay_whole in", values, "sendpayWhole");
            return (Criteria) this;
        }

        public Criteria andSendpayWholeNotIn(List<String> values) {
            addCriterion("sendpay_whole not in", values, "sendpayWhole");
            return (Criteria) this;
        }

        public Criteria andSendpayWholeBetween(String value1, String value2) {
            addCriterion("sendpay_whole between", value1, value2, "sendpayWhole");
            return (Criteria) this;
        }

        public Criteria andSendpayWholeNotBetween(String value1, String value2) {
            addCriterion("sendpay_whole not between", value1, value2, "sendpayWhole");
            return (Criteria) this;
        }

        public Criteria andPrintinfoIsNull() {
            addCriterion("printInfo is null");
            return (Criteria) this;
        }

        public Criteria andPrintinfoIsNotNull() {
            addCriterion("printInfo is not null");
            return (Criteria) this;
        }

        public Criteria andPrintinfoEqualTo(String value) {
            addCriterion("printInfo =", value, "printinfo");
            return (Criteria) this;
        }

        public Criteria andPrintinfoNotEqualTo(String value) {
            addCriterion("printInfo <>", value, "printinfo");
            return (Criteria) this;
        }

        public Criteria andPrintinfoGreaterThan(String value) {
            addCriterion("printInfo >", value, "printinfo");
            return (Criteria) this;
        }

        public Criteria andPrintinfoGreaterThanOrEqualTo(String value) {
            addCriterion("printInfo >=", value, "printinfo");
            return (Criteria) this;
        }

        public Criteria andPrintinfoLessThan(String value) {
            addCriterion("printInfo <", value, "printinfo");
            return (Criteria) this;
        }

        public Criteria andPrintinfoLessThanOrEqualTo(String value) {
            addCriterion("printInfo <=", value, "printinfo");
            return (Criteria) this;
        }

        public Criteria andPrintinfoLike(String value) {
            addCriterion("printInfo like", value, "printinfo");
            return (Criteria) this;
        }

        public Criteria andPrintinfoNotLike(String value) {
            addCriterion("printInfo not like", value, "printinfo");
            return (Criteria) this;
        }

        public Criteria andPrintinfoIn(List<String> values) {
            addCriterion("printInfo in", values, "printinfo");
            return (Criteria) this;
        }

        public Criteria andPrintinfoNotIn(List<String> values) {
            addCriterion("printInfo not in", values, "printinfo");
            return (Criteria) this;
        }

        public Criteria andPrintinfoBetween(String value1, String value2) {
            addCriterion("printInfo between", value1, value2, "printinfo");
            return (Criteria) this;
        }

        public Criteria andPrintinfoNotBetween(String value1, String value2) {
            addCriterion("printInfo not between", value1, value2, "printinfo");
            return (Criteria) this;
        }

        public Criteria andCarrierNoIsNull() {
            addCriterion("carrier_no is null");
            return (Criteria) this;
        }

        public Criteria andCarrierNoIsNotNull() {
            addCriterion("carrier_no is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierNoEqualTo(String value) {
            addCriterion("carrier_no =", value, "carrierNo");
            return (Criteria) this;
        }

        public Criteria andCarrierNoNotEqualTo(String value) {
            addCriterion("carrier_no <>", value, "carrierNo");
            return (Criteria) this;
        }

        public Criteria andCarrierNoGreaterThan(String value) {
            addCriterion("carrier_no >", value, "carrierNo");
            return (Criteria) this;
        }

        public Criteria andCarrierNoGreaterThanOrEqualTo(String value) {
            addCriterion("carrier_no >=", value, "carrierNo");
            return (Criteria) this;
        }

        public Criteria andCarrierNoLessThan(String value) {
            addCriterion("carrier_no <", value, "carrierNo");
            return (Criteria) this;
        }

        public Criteria andCarrierNoLessThanOrEqualTo(String value) {
            addCriterion("carrier_no <=", value, "carrierNo");
            return (Criteria) this;
        }

        public Criteria andCarrierNoLike(String value) {
            addCriterion("carrier_no like", value, "carrierNo");
            return (Criteria) this;
        }

        public Criteria andCarrierNoNotLike(String value) {
            addCriterion("carrier_no not like", value, "carrierNo");
            return (Criteria) this;
        }

        public Criteria andCarrierNoIn(List<String> values) {
            addCriterion("carrier_no in", values, "carrierNo");
            return (Criteria) this;
        }

        public Criteria andCarrierNoNotIn(List<String> values) {
            addCriterion("carrier_no not in", values, "carrierNo");
            return (Criteria) this;
        }

        public Criteria andCarrierNoBetween(String value1, String value2) {
            addCriterion("carrier_no between", value1, value2, "carrierNo");
            return (Criteria) this;
        }

        public Criteria andCarrierNoNotBetween(String value1, String value2) {
            addCriterion("carrier_no not between", value1, value2, "carrierNo");
            return (Criteria) this;
        }

        public Criteria andCarrierNameIsNull() {
            addCriterion("carrier_name is null");
            return (Criteria) this;
        }

        public Criteria andCarrierNameIsNotNull() {
            addCriterion("carrier_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierNameEqualTo(String value) {
            addCriterion("carrier_name =", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotEqualTo(String value) {
            addCriterion("carrier_name <>", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameGreaterThan(String value) {
            addCriterion("carrier_name >", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameGreaterThanOrEqualTo(String value) {
            addCriterion("carrier_name >=", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLessThan(String value) {
            addCriterion("carrier_name <", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLessThanOrEqualTo(String value) {
            addCriterion("carrier_name <=", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLike(String value) {
            addCriterion("carrier_name like", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotLike(String value) {
            addCriterion("carrier_name not like", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameIn(List<String> values) {
            addCriterion("carrier_name in", values, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotIn(List<String> values) {
            addCriterion("carrier_name not in", values, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameBetween(String value1, String value2) {
            addCriterion("carrier_name between", value1, value2, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotBetween(String value1, String value2) {
            addCriterion("carrier_name not between", value1, value2, "carrierName");
            return (Criteria) this;
        }

        public Criteria andDiIsNull() {
            addCriterion("di is null");
            return (Criteria) this;
        }

        public Criteria andDiIsNotNull() {
            addCriterion("di is not null");
            return (Criteria) this;
        }

        public Criteria andDiEqualTo(String value) {
            addCriterion("di =", value, "di");
            return (Criteria) this;
        }

        public Criteria andDiNotEqualTo(String value) {
            addCriterion("di <>", value, "di");
            return (Criteria) this;
        }

        public Criteria andDiGreaterThan(String value) {
            addCriterion("di >", value, "di");
            return (Criteria) this;
        }

        public Criteria andDiGreaterThanOrEqualTo(String value) {
            addCriterion("di >=", value, "di");
            return (Criteria) this;
        }

        public Criteria andDiLessThan(String value) {
            addCriterion("di <", value, "di");
            return (Criteria) this;
        }

        public Criteria andDiLessThanOrEqualTo(String value) {
            addCriterion("di <=", value, "di");
            return (Criteria) this;
        }

        public Criteria andDiLike(String value) {
            addCriterion("di like", value, "di");
            return (Criteria) this;
        }

        public Criteria andDiNotLike(String value) {
            addCriterion("di not like", value, "di");
            return (Criteria) this;
        }

        public Criteria andDiIn(List<String> values) {
            addCriterion("di in", values, "di");
            return (Criteria) this;
        }

        public Criteria andDiNotIn(List<String> values) {
            addCriterion("di not in", values, "di");
            return (Criteria) this;
        }

        public Criteria andDiBetween(String value1, String value2) {
            addCriterion("di between", value1, value2, "di");
            return (Criteria) this;
        }

        public Criteria andDiNotBetween(String value1, String value2) {
            addCriterion("di not between", value1, value2, "di");
            return (Criteria) this;
        }

        public Criteria andFactPriceIsNull() {
            addCriterion("fact_price is null");
            return (Criteria) this;
        }

        public Criteria andFactPriceIsNotNull() {
            addCriterion("fact_price is not null");
            return (Criteria) this;
        }

        public Criteria andFactPriceEqualTo(BigDecimal value) {
            addCriterion("fact_price =", value, "factPrice");
            return (Criteria) this;
        }

        public Criteria andFactPriceNotEqualTo(BigDecimal value) {
            addCriterion("fact_price <>", value, "factPrice");
            return (Criteria) this;
        }

        public Criteria andFactPriceGreaterThan(BigDecimal value) {
            addCriterion("fact_price >", value, "factPrice");
            return (Criteria) this;
        }

        public Criteria andFactPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fact_price >=", value, "factPrice");
            return (Criteria) this;
        }

        public Criteria andFactPriceLessThan(BigDecimal value) {
            addCriterion("fact_price <", value, "factPrice");
            return (Criteria) this;
        }

        public Criteria andFactPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fact_price <=", value, "factPrice");
            return (Criteria) this;
        }

        public Criteria andFactPriceIn(List<BigDecimal> values) {
            addCriterion("fact_price in", values, "factPrice");
            return (Criteria) this;
        }

        public Criteria andFactPriceNotIn(List<BigDecimal> values) {
            addCriterion("fact_price not in", values, "factPrice");
            return (Criteria) this;
        }

        public Criteria andFactPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fact_price between", value1, value2, "factPrice");
            return (Criteria) this;
        }

        public Criteria andFactPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fact_price not between", value1, value2, "factPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(BigDecimal value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(BigDecimal value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<BigDecimal> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIsJdshipIsNull() {
            addCriterion("is_jdship is null");
            return (Criteria) this;
        }

        public Criteria andIsJdshipIsNotNull() {
            addCriterion("is_jdship is not null");
            return (Criteria) this;
        }

        public Criteria andIsJdshipEqualTo(String value) {
            addCriterion("is_jdship =", value, "isJdship");
            return (Criteria) this;
        }

        public Criteria andIsJdshipNotEqualTo(String value) {
            addCriterion("is_jdship <>", value, "isJdship");
            return (Criteria) this;
        }

        public Criteria andIsJdshipGreaterThan(String value) {
            addCriterion("is_jdship >", value, "isJdship");
            return (Criteria) this;
        }

        public Criteria andIsJdshipGreaterThanOrEqualTo(String value) {
            addCriterion("is_jdship >=", value, "isJdship");
            return (Criteria) this;
        }

        public Criteria andIsJdshipLessThan(String value) {
            addCriterion("is_jdship <", value, "isJdship");
            return (Criteria) this;
        }

        public Criteria andIsJdshipLessThanOrEqualTo(String value) {
            addCriterion("is_jdship <=", value, "isJdship");
            return (Criteria) this;
        }

        public Criteria andIsJdshipLike(String value) {
            addCriterion("is_jdship like", value, "isJdship");
            return (Criteria) this;
        }

        public Criteria andIsJdshipNotLike(String value) {
            addCriterion("is_jdship not like", value, "isJdship");
            return (Criteria) this;
        }

        public Criteria andIsJdshipIn(List<String> values) {
            addCriterion("is_jdship in", values, "isJdship");
            return (Criteria) this;
        }

        public Criteria andIsJdshipNotIn(List<String> values) {
            addCriterion("is_jdship not in", values, "isJdship");
            return (Criteria) this;
        }

        public Criteria andIsJdshipBetween(String value1, String value2) {
            addCriterion("is_jdship between", value1, value2, "isJdship");
            return (Criteria) this;
        }

        public Criteria andIsJdshipNotBetween(String value1, String value2) {
            addCriterion("is_jdship not between", value1, value2, "isJdship");
            return (Criteria) this;
        }

        public Criteria andJdshipIsNull() {
            addCriterion("jdship is null");
            return (Criteria) this;
        }

        public Criteria andJdshipIsNotNull() {
            addCriterion("jdship is not null");
            return (Criteria) this;
        }

        public Criteria andJdshipEqualTo(String value) {
            addCriterion("jdship =", value, "jdship");
            return (Criteria) this;
        }

        public Criteria andJdshipNotEqualTo(String value) {
            addCriterion("jdship <>", value, "jdship");
            return (Criteria) this;
        }

        public Criteria andJdshipGreaterThan(String value) {
            addCriterion("jdship >", value, "jdship");
            return (Criteria) this;
        }

        public Criteria andJdshipGreaterThanOrEqualTo(String value) {
            addCriterion("jdship >=", value, "jdship");
            return (Criteria) this;
        }

        public Criteria andJdshipLessThan(String value) {
            addCriterion("jdship <", value, "jdship");
            return (Criteria) this;
        }

        public Criteria andJdshipLessThanOrEqualTo(String value) {
            addCriterion("jdship <=", value, "jdship");
            return (Criteria) this;
        }

        public Criteria andJdshipLike(String value) {
            addCriterion("jdship like", value, "jdship");
            return (Criteria) this;
        }

        public Criteria andJdshipNotLike(String value) {
            addCriterion("jdship not like", value, "jdship");
            return (Criteria) this;
        }

        public Criteria andJdshipIn(List<String> values) {
            addCriterion("jdship in", values, "jdship");
            return (Criteria) this;
        }

        public Criteria andJdshipNotIn(List<String> values) {
            addCriterion("jdship not in", values, "jdship");
            return (Criteria) this;
        }

        public Criteria andJdshipBetween(String value1, String value2) {
            addCriterion("jdship between", value1, value2, "jdship");
            return (Criteria) this;
        }

        public Criteria andJdshipNotBetween(String value1, String value2) {
            addCriterion("jdship not between", value1, value2, "jdship");
            return (Criteria) this;
        }

        public Criteria andJsonstrIsNull() {
            addCriterion("jsonStr is null");
            return (Criteria) this;
        }

        public Criteria andJsonstrIsNotNull() {
            addCriterion("jsonStr is not null");
            return (Criteria) this;
        }

        public Criteria andJsonstrEqualTo(String value) {
            addCriterion("jsonStr =", value, "jsonstr");
            return (Criteria) this;
        }

        public Criteria andJsonstrNotEqualTo(String value) {
            addCriterion("jsonStr <>", value, "jsonstr");
            return (Criteria) this;
        }

        public Criteria andJsonstrGreaterThan(String value) {
            addCriterion("jsonStr >", value, "jsonstr");
            return (Criteria) this;
        }

        public Criteria andJsonstrGreaterThanOrEqualTo(String value) {
            addCriterion("jsonStr >=", value, "jsonstr");
            return (Criteria) this;
        }

        public Criteria andJsonstrLessThan(String value) {
            addCriterion("jsonStr <", value, "jsonstr");
            return (Criteria) this;
        }

        public Criteria andJsonstrLessThanOrEqualTo(String value) {
            addCriterion("jsonStr <=", value, "jsonstr");
            return (Criteria) this;
        }

        public Criteria andJsonstrLike(String value) {
            addCriterion("jsonStr like", value, "jsonstr");
            return (Criteria) this;
        }

        public Criteria andJsonstrNotLike(String value) {
            addCriterion("jsonStr not like", value, "jsonstr");
            return (Criteria) this;
        }

        public Criteria andJsonstrIn(List<String> values) {
            addCriterion("jsonStr in", values, "jsonstr");
            return (Criteria) this;
        }

        public Criteria andJsonstrNotIn(List<String> values) {
            addCriterion("jsonStr not in", values, "jsonstr");
            return (Criteria) this;
        }

        public Criteria andJsonstrBetween(String value1, String value2) {
            addCriterion("jsonStr between", value1, value2, "jsonstr");
            return (Criteria) this;
        }

        public Criteria andJsonstrNotBetween(String value1, String value2) {
            addCriterion("jsonStr not between", value1, value2, "jsonstr");
            return (Criteria) this;
        }

        public Criteria andPrintinfoFlagIsNull() {
            addCriterion("printInfo_flag is null");
            return (Criteria) this;
        }

        public Criteria andPrintinfoFlagIsNotNull() {
            addCriterion("printInfo_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPrintinfoFlagEqualTo(String value) {
            addCriterion("printInfo_flag =", value, "printinfoFlag");
            return (Criteria) this;
        }

        public Criteria andPrintinfoFlagNotEqualTo(String value) {
            addCriterion("printInfo_flag <>", value, "printinfoFlag");
            return (Criteria) this;
        }

        public Criteria andPrintinfoFlagGreaterThan(String value) {
            addCriterion("printInfo_flag >", value, "printinfoFlag");
            return (Criteria) this;
        }

        public Criteria andPrintinfoFlagGreaterThanOrEqualTo(String value) {
            addCriterion("printInfo_flag >=", value, "printinfoFlag");
            return (Criteria) this;
        }

        public Criteria andPrintinfoFlagLessThan(String value) {
            addCriterion("printInfo_flag <", value, "printinfoFlag");
            return (Criteria) this;
        }

        public Criteria andPrintinfoFlagLessThanOrEqualTo(String value) {
            addCriterion("printInfo_flag <=", value, "printinfoFlag");
            return (Criteria) this;
        }

        public Criteria andPrintinfoFlagLike(String value) {
            addCriterion("printInfo_flag like", value, "printinfoFlag");
            return (Criteria) this;
        }

        public Criteria andPrintinfoFlagNotLike(String value) {
            addCriterion("printInfo_flag not like", value, "printinfoFlag");
            return (Criteria) this;
        }

        public Criteria andPrintinfoFlagIn(List<String> values) {
            addCriterion("printInfo_flag in", values, "printinfoFlag");
            return (Criteria) this;
        }

        public Criteria andPrintinfoFlagNotIn(List<String> values) {
            addCriterion("printInfo_flag not in", values, "printinfoFlag");
            return (Criteria) this;
        }

        public Criteria andPrintinfoFlagBetween(String value1, String value2) {
            addCriterion("printInfo_flag between", value1, value2, "printinfoFlag");
            return (Criteria) this;
        }

        public Criteria andPrintinfoFlagNotBetween(String value1, String value2) {
            addCriterion("printInfo_flag not between", value1, value2, "printinfoFlag");
            return (Criteria) this;
        }

        public Criteria andPrintFlagIsNull() {
            addCriterion("print_flag is null");
            return (Criteria) this;
        }

        public Criteria andPrintFlagIsNotNull() {
            addCriterion("print_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPrintFlagEqualTo(String value) {
            addCriterion("print_flag =", value, "printFlag");
            return (Criteria) this;
        }

        public Criteria andPrintFlagNotEqualTo(String value) {
            addCriterion("print_flag <>", value, "printFlag");
            return (Criteria) this;
        }

        public Criteria andPrintFlagGreaterThan(String value) {
            addCriterion("print_flag >", value, "printFlag");
            return (Criteria) this;
        }

        public Criteria andPrintFlagGreaterThanOrEqualTo(String value) {
            addCriterion("print_flag >=", value, "printFlag");
            return (Criteria) this;
        }

        public Criteria andPrintFlagLessThan(String value) {
            addCriterion("print_flag <", value, "printFlag");
            return (Criteria) this;
        }

        public Criteria andPrintFlagLessThanOrEqualTo(String value) {
            addCriterion("print_flag <=", value, "printFlag");
            return (Criteria) this;
        }

        public Criteria andPrintFlagLike(String value) {
            addCriterion("print_flag like", value, "printFlag");
            return (Criteria) this;
        }

        public Criteria andPrintFlagNotLike(String value) {
            addCriterion("print_flag not like", value, "printFlag");
            return (Criteria) this;
        }

        public Criteria andPrintFlagIn(List<String> values) {
            addCriterion("print_flag in", values, "printFlag");
            return (Criteria) this;
        }

        public Criteria andPrintFlagNotIn(List<String> values) {
            addCriterion("print_flag not in", values, "printFlag");
            return (Criteria) this;
        }

        public Criteria andPrintFlagBetween(String value1, String value2) {
            addCriterion("print_flag between", value1, value2, "printFlag");
            return (Criteria) this;
        }

        public Criteria andPrintFlagNotBetween(String value1, String value2) {
            addCriterion("print_flag not between", value1, value2, "printFlag");
            return (Criteria) this;
        }

        public Criteria andPrintxIsNull() {
            addCriterion("printx is null");
            return (Criteria) this;
        }

        public Criteria andPrintxIsNotNull() {
            addCriterion("printx is not null");
            return (Criteria) this;
        }

        public Criteria andPrintxEqualTo(String value) {
            addCriterion("printx =", value, "printx");
            return (Criteria) this;
        }

        public Criteria andPrintxNotEqualTo(String value) {
            addCriterion("printx <>", value, "printx");
            return (Criteria) this;
        }

        public Criteria andPrintxGreaterThan(String value) {
            addCriterion("printx >", value, "printx");
            return (Criteria) this;
        }

        public Criteria andPrintxGreaterThanOrEqualTo(String value) {
            addCriterion("printx >=", value, "printx");
            return (Criteria) this;
        }

        public Criteria andPrintxLessThan(String value) {
            addCriterion("printx <", value, "printx");
            return (Criteria) this;
        }

        public Criteria andPrintxLessThanOrEqualTo(String value) {
            addCriterion("printx <=", value, "printx");
            return (Criteria) this;
        }

        public Criteria andPrintxLike(String value) {
            addCriterion("printx like", value, "printx");
            return (Criteria) this;
        }

        public Criteria andPrintxNotLike(String value) {
            addCriterion("printx not like", value, "printx");
            return (Criteria) this;
        }

        public Criteria andPrintxIn(List<String> values) {
            addCriterion("printx in", values, "printx");
            return (Criteria) this;
        }

        public Criteria andPrintxNotIn(List<String> values) {
            addCriterion("printx not in", values, "printx");
            return (Criteria) this;
        }

        public Criteria andPrintxBetween(String value1, String value2) {
            addCriterion("printx between", value1, value2, "printx");
            return (Criteria) this;
        }

        public Criteria andPrintxNotBetween(String value1, String value2) {
            addCriterion("printx not between", value1, value2, "printx");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andState2IsNull() {
            addCriterion("state2 is null");
            return (Criteria) this;
        }

        public Criteria andState2IsNotNull() {
            addCriterion("state2 is not null");
            return (Criteria) this;
        }

        public Criteria andState2EqualTo(String value) {
            addCriterion("state2 =", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2NotEqualTo(String value) {
            addCriterion("state2 <>", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2GreaterThan(String value) {
            addCriterion("state2 >", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2GreaterThanOrEqualTo(String value) {
            addCriterion("state2 >=", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2LessThan(String value) {
            addCriterion("state2 <", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2LessThanOrEqualTo(String value) {
            addCriterion("state2 <=", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2Like(String value) {
            addCriterion("state2 like", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2NotLike(String value) {
            addCriterion("state2 not like", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2In(List<String> values) {
            addCriterion("state2 in", values, "state2");
            return (Criteria) this;
        }

        public Criteria andState2NotIn(List<String> values) {
            addCriterion("state2 not in", values, "state2");
            return (Criteria) this;
        }

        public Criteria andState2Between(String value1, String value2) {
            addCriterion("state2 between", value1, value2, "state2");
            return (Criteria) this;
        }

        public Criteria andState2NotBetween(String value1, String value2) {
            addCriterion("state2 not between", value1, value2, "state2");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andChannelsOutboundNoIsNull() {
            addCriterion("channels_outbound_no is null");
            return (Criteria) this;
        }

        public Criteria andChannelsOutboundNoIsNotNull() {
            addCriterion("channels_outbound_no is not null");
            return (Criteria) this;
        }

        public Criteria andChannelsOutboundNoEqualTo(String value) {
            addCriterion("channels_outbound_no =", value, "channelsOutboundNo");
            return (Criteria) this;
        }

        public Criteria andChannelsOutboundNoNotEqualTo(String value) {
            addCriterion("channels_outbound_no <>", value, "channelsOutboundNo");
            return (Criteria) this;
        }

        public Criteria andChannelsOutboundNoGreaterThan(String value) {
            addCriterion("channels_outbound_no >", value, "channelsOutboundNo");
            return (Criteria) this;
        }

        public Criteria andChannelsOutboundNoGreaterThanOrEqualTo(String value) {
            addCriterion("channels_outbound_no >=", value, "channelsOutboundNo");
            return (Criteria) this;
        }

        public Criteria andChannelsOutboundNoLessThan(String value) {
            addCriterion("channels_outbound_no <", value, "channelsOutboundNo");
            return (Criteria) this;
        }

        public Criteria andChannelsOutboundNoLessThanOrEqualTo(String value) {
            addCriterion("channels_outbound_no <=", value, "channelsOutboundNo");
            return (Criteria) this;
        }

        public Criteria andChannelsOutboundNoLike(String value) {
            addCriterion("channels_outbound_no like", value, "channelsOutboundNo");
            return (Criteria) this;
        }

        public Criteria andChannelsOutboundNoNotLike(String value) {
            addCriterion("channels_outbound_no not like", value, "channelsOutboundNo");
            return (Criteria) this;
        }

        public Criteria andChannelsOutboundNoIn(List<String> values) {
            addCriterion("channels_outbound_no in", values, "channelsOutboundNo");
            return (Criteria) this;
        }

        public Criteria andChannelsOutboundNoNotIn(List<String> values) {
            addCriterion("channels_outbound_no not in", values, "channelsOutboundNo");
            return (Criteria) this;
        }

        public Criteria andChannelsOutboundNoBetween(String value1, String value2) {
            addCriterion("channels_outbound_no between", value1, value2, "channelsOutboundNo");
            return (Criteria) this;
        }

        public Criteria andChannelsOutboundNoNotBetween(String value1, String value2) {
            addCriterion("channels_outbound_no not between", value1, value2, "channelsOutboundNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andShopNoIsNull() {
            addCriterion("shop_no is null");
            return (Criteria) this;
        }

        public Criteria andShopNoIsNotNull() {
            addCriterion("shop_no is not null");
            return (Criteria) this;
        }

        public Criteria andShopNoEqualTo(String value) {
            addCriterion("shop_no =", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotEqualTo(String value) {
            addCriterion("shop_no <>", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoGreaterThan(String value) {
            addCriterion("shop_no >", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoGreaterThanOrEqualTo(String value) {
            addCriterion("shop_no >=", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLessThan(String value) {
            addCriterion("shop_no <", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLessThanOrEqualTo(String value) {
            addCriterion("shop_no <=", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLike(String value) {
            addCriterion("shop_no like", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotLike(String value) {
            addCriterion("shop_no not like", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoIn(List<String> values) {
            addCriterion("shop_no in", values, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotIn(List<String> values) {
            addCriterion("shop_no not in", values, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoBetween(String value1, String value2) {
            addCriterion("shop_no between", value1, value2, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotBetween(String value1, String value2) {
            addCriterion("shop_no not between", value1, value2, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShoporderCreatetimeIsNull() {
            addCriterion("shoporder_createtime is null");
            return (Criteria) this;
        }

        public Criteria andShoporderCreatetimeIsNotNull() {
            addCriterion("shoporder_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andShoporderCreatetimeEqualTo(Date value) {
            addCriterion("shoporder_createtime =", value, "shoporderCreatetime");
            return (Criteria) this;
        }

        public Criteria andShoporderCreatetimeNotEqualTo(Date value) {
            addCriterion("shoporder_createtime <>", value, "shoporderCreatetime");
            return (Criteria) this;
        }

        public Criteria andShoporderCreatetimeGreaterThan(Date value) {
            addCriterion("shoporder_createtime >", value, "shoporderCreatetime");
            return (Criteria) this;
        }

        public Criteria andShoporderCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shoporder_createtime >=", value, "shoporderCreatetime");
            return (Criteria) this;
        }

        public Criteria andShoporderCreatetimeLessThan(Date value) {
            addCriterion("shoporder_createtime <", value, "shoporderCreatetime");
            return (Criteria) this;
        }

        public Criteria andShoporderCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("shoporder_createtime <=", value, "shoporderCreatetime");
            return (Criteria) this;
        }

        public Criteria andShoporderCreatetimeIn(List<Date> values) {
            addCriterion("shoporder_createtime in", values, "shoporderCreatetime");
            return (Criteria) this;
        }

        public Criteria andShoporderCreatetimeNotIn(List<Date> values) {
            addCriterion("shoporder_createtime not in", values, "shoporderCreatetime");
            return (Criteria) this;
        }

        public Criteria andShoporderCreatetimeBetween(Date value1, Date value2) {
            addCriterion("shoporder_createtime between", value1, value2, "shoporderCreatetime");
            return (Criteria) this;
        }

        public Criteria andShoporderCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("shoporder_createtime not between", value1, value2, "shoporderCreatetime");
            return (Criteria) this;
        }

        public Criteria andShoporderSourceIsNull() {
            addCriterion("shoporder_source is null");
            return (Criteria) this;
        }

        public Criteria andShoporderSourceIsNotNull() {
            addCriterion("shoporder_source is not null");
            return (Criteria) this;
        }

        public Criteria andShoporderSourceEqualTo(String value) {
            addCriterion("shoporder_source =", value, "shoporderSource");
            return (Criteria) this;
        }

        public Criteria andShoporderSourceNotEqualTo(String value) {
            addCriterion("shoporder_source <>", value, "shoporderSource");
            return (Criteria) this;
        }

        public Criteria andShoporderSourceGreaterThan(String value) {
            addCriterion("shoporder_source >", value, "shoporderSource");
            return (Criteria) this;
        }

        public Criteria andShoporderSourceGreaterThanOrEqualTo(String value) {
            addCriterion("shoporder_source >=", value, "shoporderSource");
            return (Criteria) this;
        }

        public Criteria andShoporderSourceLessThan(String value) {
            addCriterion("shoporder_source <", value, "shoporderSource");
            return (Criteria) this;
        }

        public Criteria andShoporderSourceLessThanOrEqualTo(String value) {
            addCriterion("shoporder_source <=", value, "shoporderSource");
            return (Criteria) this;
        }

        public Criteria andShoporderSourceLike(String value) {
            addCriterion("shoporder_source like", value, "shoporderSource");
            return (Criteria) this;
        }

        public Criteria andShoporderSourceNotLike(String value) {
            addCriterion("shoporder_source not like", value, "shoporderSource");
            return (Criteria) this;
        }

        public Criteria andShoporderSourceIn(List<String> values) {
            addCriterion("shoporder_source in", values, "shoporderSource");
            return (Criteria) this;
        }

        public Criteria andShoporderSourceNotIn(List<String> values) {
            addCriterion("shoporder_source not in", values, "shoporderSource");
            return (Criteria) this;
        }

        public Criteria andShoporderSourceBetween(String value1, String value2) {
            addCriterion("shoporder_source between", value1, value2, "shoporderSource");
            return (Criteria) this;
        }

        public Criteria andShoporderSourceNotBetween(String value1, String value2) {
            addCriterion("shoporder_source not between", value1, value2, "shoporderSource");
            return (Criteria) this;
        }

        public Criteria andOrderMarkIsNull() {
            addCriterion("order_mark is null");
            return (Criteria) this;
        }

        public Criteria andOrderMarkIsNotNull() {
            addCriterion("order_mark is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMarkEqualTo(String value) {
            addCriterion("order_mark =", value, "orderMark");
            return (Criteria) this;
        }

        public Criteria andOrderMarkNotEqualTo(String value) {
            addCriterion("order_mark <>", value, "orderMark");
            return (Criteria) this;
        }

        public Criteria andOrderMarkGreaterThan(String value) {
            addCriterion("order_mark >", value, "orderMark");
            return (Criteria) this;
        }

        public Criteria andOrderMarkGreaterThanOrEqualTo(String value) {
            addCriterion("order_mark >=", value, "orderMark");
            return (Criteria) this;
        }

        public Criteria andOrderMarkLessThan(String value) {
            addCriterion("order_mark <", value, "orderMark");
            return (Criteria) this;
        }

        public Criteria andOrderMarkLessThanOrEqualTo(String value) {
            addCriterion("order_mark <=", value, "orderMark");
            return (Criteria) this;
        }

        public Criteria andOrderMarkLike(String value) {
            addCriterion("order_mark like", value, "orderMark");
            return (Criteria) this;
        }

        public Criteria andOrderMarkNotLike(String value) {
            addCriterion("order_mark not like", value, "orderMark");
            return (Criteria) this;
        }

        public Criteria andOrderMarkIn(List<String> values) {
            addCriterion("order_mark in", values, "orderMark");
            return (Criteria) this;
        }

        public Criteria andOrderMarkNotIn(List<String> values) {
            addCriterion("order_mark not in", values, "orderMark");
            return (Criteria) this;
        }

        public Criteria andOrderMarkBetween(String value1, String value2) {
            addCriterion("order_mark between", value1, value2, "orderMark");
            return (Criteria) this;
        }

        public Criteria andOrderMarkNotBetween(String value1, String value2) {
            addCriterion("order_mark not between", value1, value2, "orderMark");
            return (Criteria) this;
        }

        public Criteria andTransportWayIsNull() {
            addCriterion("transport_way is null");
            return (Criteria) this;
        }

        public Criteria andTransportWayIsNotNull() {
            addCriterion("transport_way is not null");
            return (Criteria) this;
        }

        public Criteria andTransportWayEqualTo(String value) {
            addCriterion("transport_way =", value, "transportWay");
            return (Criteria) this;
        }

        public Criteria andTransportWayNotEqualTo(String value) {
            addCriterion("transport_way <>", value, "transportWay");
            return (Criteria) this;
        }

        public Criteria andTransportWayGreaterThan(String value) {
            addCriterion("transport_way >", value, "transportWay");
            return (Criteria) this;
        }

        public Criteria andTransportWayGreaterThanOrEqualTo(String value) {
            addCriterion("transport_way >=", value, "transportWay");
            return (Criteria) this;
        }

        public Criteria andTransportWayLessThan(String value) {
            addCriterion("transport_way <", value, "transportWay");
            return (Criteria) this;
        }

        public Criteria andTransportWayLessThanOrEqualTo(String value) {
            addCriterion("transport_way <=", value, "transportWay");
            return (Criteria) this;
        }

        public Criteria andTransportWayLike(String value) {
            addCriterion("transport_way like", value, "transportWay");
            return (Criteria) this;
        }

        public Criteria andTransportWayNotLike(String value) {
            addCriterion("transport_way not like", value, "transportWay");
            return (Criteria) this;
        }

        public Criteria andTransportWayIn(List<String> values) {
            addCriterion("transport_way in", values, "transportWay");
            return (Criteria) this;
        }

        public Criteria andTransportWayNotIn(List<String> values) {
            addCriterion("transport_way not in", values, "transportWay");
            return (Criteria) this;
        }

        public Criteria andTransportWayBetween(String value1, String value2) {
            addCriterion("transport_way between", value1, value2, "transportWay");
            return (Criteria) this;
        }

        public Criteria andTransportWayNotBetween(String value1, String value2) {
            addCriterion("transport_way not between", value1, value2, "transportWay");
            return (Criteria) this;
        }

        public Criteria andPickerIsNull() {
            addCriterion("picker is null");
            return (Criteria) this;
        }

        public Criteria andPickerIsNotNull() {
            addCriterion("picker is not null");
            return (Criteria) this;
        }

        public Criteria andPickerEqualTo(String value) {
            addCriterion("picker =", value, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerNotEqualTo(String value) {
            addCriterion("picker <>", value, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerGreaterThan(String value) {
            addCriterion("picker >", value, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerGreaterThanOrEqualTo(String value) {
            addCriterion("picker >=", value, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerLessThan(String value) {
            addCriterion("picker <", value, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerLessThanOrEqualTo(String value) {
            addCriterion("picker <=", value, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerLike(String value) {
            addCriterion("picker like", value, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerNotLike(String value) {
            addCriterion("picker not like", value, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerIn(List<String> values) {
            addCriterion("picker in", values, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerNotIn(List<String> values) {
            addCriterion("picker not in", values, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerBetween(String value1, String value2) {
            addCriterion("picker between", value1, value2, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerNotBetween(String value1, String value2) {
            addCriterion("picker not between", value1, value2, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerCallIsNull() {
            addCriterion("picker_call is null");
            return (Criteria) this;
        }

        public Criteria andPickerCallIsNotNull() {
            addCriterion("picker_call is not null");
            return (Criteria) this;
        }

        public Criteria andPickerCallEqualTo(String value) {
            addCriterion("picker_call =", value, "pickerCall");
            return (Criteria) this;
        }

        public Criteria andPickerCallNotEqualTo(String value) {
            addCriterion("picker_call <>", value, "pickerCall");
            return (Criteria) this;
        }

        public Criteria andPickerCallGreaterThan(String value) {
            addCriterion("picker_call >", value, "pickerCall");
            return (Criteria) this;
        }

        public Criteria andPickerCallGreaterThanOrEqualTo(String value) {
            addCriterion("picker_call >=", value, "pickerCall");
            return (Criteria) this;
        }

        public Criteria andPickerCallLessThan(String value) {
            addCriterion("picker_call <", value, "pickerCall");
            return (Criteria) this;
        }

        public Criteria andPickerCallLessThanOrEqualTo(String value) {
            addCriterion("picker_call <=", value, "pickerCall");
            return (Criteria) this;
        }

        public Criteria andPickerCallLike(String value) {
            addCriterion("picker_call like", value, "pickerCall");
            return (Criteria) this;
        }

        public Criteria andPickerCallNotLike(String value) {
            addCriterion("picker_call not like", value, "pickerCall");
            return (Criteria) this;
        }

        public Criteria andPickerCallIn(List<String> values) {
            addCriterion("picker_call in", values, "pickerCall");
            return (Criteria) this;
        }

        public Criteria andPickerCallNotIn(List<String> values) {
            addCriterion("picker_call not in", values, "pickerCall");
            return (Criteria) this;
        }

        public Criteria andPickerCallBetween(String value1, String value2) {
            addCriterion("picker_call between", value1, value2, "pickerCall");
            return (Criteria) this;
        }

        public Criteria andPickerCallNotBetween(String value1, String value2) {
            addCriterion("picker_call not between", value1, value2, "pickerCall");
            return (Criteria) this;
        }

        public Criteria andPickerIdIsNull() {
            addCriterion("picker_id is null");
            return (Criteria) this;
        }

        public Criteria andPickerIdIsNotNull() {
            addCriterion("picker_id is not null");
            return (Criteria) this;
        }

        public Criteria andPickerIdEqualTo(String value) {
            addCriterion("picker_id =", value, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdNotEqualTo(String value) {
            addCriterion("picker_id <>", value, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdGreaterThan(String value) {
            addCriterion("picker_id >", value, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdGreaterThanOrEqualTo(String value) {
            addCriterion("picker_id >=", value, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdLessThan(String value) {
            addCriterion("picker_id <", value, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdLessThanOrEqualTo(String value) {
            addCriterion("picker_id <=", value, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdLike(String value) {
            addCriterion("picker_id like", value, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdNotLike(String value) {
            addCriterion("picker_id not like", value, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdIn(List<String> values) {
            addCriterion("picker_id in", values, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdNotIn(List<String> values) {
            addCriterion("picker_id not in", values, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdBetween(String value1, String value2) {
            addCriterion("picker_id between", value1, value2, "pickerId");
            return (Criteria) this;
        }

        public Criteria andPickerIdNotBetween(String value1, String value2) {
            addCriterion("picker_id not between", value1, value2, "pickerId");
            return (Criteria) this;
        }

        public Criteria andOutboundFlagIsNull() {
            addCriterion("outbound_flag is null");
            return (Criteria) this;
        }

        public Criteria andOutboundFlagIsNotNull() {
            addCriterion("outbound_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOutboundFlagEqualTo(String value) {
            addCriterion("outbound_flag =", value, "outboundFlag");
            return (Criteria) this;
        }

        public Criteria andOutboundFlagNotEqualTo(String value) {
            addCriterion("outbound_flag <>", value, "outboundFlag");
            return (Criteria) this;
        }

        public Criteria andOutboundFlagGreaterThan(String value) {
            addCriterion("outbound_flag >", value, "outboundFlag");
            return (Criteria) this;
        }

        public Criteria andOutboundFlagGreaterThanOrEqualTo(String value) {
            addCriterion("outbound_flag >=", value, "outboundFlag");
            return (Criteria) this;
        }

        public Criteria andOutboundFlagLessThan(String value) {
            addCriterion("outbound_flag <", value, "outboundFlag");
            return (Criteria) this;
        }

        public Criteria andOutboundFlagLessThanOrEqualTo(String value) {
            addCriterion("outbound_flag <=", value, "outboundFlag");
            return (Criteria) this;
        }

        public Criteria andOutboundFlagLike(String value) {
            addCriterion("outbound_flag like", value, "outboundFlag");
            return (Criteria) this;
        }

        public Criteria andOutboundFlagNotLike(String value) {
            addCriterion("outbound_flag not like", value, "outboundFlag");
            return (Criteria) this;
        }

        public Criteria andOutboundFlagIn(List<String> values) {
            addCriterion("outbound_flag in", values, "outboundFlag");
            return (Criteria) this;
        }

        public Criteria andOutboundFlagNotIn(List<String> values) {
            addCriterion("outbound_flag not in", values, "outboundFlag");
            return (Criteria) this;
        }

        public Criteria andOutboundFlagBetween(String value1, String value2) {
            addCriterion("outbound_flag between", value1, value2, "outboundFlag");
            return (Criteria) this;
        }

        public Criteria andOutboundFlagNotBetween(String value1, String value2) {
            addCriterion("outbound_flag not between", value1, value2, "outboundFlag");
            return (Criteria) this;
        }

        public Criteria andCustomFlagIsNull() {
            addCriterion("custom_flag is null");
            return (Criteria) this;
        }

        public Criteria andCustomFlagIsNotNull() {
            addCriterion("custom_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCustomFlagEqualTo(String value) {
            addCriterion("custom_flag =", value, "customFlag");
            return (Criteria) this;
        }

        public Criteria andCustomFlagNotEqualTo(String value) {
            addCriterion("custom_flag <>", value, "customFlag");
            return (Criteria) this;
        }

        public Criteria andCustomFlagGreaterThan(String value) {
            addCriterion("custom_flag >", value, "customFlag");
            return (Criteria) this;
        }

        public Criteria andCustomFlagGreaterThanOrEqualTo(String value) {
            addCriterion("custom_flag >=", value, "customFlag");
            return (Criteria) this;
        }

        public Criteria andCustomFlagLessThan(String value) {
            addCriterion("custom_flag <", value, "customFlag");
            return (Criteria) this;
        }

        public Criteria andCustomFlagLessThanOrEqualTo(String value) {
            addCriterion("custom_flag <=", value, "customFlag");
            return (Criteria) this;
        }

        public Criteria andCustomFlagLike(String value) {
            addCriterion("custom_flag like", value, "customFlag");
            return (Criteria) this;
        }

        public Criteria andCustomFlagNotLike(String value) {
            addCriterion("custom_flag not like", value, "customFlag");
            return (Criteria) this;
        }

        public Criteria andCustomFlagIn(List<String> values) {
            addCriterion("custom_flag in", values, "customFlag");
            return (Criteria) this;
        }

        public Criteria andCustomFlagNotIn(List<String> values) {
            addCriterion("custom_flag not in", values, "customFlag");
            return (Criteria) this;
        }

        public Criteria andCustomFlagBetween(String value1, String value2) {
            addCriterion("custom_flag between", value1, value2, "customFlag");
            return (Criteria) this;
        }

        public Criteria andCustomFlagNotBetween(String value1, String value2) {
            addCriterion("custom_flag not between", value1, value2, "customFlag");
            return (Criteria) this;
        }

        public Criteria andPackTypeIsNull() {
            addCriterion("pack_type is null");
            return (Criteria) this;
        }

        public Criteria andPackTypeIsNotNull() {
            addCriterion("pack_type is not null");
            return (Criteria) this;
        }

        public Criteria andPackTypeEqualTo(String value) {
            addCriterion("pack_type =", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeNotEqualTo(String value) {
            addCriterion("pack_type <>", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeGreaterThan(String value) {
            addCriterion("pack_type >", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pack_type >=", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeLessThan(String value) {
            addCriterion("pack_type <", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeLessThanOrEqualTo(String value) {
            addCriterion("pack_type <=", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeLike(String value) {
            addCriterion("pack_type like", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeNotLike(String value) {
            addCriterion("pack_type not like", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeIn(List<String> values) {
            addCriterion("pack_type in", values, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeNotIn(List<String> values) {
            addCriterion("pack_type not in", values, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeBetween(String value1, String value2) {
            addCriterion("pack_type between", value1, value2, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeNotBetween(String value1, String value2) {
            addCriterion("pack_type not between", value1, value2, "packType");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andPaintMarkerIsNull() {
            addCriterion("paint_marker is null");
            return (Criteria) this;
        }

        public Criteria andPaintMarkerIsNotNull() {
            addCriterion("paint_marker is not null");
            return (Criteria) this;
        }

        public Criteria andPaintMarkerEqualTo(String value) {
            addCriterion("paint_marker =", value, "paintMarker");
            return (Criteria) this;
        }

        public Criteria andPaintMarkerNotEqualTo(String value) {
            addCriterion("paint_marker <>", value, "paintMarker");
            return (Criteria) this;
        }

        public Criteria andPaintMarkerGreaterThan(String value) {
            addCriterion("paint_marker >", value, "paintMarker");
            return (Criteria) this;
        }

        public Criteria andPaintMarkerGreaterThanOrEqualTo(String value) {
            addCriterion("paint_marker >=", value, "paintMarker");
            return (Criteria) this;
        }

        public Criteria andPaintMarkerLessThan(String value) {
            addCriterion("paint_marker <", value, "paintMarker");
            return (Criteria) this;
        }

        public Criteria andPaintMarkerLessThanOrEqualTo(String value) {
            addCriterion("paint_marker <=", value, "paintMarker");
            return (Criteria) this;
        }

        public Criteria andPaintMarkerLike(String value) {
            addCriterion("paint_marker like", value, "paintMarker");
            return (Criteria) this;
        }

        public Criteria andPaintMarkerNotLike(String value) {
            addCriterion("paint_marker not like", value, "paintMarker");
            return (Criteria) this;
        }

        public Criteria andPaintMarkerIn(List<String> values) {
            addCriterion("paint_marker in", values, "paintMarker");
            return (Criteria) this;
        }

        public Criteria andPaintMarkerNotIn(List<String> values) {
            addCriterion("paint_marker not in", values, "paintMarker");
            return (Criteria) this;
        }

        public Criteria andPaintMarkerBetween(String value1, String value2) {
            addCriterion("paint_marker between", value1, value2, "paintMarker");
            return (Criteria) this;
        }

        public Criteria andPaintMarkerNotBetween(String value1, String value2) {
            addCriterion("paint_marker not between", value1, value2, "paintMarker");
            return (Criteria) this;
        }

        public Criteria andProductionTimeIsNull() {
            addCriterion("production_time is null");
            return (Criteria) this;
        }

        public Criteria andProductionTimeIsNotNull() {
            addCriterion("production_time is not null");
            return (Criteria) this;
        }

        public Criteria andProductionTimeEqualTo(Date value) {
            addCriterion("production_time =", value, "productionTime");
            return (Criteria) this;
        }

        public Criteria andProductionTimeNotEqualTo(Date value) {
            addCriterion("production_time <>", value, "productionTime");
            return (Criteria) this;
        }

        public Criteria andProductionTimeGreaterThan(Date value) {
            addCriterion("production_time >", value, "productionTime");
            return (Criteria) this;
        }

        public Criteria andProductionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("production_time >=", value, "productionTime");
            return (Criteria) this;
        }

        public Criteria andProductionTimeLessThan(Date value) {
            addCriterion("production_time <", value, "productionTime");
            return (Criteria) this;
        }

        public Criteria andProductionTimeLessThanOrEqualTo(Date value) {
            addCriterion("production_time <=", value, "productionTime");
            return (Criteria) this;
        }

        public Criteria andProductionTimeIn(List<Date> values) {
            addCriterion("production_time in", values, "productionTime");
            return (Criteria) this;
        }

        public Criteria andProductionTimeNotIn(List<Date> values) {
            addCriterion("production_time not in", values, "productionTime");
            return (Criteria) this;
        }

        public Criteria andProductionTimeBetween(Date value1, Date value2) {
            addCriterion("production_time between", value1, value2, "productionTime");
            return (Criteria) this;
        }

        public Criteria andProductionTimeNotBetween(Date value1, Date value2) {
            addCriterion("production_time not between", value1, value2, "productionTime");
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

        public Criteria andTsIsNull() {
            addCriterion("ts is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("ts is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(Date value) {
            addCriterion("ts =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(Date value) {
            addCriterion("ts <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(Date value) {
            addCriterion("ts >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(Date value) {
            addCriterion("ts >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(Date value) {
            addCriterion("ts <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(Date value) {
            addCriterion("ts <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<Date> values) {
            addCriterion("ts in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<Date> values) {
            addCriterion("ts not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(Date value1, Date value2) {
            addCriterion("ts between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(Date value1, Date value2) {
            addCriterion("ts not between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andCreatePinIsNull() {
            addCriterion("create_pin is null");
            return (Criteria) this;
        }

        public Criteria andCreatePinIsNotNull() {
            addCriterion("create_pin is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePinEqualTo(String value) {
            addCriterion("create_pin =", value, "createPin");
            return (Criteria) this;
        }

        public Criteria andCreatePinNotEqualTo(String value) {
            addCriterion("create_pin <>", value, "createPin");
            return (Criteria) this;
        }

        public Criteria andCreatePinGreaterThan(String value) {
            addCriterion("create_pin >", value, "createPin");
            return (Criteria) this;
        }

        public Criteria andCreatePinGreaterThanOrEqualTo(String value) {
            addCriterion("create_pin >=", value, "createPin");
            return (Criteria) this;
        }

        public Criteria andCreatePinLessThan(String value) {
            addCriterion("create_pin <", value, "createPin");
            return (Criteria) this;
        }

        public Criteria andCreatePinLessThanOrEqualTo(String value) {
            addCriterion("create_pin <=", value, "createPin");
            return (Criteria) this;
        }

        public Criteria andCreatePinLike(String value) {
            addCriterion("create_pin like", value, "createPin");
            return (Criteria) this;
        }

        public Criteria andCreatePinNotLike(String value) {
            addCriterion("create_pin not like", value, "createPin");
            return (Criteria) this;
        }

        public Criteria andCreatePinIn(List<String> values) {
            addCriterion("create_pin in", values, "createPin");
            return (Criteria) this;
        }

        public Criteria andCreatePinNotIn(List<String> values) {
            addCriterion("create_pin not in", values, "createPin");
            return (Criteria) this;
        }

        public Criteria andCreatePinBetween(String value1, String value2) {
            addCriterion("create_pin between", value1, value2, "createPin");
            return (Criteria) this;
        }

        public Criteria andCreatePinNotBetween(String value1, String value2) {
            addCriterion("create_pin not between", value1, value2, "createPin");
            return (Criteria) this;
        }

        public Criteria andUpdatePinIsNull() {
            addCriterion("update_pin is null");
            return (Criteria) this;
        }

        public Criteria andUpdatePinIsNotNull() {
            addCriterion("update_pin is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatePinEqualTo(String value) {
            addCriterion("update_pin =", value, "updatePin");
            return (Criteria) this;
        }

        public Criteria andUpdatePinNotEqualTo(String value) {
            addCriterion("update_pin <>", value, "updatePin");
            return (Criteria) this;
        }

        public Criteria andUpdatePinGreaterThan(String value) {
            addCriterion("update_pin >", value, "updatePin");
            return (Criteria) this;
        }

        public Criteria andUpdatePinGreaterThanOrEqualTo(String value) {
            addCriterion("update_pin >=", value, "updatePin");
            return (Criteria) this;
        }

        public Criteria andUpdatePinLessThan(String value) {
            addCriterion("update_pin <", value, "updatePin");
            return (Criteria) this;
        }

        public Criteria andUpdatePinLessThanOrEqualTo(String value) {
            addCriterion("update_pin <=", value, "updatePin");
            return (Criteria) this;
        }

        public Criteria andUpdatePinLike(String value) {
            addCriterion("update_pin like", value, "updatePin");
            return (Criteria) this;
        }

        public Criteria andUpdatePinNotLike(String value) {
            addCriterion("update_pin not like", value, "updatePin");
            return (Criteria) this;
        }

        public Criteria andUpdatePinIn(List<String> values) {
            addCriterion("update_pin in", values, "updatePin");
            return (Criteria) this;
        }

        public Criteria andUpdatePinNotIn(List<String> values) {
            addCriterion("update_pin not in", values, "updatePin");
            return (Criteria) this;
        }

        public Criteria andUpdatePinBetween(String value1, String value2) {
            addCriterion("update_pin between", value1, value2, "updatePin");
            return (Criteria) this;
        }

        public Criteria andUpdatePinNotBetween(String value1, String value2) {
            addCriterion("update_pin not between", value1, value2, "updatePin");
            return (Criteria) this;
        }

        public Criteria andYnIsNull() {
            addCriterion("yn is null");
            return (Criteria) this;
        }

        public Criteria andYnIsNotNull() {
            addCriterion("yn is not null");
            return (Criteria) this;
        }

        public Criteria andYnEqualTo(Byte value) {
            addCriterion("yn =", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotEqualTo(Byte value) {
            addCriterion("yn <>", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnGreaterThan(Byte value) {
            addCriterion("yn >", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnGreaterThanOrEqualTo(Byte value) {
            addCriterion("yn >=", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnLessThan(Byte value) {
            addCriterion("yn <", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnLessThanOrEqualTo(Byte value) {
            addCriterion("yn <=", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnIn(List<Byte> values) {
            addCriterion("yn in", values, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotIn(List<Byte> values) {
            addCriterion("yn not in", values, "yn");
            return (Criteria) this;
        }

        public Criteria andYnBetween(Byte value1, Byte value2) {
            addCriterion("yn between", value1, value2, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotBetween(Byte value1, Byte value2) {
            addCriterion("yn not between", value1, value2, "yn");
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

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}