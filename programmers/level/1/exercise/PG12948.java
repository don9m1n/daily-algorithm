package programmers.level1.success;

// 핸드폰 번호 가리기
public class PG12948 {
    public static void main(String[] args) {
        String solution = solution("01033334444");
        System.out.println("solution = " + solution);
    }

    public static String solution(String phone_number) {
        int length = phone_number.length() - 4;
        return phone_number.substring(0, length).replaceAll("[0-9]", "*") + phone_number.substring(length);
    }
}
