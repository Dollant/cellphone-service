package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone myPhone = new CellPhone();
        myPhone.setSerialNumber(4000004);
        myPhone.setModel("iPhone 17 Pro Max");
        myPhone.setCarrier("Verizon");
        myPhone.setPhoneNumber("(420) 069-6767");
        myPhone.setOwner("Taryn Williams");

        CellPhone yourPhone = new CellPhone();
        yourPhone.setSerialNumber(5000005);
        yourPhone.setModel("Samsung Galaxy Ultra 25");
        yourPhone.setCarrier("Mint Mobile");
        yourPhone.setPhoneNumber("(666) 777-6767");
        yourPhone.setOwner("Fia Reaves");

        System.out.println("Serial #: " + myPhone.getSerialNumber());
        System.out.println("Model: "    + myPhone.getModel());
        System.out.println("Carrier: "  + myPhone.getCarrier());
        System.out.println("Phone #: "  + myPhone.getPhoneNumber());
        System.out.println("Owner: "    + myPhone.getOwner());

        display(myPhone);
        display(yourPhone);

        myPhone.dial(yourPhone.getPhoneNumber());
        yourPhone.dial(myPhone.getPhoneNumber());
    }

    public static void display(CellPhone phone) {
        System.out.println("°❀⋆.ೃ࿔*:･°❀⋆.ೃ࿔*:･────୨ৎ────°❀⋆.ೃ࿔*:･°❀⋆.ೃ࿔*:･");
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone #: " + phone.getPhoneNumber());
        System.out.println("Serial #: " + phone.getSerialNumber());
        System.out.println("°❀⋆.ೃ࿔*:･°❀⋆.ೃ࿔*:･────୨ৎ────°❀⋆.ೃ࿔*:･°❀⋆.ೃ࿔*:･\n");
    }
}
