package programmers.level1.exercise;

// 문자열 나누기
public class PG140108 {
    public static void main(String[] args) {
        int solution = solution("aaabbaccccabba");
        System.out.println("solution = " + solution);
    }

    public static int solution(String s) {

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int count1 = 0; // X의 개수
            int count2 = 0; // !X의 개수

            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count1++;
                } else {
                    count2++;
                }

                if (count1 == count2 || j == s.length() - 1) {
                    result++;
                    i = j;
                    break;
                }
            }
        }

        return result;
    }
}
