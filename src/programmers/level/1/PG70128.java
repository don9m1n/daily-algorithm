package programmers.level1;

// 내적 [월간 코드 챌린지 시즌1]
public class PG70128 {

    public static void main(String[] args) {
        int solution = solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2});
        System.out.println("solution = " + solution);
    }

    public static int solution(int[] a, int[] b) {

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += (a[i] * b[i]);
        }

        return sum;
    }
}
