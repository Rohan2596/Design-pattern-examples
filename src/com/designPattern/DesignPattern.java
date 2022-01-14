package com.designPattern;


import com.designPattern.type.LargePackage;
import com.designPattern.type.MediumPackage;
import com.designPattern.type.SmallPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * @author : ROHAN RAVINDRA KADAM
 * @purpose: Facade  Design pattern main class
 * @name   : DesignPattern
 * */
public class DesignPattern {

    public static double calculateCost(List<Visitable> packages){
        PackageVisitor packageVisitor= new PackageVisitor();
        for (Visitable items:packages) {
            items.accept(packageVisitor);
        }
        return packageVisitor.getTotalCost();

    }


    public static void main(String[] args) {

        List<Visitable> packages= new ArrayList<>();
        packages.add(new SmallPackage("SMALL",10));
        packages.add(new MediumPackage("MEDIUM",20));
        packages.add(new LargePackage("LARGE",30));
        System.out.println("Total Checkout Cost:-"+calculateCost(packages));



    }
}
