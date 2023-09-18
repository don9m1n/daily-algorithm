package progammers.level1;

// 콜라츠 추측
public class PG12943 {
    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
    }

    static int solution(int num) {
        int answer = 0;

        long n = num;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }

            answer++;

            if (answer == 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}
