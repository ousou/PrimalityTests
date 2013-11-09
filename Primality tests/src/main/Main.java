package main;

import impl.Wilson;

/**
 *
 * @author Sebastian Björkqvist
 */
public class Main {

    public static void main(String[] args) {
        
        long number = 97;
        
        if (Wilson.isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
