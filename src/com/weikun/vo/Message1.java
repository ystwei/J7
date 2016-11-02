package com.weikun.vo;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/11/2.
 */
public class Message1 implements Serializable {
    private int id;
    private String name;
    private String title;
    private String email;
    private String content;
    private String tzdate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTzdate() {
        return tzdate;
    }

    public void setTzdate(String tzdate) {
        this.tzdate = tzdate;
    }
}
