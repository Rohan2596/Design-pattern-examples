package com.designPattern;

public class PackageInfo {

    private String size;
    private String weight;



    public PackageInfo(String size, String weight) {
        this.size = size;
        this.weight = weight;
    }

    public PackageInfo() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
