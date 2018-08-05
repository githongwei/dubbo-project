package com.pack.dubbo.entity;

import java.io.Serializable;

/**
 * @author 娃哈哈
 * 用户实体对象
 */
public class User implements Serializable{

    private Integer id;

    private String name;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
