package progammers.level2;

// JadenCase 문자열 만들기
public class PG12951 {
    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
        System.out.println(solution("for the last week"));
        System.out.println(solution("i  am  dongmin   "));
    }

    static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        s = s.toLowerCase();
        sb.append(s.charAt(0) >= 'a' && s.charAt(0) <= 'z' ? (char) (s.charAt(0) - 32) : s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(" ");
            } else if (s.charAt(i - 1) == ' ' && (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
                sb.append(((char) (s.charAt(i) - 32)));
            } else {
                sb.append(s.charAt(i));
            }
        }

        return String.valueOf(sb);
    }
}
