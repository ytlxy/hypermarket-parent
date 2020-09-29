package com.hypermarket.pojo;

import java.io.Serializable;

public class TbAddress implements Serializable {
    private Long id;
    private String userId;
    private String provinceId;
    private String cityId;
    private String townId;
    private String mobile;
    private String address;
    private String contact;
    private String isDefault;
    private String notes;
    private String createDate;
    private String alias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserid() {
        return userId;
    }

    public void setUserid(String userid) {
        this.userId = userid == null ? null : userid.trim();
    }

    public String getProvinceid() {
        return provinceId;
    }

    public void setProvinceid(String provinceid) {
        this.provinceId = provinceid == null ? null : provinceid.trim();
    }

    public String getCityid() {
        return cityId;
    }

    public void setCityid(String cityid) {
        this.cityId = cityid == null ? null : cityid.trim();
    }

    public String getTownid() {
        return townId;
    }

    public void setTownid(String townid) {
        this.townId = townid == null ? null : townid.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }
}
