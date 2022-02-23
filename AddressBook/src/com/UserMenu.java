package com;

import java.util.Scanner;

public class UserMenu {
    Scanner input = new Scanner(System.in);

    public int showMainMenu() {
        System.out.println("Main Menu:\n 1.Add Contact");
        System.out.print("Enter your choice: ");
        return input.nextInt();
    }

    public void handleUserSelection() {
        ContactManager contactManager = new ContactManager();
        do {
            int choice = showMainMenu();
            if (choice == 1) {
                contactManager.addNewContact();
                System.out.println("Contact added to address book successfully.\n");
            } else {
                break;
            }
        } while (true);
    }
}
