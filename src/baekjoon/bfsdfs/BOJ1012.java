package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 유기농 배추
public class BOJ1012 {

    static int[] dx = {-1, 1, 0, 0}; // 상하
    static int[] dy = {0, 0, -1, 1}; // 좌우
    static int n; // 세로: x
    static int m; // 가로: y
    static int k;
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            List<Integer> result = new ArrayList<>(); // 결과를 담을 리스트
            visited = new boolean[n][m];
            map = new int[n][m];
            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }

            for (int x = 0; x < n; x++) {
                for (int y = 0; y < m; y++) {
                    if(!visited[x][y] && map[x][y] == 1) {
                        System.out.println(x + ", " + y);
                        result.add(bfs(x, y));
                    }
                }
            }
            System.out.println(result.size());
        }
    }

    private static int bfs(int x, int y) {

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});
        visited[x][y] = true;

        int cnt = 1;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curX = cur[0]; // 현재 x좌표
            int curY = cur[1]; // 현재 y좌표

            for (int i = 0; i < 4; i++) { // 상하좌우로 배추가 있는 지 검색
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) { // 좌표가 map의 범위에 포함되고
                    if(!visited[nx][ny] && map[nx][ny] == 1) { // 처음 방문하고 배추가 있는 곳이라면
                        q.add(new int[] {nx, ny});
                        visited[nx][ny] = true;
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }
}
