package com.example.jsondemo1.jsondatademo2;

//import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class User {

    private int    id;
    private String name;

    // com.alibaba.fastjson.annotation.JSONField
//    @JSONField(serialize=false)
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss" )
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