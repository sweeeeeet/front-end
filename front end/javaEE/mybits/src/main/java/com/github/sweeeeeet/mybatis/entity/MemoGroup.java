package com.github.sweeeeeet.mybatis.entity;

import java.sql.Date;

/**
 * Author:sweet
 * Created:2019/5/10
 */
public class MemoGroup {
    private Integer id;
    private String name;
    private Date createdTime;
    private Date modifyTime;

    @Override
    public String toString() {
        return "MemoGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", create_time=" + createdTime +
                ", modify_time=" + modifyTime +
                '}';
    }

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

    public Date getCreate_time() {
        return createdTime;
    }

    public void setCreate_time(Date create_time) {
        this.createdTime = create_time;
    }

    public Date getModify_time() {
        return modifyTime;
    }

    public void setModify_time(Date modify_time) {
        this.modifyTime = modify_time;
    }
}
