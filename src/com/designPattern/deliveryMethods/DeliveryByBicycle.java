package com.designPattern.deliveryMethods;

import com.designPattern.PackageInfo;

/*
 * @author : ROHAN RAVINDRA KADAM
 * @purpose: Delivery Package by Bicycle
 * @name   : DeliveryByBicycle
 * */

public class DeliveryByBicycle implements PackageDelivery {

    @Override
    public String deliveryWay(PackageInfo packageInfo) {
        return "Package Delivering Using Bicycle for "+packageInfo.getSize()
                +" and weight "+packageInfo.getWeight();
    }
}
