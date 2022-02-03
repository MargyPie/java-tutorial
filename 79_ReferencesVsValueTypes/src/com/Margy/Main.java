package com.Margy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Value types
        int intValue = 10;
        int anotherIntValue = intValue;

        System.out.println("intValue = " + intValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("intValue = " + intValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        // Reference types
        /**
         * A reference holds the reference (address) to the object
         * but not the object itself
         */
        int[] intArray = new int[5];
        int[] anotherArray = intArray;  // Now 2 references are pointing to the same array

        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("After change intArray = " + Arrays.toString(intArray));
        System.out.println("After change anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4, 5, 6, 7, 8};
        modifyArray(intArray);

        System.out.println("After modify intArray = " + Arrays.toString(intArray));
        System.out.println("After modify anotherArray = " + Arrays.toString(anotherArray));


    }

    private static void modifyArray(int[] array) {

        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};

    }
}
