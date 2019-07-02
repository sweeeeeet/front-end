package com.github.sweeeeeet.dao;

import com.github.sweeeeeet.entity.MemoGroup;

import java.util.List;

/**
 * Author:sweet
 * Created:2019/6/30
 * 用户的持久层接口
 */
public interface IMemoDao {
        /**
        * @Description: 查询所有操作
        * @Param:
        * @return:
        */
    List<MemoGroup> findAll();
    
        /** 
        * @Description: 保存
        * @Param:  
        * @return:  
        */
    void save(MemoGroup m);

    /**
    * @Description: 更新
    * @Param:
    * @return:
    */
    void  update(MemoGroup m);
    
    /** 
    * @Description: 删除操作 
    * @Param:  
    * @return:  
    */
    void delete(int id);

    /**
    * @Description: 查询用户信息
    * @Param:
    * @return:
    */
    MemoGroup findById(int id);

    /**
    * @Description: 根据名称模糊查询
    * @Param:
    * @return:
    */
    List<MemoGroup> findByName(String name);

    /**
    * @Description: 使用聚合函数查询记录的条数
    * @Param:
    * @return:
    */
    int count();
}
