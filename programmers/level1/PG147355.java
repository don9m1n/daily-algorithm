package programmers.level1.exercise;

// 크기가 작은 부분문자열
public class PG147355 {
    public static void main(String[] args) {
        int solution = solution("500220839878", "15");
        System.out.println("solution = " + solution);
    }

    public static int solution(String t, String p) {

        int count = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            if (Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p)) {
                count++;
            }
        }

        return count;
    }
}
