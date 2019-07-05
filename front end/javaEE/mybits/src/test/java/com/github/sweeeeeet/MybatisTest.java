package com.github.sweeeeeet;


import com.github.sweeeeeet.dao.IMemoDao;
import com.github.sweeeeeet.entity.MemoGroup;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Author:sweet
 * Created:2019/6/30
 */
public class MybatisTest {
    /*
    * 使用main方法进行测试
    * */
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
       InputStream in= Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建SqlSeonFactory工厂
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory= builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session=factory.openSession();
        //4.使用SqlSession创建DAO接口的代理对象
        IMemoDao memoDao=session.getMapper(IMemoDao.class);
        //5.使用代理对象的执行方法
        List<MemoGroup> memoGroups=memoDao.findAll();
        for(MemoGroup m:memoGroups){
            System.out.println(m);
        }
        //6.释放资源
        session.close();
        in.close();
    }


}
