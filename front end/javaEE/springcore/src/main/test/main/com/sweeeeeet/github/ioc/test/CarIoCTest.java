package main.com.sweeeeeet.github.ioc.test;

import com.sweeeeeet.github.ioc.practice.Car;
import com.sweeeeeet.github.ioc.practice.UserInfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:sweet
 * Created:2019/5/19
 */

public class CarIoCTest {
    private ApplicationContext context=null;
    private Car car=null;
    private UserInfo person=null;
    @Before
public void  testInit(){
         context=new ClassPathXmlApplicationContext("applicationContext.xml");

}

@Test
    public void testFunc(){
    car=(Car) context.getBean("car");

    person=(UserInfo) context.getBean("person");
       person.haveCar(true);
}
}
