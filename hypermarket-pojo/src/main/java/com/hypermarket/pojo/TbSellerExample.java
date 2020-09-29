package com.hypermarket.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbSellerExample { //处理动态sql xml文件中给定的字段
    protected String orderByClasuse; //定义List结果排序规则
    protected boolean disinct; //结果是否去重
    protected List oredCriteria; //查询条件or分割成多个子查询语句

    public TbSellerExample() {
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

        public Criteria andidIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }


        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Long value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Long value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Long value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Long value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Long> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Long> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(List value1, Long value2) {
            addCriterion("seller_id not in", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        /*name*/
        public Criteria andNameIsNull() {
            addCriterion("name is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        /*nick_name*/
        public Criteria andnickNmaeIsNull() {
            addCriterion("nick_name is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andNickNmaeIsNotNull() {
            addCriterion("nick_name is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andNickNmaeEqualTo(String value) {
            addCriterion("nick_name =", value, "nickNmae");
            return (Criteria) this;
        }

        public Criteria andNickNmaeNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickNmae");
            return (Criteria) this;
        }

        public Criteria andNickNmaeGreaterThan(String value) {
            addCriterion("nick_name <>", value, "nickNmae");
            return (Criteria) this;
        }

        public Criteria andNickNmaeGreaterThanEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickNmae");
            return (Criteria) this;
        }

        public Criteria andNickNmaeGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickNmae");
            return (Criteria) this;
        }

        public Criteria andNickNmaeLike(String value) {
            addCriterion("nick_name like", value, "nickNmae");
            return (Criteria) this;
        }

        public Criteria andNickNmaeNotLike(String value) {
            addCriterion("nick_name not like", value, "nickNmae");
            return (Criteria) this;
        }

        public Criteria andNickNmaeBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickNmae");
            return (Criteria) this;
        }

        public Criteria andNickNmaeNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickNmae");
            return (Criteria) this;
        }

        /*city_id*/
        public Criteria andPasswordIsNull() {
            addCriterion("password is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        //start email
        public Criteria andEmailIsNull() {
            addCriterion("email is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }
        //end

        //start email
        public Criteria andemailIsNull() {
            addCriterion("mobile is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andemailIsNotNull() {
            addCriterion("mobile is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andemailEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andemailNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andemailGreaterThan(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andemailGreaterThanEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andemailGreaterThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andemailLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andemailNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andemailBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andemailNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }
        //end telephone

        //start telephone
        public Criteria andTelephoneNull() {
            addCriterion("telephone is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andTelephoneNotNull() {
            addCriterion("telephone is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }
        //end

        //start telephone
        public Criteria andStatusNull() {
            addCriterion("status is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andStatusNotNull() {
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
        
        //start addressDetail
        public Criteria andAddressDetailInNull() {
            addCriterion("address_detail is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andAddressDetailInNotNull() {
            addCriterion("address_detail is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andAddressDetailEqualTo(String value) {
            addCriterion("address_detail =", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotEqualTo(String value) {
            addCriterion("address_detail <>", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailGreaterThan(String value) {
            addCriterion("address_detail <>", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailGreaterThanEqualTo(String value) {
            addCriterion("address_detail >=", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("address_detail <=", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLike(String value) {
            addCriterion("address_detail like", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotLike(String value) {
            addCriterion("address_detail not like", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailBetween(String value1, String value2) {
            addCriterion("address_detail between", value1, value2, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotBetween(String value1, String value2) {
            addCriterion("address_detail not between", value1, value2, "addressDetail");
            return (Criteria) this;
        }
        //end

        //start linkmanName
        public Criteria andlinkmanNameIsNull() {
            addCriterion("linkman_name is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andlinkmanNameIsNotNull() {
            addCriterion("linkman_name is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andlinkmanNameEqualTo(String value) {
            addCriterion("linkman_name =", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andlinkmanNameNotEqualTo(String value) {
            addCriterion("linkman_name <>", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andlinkmanNameGreaterThan(String value) {
            addCriterion("linkman_name <>", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andlinkmanNameGreaterThanEqualTo(String value) {
            addCriterion("linkman_name >=", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andlinkmanNameGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_name <=", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andlinkmanNameLike(String value) {
            addCriterion("linkman_name like", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andlinkmanNameNotLike(String value) {
            addCriterion("linkman_name not like", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andlinkmanNameBetween(String value1, String value2) {
            addCriterion("linkman_name between", value1, value2, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andlinkmanNameNotBetween(String value1, String value2) {
            addCriterion("linkman_name not between", value1, value2, "linkmanName");
            return (Criteria) this;
        }
        //end


        //start telephone
        public Criteria andLinkmanqqNull() {
            addCriterion("linkman_qq is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andLinkmanqqNotNull() {
            addCriterion("linkman_qq is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andLinkmanqqEqualTo(String value) {
            addCriterion("linkman_qq =", value, "linkmanqq");
            return (Criteria) this;
        }

        public Criteria andLinkmanqqNotEqualTo(String value) {
            addCriterion("linkman_qq <>", value, "linkmanqq");
            return (Criteria) this;
        }

        public Criteria andLinkmanqqGreaterThan(String value) {
            addCriterion("linkman_qq <>", value, "linkmanqq");
            return (Criteria) this;
        }

        public Criteria andLinkmanqqGreaterThanEqualTo(String value) {
            addCriterion("linkman_qq >=", value, "linkmanqq");
            return (Criteria) this;
        }

        public Criteria andLinkmanqqGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_qq <=", value, "linkmanqq");
            return (Criteria) this;
        }

        public Criteria andLinkmanqqLike(String value) {
            addCriterion("linkman_qq like", value, "linkmanqq");
            return (Criteria) this;
        }

        public Criteria andLinkmanqqNotLike(String value) {
            addCriterion("linkman_qq not like", value, "linkmanqq");
            return (Criteria) this;
        }

        public Criteria andLinkmanqqBetween(String value1, String value2) {
            addCriterion("linkman_qq between", value1, value2, "linkmanqq");
            return (Criteria) this;
        }

        public Criteria andLinkmanqqNotBetween(String value1, String value2) {
            addCriterion("linkman_qq not between", value1, value2, "linkmanqq");
            return (Criteria) this;
        }
        //end

        //start telephone
        public Criteria andLinkmanMobileNull() {
            addCriterion("linkman_mobile is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotNull() {
            addCriterion("linkman_mobile is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileEqualTo(String value) {
            addCriterion("linkman_mobile =", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotEqualTo(String value) {
            addCriterion("linkman_mobile <>", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileGreaterThan(String value) {
            addCriterion("linkman_mobile <>", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileGreaterThanEqualTo(String value) {
            addCriterion("linkman_mobile >=", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_mobile <=", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileLike(String value) {
            addCriterion("linkman_mobile like", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotLike(String value) {
            addCriterion("linkman_mobile not like", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileBetween(String value1, String value2) {
            addCriterion("linkman_mobile between", value1, value2, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotBetween(String value1, String value2) {
            addCriterion("linkman_mobile not between", value1, value2, "linkmanMobile");
            return (Criteria) this;
        }
        //end

        //start telephone
        public Criteria andLinkmanEmailNull() {
            addCriterion("linkman_email is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotNull() {
            addCriterion("linkman_email is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailEqualTo(String value) {
            addCriterion("linkman_email =", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotEqualTo(String value) {
            addCriterion("linkman_email <>", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailGreaterThan(String value) {
            addCriterion("linkman_email <>", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailGreaterThanEqualTo(String value) {
            addCriterion("linkman_email >=", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_email <=", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailLike(String value) {
            addCriterion("linkman_email like", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotLike(String value) {
            addCriterion("linkman_email not like", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailBetween(String value1, String value2) {
            addCriterion("linkman_email between", value1, value2, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotBetween(String value1, String value2) {
            addCriterion("linkman_email not between", value1, value2, "linkmanEmail");
            return (Criteria) this;
        }
        //end
        

        //start telephone
        public Criteria andLicenseNumberNull() {
            addCriterion("license_number is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotNull() {
            addCriterion("license_number is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andLicenseNumberEqualTo(String value) {
            addCriterion("license_number =", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotEqualTo(String value) {
            addCriterion("license_number <>", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThan(String value) {
            addCriterion("license_number <>", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThanEqualTo(String value) {
            addCriterion("license_number >=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("license_number <=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLike(String value) {
            addCriterion("license_number like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotLike(String value) {
            addCriterion("license_number not like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberBetween(String value1, String value2) {
            addCriterion("license_number between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotBetween(String value1, String value2) {
            addCriterion("license_number not between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }
        //end

        //start telephone
        public Criteria andTaxNumberNull() {
            addCriterion("tax_number is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andTaxNumberNotNull() {
            addCriterion("tax_number is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andTaxNumberEqualTo(String value) {
            addCriterion("tax_number =", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberNotEqualTo(String value) {
            addCriterion("tax_number <>", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberGreaterThan(String value) {
            addCriterion("tax_number <>", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberGreaterThanEqualTo(String value) {
            addCriterion("tax_number >=", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberGreaterThanOrEqualTo(String value) {
            addCriterion("tax_number <=", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberLike(String value) {
            addCriterion("tax_number like", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberNotLike(String value) {
            addCriterion("tax_number not like", value, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberBetween(String value1, String value2) {
            addCriterion("tax_number between", value1, value2, "taxNumber");
            return (Criteria) this;
        }

        public Criteria andTaxNumberNotBetween(String value1, String value2) {
            addCriterion("tax_number not between", value1, value2, "taxNumber");
            return (Criteria) this;
        }
        //end

        //start telephone
        public Criteria andOrgNumberNull() {
            addCriterion("org_number is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andOrgNumberNotNull() {
            addCriterion("org_number is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andOrgNumberEqualTo(String value) {
            addCriterion("org_number =", value, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgNumberNotEqualTo(String value) {
            addCriterion("org_number <>", value, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgNumberGreaterThan(String value) {
            addCriterion("org_number <>", value, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgNumberGreaterThanEqualTo(String value) {
            addCriterion("org_number >=", value, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgNumberOrEqualTo(String value) {
            addCriterion("org_number <=", value, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgNumberLike(String value) {
            addCriterion("org_number like", value, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgNumberNotLike(String value) {
            addCriterion("org_number not like", value, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgNumberBetween(String value1, String value2) {
            addCriterion("org_number between", value1, value2, "orgNumber");
            return (Criteria) this;
        }

        public Criteria andOrgNumberNotBetween(String value1, String value2) {
            addCriterion("org_number not between", value1, value2, "orgNumber");
            return (Criteria) this;
        }
        //end


        //start telephone
        public Criteria andAddressNull() {
            addCriterion("address is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andAddressNotNull() {
            addCriterion("address is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }
        //end

        //start telephone
        public Criteria andLogoPicNull() {
            addCriterion("logo_pic is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andLogoPicNotNull() {
            addCriterion("logo_pic is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andLogoPicEqualTo(String value) {
            addCriterion("logo_pic =", value, "logoPic");
            return (Criteria) this;
        }

        public Criteria andLogoPicNotEqualTo(String value) {
            addCriterion("logo_pic <>", value, "logoPic");
            return (Criteria) this;
        }

        public Criteria andLogoPicGreaterThan(String value) {
            addCriterion("logo_pic <>", value, "logoPic");
            return (Criteria) this;
        }

        public Criteria andLogoPicGreaterThanEqualTo(String value) {
            addCriterion("logo_pic >=", value, "logoPic");
            return (Criteria) this;
        }

        public Criteria andLogoPicrEqualTo(String value) {
            addCriterion("logo_pic <=", value, "logoPic");
            return (Criteria) this;
        }

        public Criteria andLogoPicLike(String value) {
            addCriterion("logo_pic like", value, "logoPic");
            return (Criteria) this;
        }

        public Criteria andLogoPicNotLike(String value) {
            addCriterion("logo_pic not like", value, "logoPic");
            return (Criteria) this;
        }

        public Criteria andLogoPicBetween(String value1, String value2) {
            addCriterion("logo_pic between", value1, value2, "logoPic");
            return (Criteria) this;
        }

        public Criteria andLogoPicNotBetween(String value1, String value2) {
            addCriterion("logo_pic not between", value1, value2, "logoPic");
            return (Criteria) this;
        }
        //end

        //start telephone
        public Criteria andBirefNull() {
            addCriterion("biref is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andBirefNotNull() {
            addCriterion("biref is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andBirefEqualTo(String value) {
            addCriterion("biref =", value, "biref");
            return (Criteria) this;
        }

        public Criteria andBirefNotEqualTo(String value) {
            addCriterion("biref <>", value, "biref");
            return (Criteria) this;
        }

        public Criteria andBirefGreaterThan(String value) {
            addCriterion("biref <>", value, "biref");
            return (Criteria) this;
        }

        public Criteria andBirefGreaterThanEqualTo(String value) {
            addCriterion("biref >=", value, "biref");
            return (Criteria) this;
        }

        public Criteria andBirefrEqualTo(String value) {
            addCriterion("biref <=", value, "biref");
            return (Criteria) this;
        }

        public Criteria andBirefLike(String value) {
            addCriterion("biref like", value, "biref");
            return (Criteria) this;
        }

        public Criteria andBirefNotLike(String value) {
            addCriterion("biref not like", value, "biref");
            return (Criteria) this;
        }

        public Criteria andBirefBetween(String value1, String value2) {
            addCriterion("biref between", value1, value2, "biref");
            return (Criteria) this;
        }

        public Criteria andBirefNotBetween(String value1, String value2) {
            addCriterion("biref not between", value1, value2, "biref");
            return (Criteria) this;
        }
        //end

        //start telephone
        public Criteria andCreateTimeNull() {
            addCriterion("create_time is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotNull() {
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

        public Criteria andCreateTimeNotGreaterThanEqualTo(String value) {
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
        //end

        //start telephone
        public Criteria andLegalPersonNull() {
            addCriterion("legal_person is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotNull() {
            addCriterion("legal_person is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("legal_person =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("legal_person <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("legal_person <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanEqualTo(String value) {
            addCriterion("legal_person >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotGreaterThanEqualTo(String value) {
            addCriterion("legal_person <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("legal_person like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("legal_person not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("legal_person between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("legal_person not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }
        //end legal_person_card_id

        //start telephone
        public Criteria andLegalPersonCardIdNull() {
            addCriterion("legal_person_card_id is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardNotNull() {
            addCriterion("legal_person_card_id is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardEqualTo(String value) {
            addCriterion("legal_person_card_id =", value, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardNotEqualTo(String value) {
            addCriterion("legal_person_card_id <>", value, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdGreaterThan(String value) {
            addCriterion("legal_person_card_id <>", value, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdGreaterThanEqualTo(String value) {
            addCriterion("legal_person_card_id >=", value, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdNotGreaterThanEqualTo(String value) {
            addCriterion("legal_person_card_id <=", value, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdLike(String value) {
            addCriterion("legal_person_card_id like", value, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdNotLike(String value) {
            addCriterion("legal_person_card_id not like", value, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdBetween(String value1, String value2) {
            addCriterion("legal_person_card_id between", value1, value2, "legalPersonCardId");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCardIdNotBetween(String value1, String value2) {
            addCriterion("legal_person_card_id not between", value1, value2, "legalPersonCardId");
            return (Criteria) this;
        }
        //end back_user

        //start telephone
        public Criteria andBankUserIdNull() {
            addCriterion("back_user is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andBankUserIdNotNull() {
            addCriterion("back_user is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andBankUserIdEqualTo(String value) {
            addCriterion("back_user =", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserIdNotEqualTo(String value) {
            addCriterion("back_user <>", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserIdGreaterThan(String value) {
            addCriterion("back_user <>", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andvGreaterThanEqualTo(String value) {
            addCriterion("back_user >=", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserIdNotGreaterThanEqualTo(String value) {
            addCriterion("back_user <=", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserIdLike(String value) {
            addCriterion("back_user like", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserIdNotLike(String value) {
            addCriterion("back_user not like", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserIdBetween(String value1, String value2) {
            addCriterion("back_user between", value1, value2, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserIdNotBetween(String value1, String value2) {
            addCriterion("back_user not between", value1, value2, "bankUser");
            return (Criteria) this;
        }
        //end

        //start back_name
        public Criteria andBankNameIdNull() {
            addCriterion("back_name is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andBankNameIdNotNull() {
            addCriterion("back_name is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andBankNameIdEqualTo(String value) {
            addCriterion("back_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIdNotEqualTo(String value) {
            addCriterion("back_name <>", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankNameIdGreaterThan(String value) {
            addCriterion("back_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameThanEqualTo(String value) {
            addCriterion("back_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotGreaterThanEqualTo(String value) {
            addCriterion("back_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("back_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankvNotLike(String value) {
            addCriterion("back_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("back_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("back_name not between", value1, value2, "bankName");
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

