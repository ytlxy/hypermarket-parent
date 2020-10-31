package com.hypermarket.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbPayLogExample { //处理动态sql xml文件中给定的字段
    protected String orderByClasuse; //定义List结果排序规则
    protected boolean disinct; //结果是否去重
    protected List<Criteria> oredCriteria; //查询条件or分割成多个子查询语句

    public TbPayLogExample() {
        oredCriteria = new ArrayList();
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public String getOrderByClasuse() {
        return orderByClasuse;
    }

    public void setOrderByClasuse(String orderByClasuse) {
        this.orderByClasuse = orderByClasuse;
    }

    public boolean isDisinct() {
        return disinct;
    }

    public void setDisinct(boolean disinct) {
        this.disinct = disinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void setOredCriteria(List<Criteria> oredCriteria) {
        this.oredCriteria = oredCriteria;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }


        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("outTradeNo is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(Long value) {
            addCriterion("out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(Long value) {
            addCriterion("out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(Long value) {
            addCriterion("out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(Long value) {
            addCriterion("out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(Long value) {
            addCriterion("out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(Long value) {
            addCriterion("out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<Long> values) {
            addCriterion("out_trade_no in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<Long> values) {
            addCriterion("out_trade_no not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(List value1, Long value2) {
            addCriterion("out_trade_no not in", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(Long value1, Long value2) {
            addCriterion("out_trade_no not between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        /*create_time*/
        public Criteria andCreatTimeIsNull() {
            addCriterion("create_time is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("create_time is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(String value) {
            addCriterion("create_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(String value) {
            addCriterion("create_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanEqualTo(String value) {
            addCriterion("create_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLike(String value) {
            addCriterion("create_time like", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotLike(String value) {
            addCriterion("create_time not like", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        /*pay_time*/
        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(String value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(String value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(String value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanEqualTo(String value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLike(String value) {
            addCriterion("pay_time like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotLike(String value) {
            addCriterion("pay_time not like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(String value1, String value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(String value1, String value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        /*total_fee*/
        public Criteria andTotalFeeIsNull() {
            addCriterion("total_fee is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNotNull() {
            addCriterion("total_fee is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andTotalFeeEqualTo(String value) {
            addCriterion("total_fee =", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotEqualTo(String value) {
            addCriterion("total_fee <>", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThan(String value) {
            addCriterion("total_fee <>", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThanEqualTo(String value) {
            addCriterion("total_fee >=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThanOrEqualTo(String value) {
            addCriterion("total_fee <=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLike(String value) {
            addCriterion("total_fee like", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotLike(String value) {
            addCriterion("total_fee not like", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeBetween(String value1, String value2) {
            addCriterion("total_fee between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotBetween(String value1, String value2) {
            addCriterion("total_fee not between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        /*user_id*/
        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
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

        //start transactionId
        public Criteria andTransactionIdIsNull() {
            addCriterion("transaction_id is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("transaction_id is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(String value) {
            addCriterion("transaction_id =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanEqualTo(String value) {
            addCriterion("transaction_id >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_id <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLike(String value) {
            addCriterion("transaction_id like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotLike(String value) {
            addCriterion("transaction_id not like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("transaction_id between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("transaction_id not between", value1, value2, "transactionId");
            return (Criteria) this;
        }
        //end

        //start orderList
        public Criteria andOrderListIsNull() {
            addCriterion("order_list is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andOrderListIsNotNull() {
            addCriterion("order_list is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andOrderListEqualTo(String value) {
            addCriterion("order_list =", value, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListNotEqualTo(String value) {
            addCriterion("order_list <>", value, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListGreaterThan(String value) {
            addCriterion("order_list <>", value, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListGreaterThanEqualTo(String value) {
            addCriterion("order_list >=", value, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListGreaterThanOrEqualTo(String value) {
            addCriterion("order_list <=", value, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListLike(String value) {
            addCriterion("order_list like", value, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListNotLike(String value) {
            addCriterion("order_list not like", value, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListBetween(String value1, String value2) {
            addCriterion("order_list between", value1, value2, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListNotBetween(String value1, String value2) {
            addCriterion("order_list not between", value1, value2, "orderList");
            return (Criteria) this;
        }
        //end

        //start payType
        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
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

