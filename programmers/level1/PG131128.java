package progammers.level1;

// 숫자 짝꿍
public class PG131128 {
    public static void main(String[] args) {
        System.out.println(solution("100", "2345"));
        System.out.println(solution("100", "203045"));
        System.out.println(solution("100", "123450"));
        System.out.println(solution("12321", "42531"));
        System.out.println(solution("5525", "1255"));
    }

    static String solution(String X, String Y) {
        int[] x = new int[10];
        int[] y = new int[10];

        for (int i = 0; i < X.length(); i++) {
            x[X.charAt(i) - 48]++;
        }

        for (int i = 0; i < Y.length(); i++) {
            y[Y.charAt(i) - 48]++;
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int min = Math.min(x[i], y[i]);
            answer.append(String.valueOf(i).repeat(min));
        }

        return answer.isEmpty() ? "-1" : answer.charAt(0) == '0' ? "0" : String.valueOf(answer);
    }
}
