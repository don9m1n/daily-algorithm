package progammers.level1;

// 수박수박수박수박수박수?
public class PG12922 {
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(4));
    }

    static String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            answer.append(i % 2 != 0 ? "수" : "박");
        }

        return answer.toString();
    }
}
