package progammers.level1;

// 서울에서 김서방 찾기
public class PG12919 {
    public static void main(String[] args) {
        String solution = solution(new String[]{"Jane", "Kim"});
        System.out.println("solution = " + solution);
    }

    static String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return String.format("김서방은 %d에 있다.", i);
            }
        }

        return "";
    }
}
