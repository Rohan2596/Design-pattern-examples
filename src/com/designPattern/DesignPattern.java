package com.designPattern;


import java.util.Scanner;

/*
 * @author : ROHAN RAVINDRA KADAM
 * @purpose: Proxy  Design pattern main class
 * @name   : DesignPattern
 * */
public class DesignPattern {

    public static void main(String[] args) {
        System.out.println("***** Delivery Manager Process Started *****");

        DeliveryManager deliveryManager = new DeliveryManager();

        //Package Info Size Small and weight 5kgs
        PackageInfo packageInfoSmall = new PackageInfo("SMALL", 5);
        System.out.println(deliveryManager.deliveryManagerFactory(packageInfoSmall));

        //Package Info Size Medium and weight 12kgs
        PackageInfo packageInfoMedium = new PackageInfo("MEDIUM", 12);
        System.out.println(deliveryManager.deliveryManagerFactory(packageInfoMedium));

        //Package Info Size Large and weight 20kgs
        PackageInfo packageInfoLarge = new PackageInfo("LARGE", 52);
        System.out.println(deliveryManager.deliveryManagerFactory(packageInfoLarge));

    }
}
