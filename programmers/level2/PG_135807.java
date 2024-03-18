package progammers.level2;

// 숫자 카드 나누기
public class PG_135807 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{10, 17}, new int[]{5, 20}));
        System.out.println(solution(new int[]{4, 10, 17}, new int[]{4, 5, 20}));
        System.out.println(solution(new int[]{10, 20}, new int[]{5, 17}));
        System.out.println(solution(new int[]{14, 35, 119}, new int[]{18, 30, 102}));

    }

    static int solution(int[] arrayA, int[] arrayB) {

        int gcdA = arrayA[0];
        int gcdB = arrayB[0];

        // 각 배열의 최대 공약수 구하기
        for (int i = 1; i < arrayA.length; i++) {
            gcdA = gcd(arrayA[i], gcdA);
            gcdB = gcd(arrayB[i], gcdB);
        }

        int answer = 0;

        if (notDivide(gcdA, arrayB)) {
            answer = Math.max(answer, gcdA);
        }

        if(notDivide(gcdB, arrayA)) {
            answer = Math.max(answer, gcdB);
        }

        return answer;
    }

    private static int gcd(int a, int b) {

        while (b != 0) {
            int r = a % b;
            a = b;
            b= r;
        }

        return a;
    }

    private static boolean notDivide(int gcd, int[] array) {
        for (int num : array) {
            if (num % gcd == 0) {
                return false;
            }
        }

        return true;
    }
}
