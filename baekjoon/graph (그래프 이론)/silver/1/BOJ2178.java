package baekjoon.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 미로탐색
public class BOJ2178 {

    static int n;
    static int m;
    static int x = 1;
    static int y = 1;
    // 상좌하우
    static int[] dx = {-1 , 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int[][] map;
    static boolean[][] visited;
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n + 1][m + 1];
        visited = new boolean[n + 1][m + 1]; // 방문 지점 체크

        for (int i = 1; i <= n; i++) {
            String arr = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j + 1] = arr.charAt(j) - 48;
            }
        }

        int cnt = bfs(x, y);
        System.out.println(cnt);
    }

    private static int bfs(int x, int y) {
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && nx <= n && ny >= 0 && ny <= m) {
                    if (!visited[nx][ny] && map[nx][ny] == 1) {
                        queue.offer(new int[]{nx, ny});
                        map[nx][ny] = map[curX][curY] + 1;
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return map[n][m];
    }
}
