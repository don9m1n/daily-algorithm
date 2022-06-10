package programmers.level1.success;

// 시저암호
public class PG12926 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        String solution = solution("a B z", 4);
        System.out.println("solution = " + solution);
    }

    public static String solution(String s, int n) {
        for (int i = 0; i < s.length(); i++) {
            convertCharacter(s, n, i);
        }
        return sb.toString();
    }

    private static void convertCharacter(String s, int n, int i) {
        char ch = s.charAt(i); // 변경할 문자
        if (ch != ' ') {
            int next = ch + n;
            if (next < (97 + n)) { // 대문자
                if ((90 - next) < 0) {
                    sb.append((char)((65 + (next % 90)) - 1));
                }else {
                    sb.append((char) next);
                }
            } else { // 소문자
                if ((122 - next) < 0) {
                    sb.append((char)((97 + (next % 122)) - 1));
                }else {
                    sb.append((char) next);
                }
            }
        }else {
            sb.append(ch);
        }
    }
}
