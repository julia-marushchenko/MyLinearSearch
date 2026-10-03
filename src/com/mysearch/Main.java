/**
 *  Java program to implement linear search.
 */

package com.mysearch;

/**
 * Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an array to test method linearSearch().
        double[] array = {2.1, 3.4, 9.5, 8.4, 7.3, 2.3, 5.7};

        // Printing index of element with value 7.3.
        System.out.println("Element 7.3 has index: " + linearSearch(array, 7.3)); // Output: 4

        // Printing index of element with value 2.2.
        System.out.println("Element 2.2 has index: " + linearSearch(array, 2.2)); // Output: -1

        // Printing index of element with value 7.3.
        System.out.println("Element 8.4 has index: " + linearSearch(array, 8.4)); // Output: 3

    }

    // Method to search for index of element in the array.
    public static int linearSearch(double[] array, double searched) {
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == searched) {
                return i;
            }
        }
        return -1;
    }
}