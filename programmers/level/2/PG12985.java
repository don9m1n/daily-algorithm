package programmers.level2;

// 예상 대진표 <2017 팁스타운>
public class PG12985 {

    public static void main(String[] args) {

        int solution = solution(8, 4, 7);
        System.out.println("solution = " + solution); // 3??
    }

    // n: 참가자 수, a: 참가자 a, b: 참가자 b
    public static int solution(int n, int a, int b) {

        int round = 0;

        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            round++;
        }

        return round;
    }
}
