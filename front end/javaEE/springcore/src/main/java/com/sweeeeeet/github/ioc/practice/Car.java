package com.sweeeeeet.github.ioc.practice;

/**
 * Author:sweet
 * Created:2019/5/19
 */
public class Car {
    private String brand;
    private double price;
    private String name;
    private String proAdd;

    public Car() {
    }

    public String getBrand() {
        return brand;
    }



    public double getPrice() {
        return price;
    }



    public String getName() {
        return name;
    }



    public String getProAdd() {
        return proAdd;
    }



    public Car(String brand, double price, String name, String proAdd) {
        this.brand = brand;
        this.price = price;
        this.name = name;
        this.proAdd = proAdd;
    }


}
