package programmers.level1.exercise;

// 기사단원의 무기
public class PG136798 {
    public static void main(String[] args) {
        int solution = solution(5, 3, 2);
        System.out.println("solution = " + solution);
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int count = divisor(i);

            if (count > limit) {
                answer += power;
            } else {
                answer += count;
            }
        }
        return answer;
    }

    private static int divisor(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                count++;
            } else if(num % i == 0) {
                count += 2;
            }
        }
        return count;
    }
}
