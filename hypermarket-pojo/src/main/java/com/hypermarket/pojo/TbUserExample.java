package com.hypermarket.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbUserExample { //处理动态sql xml文件中给定的字段
    protected String orderByClasuse; //定义List结果排序规则
    protected boolean disinct; //结果是否去重
    protected List<Criteria> oredCriteria; //查询条件or分割成多个子查询语句

    public TbUserExample() {
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

        public Criteria andidIsNull() {
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

        /*username*/
        public Criteria andUsernameIsNull() {
            addCriterion("username is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        /*username_type*/
        public Criteria andusernameTypeIsNull() {
            addCriterion("username_type is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andusernameTypeIsNotNull() {
            addCriterion("username_type is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andusernameTypeEqualTo(String value) {
            addCriterion("username_type =", value, "usernameType");
            return (Criteria) this;
        }

        public Criteria andusernameTypeNotEqualTo(String value) {
            addCriterion("username_type <>", value, "usernameType");
            return (Criteria) this;
        }

        public Criteria andusernameTypeGreaterThan(String value) {
            addCriterion("username_type <>", value, "usernameType");
            return (Criteria) this;
        }

        public Criteria andusernameTypeGreaterThanEqualTo(String value) {
            addCriterion("username_type >=", value, "usernameType");
            return (Criteria) this;
        }

        public Criteria andusernameTypeGreaterThanOrEqualTo(String value) {
            addCriterion("username_type <=", value, "usernameType");
            return (Criteria) this;
        }

        public Criteria andusernameTypeLike(String value) {
            addCriterion("username_type like", value, "usernameType");
            return (Criteria) this;
        }

        public Criteria andusernameTypeNotLike(String value) {
            addCriterion("username_type not like", value, "usernameType");
            return (Criteria) this;
        }

        public Criteria andusernameTypeBetween(String value1, String value2) {
            addCriterion("username_type between", value1, value2, "usernameType");
            return (Criteria) this;
        }

        public Criteria andusernameTypeNotBetween(String value1, String value2) {
            addCriterion("username_type not between", value1, value2, "usernameType");
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

        //start phone
        public Criteria andPhoneIsNull() {
            addCriterion("phone is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }
        //end

        //start email
        public Criteria andemailIsNull() {
            addCriterion("email is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andemailIsNotNull() {
            addCriterion("email is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andemailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andemailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andemailGreaterThan(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andemailGreaterThanEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andemailGreaterThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andemailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andemailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andemailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andemailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }
        //end nickName

        //start nickName
        public Criteria andNickNameNull() {
            addCriterion("nickName is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andNickNameNotNull() {
            addCriterion("nickName is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nickName =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nickName <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nickName <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanEqualTo(String value) {
            addCriterion("nickName >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nickName <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nickName like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nickName not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nickName between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nickName not between", value1, value2, "nickName");
            return (Criteria) this;
        }
        //end
        
        //start nickName
        public Criteria andNameNull() {
            addCriterion("name is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andNameNotNull() {
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

        public Criteria andNamerEqualTo(String value) {
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
        //end
        
        //start nickName
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
        
        //start headPic
        public Criteria andHeadPicInNull() {
            addCriterion("head_pic is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andHeadPicInNotNull() {
            addCriterion("head_pic is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andHeadPicEqualTo(String value) {
            addCriterion("head_pic =", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotEqualTo(String value) {
            addCriterion("head_pic <>", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicGreaterThan(String value) {
            addCriterion("head_pic <>", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicGreaterThanEqualTo(String value) {
            addCriterion("head_pic >=", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicGreaterThanOrEqualTo(String value) {
            addCriterion("head_pic <=", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicLike(String value) {
            addCriterion("head_pic like", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotLike(String value) {
            addCriterion("head_pic not like", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicBetween(String value1, String value2) {
            addCriterion("head_pic between", value1, value2, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotBetween(String value1, String value2) {
            addCriterion("head_pic not between", value1, value2, "headPic");
            return (Criteria) this;
        }
        //end

        //start qq
        public Criteria andQqIsNull() {
            addCriterion("qq is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }
        //end

        //start accountBalance
        public Criteria andAccountBalanceIsNull() {
            addCriterion("account_balance is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andAccountBalanceIsNotNull() {
            addCriterion("account_balance is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andAccountBalanceEqualTo(String value) {
            addCriterion("account_balance =", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceNotEqualTo(String value) {
            addCriterion("account_balance <>", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceGreaterThan(String value) {
            addCriterion("account_balance <>", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceGreaterThanEqualTo(String value) {
            addCriterion("account_balance >=", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("account_balance <=", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceLike(String value) {
            addCriterion("account_balance like", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceNotLike(String value) {
            addCriterion("account_balance not like", value, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceBetween(String value1, String value2) {
            addCriterion("account_balance between", value1, value2, "accountBalance");
            return (Criteria) this;
        }

        public Criteria andAccountBalanceNotBetween(String value1, String value2) {
            addCriterion("account_balance not between", value1, value2, "accountBalance");
            return (Criteria) this;
        }
        //end


        //start nickName
        public Criteria andIsMobileCheckNull() {
            addCriterion("is_mobile_check is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andIsMobileCheckNotNull() {
            addCriterion("is_mobile_check is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andIsMobileCheckEqualTo(String value) {
            addCriterion("is_mobile_check =", value, "isMobileCheck");
            return (Criteria) this;
        }

        public Criteria andIsMobileCheckNotEqualTo(String value) {
            addCriterion("is_mobile_check <>", value, "isMobileCheck");
            return (Criteria) this;
        }

        public Criteria andIsMobileCheckGreaterThan(String value) {
            addCriterion("is_mobile_check <>", value, "isMobileCheck");
            return (Criteria) this;
        }

        public Criteria andIsMobileCheckGreaterThanEqualTo(String value) {
            addCriterion("is_mobile_check >=", value, "isMobileCheck");
            return (Criteria) this;
        }

        public Criteria andIsMobileCheckGreaterThanOrEqualTo(String value) {
            addCriterion("is_mobile_check <=", value, "isMobileCheck");
            return (Criteria) this;
        }

        public Criteria andIsMobileCheckLike(String value) {
            addCriterion("is_mobile_check like", value, "isMobileCheck");
            return (Criteria) this;
        }

        public Criteria andIsMobileCheckNotLike(String value) {
            addCriterion("is_mobile_check not like", value, "isMobileCheck");
            return (Criteria) this;
        }

        public Criteria andIsMobileCheckBetween(String value1, String value2) {
            addCriterion("is_mobile_check between", value1, value2, "isMobileCheck");
            return (Criteria) this;
        }

        public Criteria andIsMobileCheckNotBetween(String value1, String value2) {
            addCriterion("is_mobile_check not between", value1, value2, "isMobileCheck");
            return (Criteria) this;
        }
        //end

        //start nickName
        public Criteria andIsEmailCheckNull() {
            addCriterion("is_email_check is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckNotNull() {
            addCriterion("is_email_check is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckEqualTo(String value) {
            addCriterion("is_email_check =", value, "isEmailCheck");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckNotEqualTo(String value) {
            addCriterion("is_email_check <>", value, "isEmailCheck");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckGreaterThan(String value) {
            addCriterion("is_email_check <>", value, "isEmailCheck");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckGreaterThanEqualTo(String value) {
            addCriterion("is_email_check >=", value, "isEmailCheck");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckGreaterThanOrEqualTo(String value) {
            addCriterion("is_email_check <=", value, "isEmailCheck");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckLike(String value) {
            addCriterion("is_email_check like", value, "isEmailCheck");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckNotLike(String value) {
            addCriterion("is_email_check not like", value, "isEmailCheck");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckBetween(String value1, String value2) {
            addCriterion("is_email_check between", value1, value2, "isEmailCheck");
            return (Criteria) this;
        }

        public Criteria andIsEmailCheckNotBetween(String value1, String value2) {
            addCriterion("is_email_check not between", value1, value2, "isEmailCheck");
            return (Criteria) this;
        }
        //end

        //start nickName
        public Criteria andSexNull() {
            addCriterion("sex is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andSexNotNull() {
            addCriterion("sex is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }
        //end
        

        //start nickName
        public Criteria andUserLevelNull() {
            addCriterion("user_level is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andUserLevelNotNull() {
            addCriterion("user_level is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andUserLevelEqualTo(String value) {
            addCriterion("user_level =", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotEqualTo(String value) {
            addCriterion("user_level <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThan(String value) {
            addCriterion("user_level <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanEqualTo(String value) {
            addCriterion("user_level >=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanOrEqualTo(String value) {
            addCriterion("user_level <=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLike(String value) {
            addCriterion("user_level like", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotLike(String value) {
            addCriterion("user_level not like", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelBetween(String value1, String value2) {
            addCriterion("user_level between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotBetween(String value1, String value2) {
            addCriterion("user_level not between", value1, value2, "userLevel");
            return (Criteria) this;
        }
        //end

        //start nickName
        public Criteria andPointsNull() {
            addCriterion("points is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPointsNotNull() {
            addCriterion("points is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(String value) {
            addCriterion("points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(String value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(String value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanEqualTo(String value) {
            addCriterion("points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(String value) {
            addCriterion("points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLike(String value) {
            addCriterion("points like", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotLike(String value) {
            addCriterion("points not like", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(String value1, String value2) {
            addCriterion("points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(String value1, String value2) {
            addCriterion("points not between", value1, value2, "points");
            return (Criteria) this;
        }
        //end

        //start nickName
        public Criteria andExperienceValueNull() {
            addCriterion("experience_value is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andExperienceValueNotNull() {
            addCriterion("experience_value is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andExperienceValueEqualTo(String value) {
            addCriterion("experience_value =", value, "experienceValue");
            return (Criteria) this;
        }

        public Criteria andExperienceValueNotEqualTo(String value) {
            addCriterion("experience_value <>", value, "experienceValue");
            return (Criteria) this;
        }

        public Criteria andExperienceValueGreaterThan(String value) {
            addCriterion("experience_value <>", value, "experienceValue");
            return (Criteria) this;
        }

        public Criteria andExperienceValueGreaterThanEqualTo(String value) {
            addCriterion("experience_value >=", value, "experienceValue");
            return (Criteria) this;
        }

        public Criteria andExperienceValueOrEqualTo(String value) {
            addCriterion("experience_value <=", value, "experienceValue");
            return (Criteria) this;
        }

        public Criteria andExperienceValueLike(String value) {
            addCriterion("experience_value like", value, "experienceValue");
            return (Criteria) this;
        }

        public Criteria andExperienceValueNotLike(String value) {
            addCriterion("experience_value not like", value, "experienceValue");
            return (Criteria) this;
        }

        public Criteria andExperienceValueBetween(String value1, String value2) {
            addCriterion("experience_value between", value1, value2, "experienceValue");
            return (Criteria) this;
        }

        public Criteria andExperienceValueNotBetween(String value1, String value2) {
            addCriterion("experience_value not between", value1, value2, "experienceValue");
            return (Criteria) this;
        }
        //end


        //start nickName
        public Criteria andBirthdayNull() {
            addCriterion("birthday is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andBirthdayNotNull() {
            addCriterion("birthday is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }
        //end

        //start nickName
        public Criteria andLastLoginTimeNull() {
            addCriterion("last_login_time is null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotNull() {
            addCriterion("last_login_time is not null"); //处理的全是sql语句
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(String value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(String value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(String value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanEqualTo(String value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimerEqualTo(String value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLike(String value) {
            addCriterion("last_login_time like", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotLike(String value) {
            addCriterion("last_login_time not like", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(String value1, String value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(String value1, String value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
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

