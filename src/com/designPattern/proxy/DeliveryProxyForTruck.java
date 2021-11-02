package com.designPattern.proxy;

import com.designPattern.PackageInfo;
import com.designPattern.deliveryMethods.DeliveryByCar;
import com.designPattern.deliveryMethods.DeliveryByTruck;

public class DeliveryProxyForTruck extends DeliveryByTruck {

    @Override
    public String deliveryWay(PackageInfo packageInfo) {
        if(packageInfo.getWeight()>50){
            return "Package Delivering By Truck for "+packageInfo.getSize()
                    +" and weight "+packageInfo.getWeight()
                    +" is not possible due over-weight ";
        }
        return super.deliveryWay(packageInfo);
    }
}
