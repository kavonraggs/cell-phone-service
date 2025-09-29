package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone phone = new CellPhone();

        System.out.print("Enter Serial Number (ex: 100000-999999): ");
        phone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Enter Model (ex: iPhone X): ");
        phone.setModel(scanner.nextLine());

        System.out.print("Enter Carrier (ex: AT&T) ");
        phone.setCarrier(scanner.nextLine());

        System.out.print("Enter Phone Number (ex: 800-555-5555): ");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.print("Enter Owner Name (ex: Dana Wyatt): ");
        phone.setOwner(scanner.nextLine());

        //results
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier:: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());

    }

    static class CellPhone {
        int serialNumber;
        String model;
        String carrier;
        String phoneNumber;
        String owner;

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
    }
}