package Mersenee;

import java.math.BigInteger;
import java.sql.SQLOutput;

public class Mersenee {
    public static void main(String[] args) {
        int count = 0;
        int p = 2;
        System.out.println('P' + "\t" + "2^p-1");
        System.out.println("----------------------");
        while (count < 25) {
            if (PrimeUtility.isPrime(p)) {
                BigInteger mersennePrime = MerseneePrime.computeMersennePrime(p);
                if (PrimeUtility.isPrime(mersennePrime)) {
                    System.out.printf("%d\t%d\n", p, mersennePrime);
                    count++;
                }

            }
            p++;
        }

    }
}


