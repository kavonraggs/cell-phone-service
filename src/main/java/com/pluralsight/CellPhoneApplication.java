package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone phone1 = createPhone(scanner);
        CellPhone phone2 = createPhone(scanner);

        display(phone1);
        display(phone2);

        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1.getPhoneNumber());
    }
        //results

    public static CellPhone createPhone(Scanner scanner) {
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

        return phone;
    }

    public static void display(CellPhone phone1){
        System.out.println("Owner: " + phone1.getOwner());
        System.out.println("Serial Number: " + phone1.getSerialNumber());
        System.out.println("Model: " + phone1.getModel());
        System.out.println("Carrier: " + phone1.getCarrier());
        System.out.println("Phone Number: " + phone1.getPhoneNumber());
        System.out.println();
    }

}