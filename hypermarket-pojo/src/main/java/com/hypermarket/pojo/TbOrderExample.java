package com.hypermarket.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbOrderExample { //处理动态sql xml文件中给定的字段
    protected String orderByClasuse; //定义List结果排序规则
    protected boolean disinct; //结果是否去重
    protected List oredCriteria; //查询条件or分割成多个子查询语句

    public TbOrderExample() {
        oredCriteria = new ArrayList();
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal(); //方法负责处理该对象
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal(); //该方法负责处理该对象
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    public Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        oredCriteria = null;
        disinct = false;
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

        public List<Criterion> getCriteria() {
            return criteria;
        }

        public List<Criterion> getAllCriteria() {
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
                throw new RuntimeException("value for" + property + "cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for" + property + "cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }


        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "iorderIdd");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(List value1, Long value2) {
            addCriterion("order_id not in", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        /*payment*/
        public Criteria andPaymentIsNull() {
            addCriterion("payment is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null"); //处理的全是sql语句
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
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanEqualTo(String value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(String value) {
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

        public Criteria andPaymentBetween(String value1, String value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(String value1, String value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        /*payment_type*/
        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(String value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(String value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(String value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanEqualTo(String value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLike(String value) {
            addCriterion("payment_type like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotLike(String value) {
            addCriterion("payment_type not like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(String value1, String value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(String value1, String value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        /*city_id*/
        public Criteria andPostFeeIsNull() {
            addCriterion("post_fee is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPostFeeIsNotNull() {
            addCriterion("post_fee is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("post_fee =", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotEqualTo(String value) {
            addCriterion("post_fee <>", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeGreaterThan(String value) {
            addCriterion("post_fee <>", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeGreaterThanEqualTo(String value) {
            addCriterion("post_fee >=", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeGreaterThanOrEqualTo(String value) {
            addCriterion("post_fee <=", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeLike(String value) {
            addCriterion("post_fee like", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotLike(String value) {
            addCriterion("post_fee not like", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeBetween(String value1, String value2) {
            addCriterion("post_fee between", value1, value2, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotBetween(String value1, String value2) {
            addCriterion("post_fee not between", value1, value2, "postFee");
            return (Criteria) this;
        }

        //start status
        public Criteria andStatusIsNull() {
            addCriterion("status is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andSstatusIsNotNull() {
            addCriterion("status is not null"); //处理的全是sql语句
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
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
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

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
        //end

        //start create_time
        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null"); //处理的全是sql语句
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
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
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

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
        //end update_time

        //start update_time
        public Criteria andUpdate_timeNull() {
            addCriterion("update_time is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotNull() {
            addCriterion("update_time is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andUpdate_timeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
        //end

        public Criteria andcreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andcreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andcreateTimeGreaterThan(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andcreateTimeGreaterThanEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andcreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andcreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andcreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andcreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andcreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
        //end
        //start update_time
        public Criteria andPaymentTimeNull() {
            addCriterion("payment_time is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotNull() {
            addCriterion("payment_time is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(String value) {
            addCriterion("payment_time =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(String value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(String value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanEqualTo(String value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeeLike(String value) {
            addCriterion("payment_time like", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeeNotLike(String value) {
            addCriterion("payment_time not like", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(String value1, String value2) {
            addCriterion("payment_time between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(String value1, String value2) {
            addCriterion("payment_time not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }
        //end

        //start update_time
        public Criteria andConsignTimeNull() {
            addCriterion("consign_time is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andConsignTimeNotNull() {
            addCriterion("consign_time is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andConsignTimeEqualTo(String value) {
            addCriterion("consign_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeNotEqualTo(String value) {
            addCriterion("consign_time <>", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeGreaterThan(String value) {
            addCriterion("consign_time <>", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeeGreaterThanEqualTo(String value) {
            addCriterion("consign_time >=", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeGreaterThanOrEqualTo(String value) {
            addCriterion("consign_time <=", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeLike(String value) {
            addCriterion("consign_time like", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeNotLike(String value) {
            addCriterion("consign_time not like", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeBetween(String value1, String value2) {
            addCriterion("consign_time between", value1, value2, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeNotBetween(String value1, String value2) {
            addCriterion("consign_time not between", value1, value2, "consignTime");
            return (Criteria) this;
        }
        //end

        //start update_time
        public Criteria andEndTimeNull() {
            addCriterion("end_time is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andEndTimeNotNull() {
            addCriterion("end_time is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria EndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }
        //end
        
        //start closeTime
        public Criteria andCloseTimeIsNull() {
            addCriterion("close_time is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andvloseTimeIsNotNull() {
            addCriterion("close_time is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(String value) {
            addCriterion("close_time =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(String value) {
            addCriterion("close_time <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(String value) {
            addCriterion("close_time <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanEqualTo(String value) {
            addCriterion("close_time >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("close_time <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLike(String value) {
            addCriterion("close_time like", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotLike(String value) {
            addCriterion("close_time not like", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(String value1, String value2) {
            addCriterion("close_time between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(String value1, String value2) {
            addCriterion("close_time not between", value1, value2, "closeTime");
            return (Criteria) this;
        }
        //end

        //start shoppingMessage
        public Criteria andShoppingMessageIsNull() {
            addCriterion("shopping_message is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andShoppingMessageIsNotNull() {
            addCriterion("shopping_message is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andShoppingMessageEqualTo(String value) {
            addCriterion("shopping_message =", value, "shoppingMessage");
            return (Criteria) this;
        }

        public Criteria andShoppingMessageNotEqualTo(String value) {
            addCriterion("shopping_message <>", value, "shoppingMessage");
            return (Criteria) this;
        }

        public Criteria andShoppingMessageGreaterThan(String value) {
            addCriterion("shopping_message <>", value, "shoppingMessage");
            return (Criteria) this;
        }

        public Criteria andShoppingMessageGreaterThanEqualTo(String value) {
            addCriterion("shopping_message >=", value, "shoppingMessage");
            return (Criteria) this;
        }

        public Criteria andShoppingMessageGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_message <=", value, "shoppingMessage");
            return (Criteria) this;
        }

        public Criteria andShoppingMessageLike(String value) {
            addCriterion("shopping_message like", value, "shoppingMessage");
            return (Criteria) this;
        }

        public Criteria andShoppingMessageNotLike(String value) {
            addCriterion("shopping_message not like", value, "shoppingMessage");
            return (Criteria) this;
        }

        public Criteria andShoppingMessageBetween(String value1, String value2) {
            addCriterion("shopping_message between", value1, value2, "shoppingMessage");
            return (Criteria) this;
        }

        public Criteria andShoppingMessageNotBetween(String value1, String value2) {
            addCriterion("shopping_message not between", value1, value2, "shoppingMessage");
            return (Criteria) this;
        }
        //end

        //start shoppingName
        public Criteria andShoppingNameIsNull() {
            addCriterion("shopping_name is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andShoppingNameIsNotNull() {
            addCriterion("shopping_name is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andShoppingNameEqualTo(String value) {
            addCriterion("shopping_name =", value, "shoppingName");
            return (Criteria) this;
        }

        public Criteria andShoppingNameNotEqualTo(String value) {
            addCriterion("shopping_name <>", value, "shoppingName");
            return (Criteria) this;
        }

        public Criteria andShoppingNameGreaterThan(String value) {
            addCriterion("shopping_name <>", value, "shoppingName");
            return (Criteria) this;
        }

        public Criteria andShoppingNameGreaterThanEqualTo(String value) {
            addCriterion("shopping_name >=", value, "shoppingName");
            return (Criteria) this;
        }

        public Criteria andShoppingNameGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_name <=", value, "shoppingName");
            return (Criteria) this;
        }

        public Criteria andShoppingNameLike(String value) {
            addCriterion("shopping_name like", value, "shoppingName");
            return (Criteria) this;
        }

        public Criteria andShoppingNameNotLike(String value) {
            addCriterion("shopping_name not like", value, "shoppingName");
            return (Criteria) this;
        }

        public Criteria andShoppingNameBetween(String value1, String value2) {
            addCriterion("shopping_name between", value1, value2, "shoppingName");
            return (Criteria) this;
        }

        public Criteria andShoppingNameNotBetween(String value1, String value2) {
            addCriterion("shopping_name not between", value1, value2, "shoppingName");
            return (Criteria) this;
        }
        //end


        //start update_time
        public Criteria andUserIdNull() {
            addCriterion("user_id is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andUserIdNotNull() {
            addCriterion("user_id is not null"); //处理的全是sql语句
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
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
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

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }
        //end

        //start update_time
        public Criteria andBuyerNickNull() {
            addCriterion("buyer_nick is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andBuyerNickNotNull() {
            addCriterion("buyer_nick is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andBuyerNickEqualTo(String value) {
            addCriterion("buyer_nick =", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNotEqualTo(String value) {
            addCriterion("buyer_nick <>", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickGreaterThan(String value) {
            addCriterion("buyer_nick <>", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickGreaterThanEqualTo(String value) {
            addCriterion("buyer_nick >=", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_nick <=", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickLike(String value) {
            addCriterion("buyer_nick like", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNotLike(String value) {
            addCriterion("buyer_nick not like", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickBetween(String value1, String value2) {
            addCriterion("buyer_nick between", value1, value2, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNotBetween(String value1, String value2) {
            addCriterion("buyer_nick not between", value1, value2, "buyerNick");
            return (Criteria) this;
        }
        //end

        //start update_time
        public Criteria andBuyerRateNull() {
            addCriterion("buyer_rate is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andBuyerRateNotNull() {
            addCriterion("buyer_rate is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andBuyerRateEqualTo(String value) {
            addCriterion("buyer_rate =", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateNotEqualTo(String value) {
            addCriterion("buyer_rate <>", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateGreaterThan(String value) {
            addCriterion("buyer_rate <>", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateGreaterThanEqualTo(String value) {
            addCriterion("buyer_rate >=", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_rate <=", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateLike(String value) {
            addCriterion("buyer_rate like", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateNotLike(String value) {
            addCriterion("buyer_rate not like", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateBetween(String value1, String value2) {
            addCriterion("buyer_rate between", value1, value2, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateNotBetween(String value1, String value2) {
            addCriterion("buyer_rate not between", value1, value2, "buyerRate");
            return (Criteria) this;
        }
        //end
        

        //start update_time
        public Criteria andReceiverAreaNameNull() {
            addCriterion("receiver_area_name is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andReceiverAreaNameNotNull() {
            addCriterion("receiver_area_name is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andReceiverAreaNameEqualTo(String value) {
            addCriterion("receiver_area_name =", value, "receiverAreaName");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaNameNotEqualTo(String value) {
            addCriterion("receiver_area_name <>", value, "receiverAreaName");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaNameGreaterThan(String value) {
            addCriterion("receiver_area_name <>", value, "receiverAreaName");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaNameGreaterThanEqualTo(String value) {
            addCriterion("receiver_area_name >=", value, "receiverAreaName");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_area_name <=", value, "receiverAreaName");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaNameLike(String value) {
            addCriterion("receiver_area_name like", value, "receiverAreaName");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaNameNotLike(String value) {
            addCriterion("receiver_area_name not like", value, "receiverAreaName");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaNameBetween(String value1, String value2) {
            addCriterion("receiver_area_name between", value1, value2, "receiverAreaName");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaNameNotBetween(String value1, String value2) {
            addCriterion("receiver_area_name not between", value1, value2, "receiverAreaName");
            return (Criteria) this;
        }
        //end

        //start update_time
        public Criteria andReceiverMobileNull() {
            addCriterion("receiver_mobile is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotNull() {
            addCriterion("receiver_mobile is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andReceiverMobileEqualTo(String value) {
            addCriterion("receiver_mobile =", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotEqualTo(String value) {
            addCriterion("receiver_mobile <>", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileGreaterThan(String value) {
            addCriterion("receiver_mobile <>", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileGreaterThanEqualTo(String value) {
            addCriterion("receiver_mobile >=", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_mobile <=", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLike(String value) {
            addCriterion("receiver_mobile like", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotLike(String value) {
            addCriterion("receiver_mobile not like", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileBetween(String value1, String value2) {
            addCriterion("receiver_mobile between", value1, value2, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotBetween(String value1, String value2) {
            addCriterion("receiver_mobile not between", value1, value2, "receiverMobile");
            return (Criteria) this;
        }
        //end

        //start update_time
        public Criteria andReceiverZipCodeNull() {
            addCriterion("receiver_zip_code is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andReceiverZipCodeNotNull() {
            addCriterion("receiver_zip_code is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andReceiverZipCodeEqualTo(String value) {
            addCriterion("receiver_zip_code =", value, "receiverZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiverZipCodeNotEqualTo(String value) {
            addCriterion("receiver_zip_code <>", value, "receiverZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiverZipCodeGreaterThan(String value) {
            addCriterion("receiver_zip_code <>", value, "receiverZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiverZipCodeGreaterThanEqualTo(String value) {
            addCriterion("receiver_zip_code >=", value, "receiverZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiverZipCodeOrEqualTo(String value) {
            addCriterion("receiver_zip_code <=", value, "receiverZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiverZipCodeLike(String value) {
            addCriterion("receiver_zip_code like", value, "receiverZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiverZipCodeNotLike(String value) {
            addCriterion("receiver_zip_code not like", value, "receiverZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiverZipCodeBetween(String value1, String value2) {
            addCriterion("receiver_zip_code between", value1, value2, "receiverZipCode");
            return (Criteria) this;
        }

        public Criteria andReceiverZipCodeNotBetween(String value1, String value2) {
            addCriterion("receiver_zip_code not between", value1, value2, "receiverZipCode");
            return (Criteria) this;
        }
        //end


        //start update_time
        public Criteria andexpireNull() {
            addCriterion("expire is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andexpireNotNull() {
            addCriterion("expire is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andexpireEqualTo(String value) {
            addCriterion("expire =", value, "expire");
            return (Criteria) this;
        }

        public Criteria andexpireNotEqualTo(String value) {
            addCriterion("expire <>", value, "expire");
            return (Criteria) this;
        }

        public Criteria andexpireGreaterThan(String value) {
            addCriterion("expire <>", value, "expire");
            return (Criteria) this;
        }

        public Criteria andexpireGreaterThanEqualTo(String value) {
            addCriterion("expire >=", value, "expire");
            return (Criteria) this;
        }

        public Criteria andexpireOrEqualTo(String value) {
            addCriterion("expire <=", value, "expire");
            return (Criteria) this;
        }

        public Criteria andexpireLike(String value) {
            addCriterion("expire like", value, "expire");
            return (Criteria) this;
        }

        public Criteria andexpireNotLike(String value) {
            addCriterion("expire not like", value, "expire");
            return (Criteria) this;
        }

        public Criteria andexpireBetween(String value1, String value2) {
            addCriterion("expire between", value1, value2, "expire");
            return (Criteria) this;
        }

        public Criteria andexpireNotBetween(String value1, String value2) {
            addCriterion("expire not between", value1, value2, "expire");
            return (Criteria) this;
        }
        //end

        //start update_time
        public Criteria andInvoiceTypeNull() {
            addCriterion("invoice_type is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotNull() {
            addCriterion("invoice_type is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(String value) {
            addCriterion("invoice_type =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(String value) {
            addCriterion("invoice_type <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(String value) {
            addCriterion("invoice_type <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanEqualTo(String value) {
            addCriterion("invoice_type >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTyperEqualTo(String value) {
            addCriterion("invoice_type <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLike(String value) {
            addCriterion("invoice_type like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotLike(String value) {
            addCriterion("invoice_type not like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(String value1, String value2) {
            addCriterion("invoice_type between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("invoice_type not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }
        //end

        //start update_time
        public Criteria andSourceTypeNull() {
            addCriterion("source_type is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotNull() {
            addCriterion("source_type is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(String value) {
            addCriterion("source_type =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(String value) {
            addCriterion("source_type <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(String value) {
            addCriterion("source_type <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanEqualTo(String value) {
            addCriterion("source_type >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTyperEqualTo(String value) {
            addCriterion("source_type <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLike(String value) {
            addCriterion("source_type like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotLike(String value) {
            addCriterion("source_type not like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(String value1, String value2) {
            addCriterion("source_type between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(String value1, String value2) {
            addCriterion("source_type not between", value1, value2, "sourceType");
            return (Criteria) this;
        }
        //end

        //start update_time
        public Criteria andSellerIdNull() {
            addCriterion("seller_id is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andSellerIdNotNull() {
            addCriterion("seller_id is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(String value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(String value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(String value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanEqualTo(String value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotGreaterThanEqualTo(String value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLike(String value) {
            addCriterion("seller_id like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotLike(String value) {
            addCriterion("seller_id not like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(String value1, String value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(String value1, String value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }
        //end

        public void setCriteria(List<Criterion> criteria) {
            this.criteria = criteria;
        }
    }

    public static class Criteria extends GeneratedCriteria { //当Criteria 继承与某个类之后 才能发挥出调用字段的能力
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

        public void setCondition(String condition) {
            this.condition = condition;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public void setSecondValue(Object secondValue) {
            this.secondValue = secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public void setNoValue(boolean noValue) {
            this.noValue = noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public void setSingleValue(boolean singleValue) {
            this.singleValue = singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public void setBetweenValue(boolean betweenValue) {
            this.betweenValue = betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public void setListValue(boolean listValue) {
            this.listValue = listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        public void setTypeHandler(String typeHandler) {
            this.typeHandler = typeHandler;
        }

        public Criterion(String condition) {
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
            if (value instanceof List<?>) { //满足为一堆数据 否则为一个数据
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

