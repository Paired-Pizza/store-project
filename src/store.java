/**
 * Created by michaelfestger on 5/15/17.
 */

import java.util.Scanner;

public class store {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         int mainMenuSelect = 0;


        System.out.println("Please select an option: ");
        System.out.println("1. Sale");
        System.out.println("2. Print Receipt");
        System.out.println("3. Exit");

        mainMenuSelect = input.nextInt();

        if (mainMenuSelect == 1){
            shop();
        }

        if (mainMenuSelect == 2){
            // receipt logic here
        }
        if (mainMenuSelect == 3){
            // exit logic here
            System.out.println("Thank you, come again.");
        }

    }
    public static void shop(){
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to purchase?");
        String item = input.nextLine();
        System.out.println("What is the cost of the item?");
        double price = input.nextDouble();
        System.out.println("How many would you like to buy?");
        int numberOfItems = input.nextInt();
        System.out.println("Would you like to go back to the main menu?");
        String mainMenuReturnFromShop = input.nextLine();
        if(mainMenuReturnFromShop.toLowerCase() == "yes"){
   //         main();
        }


    //    System.out.println(item + price + numberOfItems);

    }
}
