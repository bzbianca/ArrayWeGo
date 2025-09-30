// File name: ArrayCreationLab.java
// Date: 9/30/2025
// Name: Bianca Baccay

import java.util.Scanner;
public class ArrayCreationLab {
    public static void main(String[] args) {

        // Part 1
        String[] scores; // initialize scores
        scores = new String[5]; // declare it to have a size of 5
        System.out.println("Array length: " + scores.length); // print the length

        // Part 2
        String[] colors = {"Red", "Green", "Blue"}; // initialize colors with values
        for (String color : colors) { // print out colors with loop
            System.out.println(color);
        }

        // Part 3
        double[] prices = new double[3]; // initialize prices with size of 3
        prices[0] = 9.99; // add 9.99
        prices[1] = 14.50; // add 14.50
        prices[2] = 20.00; // add 20.00
        for (double price : prices) { // print out prices
            System.out.print(price + " ");
        }
        System.out.println();

        // Part 4
        Scanner input = new Scanner(System.in); // scanner
        System.out.print("How many favorite foods? "); // ask the size of array
        int amountOfFood = input.nextInt(); // get the amount
        String[] foods = new String[amountOfFood]; // initialize array with given size
        input.nextLine(); // clear buffer

        for(int i = 0; i < amountOfFood; i++) { // ask for input then insert value into array
            System.out.print("Enter a food " + (i + 1) + ": ");
            foods[i] = input.nextLine();
        }
        System.out.print("Your favorite foods are: ");
        for (int i = 0; i < amountOfFood; i++) { // print out array through loop with checking
            if (i == amountOfFood - 1) { // checks if the index is last in the string to prevent from adding a comma
                System.out.print(foods[i]);
            } else {
                System.out.print(foods[i] + ", ");
            }
        }
    }
}