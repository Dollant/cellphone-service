package com.pluralsight;

public class CellPhone {

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    public int getSerialNumber() {
        return serialNumber;
    }
    public String getModel() {
        return model;
    }
    public String getCarrier() {
        return carrier;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getOwner() {
        return owner;
    }


}
