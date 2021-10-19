package com.designPattern.deliveryMethods;

import com.designPattern.PackageInfo;

/*
 * @author : ROHAN RAVINDRA KADAM
 * @purpose: Package Delivery Interface
 *            with deliveryWay
 * @name   : PackageDelivery
 * */
public interface PackageDelivery {

     String deliveryWay(PackageInfo packageInfo);
}
