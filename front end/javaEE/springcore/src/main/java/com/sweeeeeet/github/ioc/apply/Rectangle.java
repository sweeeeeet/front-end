package com.sweeeeeet.github.ioc.apply;

/**
 * Author:sweet
 * Created:2019/5/19
 */

//利用接口控制反转
public class Rectangle implements IShape{

    //类中的属性依赖注入
    private final double width;
    private final double height;

    //包含构造方法，因此在xml文件中采用构造注入的方式
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return width*height;
    }

    @Override
    public double computeSide() {
        return (width+height)*2;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
