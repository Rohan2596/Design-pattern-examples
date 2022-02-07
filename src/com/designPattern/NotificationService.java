package com.designPattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    public void subscribe(Customer customer , DeliveryPackage deliveryPackage){
        List<Customer>preCustomer=new ArrayList<>();
        preCustomer.addAll(deliveryPackage.getCustomers()!=null
                ? deliveryPackage.getCustomers() : new ArrayList<>());
        preCustomer.add(customer);
        deliveryPackage.setCustomers(preCustomer);

    }
    public void unSubscribe(Customer customer , DeliveryPackage deliveryPackage){
        List<Customer>preCustomer=new ArrayList<>();
        preCustomer.addAll(deliveryPackage.getCustomers()!=null ?
                deliveryPackage.getCustomers() : new ArrayList<>());
        preCustomer.remove(customer);
        deliveryPackage.setCustomers(preCustomer);
    }
    public void notifyCustomer(DeliveryPackage deliveryPackage){
        List<Customer>customers=new ArrayList<>();
        customers.addAll(deliveryPackage.getCustomers()!=null ?
                deliveryPackage.getCustomers() : new ArrayList<>());
        for (Customer customer:customers) {
            System.out.println("Hey "+ customer.getName()
                    +"  delivery status for your Package Change to:-"+ deliveryPackage.getStatus());
        }



    }
}
