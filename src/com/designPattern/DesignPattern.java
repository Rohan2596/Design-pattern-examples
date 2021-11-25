package com.designPattern;


import java.util.Scanner;

/*
 * @author : ROHAN RAVINDRA KADAM
 * @purpose: Facade  Design pattern main class
 * @name   : DesignPattern
 * */
public class DesignPattern {

    public static void main(String[] args) {
        System.out.println("***** Delivery Manager Process Started *****");

        DeliveryManager deliveryManager = new DeliveryManager();

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Package Size SMALL,LARGE OR MEDIUM");
       String size=scanner.next();

        System.out.println("Enter the Package weight ie 5,10 or 20");
        int weight=scanner.nextInt();

        System.out.println("Enter Custom Packaging True or False");
        boolean condition =scanner.nextBoolean();

        PackageInfo packageInfo= new PackageInfo(size,weight,condition);
        System.out.println(deliveryManager.deliveryManagerFactory(packageInfo));

    }
}
