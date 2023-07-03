package roadmap.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최대공약수와 최소공배수
public class BOJ2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int gcd = gcd(num1, num2);
        int lcm = (num1 * num2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }

    private static int gcd(int num1, int num2) {
        if (num1 < num2) {
            int tmp = num2;
            num2 = num1;
            num1 = tmp;
        }

        if (num2 == 0) {
            return num1;
        }

        if (num1 % num2 == 0) {
            return num2;
        }


        int tmp = num1 % num2;
        num1 = num2;
        num2 = tmp;

        return gcd(num1, num2);
    }
}
