package programmers.level1;

// 숫자 문자열과 영단어 [2021 카카오 채용연계형 인턴십]
public class PG81301 {

    public static void main(String[] args) {
        int solution = solution("2three45sixseven");
        System.out.println("solution = " + solution);
    }

    // replaceAll, replace
    public static int solution(String s) {

        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < numbers.length; i++) {
            s = s.replaceAll(numbers[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}
