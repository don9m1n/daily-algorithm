package programmers.level2;

// 멀쩡한 사각형 [Summer/Winter Coding(2019)]
public class PG62048 {

    public static void main(String[] args) {
        long solution = solution(8, 12);
        System.out.println("solution = " + solution);
    }

    public static long solution(int w, int h) {
        /**
         * 최대공약수(gcd) : 공통 약수 중에 가장 큰 약수
         * 최소공배수(lcm) : (a * b) / gcd
         */
        return ((long) w * h) - (((long) w + h) - gcd(w, h));
    }

    private static long gcd(int a, int b) {

        int tmp = 0;

        // a, b 중에 큰 수 검사
        if(a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        while (b != 0) {
            int r = a % b;

            a = b;
            b = r;
        }

        return a;
    }

    private static long gcd2(int a, int b) {

        if (b == 0) {
            return a;
        }else {
            return gcd2(b, a % b);
        }
    }
}
