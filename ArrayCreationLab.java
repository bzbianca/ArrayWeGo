// File name: ArrayCreationLab.java
// Date: 9/30/2025
// Name: Bianca Baccay

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;
public class ArrayCreationLab {
    public static void main(String[] args) {

        // Part 1
        String[] scores;
        scores = new String[5];
        System.out.println("Array length: " + scores.length);

        // Part 2
        String[] colors = {"Red", "Green", "Blue"};
        for (String color : colors) {
            System.out.println(color);
        }

        // Part 3
        double[] prices = new double[3];
        prices[0] = 9.99;
        prices[1] = 14.50;
        prices[2] = 20.00;
        for (double price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();

        // Part 4
        Scanner input = new Scanner(System.in);
        System.out.print("How many favorite foods? ");
        int amountOfFood = input.nextInt();
        String[] foods = new String[amountOfFood];
        input.nextLine();

        for(int i = 0; i < amountOfFood; i++) {
            System.out.print("Enter a food " + (i + 1) + ": ");
            foods[i] = input.nextLine();
        }
        System.out.print("Your favorite foods are: ");
        for (int i = 0; i < amountOfFood; i++) {
            if (i == amountOfFood - 1) { // checks if the index is last in the string to prevent from adding a comma
                System.out.print(foods[i]);
            } else {
                System.out.print(foods[i] + ", ");
            }
        }
    }
}