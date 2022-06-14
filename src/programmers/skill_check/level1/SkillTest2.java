package programmers.skillcheck.level1;

public class SkillTest2 {

    static String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void main(String[] args) {
        int solution = solution("one4seveneight");
        System.out.println("solution = " + solution);
    }

    public static int solution(String s) {
        for (int i = 0; i < numbers.length; i++) {
            if (s.contains(numbers[i])) {
                s = s.replace(numbers[i], String.valueOf(i));
            }
        }
        return Integer.parseInt(s);
    }
}
