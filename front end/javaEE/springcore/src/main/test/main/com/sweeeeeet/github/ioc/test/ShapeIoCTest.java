package main.com.sweeeeeet.github.ioc.test;

import com.sweeeeeet.github.ioc.apply.Rectangle;
import com.sweeeeeet.github.ioc.apply.XMLShapeCompute;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:sweet
 * Created:2019/5/19
 */

public class ShapeIoCTest {



    public ApplicationContext context=null;

    @Before
    public void testInit(){
context=new ClassPathXmlApplicationContext("applicationContext.xml");


    }
    @Test
    public void testFunc(){
         XMLShapeCompute shapeCompute=null;

        shapeCompute=(XMLShapeCompute) context.getBean("shapeCompute");

        System.out.println(shapeCompute.compute("circular"));
        System.out.println(shapeCompute.compute("circular").computeArea());
        System.out.println(shapeCompute.compute("circular").computeArea());

        System.out.println(shapeCompute.compute("rectangle"));
        System.out.println(shapeCompute.compute("rectangle").computeArea());
        System.out.println(shapeCompute.compute("rectangle").computeSide());

        System.out.println(shapeCompute.compute("nothing"));
        System.out.println(shapeCompute.compute("nothing").computeArea());
        System.out.println(shapeCompute.compute("nothing").computeSide());

    }


}
