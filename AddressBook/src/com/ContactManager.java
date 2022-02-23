package com;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private final List<Contact> contactList = new ArrayList<>();


    public void addNewContact() {
        Contact contact = new Contact();

        contact.setFirstName(ScannerUtil.getString("Enter First name: "));
        contact.setLastName(ScannerUtil.getString("Enter Last name: "));
        contact.setPhoneNumber(ScannerUtil.getLong("Enter Phone number: "));
        contact.setEmail(ScannerUtil.getString("Enter Email: "));
        contact.setAddress(ScannerUtil.getString("Enter Address: "));
        contact.setCity(ScannerUtil.getString("Enter City: "));
        contact.setState(ScannerUtil.getString("Enter State: "));
        contact.setZip(ScannerUtil.getInt("Enter Zip code: "));

        contactList.add(contact);

    }

    public void editByName(String name) {
        for (Contact contact : contactList) {
            if (name.equalsIgnoreCase(contact.firstName)) {
                editContact(contact);
            } else {
                System.out.println("Contact nor found");
            }
        }
    }

    public void editContact(Contact contact) {
        contact.setFirstName(ScannerUtil.getString("Enter new First name: "));
        contact.setLastName(ScannerUtil.getString("Enter new Last name: "));
        contact.setPhoneNumber(ScannerUtil.getLong("Enter new Phone number: "));
        contact.setEmail(ScannerUtil.getString("Enter new Email: "));
        contact.setAddress(ScannerUtil.getString("Enter new Address: "));
        contact.setCity(ScannerUtil.getString("Enter new City: "));
        contact.setState(ScannerUtil.getString("Enter new State: "));
        contact.setZip(ScannerUtil.getInt("Enter new Zip code: "));
    }

    public void deleteContact(String name) {
        for (Contact contact : contactList) {
            if (name.equals(contact.firstName)) {
                contactList.remove(contact);
                System.out.println("Contact removed successfully.");
                break;
            } else {
                System.out.println("Contact nor found");
            }
        }
    }

}
