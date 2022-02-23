package com;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        UserMenu userMenu = new UserMenu();
        userMenu.handleUserSelection();
    }
}
