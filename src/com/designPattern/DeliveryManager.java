package com.designPattern;

import com.designPattern.deliveryMethods.DeliveryByBicycle;
import com.designPattern.deliveryMethods.DeliveryByCar;
import com.designPattern.deliveryMethods.DeliveryByTruck;



public class DeliveryManager {

   public String deliveryManagerFactory(PackageInfo packageInfo){


       if(packageInfo.getSize().equals("SMALL")){
           return new DeliveryByBicycle().deliveryWay(packageInfo);
       }
       if(packageInfo.getSize().equals("MEDIUM")){
           return new DeliveryByCar().deliveryWay(packageInfo);
       }
       if(packageInfo.getSize().equals("LARGE")){
           return new DeliveryByTruck().deliveryWay(packageInfo);
       }
       return "FAILED TO DELIVERY";
   }
}
