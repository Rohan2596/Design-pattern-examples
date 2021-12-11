package com.designPattern;

import com.designPattern.deliveryMethods.DeliveryByBicycle;
import com.designPattern.deliveryMethods.DeliveryByCar;
import com.designPattern.deliveryMethods.DeliveryByTruck;
import com.designPattern.proxy.DeliveryProxyForBicycle;
import com.designPattern.proxy.DeliveryProxyForCar;
import com.designPattern.proxy.DeliveryProxyForTruck;

/*
 * @author : ROHAN RAVINDRA KADAM
 * @purpose: Delivery Manager or Factory Class
 * @name   : DeliveryManager
 * */

public class DeliveryManager {

   public String deliveryManagerFactory(PackageInfo packageInfo){


       if(packageInfo.getSize().equals("SMALL")){

           return new DeliveryByBicycle()
                   .deliveryWay(packageInfo);
       }
       if(packageInfo.getSize().equals("MEDIUM")){

           return new DeliveryByCar()
                   .deliveryWay(packageInfo);
       }
       if(packageInfo.getSize().equals("LARGE")){

           return new DeliveryByTruck()
                   .deliveryWay(packageInfo);
       }
       return "FAILED TO DELIVERY";
   }
}
