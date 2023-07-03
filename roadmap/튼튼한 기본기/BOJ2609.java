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
        int lcm = gcd == 1 ? num1 * num2 : gcd * ((num1 / gcd) * (num2 / gcd));

        System.out.println(gcd);
        System.out.println(lcm);
    }

    private static int gcd(int num1, int num2) {
        int max = Math.max(num1, num2);

        for (int i = max; i >= 1; i--) {
            if (num2 % i == 0 && num1 % i == 0) {
                return i;
            }
        }
        return 0;
    }
}
