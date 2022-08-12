package com.bridgelabz.AddressBook;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Contact> list = new ArrayList<>();

    public void operations(ArrayList<Contact> arrayRead){
        list = arrayRead;
        boolean status = true;

        do{
            System.out.println("Choose Operations : ");
            System.out.println("1. Add");

            add();

        }while (status);
    }

    public void add(){
        Contact contact = new Contact();
        System.out.println("Enter the First name:");
        String firstName = scanner.next();
        contact.getFirstName(firstName);

        System.out.println("Enter the Last name:");
        String lastname = scanner.next();
        contact.getLastName(lastname);

        System.out.println("Enter the Phone Number:");
        Long phoneNumber = scanner.nextLong();
        contact.getPhoneNumber(phoneNumber);

        System.out.println("Enter Address ");
        String address = scanner.next();
        contact.getAddress(address);

        System.out.println("Enter the City:");
        String city = scanner.next();
        contact.setCity(city);

        System.out.println("Enter the Zip:");
        long zip = scanner.nextLong();
        //contact.setZip(zip);

        System.out.println("Enter the State:");
        String state = scanner.next();
        contact.setState(state);

        list.add(contact);

    }
}
