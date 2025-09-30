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
        phone.dial(scanner);

    }


}