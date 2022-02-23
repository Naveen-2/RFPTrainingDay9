package com;

import java.util.Scanner;

public class UserMenu {
    Scanner input = new Scanner(System.in);

    public int showMainMenu() {
        System.out.println("Main Menu:\n 1.Add Contact \n 2.Edit Contact");
        System.out.print("Enter your choice: ");
        return input.nextInt();
    }

    public void handleUserSelection() {
        ContactManager contactManager = new ContactManager();
        loop : do {
            int choice = showMainMenu();
            switch (choice) {
                case 1 -> {
                    contactManager.addNewContact();
                    System.out.println("Contact added to address book successfully.\n");
                }
                case 2 -> contactManager.editByName(ScannerUtil.getString("Enter contact First name to edit: "));
                default -> {
                    break loop;
                }
            }
        } while (true);
    }
}
