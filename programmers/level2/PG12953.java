package progammers.level2;

// N개의 최소공배수
public class PG12953 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 6, 8, 14}));
        System.out.println(solution(new int[]{1, 2, 3}));
        System.out.println(solution(new int[]{6, 12}));

    }

    static int solution(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int a = Math.max(arr[i], arr[i + 1]);
            int b = Math.min(arr[i], arr[i + 1]);

            while (a % b > 0) {
                int r = a % b;
                a = b;
                b = r;
            }

            int gcd = b;
            arr[i + 1] = (arr[i] * arr[i + 1]) / gcd;
        }

        return arr[arr.length - 1];
    }
}
