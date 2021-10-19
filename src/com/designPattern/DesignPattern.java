package com.designPattern;


/*
* @author : ROHAN RAVINDRA KADAM
* @purpose: Factory  Design pattern main class
* @name   : DesignPattern
* */
public class DesignPattern {

    public static void main(String[] args) {
        System.out.println("***** Delivery Manager Process Started *****");

        DeliveryManager deliveryManager=new DeliveryManager();

        //Package Info Size Small and weight 5kgs
        PackageInfo packageInfoSmall=new PackageInfo("SMALL","5");
        System.out.println( deliveryManager.deliveryManagerFactory(packageInfoSmall));

        //Package Info Size Small and weight 5kgs
        PackageInfo packageInfoMedium=new PackageInfo("MEDIUM","10");
        System.out.println(deliveryManager.deliveryManagerFactory(packageInfoMedium));

        //Package Info Size Small and weight 5kgs
        PackageInfo packageInfoLarge=new PackageInfo("LARGE","20");
        System.out.println(deliveryManager.deliveryManagerFactory(packageInfoLarge));

    }
}
