package com.designPattern.deliveryMethods;

import com.designPattern.PackageInfo;

public class DeliveryByCar implements PackageDelivery{

    @Override
    public String deliveryWay(PackageInfo packageInfo) {
        return "Package Delivering Using Car for "+packageInfo.getSize()
                +" and weight "+packageInfo.getWeight();
    }
}
