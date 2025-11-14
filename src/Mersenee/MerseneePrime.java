package Mersenee;
import java.math.BigInteger;

public class MerseneePrime {
    public static BigInteger computeMersennePrime(int p) {
        return new BigInteger("2").pow(p).subtract(BigInteger.ONE);
    }
}
