package progammers.level0;

import java.util.Arrays;

// 캐릭터의 좌표
public class PG_120861 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11})));
    }

    static int[] solution(String[] keyinput, int[] board) {

        int maxX = (board[0] - 1) / 2; // 최대 X 좌표
        int maxY = (board[1] - 1) / 2; // 최대 Y 좌표

        int minX = maxX * -1;
        int minY = maxY * -1;

        int currX = 0;
        int currY = 0;

        for (String command : keyinput) {
            switch (command) {
                case "up" -> currY = Math.min(currY + 1, maxY);
                case "down" -> currY = Math.max(currY - 1, minY);
                case "left" -> currX = Math.max(currX - 1, minX);
                case "right" -> currX = Math.min(currX + 1, maxX);
            }
        }

        return new int[]{currX, currY};
    }
}
