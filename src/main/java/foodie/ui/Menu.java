package foodie.ui;

import foodie.controller.Customercontroller;
import foodie.exception.CustomerExistsException;
import foodie.model.Customermodel;
import foodie.util.Factory;

import java.util.Scanner;

public class Menu {

    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenuHeader("WELCOME TO FOODIE APP");
            System.out.println();
            System.out.println("Please select an option:");
            System.out.println("--------------------------");
            System.out.println("1. Register (New Customer)");
            System.out.println("2. Login (Existing Customer)");
            System.out.println("3. View Restaurants");
            System.out.println("4. View Dishes");
            System.out.println("5. Add Restaurant");
            System.out.println("6. Add Dish");
            System.out.println("7. Place Order");
            System.out.println("8. View Orders");
            System.out.println("9. Exit");
            System.out.println("Please enter your choice (1-9):");

            int input = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            switch (input) {
                case 1:
                    customerRegisterForm();
                    break;
                case 9:
                    System.out.println("Exiting the application. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid Input. Please enter a valid input from 1-9.");
            }
        }
    }

    private void displayMenuHeader(String menuHeader) {
        String dashesLine = new String(new char[150]).replace('\0', '-');
        System.out.println(dashesLine);
        String spaces = new String(new char[70]).replace('\0', ' ');
        System.out.printf("%-70s %-10s %-70s \n", spaces, menuHeader, spaces);
        System.out.println(dashesLine);
    }

    private void customerRegisterForm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please register by entering the following details:");
        System.out.println("Enter Id:");
        String id = scanner.nextLine();
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter E-mail:");
        String email = scanner.nextLine();
        System.out.println("Enter Password:");
        String password = scanner.nextLine();

        Customermodel customer = new Customermodel();
        customer.setId(id);
        customer.setName(name);
        customer.setEmail(email);
        customer.setPassword(password);

        Customercontroller customerController = Factory.getCustomerController();

        try {
            Customermodel savedCustomer = customerController.save(customer);
            if (savedCustomer != null) {
                System.out.println("Customer Registration Successful");
                System.out.println("Details:");
                System.out.println("Id : " + customer.getId());
                System.out.println("Name : " + customer.getName());
                System.out.println("E-mail : " + customer.getEmail());
                System.out.println("Password : " + customer.getPassword());
            } else {
                System.out.println("Some internal error occurred. Please try again.");
                customerRegisterForm();
            }
        } catch (CustomerExistsException e) {
            System.out.println(e.getMessage());
            System.out.println("Please return to the main menu and log in.");
            displayMainMenu();
        }
    }
}
