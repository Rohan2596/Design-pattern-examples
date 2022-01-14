package com.designPattern;

import com.designPattern.type.LargePackage;
import com.designPattern.type.MediumPackage;
import com.designPattern.type.SmallPackage;

public class PackageVisitor implements Visitor{

    private double totalCost;
    @Override
    public void visit(SmallPackage smallPackage) {

        totalCost+=smallPackage.getPrice();
    }

    @Override
    public void visit(MediumPackage mediumPackage) {
        totalCost+=mediumPackage.getPrice();
    }

    @Override
    public void visit(LargePackage largePackage) {
        totalCost+=largePackage.getPrice();
    }


    public double getTotalCost() {
        return totalCost;
    }
}
