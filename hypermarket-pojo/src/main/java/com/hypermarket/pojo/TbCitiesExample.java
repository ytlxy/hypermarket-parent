package com.hypermarket.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbCitiesExample { //处理动态sql xml文件中给定的字段
    protected String orderByClasuse; //定义List结果排序规则
    protected boolean disinct; //结果是否去重
    protected List oredCriteria; //查询条件or分割成多个子查询语句

    public TbCitiesExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }


        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(List value1, Long value2) {
            addCriterion("id not in", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        /*citid*/
        public Criteria andUserIdIsNull() {
            addCriterion("citid is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("citid is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andCitidEqualTo(String value) {
            addCriterion("citid =", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidNotEqualTo(String value) {
            addCriterion("citid <>", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidGreaterThan(String value) {
            addCriterion("citid <>", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidGreaterThanEqualTo(String value) {
            addCriterion("citid >=", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidGreaterThanOrEqualTo(String value) {
            addCriterion("citid <=", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidLike(String value) {
            addCriterion("citid like", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidNotLike(String value) {
            addCriterion("citid not like", value, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidBetween(String value1, String value2) {
            addCriterion("citid between", value1, value2, "citid");
            return (Criteria) this;
        }

        public Criteria andCitidNotBetween(String value1, String value2) {
            addCriterion("citid not between", value1, value2, "citid");
            return (Criteria) this;
        }

        /*city*/
        public Criteria andcityIsNull() {
            addCriterion("city is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andcityIsNotNull() {
            addCriterion("city is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andcityEqualTo(String value) {
            addCriterion("city =", value, "City");
            return (Criteria) this;
        }

        public Criteria andcityNotEqualTo(String value) {
            addCriterion("city <>", value, "City");
            return (Criteria) this;
        }

        public Criteria andcityGreaterThan(String value) {
            addCriterion("city <>", value, "City");
            return (Criteria) this;
        }

        public Criteria andcityGreaterThanEqualTo(String value) {
            addCriterion("city >=", value, "City");
            return (Criteria) this;
        }

        public Criteria andcityGreaterThanOrEqualTo(String value) {
            addCriterion("city <=", value, "City");
            return (Criteria) this;
        }

        public Criteria andcityLike(String value) {
            addCriterion("city like", value, "City");
            return (Criteria) this;
        }

        public Criteria andcityNotLike(String value) {
            addCriterion("city not like", value, "City");
            return (Criteria) this;
        }

        public Criteria andcityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "City");
            return (Criteria) this;
        }

        public Criteria andcityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "City");
            return (Criteria) this;
        }

        /*provinceid*/
        public Criteria andProvinceidIsNull() {
            addCriterion("provinceid is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNotNull() {
            addCriterion("provinceid is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andProvinceidEqualTo(String value) {
            addCriterion("provinceid =", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotEqualTo(String value) {
            addCriterion("provinceid <>", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThan(String value) {
            addCriterion("provinceid <>", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThanEqualTo(String value) {
            addCriterion("provinceid >=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThanOrEqualTo(String value) {
            addCriterion("provinceid <=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLike(String value) {
            addCriterion("provinceid like", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotLike(String value) {
            addCriterion("provinceid not like", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidBetween(String value1, String value2) {
            addCriterion("provinceid between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotBetween(String value1, String value2) {
            addCriterion("provinceid not between", value1, value2, "provinceid");
            return (Criteria) this;
        }

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

