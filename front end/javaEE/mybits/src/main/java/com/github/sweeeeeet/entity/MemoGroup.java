package com.github.sweeeeeet.entity;

import java.sql.Date;

/**
 * Author:sweet
 * Created:2019/5/10
 */
public class MemoGroup {
    private Integer id;
    private String name;
    private Date create_time;
    private Date modify_time;

    @Override
    public String toString() {
        return "MemoGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", create_time=" + create_time +
                ", modify_time=" + modify_time +
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
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getModify_time() {
        return modify_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }
}
