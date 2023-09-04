package programmers.level1.success;

// 가운데 글자 가져오기
public class PG12903 {
    public static void main(String[] args) {
        String solution = solution("qwer");
        System.out.println("solution = " + solution);
    }

    public static String solution(String s) {

        StringBuilder sb = new StringBuilder();
        if (s.length() % 2 == 0) { // 단어의 길이가 짝수!
            int start = (s.length() / 2) - 1;
            int end = start + 2;
            sb.append(s, start, end);
        } else {
            int startIndex = s.length() / 2;
            sb.append(s.charAt(startIndex));
        }
        return sb.toString();
    }
}
