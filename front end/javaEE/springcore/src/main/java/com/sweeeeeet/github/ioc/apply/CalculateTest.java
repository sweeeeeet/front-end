package com.sweeeeeet.github.ioc.apply;

/**
 * Author:sweet
 * Created:2019/5/19
 */
public class CalculateTest {
    private IShape circular_impl;
    private IShape rectangle_impl;
    public CalculateTest(){

    }

    public IShape getCircular_impl() {
        return circular_impl;
    }

    public void setCircular_impl(IShape circular_impl) {
        this.circular_impl = circular_impl;
    }

    public IShape getRectangle_impl() {
        return rectangle_impl;
    }

    public void setRectangle_impl(IShape rectangle_impl) {
        this.rectangle_impl = rectangle_impl;
    }

    public IShape myCalculate(String shameName){
        if(shameName.equals("rectangle")){
            return this.rectangle_impl;
        }
        if(shameName.equals("circular")){
            return this.rectangle_impl;
        }
        return null;
    }
}
