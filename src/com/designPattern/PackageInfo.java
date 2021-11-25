package com.designPattern;

public class PackageInfo {

    private String size;
    private int weight;
    private Boolean customPackaging;


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

    public Boolean getCustomPackaging() {
        return customPackaging;
    }

    public void setCustomPackaging(Boolean customPackaging) {
        this.customPackaging = customPackaging;
    }

    public PackageInfo(String size, int weight, Boolean customPackaging) {
        this.size = size;
        this.weight = weight;
        this.customPackaging = customPackaging;
    }
}
