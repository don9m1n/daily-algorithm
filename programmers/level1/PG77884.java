package programmers.level1;

// 약수의 개수와 뎃셈 [월간 코드 챌린지 시즌2]
public class PG77884 {

    public static void main(String[] args) {
        int solution = solution(13, 17);
        System.out.println("solution = " + solution);
    }

    public static int solution(int left, int right) {

        int sum = 0;
        for (int i = left; i <= right; i++) {
            // 제곱수는 약수의 개수는 항상 홀수개!!
            if(i % Math.sqrt(i) == 0) {
                sum -= i;
            }else {
                sum += i;
            }
        }

        return sum;
    }
}
