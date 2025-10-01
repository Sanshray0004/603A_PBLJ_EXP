package BASICS;

import java.util.ArrayList;
import java.util.Scanner;

public class SumUsingAutoboxingUnboxing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers separated by space:");
        String[] inputs = sc.nextLine().split("\\s+");

        for (String input : inputs) {
            try {
                Integer num = Integer.parseInt(input); // Parsing string to int (autoboxes to Integer)
                numbers.add(num); // Autoboxing from int to Integer
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer input: " + input);
            }
        }

        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing from Integer to int occurs here
        }

        System.out.println("Sum of integers: " + sum);

        sc.close();
    }
}
