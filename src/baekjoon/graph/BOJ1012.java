package baekjoon.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 유기농 배추
public class BOJ1012 {

    static int n;
    static int m;
    static int k;
    static int[] dx = {-1 , 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int[][] field;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            field = new int[n][m];
            visited = new boolean[n][m];

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                field[x][y] = 1;
            }

            int cnt = 0;
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < m; y++) {
                    if (!visited[x][y] && field[x][y] == 1) {
                        dfs2(x, y);
                        // dfs1(x, y);
                        // bfs(x, y);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    // dfs => 재귀
    private static void dfs2(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                if (!visited[nx][ny] && field[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    dfs2(nx, ny);
                }
            }
        }
    }

    // dfs => 스택!
    private static void dfs1(int x, int y) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{x, y});
        visited[x][y] = true;

        while (!stack.isEmpty()) {
            int[] cur = stack.peek();
            int curX = cur[0];
            int curY = cur[1];
            boolean flag = false; // 인접 노드 체크

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (!visited[nx][ny] && field[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        stack.push(new int[]{nx, ny});
                        flag = true;
                        break;
                    }
                }
            }
            if(!flag) {
                stack.pop();
            }
        }

    }


    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (!visited[nx][ny] && field[nx][ny] == 1) {
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }
}
