package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 안전 영역
public class BOJ2468 {

    static StringTokenizer st;
    static int[] dx = {-1, 1, 0, 0}; // 상하
    static int[] dy = {0, 0, -1, 1}; // 좌우
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        if(n == 1) return;

        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        int height = 0;
        while(height <= 100) {
            boolean[][] visited = new boolean[n][n]; // 방문 지점 체크
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j] && map[i][j] > height) {
                        list.add(bfs(map, visited, i, j, height));
                    }
                }
            }
            if(list.size() == 0) break;
            max = Math.max(max, list.size());
            height++;
        }

        System.out.print(max);
    }

    private static int bfs(int[][] map, boolean[][] visited, int x, int y, int h) {

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});
        visited[x][y] = true;

        int cnt = 1;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i]; // 다음 x좌표
                int ny = curY + dy[i]; // 다음 y좌표

                if (nx >= 0 && nx < n && ny >= 0 && ny < n) { // 좌표를 옮겼을 때 map을 벗어나지 않는다면
                    if(!visited[nx][ny] && map[nx][ny] > h) {
                        q.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
