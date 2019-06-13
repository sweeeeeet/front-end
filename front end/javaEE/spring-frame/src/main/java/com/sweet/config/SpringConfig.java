package com.sweet.config;

import com.jolbox.bonecp.BoneCPDataSource;
import com.sweet.dao.UserInfoDAO;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Author:sweet
 * Created:2019/5/18
 * 配置spring框架
 * configation spring framwork
 */

@Configurable//配置spring的相关信息
@ComponentScan(basePackages = "com.sweet")//扫描组件
@PropertySource(value = "classpath:jdbc.properties",ignoreResourceNotFound = true)
public class SpringConfig {
    @Value("${jdbc.driver}")
    private String driverClass;
    @Value("${jdbc.url}")
    private String dbUrl;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;


    @Bean//将这段代码连接JDBC交给spring管理
    public BoneCPDataSource boneCPDataSource(){
        BoneCPDataSource boneCPDataSource=new BoneCPDataSource();
        boneCPDataSource.setDriverClass(driverClass);
        boneCPDataSource.setJdbcUrl(dbUrl);
        boneCPDataSource.setUsername(username);
        boneCPDataSource.setPassword(password);
        boneCPDataSource.setIdleConnectionTestPeriodInMinutes(60);
        boneCPDataSource.setIdleConnectionTestPeriod(30);
        boneCPDataSource.setMaxConnectionAgeInSeconds(20);
                return boneCPDataSource;
    }

    /*
    * 1.配置spring 的bean(管理类于类之间的关系)
    * */

    @Bean//代表的是spring管理的类 IOC,相当于会自动new对象，并通过get方法返回这个对象
    public UserInfoDAO getUsrInfoDAO(){
        return new UserInfoDAO();
    }


}
