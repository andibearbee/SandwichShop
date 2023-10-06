package com.pluralsight;
import java.util.Scanner;
public class SandwichShop {
/* Create a Java app to order a sandwich
Prompt user to input size of sandwich either 1 or 2
Inform the user the price of sandwich based on the size
Prompt user to input their age
Apply discount to price if they are older than 65 or younger than 17
Display new cost of sandwich
 */
    public static void main(String[] args) {
        Scanner keypad = new Scanner(System.in);
        //Prompting user to choose sandwich size by displaying options and relative prices
        System.out.println("Choose sandwich size: ");
        System.out.println( "1: Regular: base price $5.45");
        System.out.println( "2: Large: base price $8.95");
        //Give space for input
        System.out.print("Your choice: ");
        int sandwichSize = keypad.nextInt();


        //if size 1 is chosen then price is 5.45
        //if size 2 is chosen then price is 8.95
        final double priceOne = 5.45;
        final double priceTwo = 8.95;
        double totalPrice = 0;
        if (sandwichSize == 1) {
            totalPrice += priceOne;
            System.out.println("Regular $5.45");
        } else if (sandwichSize == 2) {
            totalPrice += priceTwo;
        }
        double studentdiscount = .1;
        double seniordiscount = .2;
        System.out.print("Enter your age: ");
        int customerage = keypad.nextInt();
        if (customerage <= 17) {
            totalPrice *= .90;
        }
        else if (customerage >= 65) {
            totalPrice *= .80;
        }
        System.out.println("Price $" + totalPrice)  ;




    }
}
