/**
 * Created by michaelfestger on 5/16/17.
 */

import java.util.Scanner;

public class store {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String init = "y";
        int mainMenuSelect;

        System.out.println("Welcome to the Shop!");
        showMenu();
        while (init.equalsIgnoreCase("y")) {

            switch (mainMenuSelect(input)) {
                case 1:
                    String item = item(input);
                    Double price = price(input);
                    int quantity = quantity(input);
                    buyAnother(input);
                    break;
                case 2:
                    item = item(input);
                    price = price(input);
                    quantity = quantity(input);
                    double total = price * quantity;
                    System.out.println("Building receipt...");
                    System.out.println("Item: " + item);
                    System.out.println("Price per item: $" + price);
                    System.out.println("Amount purchased: " + quantity);
                    System.out.println("Total: $" + total);
                    buyAnother(input);
                    break;
                case 3:
                    System.out.println("Please come again!");
                    System.exit(0);

                default:
                    System.out.println("Please try that again.");
            }
            System.out.println("Return to the main menu? (y/n)");
            init = input.nextLine();
        }

}
    public static int mainMenuSelect(Scanner input) {
        int menuOption = input.nextInt();
        input.nextLine();
        return menuOption;
    }

    public static void showMenu(){
        System.out.println("Please select an option:");
        System.out.println("1) Sale");
        System.out.println("2) Print receipt");
        System.out.println("3) Exit");
    }

    public static String item(Scanner input){
        System.out.println("What would you like to purchase?");
        return input.nextLine();
    }

    public static double price(Scanner input){
        System.out.println("What is the price of the item?");
        return input.nextDouble();
    }

    public static int quantity(Scanner input){
        System.out.println("How many of this item?");
        input.nextLine();
        return input.nextInt();

    }

    public static void buyAnother(Scanner input){
        input.nextLine();
        System.out.println("Would you like to buy something else? (y/n)");
        String buyAnotherString = input.nextLine();
        switch (buyAnotherString){
            case "y":
                item(input);
                price(input);
                quantity(input);
                buyAnother(input);
                break;
            case "n":
                System.out.println("Would you like to go to the Main Menu? (y/n)");
                String mainMenuReturn = input.nextLine();
                switch (mainMenuReturn){
                    case "y": showMenu();
                        mainMenuSelect(input);
                    case "n": break;
                    default:
                        System.out.println("Sorry, didn't catch that.");
                }
                break;
            default:
                System.out.println("Sorry, I didn't get that.");
        }
    }


}
