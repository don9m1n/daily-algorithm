package progammers.level2;

import java.util.HashSet;
import java.util.Set;

// 방문 길이
public class PG49994 {
    public static void main(String[] args) {
        System.out.println(solution("ULURRDLLU"));
        System.out.println(solution("LULLLLLLU"));
    }

    static int solution(String dirs) {
        Set<String> set = new HashSet<>();

        int curX = 0;
        int curY = 0;

        for (int i = 0; i < dirs.length(); i++) {
            char command = dirs.charAt(i);
            boolean flag = false;
            int nextX = curX;
            int nextY = curY;

            StringBuilder sb = new StringBuilder();
            switch (command) {
                case 'U' -> {
                    nextY++;
                    sb.append(curX).append(curY).append(nextX).append(nextY);
                }
                case 'D' -> {
                    nextY--;
                    sb.append(nextX).append(nextY).append(curX).append(curY);
                }
                case 'R' -> {
                    nextX++;
                    sb.append(curX).append(curY).append(nextX).append(nextY);
                }
                case 'L' -> {
                    nextX--;
                    sb.append(nextX).append(nextY).append(curX).append(curY);
                }
            }

            if (nextX < -5 || nextX > 5 || nextY < -5 || nextY > 5) {
                continue;
            }

            set.add(sb.toString());
            curX = nextX;
            curY = nextY;
        }

        return set.size();
    }
}
