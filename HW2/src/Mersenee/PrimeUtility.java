package Mersenee;
import prime.PrimeStack;

import java.math.BigInteger;
public class PrimeUtility {
    public static boolean isPrime(int n){
        return PrimeStack.isPrime(n);
    }
    public static boolean isPrime(BigInteger n){
        return n.isProbablePrime(10);
    }
}