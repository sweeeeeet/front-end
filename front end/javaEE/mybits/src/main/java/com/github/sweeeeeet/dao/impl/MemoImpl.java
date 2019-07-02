package com.github.sweeeeeet.dao.impl;

import com.github.sweeeeeet.dao.IMemoDao;
import com.github.sweeeeeet.entity.MemoGroup;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * Author:sweet
 * Created:2019/6/30
 */
public class MemoImpl{
//public class MemoImpl implements IMemoDao {
    private SqlSessionFactory factory;

    public MemoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }

    public List<MemoGroup> findAll() {
        //使用工厂创建SqlSession对象
        SqlSession session =factory.openSession();
        //使用session对象查询所有方法
        List<MemoGroup> memoGroups=session.
                selectList("com.github.sweeeeeet.dao.IMemoDao.findAll");
        session.close();
        //返回查询结果
        return memoGroups;
    }

    public void save(MemoGroup m) {

    }
}
