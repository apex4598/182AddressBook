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
            System.out.println("1. Add\n 2. Edit\n 3. Back");
            switch (scanner.next()){
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;

            }
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
    public void edit(){
        System.out.println("Enter your First name:");
        String firstname = scanner.next();

       Iterator<Contact> iterator = list.listIterator();

       while (iterator.hasNext()){
           Contact contact = iterator.next();

           if(firstname.equals(contact.getFirstName(firstname))){
               System.out.println("Choose field you want to Edit:");
               System.out
                       .println("1.Last Name\t2.Phone Number\t3.City\t4.Zip\t5. State");
               switch (scanner.nextInt()) {
                   case 1:
                       System.out.println("Re-Correct your lastname");
                       contact.setLastName(contact.getLastName());
                       break;
                   case 2:
                       System.out.println("Re-Correct your Phone Number");
                       contact.getPhoneNumber(scanner.nextLong());
                       break;
                   case 3:
                       System.out.println("Re-Correct your City");
                       contact.setCity(scanner.next());
                       break;
                   case 4:
                       System.out.println("Re-Correct your Zip");
                       contact.setZip(scanner.nextLong());
                       break;
                   case 5:
                       System.out.println("Re-Correct your State");
                       contact.setState(scanner.next());
                       break;
           }
       }
    }
}
