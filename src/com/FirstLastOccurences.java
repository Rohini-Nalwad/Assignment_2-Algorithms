package com;
//18- First and last occurrences of X
import java.util.Scanner;

public class FirstLastOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();

        System.out.print("Enter the element to find (X): ");
        int X = scanner.nextInt();

        int first = -1, last = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == X) {
                if (first == -1) first = i;
                last = i;
            }
        }

        if (first != -1) {
            System.out.println("First occurrence of " + X + " is at index: " + first);
            System.out.println("Last occurrence of " + X + " is at index: " + last);
        } else {
            System.out.println(X + " is not present in the array.");
        }

        scanner.close();
    }
}
