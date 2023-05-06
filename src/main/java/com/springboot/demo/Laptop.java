package com.springboot.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    private int lid;
    private String brand;
    private Laptop laptop;

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", laptop=" + laptop +
                '}';
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void compile(){
        System.out.println("compiling");
    }

}
