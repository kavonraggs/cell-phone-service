package com.pluralsight;

import java.util.Scanner;

public class CellPhone {
    int serialNumber;
    String model;
    String carrier;
    String phoneNumber;
    String owner;

//    public Dial(String phoneNumber){
//        System.out.println(owner.);
//    }


    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void dial(Scanner scanner) {
        System.out.print("Enter the number you want to call: ");
        String phoneNumber = scanner.nextLine();
        System.out.println(owner + "'s phone is calling " + phoneNumber);
    }
}