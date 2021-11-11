package programmers.level1;

// 없는 숫자 더하기 [월간 코드 챌린지 시즌3]
public class PG86051 {

    public static void main(String[] args) {
        int solution = solution(new int[]{5,8,4,0,6,7,9});
        System.out.println("solution = " + solution);
    }

    public static int solution(int[] numbers) {

        int sum = 45;
        for (int i = 0; i < numbers.length; i++) {
            sum -= numbers[i];
        }

        return sum;
    }
}
