package progammers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 호텔 대실
public class PG_155651 {
    public static void main(String[] args) {
        System.out.println(solution(new String[][]{{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}}));
        System.out.println(solution(new String[][]{{"09:10", "10:10"}, {"10:20", "12:20"}}));
        System.out.println(solution(new String[][]{{"10:20", "12:30"}, {"10:20", "12:30"}, {"10:20", "12:30"}}));

    }

    static int solution(String[][] book_time) {

        Arrays.sort(book_time, Comparator.comparing(o -> o[0]));

        // 예약 시간 정수로 변경
        int[][] time = new int[book_time.length][2];
        for (int i = 0; i < book_time.length; i++) {
            int startTime = Integer.parseInt(book_time[i][0].replace(":", ""));
            int endTime = Integer.parseInt(book_time[i][1].replace(":", ""));

            endTime += 10;
            if (endTime % 100 >= 60) {
                endTime += 40;
            }

            time[i][0] = startTime;
            time[i][1] = endTime;
        }

        List<Integer> rooms = new ArrayList<>();
        for (int[] t : time) {

            if (rooms.isEmpty()) {
                rooms.add(t[1]);
                continue;
            }

            boolean flag = false;
            for (int j = 0; j < rooms.size(); j++) {
                if (t[0] >= rooms.get(j)) {
                    rooms.set(j, t[1]);
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                rooms.add(t[1]);
            }
        }

        return rooms.size();
    }
}
