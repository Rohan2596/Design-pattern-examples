package com.designPattern.deliveryMethods;

import com.designPattern.PackageInfo;

/*
 * @author : ROHAN RAVINDRA KADAM
 * @purpose: Delivery Package by Truck
 * @name   : DeliveryByTruck
 * */

public class DeliveryByTruck implements PackageDelivery{

    @Override
    public String deliveryWay(PackageInfo packageInfo) {
        return "Package Delivering Using Truck for "+packageInfo.getSize()
                +" and weight "+packageInfo.getWeight();
    }
}
