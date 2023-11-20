package progammers.level2;

import java.util.*;

// 무인도 여행
public class PG154540 {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;
    static String[][] map;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"X591X","X1X5X","X231X", "1XXX1"})));
        System.out.println(Arrays.toString(solution(new String[]{"XXX","XXX","XXX"})));
    }

    static int[] solution(String[] maps) {

        visited = new boolean[maps.length][maps[0].length()];
        map = new String[maps.length][maps[0].length()];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                map[i][j] = String.valueOf(maps[i].charAt(j));
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (!visited[i][j] && !map[i][j].equals("X")) {
                    list.add(bfs(i, j));
                }
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    private static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        int sum = Integer.parseInt(map[x][y]);
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int curX = current[0];
            int curY = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && ny >= 0 && nx < map.length && ny < map[0].length) {
                    if(!visited[nx][ny] && !map[nx][ny].equals("X")) {
                        queue.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        sum += Integer.parseInt(map[nx][ny]);
                    }
                }
            }
        }
        return sum;
    }
}
