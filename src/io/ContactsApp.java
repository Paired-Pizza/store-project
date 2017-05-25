package io;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactsApp {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        Path contactsPath = Paths.get("src/io", "contacts.txt");
        List<String> contacts = Files.readAllLines(contactsPath);
        for (int i = 0; i < contacts.size(); i += 1) ;

//        displayMenu();
        switch (displayMenu()) {
            case 1: // View All Contacts
                System.out.println("Here are your Contacts: ");
                for (int p = 0; p < contacts.size(); p += 1) {
                    System.out.println((p + 1 + ": " + contacts.get(p)));
                    System.out.println();
                    displayMenu();
                }
                break;
            case 2: // Add New Contact
                addContact(input);
                System.out.println("The contact you added is : " + input.next());
                Files.write(
                        Paths.get("src/io", "contacts.txt"),
                        List("addContact"),
                        StandardOpenOption.APPEND
                );
                System.out.println(contacts);

            case 3:
                break;
            case 4:
                break;
            case 5:
                System.exit(0);

        }
    }

    public static int displayMenu() {
        int mainMenuSelect;
        Scanner input = new Scanner(System.in);
        System.out.println("Please make a selection.");
        System.out.println();
        System.out.println("1. View Contacts");
        System.out.println("2. Add a new Contact");
        System.out.println("3. Search a Contact by Name");
        System.out.println("4. Delete an existing Contact");
        System.out.println("5. Exit");
        System.out.println();
        System.out.println("Enter an option (1, 2, 3, 4, or 5): ");
        mainMenuSelect = input.nextInt();
        return mainMenuSelect;

    }

    public static String addContact(Scanner input) {
        String newContact;
        System.out.println("Please enter the contacts information that you would like to add:");
        newContact = input.nextLine();
        return newContact;
    }


}
