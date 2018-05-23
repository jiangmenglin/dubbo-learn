package com.jml.serviceapi.domain;

import java.io.Serializable;

/**
 * @Author: jml
 * @Date: 18-5-22
 * @Description:
 */
public class City implements Serializable {
    private static final long serialVersionUID = -3151380724426948922L;

    private Long id;

    private String name;

    private String state;

    private String country;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
