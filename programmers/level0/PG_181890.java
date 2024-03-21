package progammers.level0;

import java.util.Arrays;

// 왼쪽 오른쪽
public class PG_181890 {
    public static void main(String[] args) {
        System.out.println((Arrays.toString(solution(new String[]{"u", "u", "l", "r"}))));
        System.out.println((Arrays.toString(solution(new String[]{"u", "u", "r", "l"}))));
        System.out.println((Arrays.toString(solution(new String[]{"l"}))));
    }

    static String[] solution(String[] str_list) {

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }

        return new String[]{};
    }
}
