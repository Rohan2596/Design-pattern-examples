package com.designPattern.proxy;

import com.designPattern.PackageInfo;
import com.designPattern.deliveryMethods.DeliveryByBicycle;
import com.designPattern.deliveryMethods.DeliveryByCar;
import com.designPattern.deliveryMethods.DeliveryByTruck;

public class DeliveryProxyForBicycle extends DeliveryByBicycle {

    @Override
    public String deliveryWay(PackageInfo packageInfo) {
        if(packageInfo.getWeight()>5){
            return "Package Delivering By Bicycle for "+packageInfo.getSize()
                    +" and weight "+packageInfo.getWeight() +" is not possible due over-weight ";
        }
        return super.deliveryWay(packageInfo);
    }
}
