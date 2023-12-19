package HackerRank.Java.Generics;

import java.util.Arrays;
import java.util.Scanner;

public class GenericIPrintIntStringArray {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        // Read the integer array
        int[] intArray = {1, 2, 3};
        Integer[] integerArray = Arrays.stream(intArray).boxed().toArray(Integer[]::new);

        // Read the string array
        String[] stringArray = {"Hello", "World"};

        // Print the integer array
        printArray(integerArray);

        // Print the string array
        printArray(stringArray);
    }
}
