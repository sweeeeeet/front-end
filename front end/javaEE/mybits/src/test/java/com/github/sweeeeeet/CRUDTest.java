package com.github.sweeeeeet;

import com.github.sweeeeeet.dao.IMemoDao;
import com.github.sweeeeeet.entity.MemoGroup;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.List;

/**
 * Author:sweet
 * Created:2019/7/1
 */
public class CRUDTest {

        private InputStream in;
        private SqlSession session;
        private IMemoDao memoDao;

        @Before
        public void init() throws IOException {
            //1.读取配置文件
            in = Resources.getResourceAsStream("mybatis-config.xml");
            //2.创建SqlSeonFactory工厂
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(in);
            //3.使用工厂生产SqlSession对象
            session = factory.openSession();
            //4.使用SqlSession创建DAO接口的代理对象
            memoDao = session.getMapper(IMemoDao.class);
        }

    @Test
    public void testSave() {
        MemoGroup memoGroup = new MemoGroup();
        memoGroup.setId(12);
        memoGroup.setName("python");
        memoGroup.setCreate_time(new Date(20190901));
        //执行插入操作
        memoDao.save(memoGroup);
        //执行更新方法
        memoDao.update(memoGroup);
        //执行删除操作
        memoDao.delete(12);
        //执行查找操作
       System.out.println(memoDao.findById(2));


       //模糊查询 匹配 #{id} 通配符的方式：
        //List<MemoGroup> memoGroups=memoDao.findByName("%a");
        //匹配此种通配符:'%${value}%'
        List<MemoGroup> memoGroups=memoDao.findByName("a");
        for(MemoGroup me:memoGroups){
            System.out.println(me);
        }

        //聚合函数查询记录总条数
        System.out.println(memoDao.count());;
        //提交事务
        session.commit();
    }

    @Test
    public void testInsert(){
        MemoGroup memoGroup = new MemoGroup();
        memoGroup.setId(5);
        memoGroup.setName("python");
        memoGroup.setCreate_time(new Date(20190901));
        System.out.println(memoGroup);
        memoDao.save(memoGroup);
        System.out.println(memoGroup);
        session.commit();
    }

        @After
        public  void destory() throws IOException {


            //6.释放资源
            session.close();
            in.close();
        }


    }

