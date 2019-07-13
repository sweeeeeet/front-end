package com.sweet.test;

import com.sweet.config.SpringConfig;
import com.sweet.service.UserInfoService;
import com.sweet.vo.UserInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Author:sweet
 * Created:2019/5/18
 */



public class SpringTest {

    private AnnotationConfigApplicationContext context=null;

    @Before
    public void initFunc(){
        context=new AnnotationConfigApplicationContext(SpringConfig.class);
    }
    @Test
    public void testFunction(){
     UserInfoService userInfoService=   context.getBean(UserInfoService.class);
        List<UserInfo> userInfoServices=     userInfoService.queryUseryInfo();
        for(UserInfo userInfo:userInfoServices){
            System.out.println("username="+userInfo.getUserName()
                    +","+userInfo.getPassword()+", "
                    +userInfo.getUserAge());
        }

    }


    @After
    public void myDestroy(){
        context.destroy();
    }
}
