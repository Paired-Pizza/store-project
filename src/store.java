/**
 * Created by michaelfestger on 5/15/17.
 */

import java.util.Scanner;

public class store {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mainMenuSelect = 0;

        String wantsToReturnToMainMenu;

        do {

        System.out.println("Please select an option: ");
        System.out.println("1. Sale");
        System.out.println("2. Print Receipt");
        System.out.println("3. Exit");

        mainMenuSelect = input.nextInt();

        if (mainMenuSelect == 1) {
            shop();
        }
        System.out.println("Would you like to go back to the main menu? (y/n)");
        wantsToReturnToMainMenu = input.next();
    } while(wantsToReturnToMainMenu.equalsIgnoreCase("y"));
        if (wantsToReturnToMainMenu.equalsIgnoreCase("n")){
            System.exit(0);
        }

        if (mainMenuSelect == 2) {
            // receipt logic here
        }
        if (mainMenuSelect == 3) {
            System.out.println("Thank you, come again.");
            System.exit(0);
        }

    }

    public static void shop() {
        String[] itemHolder;
        double[] priceHolder;
        int[] numberofItemsArray;

        itemHolder = new String[10];
        priceHolder = new double[10];
        numberofItemsArray = new int[10];

        for (int i = 1; i < 10; i++){
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to purchase?");
        itemHolder[i] = input.nextLine();

        System.out.println("What is the cost of the item?");
        double price = input.nextDouble();
        priceHolder[i] = input.nextDouble();


        System.out.println("How many would you like to buy?");
        int numberOfItems = input.nextInt();
        numberofItemsArray[i] = input.nextInt();
     //   System.out.println("Items: " + itemHolder[1] + " " + itemHolder[2] + " Price: " + price + " Number of Items: " + numberOfItems);
        }


}



    }

