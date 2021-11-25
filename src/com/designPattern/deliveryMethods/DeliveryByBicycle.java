package com.designPattern.deliveryMethods;

import com.designPattern.CustomPackaging;
import com.designPattern.PackageInfo;

/*
 * @author : ROHAN RAVINDRA KADAM
 * @purpose: Delivery Package by Bicycle
 * @name   : DeliveryByBicycle
 * */

public class DeliveryByBicycle implements PackageDelivery, CustomPackaging {

    @Override
    public String deliveryWay(PackageInfo packageInfo) {
        String packaging= packaging(packageInfo.getCustomPackaging());
        return "Package Delivering Using Bicycle for "+packageInfo.getSize()
                +" and weight "+packageInfo.getWeight() +"  "+packaging;
    }

    @Override
    public String packaging(Boolean condition) {
        if(condition)
            return "with custom packaging";
        return "with no custom packaging";
    }
}
