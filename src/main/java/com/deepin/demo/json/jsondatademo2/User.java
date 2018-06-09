package com.deepin.demo.json.jsondatademo2;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class User {

    private int    id;
    private String name;
    // com.alibaba.fastjson.annotation.JSONField
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date   createTime;

    public int getId() {
        return id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

}