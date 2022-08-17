package programmers.level1;

// 문자열 다루기 기본
public class PG12918 {
    public static void main(String[] args) {
        boolean solution = solution("1");
        System.out.println("solution = " + solution);
    }

    public static boolean solution(String s) {
        return isCheck(s);
    }

    private static boolean isCheck(String s) {
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                    return false;
                }
            }
        } else {
            return false;
        }

        return true;
    }
}
