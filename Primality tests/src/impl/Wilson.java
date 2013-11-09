package impl;

/**
 * Primality test using Wilson's theorem. 
 * 
 * Wilson's theorem states that (n-1)! = 1 modulo n
 * if and only if n is prime.
 * 
 * @author Sebastian Björkqvist
 */
public class Wilson {

    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        
        long product = 1;
        
        for (long i = 2; i < number; i++) {
            product = (product*i) % number;
            if (product % number == 0) {
                return false;
            }
        }
        
        if (product != number - 1) {
            return false;
        }
        
        return true;
    }
}
