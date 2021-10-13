package com.designPattern.singleton;

public class SharedCloud {


    private SharedCloud() {
    }

    /*
    *
    * public  :  This method is public and therefore available to anyone.
    * static  :  This method can be run without having to create an instance of the class SharedCloud.
    * private : This method is private and therefore not available to anyone.
    *
    * */
    private static SharedCloud sharedCloud = null;

    public static SharedCloud getSharedCloudInstance() {

        if (sharedCloud == null) {

            return sharedCloud = new SharedCloud();
        }
        return sharedCloud;
    }
}
