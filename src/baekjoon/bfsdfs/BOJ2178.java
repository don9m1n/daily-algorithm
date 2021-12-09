package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 미로탐색
public class BOJ2178 {

    // 상하좌우 이동
    static int[] dx = {-1, 1, 0, 0}; // 상하
    static int[] dy = {0, 0, -1, 1}; // 좌우
    static int n;
    static int m;
    static boolean[][] visited;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n][m];
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split("");
            for (int j = 0; j < arr.length; j++) {
                map[i][j] = Integer.parseInt(arr[j]);
            }
        }

        int solution = bfs(0, 0);
        System.out.println("solution = " + solution);
    }

    private static int bfs(int x, int y) {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {

            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int i = 0; i < 4; i++) { // 상하좌우로 갈 수 있는지 체크
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if(nx >= 0 && nx < n && ny >= 0 && ny < m) { // 좌표가 map에 포함되는 경우
                    if(map[nx][ny] == 1 && !visited[nx][ny]) { // 길이고 방문하지 않은 곳이라면
                        queue.add(new int[]{nx, ny});
                        map[nx][ny] = map[curX][curY] + 1;
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return map[n - 1][m - 1];
    }
}
