package com.hypermarket.pojo;

import java.io.Serializable;

public class TbBrand implements Serializable {
    private Long id;
    private String name;
    private String firstChar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getfirstChar() {
        return firstChar;
    }

    public void setfirstChar(String firstChar) {
        this.firstChar = firstChar == null ? null : firstChar.trim();
    }
}
