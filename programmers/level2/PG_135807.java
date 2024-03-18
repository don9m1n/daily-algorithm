package progammers.level2;

// 숫자 카드 나누기
public class PG_135807 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{10, 17}, new int[]{5, 20}));
        System.out.println(solution(new int[]{10, 20}, new int[]{5, 17}));
        System.out.println(solution(new int[]{14, 35, 119}, new int[]{18, 30, 102}));

    }

    static int solution(int[] arrayA, int[] arrayB) {

        int max = Math.max(arrayA[0], arrayB[0]);

        int answer = 0;
        for (int i = 2; i <= max; i++) {
            if (divide(i, arrayA) && notDivide(i, arrayB) || divide(i, arrayB) && notDivide(i, arrayA)) {
                answer = i;
            }
        }

        return answer;
    }

    private static boolean divide(int max, int[] array) {
        for (int num : array) {
            if (num % max > 0) {
                return false;
            }
        }

        return true;
    }

    private static boolean notDivide(int max, int[] array) {
        for (int num : array) {
            if (num % max == 0) {
                return false;
            }
        }

        return true;
    }
}
