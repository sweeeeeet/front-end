package com.sweeeeeet.github.ioc.practice;

/**
 * Author:sweet
 * Created:2019/5/19
 */
public class UserInfo {
  private   String name;
  private String sex;
private Car car;
    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Car haveCar(boolean wtCar){
        if(wtCar){
            System.out.println(toString());
            System.out.println(car.getBrand());
            System.out.println(car.getName());
            System.out.println(car.getPrice());
            System.out.println(car.getProAdd());
        }
        return null;
    }
}
