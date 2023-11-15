package com;
//16- Sieve of Eratosthenes 
import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the upper limit to find primes up to: ");
        int limit = scanner.nextInt();
        
        boolean[] isPrime = new boolean[limit + 1];

        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }
        
       for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
