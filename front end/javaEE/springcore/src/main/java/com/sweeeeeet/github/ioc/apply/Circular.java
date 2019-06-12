package com.sweeeeeet.github.ioc.apply;

/**
 * Author:sweet
 * Created:2019/5/19
 */
public class Circular implements IShape{
    private final  double radius;

    //包含构造方法，因此在xml文件中采用构造注入的方式
    public Circular(double radius) {
        this.radius = radius;
    }


    @Override
    public double computeArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double computeSide() {
        return radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public String toString() {
        return "Circular{" +
                "radius=" + radius +
                '}';
    }
}
