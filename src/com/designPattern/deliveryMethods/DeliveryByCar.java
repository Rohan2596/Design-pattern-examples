package com.designPattern.deliveryMethods;

import com.designPattern.CustomPackaging;
import com.designPattern.PackageInfo;


/*
 * @author : ROHAN RAVINDRA KADAM
 * @purpose: Delivery Package by Car
 * @name   : DeliveryByCar
 * */

public class DeliveryByCar implements PackageDelivery, CustomPackaging {

    @Override
    public String deliveryWay(PackageInfo packageInfo) {
        String packaging= packaging(packageInfo.getCustomPackaging());
        return "Package Delivering Using Car for "+packageInfo.getSize()
                +" and weight "+packageInfo.getWeight()  +"  "+packaging;
    }

    @Override
    public String packaging(Boolean condition) {
        if(condition)
            return "with custom packaging";
        return "with no custom packaging";
    }
}
