package com.designPattern.type;

import com.designPattern.Visitable;
import com.designPattern.Visitor;

public class SmallPackage implements Visitable {


    private String size;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public SmallPackage(String size, double price) {
        this.size = size;
        this.price = price;
    }
}
