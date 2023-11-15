package com;
//20-Good or Bad string
import java.util.Scanner;

public class GoodBadString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input.toLowerCase().contains("good")) {
            System.out.println("This is a good string!");
        } else if (input.toLowerCase().contains("bad")) {
            System.out.println("This is a bad string!");
        } else {
            System.out.println("Unable to determine if it's good or bad.");
        }

        scanner.close();
    }
}
