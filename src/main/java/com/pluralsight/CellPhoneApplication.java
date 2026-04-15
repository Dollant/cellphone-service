package com.pluralsight;

import java.util.Scanner;

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

        CellPhone thirdPhone = new CellPhone(
                6000006,
                "Google Pixel 12 Pro",
                "AT&T",
                "(333) 444-5555",
                "Dolly Ari"
        );

        display(myPhone);
        display(yourPhone);
        display(thirdPhone);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nEnter a phone number to call:");
        String numberToCall = keyboard.nextLine();

        if (numberToCall == null || numberToCall.trim().isEmpty()) {
            System.out.println("Error: You must enter a phone number.");
            return;
        }

        numberToCall = numberToCall.trim();

        if (!numberToCall.matches(".*\\d.*")) {
            System.out.println("Error: Phone number must contain digits.");
            return;
        }

        String normalizedInput = numberToCall.replaceAll("[^0-9]", "");
        String myNorm = myPhone.getPhoneNumber().replaceAll("[^0-9]", "");
        String yourNorm = yourPhone.getPhoneNumber().replaceAll("[^0-9]", "");
        String thirdNorm = thirdPhone.getPhoneNumber().replaceAll("[^0-9]", "");

        if (normalizedInput.equals(myNorm)) {
            yourPhone.dial(myPhone);
        }
        else if (normalizedInput.equals(yourNorm)) {
            myPhone.dial(yourPhone);
        }
        else if (normalizedInput.equals(thirdNorm)) {
            myPhone.dial(thirdPhone);
        }
        else {
            System.out.println("No phone with that number exists in the system.");
        }

        keyboard.close();
    }

    public static void display(CellPhone phone) {
        System.out.println("\n°❀⋆.ೃ࿔*:･°❀⋆.ೃ࿔*:･────୨ৎ────°❀⋆.ೃ࿔*:･°❀⋆.ೃ࿔*:･");
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone #: " + phone.getPhoneNumber());
        System.out.println("Serial #: " + phone.getSerialNumber());
        System.out.println("°❀⋆.ೃ࿔*:･°❀⋆.ೃ࿔*:･────୨ৎ────°❀⋆.ೃ࿔*:･°❀⋆.ೃ࿔*:･\n");
    }
}
