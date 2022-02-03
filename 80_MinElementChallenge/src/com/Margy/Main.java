package com.Margy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Ask user for the length of the array
        System.out.println("Enter a count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] userArray = readIntegers(count);
        System.out.println("Minimum value in the array " + Arrays.toString(userArray) + " is: " + findMin(userArray));

    }

    private static int[] readIntegers(int count) {

        // Create new array of the length input
        int[] userInput = new int[count];

        // Ask user for input
        System.out.println("Enter " + count + " integer values:\r");

        // Assign user input to array spaces
        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = scanner.nextInt();
        }

        return userInput;
    }

    public static int findMin(int[] array) {

        int minValue = Integer.MAX_VALUE;

            for (int j = 1; j < array.length; j++) {

                if(array[j] < minValue) {
                    minValue = array[j];
                }

            }

        return minValue;

    }
}
