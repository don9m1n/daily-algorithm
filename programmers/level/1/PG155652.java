package programmers.level1.success;

// 둘만의 암호
public class PG155652 {
    public static void main(String[] args) {
        String solution = solution("bcdefghijklmnopqrstuvwxyz", "a", 1);
        System.out.println("solution = " + solution);
        System.out.println("expected = " + "cdefghijklmnopqrstuvwxyzb");
    }
    static String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            for (int j = 0; j < index; j++) {
                ch += 1;
                if (ch > 'z') {
                    ch -= 26;
                }
                if (skip.contains(String.valueOf(ch))) {
                    j--;
                }
            }
            sb.append(ch);
        }
        return String.valueOf(sb);
    }
}
