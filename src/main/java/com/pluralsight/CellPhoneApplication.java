package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone myPhone = new CellPhone();

        myPhone.setSerialNumber(4000004);
        myPhone.setModel("iPhone 17 Pro Max");
        myPhone.setCarrier("Verizon");
        myPhone.setPhoneNumber("(420) 069-6767");
        myPhone.setOwner("Taryn Williams");

        System.out.println("Serial #: " + myPhone.getSerialNumber());
        System.out.println("Model: "    + myPhone.getModel());
        System.out.println("Carrier: "  + myPhone.getCarrier());
        System.out.println("Phone #: "  + myPhone.getPhoneNumber());
        System.out.println("Owner: "    + myPhone.getOwner());

    }
}
