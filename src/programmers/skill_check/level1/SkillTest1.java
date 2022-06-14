package programmers.skillcheck.level1;

public class SkillTest1 {
    public static void main(String[] args) {
        String solution = solution("027778888");
        System.out.println("solution = " + solution);
    }

    public static String solution(String phone_number) {

        StringBuilder sb = new StringBuilder();
        int end = phone_number.length() - 4;
        sb.append(phone_number.substring(0, end).replaceAll("[0-9]", "*"));
        sb.append(phone_number.substring(end));
        return sb.toString();
    }
}
