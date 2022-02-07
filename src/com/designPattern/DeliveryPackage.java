package com.designPattern;

import java.util.List;

public class DeliveryPackage {
    private String uid;
    private String type;
    private String status;
    private List<Customer> customers;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public DeliveryPackage(String uid, String type, String status) {
        this.uid = uid;
        this.type = type;
        this.status = status;

    }

    public DeliveryPackage() {
    }
}
