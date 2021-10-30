package com.designPattern.proxy;

import com.designPattern.PackageInfo;
import com.designPattern.deliveryMethods.DeliveryByCar;

public class DeliveryProxyForCar  extends DeliveryByCar {

    @Override
    public String deliveryWay(PackageInfo packageInfo) {
        if(packageInfo.getWeight()>10){
            return "Package Delivering By Car for "+packageInfo.getSize()
                    +" and weight "+packageInfo.getWeight() +" is not possible due over-weight ";
        }
        return super.deliveryWay(packageInfo);
    }
}
