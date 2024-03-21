package baekjoon.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 1
public class BOJ_4375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (!(line = br.readLine()).isEmpty()) {
            BigInteger n = new BigInteger(line);
            System.out.println(one(n).length());
        }
    }

    private static String one(BigInteger n) {
        BigInteger one = BigInteger.ONE;
        while (one.mod(n).intValue() > 0) {
            one = (one.multiply(BigInteger.TEN)).add(BigInteger.ONE);
        }

        return String.valueOf(one);
    }
}
