package com.designPattern;

public class PackageInfo {

    private String size;
    private int weight;



    public PackageInfo(String size, int weight) {
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
