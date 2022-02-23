package com;

public class AddressBook {
    String firstName;
    String lastName;
    String address;
    String city;
    String zipCode;
    String phoneNumber;
    String email;

    AddressBook(String firstName, String lastName, String address, String city, String zipCode, String phoneNumber, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
