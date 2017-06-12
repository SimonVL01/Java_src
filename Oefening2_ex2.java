import java.math.*;
import java.util.*;

public class Oefening2_ex2 {
    public static void main(String[] args) {
        int bigInt = 2_000_000_000;
        int biggerInt = bigInt + bigInt;

        System.out.println(biggerInt);

        BigInteger biggest = BigInteger.valueOf("2_000_000_000");
        biggest = biggest.add(BigInteger.valueOf("2_000_000_000"));

        System.out.println(biggest);
    }
        }
