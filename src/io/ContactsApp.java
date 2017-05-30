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


        switch (displayMenu()) {
            case 1: // View All Contacts
                System.out.println("Here are your Contacts: ");
                for (int p = 0; p < contacts.size(); p += 1) {
                    System.out.println(((p + 1) + ": " + contacts.get(p)));
                    System.out.println();
                }
                displayMenu();
                break;
            case 2: // Add New Contact
                String newContact = addContact(input);
                contacts.add(newContact);
                System.out.println("The contact you added is : " + newContact);
                Files.write(
                        Paths.get("src", "io", "contacts.txt"),
                        contacts
                );
                break;

            case 3: // Search Contact By Name
                searchContacts(input);
                for (String contact : contacts) {
                    if (contacts.contains(searchContacts(input))) {
                        System.out.println("[match]");
                    } else {
                        System.out.println("[no match]");
                    }
                }
                break;

            case 4: // Delete an existing contact




//                for ( int i = contacts.size() - 1;  i >= 0; i--){
//                    String willIBeDeleted = contacts.get(i);
//                    if(willIBeDeleted.equals(deleteContacts(input)))
//                    {
//                        contacts.remove(i);
//                        i++;
//                        System.out.println(deleteContacts(input) + " deleted.");
//                    } else {
//                        System.out.println("No match.");
//                    }
//                }



//                for(int n = 0; n < contacts.size(); n++){
//                    if(contacts.contains(deleteContacts(input))){
//                        contacts.remove(deleteContacts(input));
//                        System.out.println("deleted");
//                    } else {
//                        System.out.println("no match");
//                    }
//                }




             //   deleteContacts(input);
//                for (String contact : contacts) {
//                    if (contacts.contains(deleteContacts(input))) {
//                        contacts.remove(deleteContacts(input));
//                        System.out.println(deleteContacts(input) + " removed.");
//                        System.exit(0);
//                    } else {
//                        System.out.println("[no match]");
//                    }
//                }

//                if (contacts.contains(deleteContacts(input))){
//                    String deleteMe = deleteContacts(input);
//                    contacts.remove(deleteMe);
//                    System.out.println(deleteMe + " deleted.");
//                } else {
//                    System.out.println("Sorry, no match.");
//                }
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
        System.out.println("Please enter new Contact name:");
        newContact = input.nextLine();
        return newContact;
    }

    public static String searchContacts(Scanner input) {
        String findMe;
        System.out.println("Search Contacts by name: ");
        findMe = input.nextLine();
        return findMe;
    }

    public static String deleteContacts(Scanner input) {
        String deleteMe;
        System.out.println("Enter Contact to Delete: ");
        deleteMe = input.nextLine();
        return deleteMe;
    }


}
