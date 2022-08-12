package com.bridgelabz.AddressBook;

import java.util.ArrayList;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program Management");
        ArrayList<Contact> list = new ArrayList<>();
        AddressBook addressBook = new AddressBook();
        addressBook.operations(list);
    }
}
