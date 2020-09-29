package com.hypermarket.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbGoodsExample { //处理动态sql xml文件中给定的字段
    protected String orderByClasuse; //定义List结果排序规则
    protected boolean disinct; //结果是否去重
    protected List oredCriteria; //查询条件or分割成多个子查询语句

    public TbGoodsExample() {
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

        /*seller_id*/
        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
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

        public Criteria andSellerIdGreaterThanOrEqualTo(String value) {
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

        /*default_item_id*/
        public Criteria andDefaultItemIdIsNull() {
            addCriterion("default_item_id is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andDefaultItemIdIsNotNull() {
            addCriterion("default_item_id is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andDefaultItemIdEqualTo(String value) {
            addCriterion("default_item_id =", value, "defaultItemId");
            return (Criteria) this;
        }

        public Criteria andDefaultItemIdNotEqualTo(String value) {
            addCriterion("default_item_id <>", value, "defaultItemId");
            return (Criteria) this;
        }

        public Criteria andDefaultItemIdGreaterThan(String value) {
            addCriterion("default_item_id <>", value, "defaultItemId");
            return (Criteria) this;
        }

        public Criteria andDefaultItemIdGreaterThanEqualTo(String value) {
            addCriterion("default_item_id >=", value, "defaultItemId");
            return (Criteria) this;
        }

        public Criteria andDefaultItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("default_item_id <=", value, "defaultItemId");
            return (Criteria) this;
        }

        public Criteria andDefaultItemIdLike(String value) {
            addCriterion("default_item_id like", value, "defaultItemId");
            return (Criteria) this;
        }

        public Criteria andDefaultItemIdNotLike(String value) {
            addCriterion("default_item_id not like", value, "defaultItemId");
            return (Criteria) this;
        }

        public Criteria andDefaultItemIdBetween(String value1, String value2) {
            addCriterion("default_item_id between", value1, value2, "defaultItemId");
            return (Criteria) this;
        }

        public Criteria andDefaultItemIdNotBetween(String value1, String value2) {
            addCriterion("default_item_id not between", value1, value2, "defaultItemId");
            return (Criteria) this;
        }

        /*city_id*/
        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanEqualTo(String value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("audit_status like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("audit_status not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        /*is_marketable*/
        public Criteria andIsMarketableIsNull() {
            addCriterion("is_marketable is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andIsMarketableIsNotNull() {
            addCriterion("is_marketable is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andIsMarketableEqualTo(String value) {
            addCriterion("is_marketable =", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableNotEqualTo(String value) {
            addCriterion("is_marketable <>", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableGreaterThan(String value) {
            addCriterion("is_marketable <>", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableGreaterThanEqualTo(String value) {
            addCriterion("is_marketable >=", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableGreaterThanOrEqualTo(String value) {
            addCriterion("is_marketable <=", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableLike(String value) {
            addCriterion("is_marketable like", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableNotLike(String value) {
            addCriterion("is_marketable not like", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableBetween(String value1, String value2) {
            addCriterion("is_marketable between", value1, value2, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableNotBetween(String value1, String value2) {
            addCriterion("is_marketable not between", value1, value2, "isMarketable");
            return (Criteria) this;
        }

        //start brand_id
        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(String value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(String value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(String value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanEqualTo(String value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(String value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLike(String value) {
            addCriterion("brand_id like", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotLike(String value) {
            addCriterion("brand_id not like", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(String value1, String value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(String value1, String value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }
        //end

        //start caption
        public Criteria andCaptionIsNull() {
            addCriterion("caption is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andCaptionIsNotNull() {
            addCriterion("caption is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andCaptionEqualTo(String value) {
            addCriterion("caption =", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotEqualTo(String value) {
            addCriterion("caption <>", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionGreaterThan(String value) {
            addCriterion("caption <>", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionGreaterThanEqualTo(String value) {
            addCriterion("caption >=", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionGreaterThanOrEqualTo(String value) {
            addCriterion("caption <=", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLike(String value) {
            addCriterion("caption like", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotLike(String value) {
            addCriterion("caption not like", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionBetween(String value1, String value2) {
            addCriterion("caption between", value1, value2, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotBetween(String value1, String value2) {
            addCriterion("caption not between", value1, value2, "caption");
            return (Criteria) this;
        }
        //end

        //start category1_id
        public Criteria andCategory1IdIsNull() {
            addCriterion("category1_id is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andCategory1IdIsNotNull() {
            addCriterion("category1_id is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andCategory1IdEqualTo(String value) {
            addCriterion("category1_id =", value, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdNotEqualTo(String value) {
            addCriterion("category1_id <>", value, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdGreaterThan(String value) {
            addCriterion("category1_id <>", value, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdGreaterThanEqualTo(String value) {
            addCriterion("category1_id >=", value, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdGreaterThanOrEqualTo(String value) {
            addCriterion("category1_id <=", value, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdLike(String value) {
            addCriterion("category1_id like", value, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdNotLike(String value) {
            addCriterion("category1_id not like", value, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdBetween(String value1, String value2) {
            addCriterion("category1_id between", value1, value2, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdNotBetween(String value1, String value2) {
            addCriterion("category1_id not between", value1, value2, "category1Id");
            return (Criteria) this;
        }
        //end
        
        //start category2_id
        public Criteria andCategory2IdIsNull() {
            addCriterion("category2_id is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andCategory2IdIsNotNull() {
            addCriterion("category2_id is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andCategory2IdEqualTo(String value) {
            addCriterion("category2_id =", value, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdNotEqualTo(String value) {
            addCriterion("category2_id <>", value, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdGreaterThan(String value) {
            addCriterion("category2_id <>", value, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdGreaterThanEqualTo(String value) {
            addCriterion("category2_id >=", value, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdGreaterThanOrEqualTo(String value) {
            addCriterion("category2_id <=", value, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdLike(String value) {
            addCriterion("category2_id like", value, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdNotLike(String value) {
            addCriterion("category2_id not like", value, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdBetween(String value1, String value2) {
            addCriterion("category2_id between", value1, value2, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdNotBetween(String value1, String value2) {
            addCriterion("category2_id not between", value1, value2, "category2Id");
            return (Criteria) this;
        }
        //end

        //start category3_id
        public Criteria andCategory3IdIsNull() {
            addCriterion("category3_id is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andCategory3IdIsNotNull() {
            addCriterion("category3_id is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andCategory3IdEqualTo(String value) {
            addCriterion("category3_id =", value, "category3Id");
            return (Criteria) this;
        }

        public Criteria andCategory3IdNotEqualTo(String value) {
            addCriterion("category3_id <>", value, "category3Id");
            return (Criteria) this;
        }

        public Criteria andCategory3IdGreaterThan(String value) {
            addCriterion("category3_id <>", value, "category3Id");
            return (Criteria) this;
        }

        public Criteria andCategory3IdGreaterThanEqualTo(String value) {
            addCriterion("category3_id >=", value, "category3Id");
            return (Criteria) this;
        }

        public Criteria andCategory3IdGreaterThanOrEqualTo(String value) {
            addCriterion("category3_id <=", value, "category3Id");
            return (Criteria) this;
        }

        public Criteria andCategory3IdLike(String value) {
            addCriterion("category3_id like", value, "category3Id");
            return (Criteria) this;
        }

        public Criteria andCategory3IdNotLike(String value) {
            addCriterion("category3_id not like", value, "category3Id");
            return (Criteria) this;
        }

        public Criteria andCategory3IdBetween(String value1, String value2) {
            addCriterion("category3_id between", value1, value2, "category3Id");
            return (Criteria) this;
        }

        public Criteria andCategory3IdNotBetween(String value1, String value2) {
            addCriterion("category3_id not between", value1, value2, "category3Id");
            return (Criteria) this;
        }
        //end


        //start small_pic
        public Criteria andSmallPicIsNull() {
            addCriterion("small_pic is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andSmallPicIsNotNull() {
            addCriterion("small_pic is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andSmallPicEqualTo(String value) {
            addCriterion("small_pic =", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicNotEqualTo(String value) {
            addCriterion("small_pic <>", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicGreaterThan(String value) {
            addCriterion("small_pic <>", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicGreaterThanEqualTo(String value) {
            addCriterion("small_pic >=", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicGreaterThanOrEqualTo(String value) {
            addCriterion("small_pic <=", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicLike(String value) {
            addCriterion("small_pic like", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicNotLike(String value) {
            addCriterion("small_pic not like", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicBetween(String value1, String value2) {
            addCriterion("small_pic between", value1, value2, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicNotBetween(String value1, String value2) {
            addCriterion("small_pic not between", value1, value2, "smallPic");
            return (Criteria) this;
        }
        //end

        //start price
        public Criteria andPriceIsNull() {
            addCriterion("price is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }
        //end

        //start type_template_id
        public Criteria andTypeTemplateIdIsNull() {
            addCriterion("type_template_id is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdIsNotNull() {
            addCriterion("type_template_id is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdEqualTo(String value) {
            addCriterion("type_template_id =", value, "typeTemplateId");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdNotEqualTo(String value) {
            addCriterion("type_template_id <>", value, "typeTemplateId");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdGreaterThan(String value) {
            addCriterion("type_template_id <>", value, "typeTemplateId");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdGreaterThanEqualTo(String value) {
            addCriterion("type_template_id >=", value, "typeTemplateId");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("type_template_id <=", value, "typeTemplateId");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdLike(String value) {
            addCriterion("type_template_id like", value, "typeTemplateId");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdNotLike(String value) {
            addCriterion("type_template_id not like", value, "typeTemplateId");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdBetween(String value1, String value2) {
            addCriterion("type_template_id between", value1, value2, "typeTemplateId");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdNotBetween(String value1, String value2) {
            addCriterion("type_template_id not between", value1, value2, "typeTemplateId");
            return (Criteria) this;
        }
        //end is_enable_spec

        //start is_enable_spec
        public Criteria anIsEnableSpecIsNull() {
            addCriterion("is_enable_spec is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecNotNull() {
            addCriterion("is_enable_spec is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecEqualTo(String value) {
            addCriterion("is_enable_spec =", value, "isEnableSpec");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecNotEqualTo(String value) {
            addCriterion("is_enable_spec <>", value, "isEnableSpec");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecGreaterThan(String value) {
            addCriterion("is_enable_spec <>", value, "isEnableSpec");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecGreaterThanEqualTo(String value) {
            addCriterion("is_enable_spec >=", value, "isEnableSpec");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecGreaterThanOrEqualTo(String value) {
            addCriterion("is_enable_spec <=", value, "isEnableSpec");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecLike(String value) {
            addCriterion("is_enable_spec like", value, "isEnableSpec");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecNotLike(String value) {
            addCriterion("is_enable_spec not like", value, "isEnableSpec");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecBetween(String value1, String value2) {
            addCriterion("is_enable_spec between", value1, value2, "isEnableSpec");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecNotBetween(String value1, String value2) {
            addCriterion("is_enable_spec not between", value1, value2, "isEnableSpec");
            return (Criteria) this;
        }
        //end

        //start small_pic
        public Criteria andIsDeleteNull() {
            addCriterion("is_delete is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotNull() {
            addCriterion("is_delete is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(String value) {
            addCriterion("is_delete =", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(String value) {
            addCriterion("is_delete <>", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(String value) {
            addCriterion("is_delete <>", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanEqualTo(String value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLike(String value) {
            addCriterion("is_delete like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotLike(String value) {
            addCriterion("is_delete not like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(String value1, String value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(String value1, String value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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

