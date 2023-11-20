package progammers.level2;

import java.util.LinkedList;
import java.util.Queue;

// 게임 맵 최단거리
public class PG1844 {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static boolean[][] visited;
    static int[][] map;

    public static void main(String[] args) {
        System.out.println((solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}})));
        System.out.println((solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}})));
        System.out.println(solution(new int[][]{{1}}));
    }

    static int solution(int[][] maps) {

        map = new int[maps.length][maps[0].length];
        visited = new boolean[maps.length][maps[0].length];

        for (int i = 0; i < maps.length; i++) {
            System.arraycopy(maps[i], 0, map[i], 0, maps[i].length);
        }

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    return bfs(i, j);
                }
            }
        }

        return 1;
    }

    private static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        int count = 0;
        int min = Integer.MAX_VALUE;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int curX = current[0];
            int curY = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if(nx >= 0 && nx < map.length && ny >= 0 && ny < map[0].length){
                    if (!visited[nx][ny] && map[nx][ny] == 1) {
                        queue.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        map[nx][ny] = map[curX][curY] + 1;
                    }
                }
            }
        }

        return map.length > 1 && map[map.length - 1][map[0].length - 1] == 1 ? -1 : map[map.length - 1][map[0].length - 1];
    }
}
