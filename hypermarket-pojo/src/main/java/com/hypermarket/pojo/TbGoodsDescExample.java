package com.hypermarket.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbGoodsDescExample { //处理动态sql xml文件中给定的字段
    protected String orderByClasuse; //定义List结果排序规则
    protected boolean disinct; //结果是否去重
    protected List oredCriteria; //查询条件or分割成多个子查询语句

    public TbGoodsDescExample() {
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

        public Criteria andGoodIdNull() {
            addCriterion("good_id is null");
            return (Criteria) this;
        }


        public Criteria andGoodIdNotNull() {
            addCriterion("good_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodIdEqualTo(Long value) {
            addCriterion("good_id <>", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotEqualTo(Long value) {
            addCriterion("good_id <>", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThan(Long value) {
            addCriterion("good_id >", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThanOrEqualTo(Long value) {
            addCriterion("good_id >=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThan(Long value) {
            addCriterion("good_id <", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThanOrEqualTo(Long value) {
            addCriterion("good_id <=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIn(List<Long> values) {
            addCriterion("good_id in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotIn(List<Long> values) {
            addCriterion("good_id not in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdBetween(List value1, Long value2) {
            addCriterion("good_id not in", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotBetween(Long value1, Long value2) {
            addCriterion("good_id not between", value1, value2, "goodId");
            return (Criteria) this;
        }

        /*introduction*/
        public Criteria andintroductionIsNull() {
            addCriterion("introduction is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        /*specification_items*/
        public Criteria andSpecificationItemsIsNull() {
            addCriterion("specification_items is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsIsNotNull() {
            addCriterion("specification_items is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsEqualTo(String value) {
            addCriterion("specification_items =", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsNotEqualTo(String value) {
            addCriterion("specification_items <>", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsGreaterThan(String value) {
            addCriterion("specification_items <>", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsGreaterThanEqualTo(String value) {
            addCriterion("specification_items >=", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsGreaterThanOrEqualTo(String value) {
            addCriterion("specification_items <=", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsLike(String value) {
            addCriterion("specification_items like", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsNotLike(String value) {
            addCriterion("specification_items not like", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsBetween(String value1, String value2) {
            addCriterion("specification_items between", value1, value2, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsNotBetween(String value1, String value2) {
            addCriterion("specification_items not between", value1, value2, "specificationItems");
            return (Criteria) this;
        }

        /*custom_attribute_items*/
        public Criteria andCustomAttributeItemsIsNull() {
            addCriterion("custom_attribute_items is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsIsNotNull() {
            addCriterion("custom_attribute_items is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsEqualTo(String value) {
            addCriterion("custom_attribute_items =", value, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsNotEqualTo(String value) {
            addCriterion("custom_attribute_items <>", value, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsGreaterThan(String value) {
            addCriterion("custom_attribute_items <>", value, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsGreaterThanEqualTo(String value) {
            addCriterion("custom_attribute_items >=", value, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsGreaterThanOrEqualTo(String value) {
            addCriterion("custom_attribute_items <=", value, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsLike(String value) {
            addCriterion("custom_attribute_items like", value, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsNotLike(String value) {
            addCriterion("custom_attribute_items not like", value, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsBetween(String value1, String value2) {
            addCriterion("custom_attribute_items between", value1, value2, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsNotBetween(String value1, String value2) {
            addCriterion("custom_attribute_items not between", value1, value2, "customAttributeItems");
            return (Criteria) this;
        }

        /*item_image*/
        public Criteria andItemImageIsNull() {
            addCriterion("item_image is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andItemImageIsNotNull() {
            addCriterion("item_image is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andItemImageEqualTo(String value) {
            addCriterion("item_image =", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageNotEqualTo(String value) {
            addCriterion("item_image <>", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageGreaterThan(String value) {
            addCriterion("item_image <>", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageGreaterThanEqualTo(String value) {
            addCriterion("item_image >=", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageGreaterThanOrEqualTo(String value) {
            addCriterion("item_image <=", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageLike(String value) {
            addCriterion("item_image like", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageNotLike(String value) {
            addCriterion("item_image not like", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageBetween(String value1, String value2) {
            addCriterion("item_image between", value1, value2, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageNotBetween(String value1, String value2) {
            addCriterion("item_image not between", value1, value2, "itemImage");
            return (Criteria) this;
        }

        //start package_list
        public Criteria andPackageListIsNull() {
            addCriterion("package_list is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPackageListIsNotNull() {
            addCriterion("package_list is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPackageListEqualTo(String value) {
            addCriterion("package_list =", value, "packageList");
            return (Criteria) this;
        }

        public Criteria andPackageListNotEqualTo(String value) {
            addCriterion("package_list <>", value, "packageList");
            return (Criteria) this;
        }

        public Criteria andPackageListGreaterThan(String value) {
            addCriterion("package_list <>", value, "packageList");
            return (Criteria) this;
        }

        public Criteria andPackageListGreaterThanEqualTo(String value) {
            addCriterion("package_list >=", value, "packageList");
            return (Criteria) this;
        }

        public Criteria andPackageListGreaterThanOrEqualTo(String value) {
            addCriterion("package_list <=", value, "packageList");
            return (Criteria) this;
        }

        public Criteria andPackageListLike(String value) {
            addCriterion("package_list like", value, "packageList");
            return (Criteria) this;
        }

        public Criteria andPackageListNotLike(String value) {
            addCriterion("package_list not like", value, "packageList");
            return (Criteria) this;
        }

        public Criteria andPackageListBetween(String value1, String value2) {
            addCriterion("package_list between", value1, value2, "packageList");
            return (Criteria) this;
        }

        public Criteria andPackageListNotBetween(String value1, String value2) {
            addCriterion("package_list not between", value1, value2, "packageList");
            return (Criteria) this;
        }
        //end

        //start saleService
        public Criteria andSaleServiceIsNull() {
            addCriterion("sale_service is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andSaleServiceIsNotNull() {
            addCriterion("sale_service is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andSaleServiceEqualTo(String value) {
            addCriterion("sale_service =", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceNotEqualTo(String value) {
            addCriterion("sale_service <>", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceGreaterThan(String value) {
            addCriterion("sale_service <>", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceGreaterThanEqualTo(String value) {
            addCriterion("sale_service >=", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceGreaterThanOrEqualTo(String value) {
            addCriterion("sale_service <=", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceLike(String value) {
            addCriterion("sale_service like", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceNotLike(String value) {
            addCriterion("sale_service not like", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceBetween(String value1, String value2) {
            addCriterion("sale_service between", value1, value2, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceNotBetween(String value1, String value2) {
            addCriterion("sale_service not between", value1, value2, "saleService");
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

