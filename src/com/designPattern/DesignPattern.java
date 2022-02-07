package com.designPattern;


import java.util.UUID;

/*
 * @author : ROHAN RAVINDRA KADAM
 * @purpose: Observer  Design pattern main class
 * @name   : DesignPattern
 * */
public class DesignPattern {

    public static void main(String[] args) {

        //Adding New Customer
        Customer customerJo=new Customer(UUID.randomUUID().toString(),"John Doe");
        Customer customerMo=new Customer(UUID.randomUUID().toString(),"Molly Doe");

        //Lets Create a Package for Subscription
        DeliveryPackage deliveryPackage = new DeliveryPackage(UUID.randomUUID().toString(),
                "LAPTOP",PackageStatus.STARTED.name());

        //Service for Subscription
        NotificationService notificationService= new NotificationService();

        //Customer Subscribing to Package
        notificationService.subscribe(customerJo,deliveryPackage);
        notificationService.subscribe(customerMo,deliveryPackage);

        //Customer Subscribing to Package
        notificationService.unSubscribe(customerMo,deliveryPackage);
        //notifying Customers...
        notificationService.notifyCustomer(deliveryPackage);

        //Status Change to Package
        deliveryPackage.setStatus(PackageStatus.OUT_FOR_DELIVERY.name());

        //Notifying Customers...
        notificationService.notifyCustomer(deliveryPackage);


    }
}
