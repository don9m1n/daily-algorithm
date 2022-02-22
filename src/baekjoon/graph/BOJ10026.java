package baekjoon.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 적록색약
public class BOJ10026 {

    static int n;
    static String[][] map;
    static String[][] copy; // 적록색약 전용 배열
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new String[n][n];
        copy = new String[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                map[i][j] = arr[j];
            }
        }

        copy = copyMap();

        int cnt1 = result(map);
        for (boolean[] b : visited) Arrays.fill(b, false); // visited 배열 초기화
        int cnt2 = result(copy);
        System.out.println(cnt1 + " " + cnt2);
    }

    private static void dfs(int x, int y, String[][] map) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{x, y});
        visited[x][y] = true;
        String color = map[x][y]; // 탐색할 색깔

        while (!stack.isEmpty()) {
            int[] cur = stack.peek();
            int curX = cur[0];
            int curY = cur[1];
            boolean flag = false; // 해당 노드에 인접 노드가 있는지 체크할 변수

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    if (!visited[nx][ny] && map[nx][ny].equals(color)) {
                        stack.push(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        flag = true;
                    }
                }
            }

            if (!flag) {
                stack.pop();
            }
        }

    }

    // bfs
    private static void bfs(int x, int y, String[][] map) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        String color = map[x][y];

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    if (!visited[nx][ny] && map[nx][ny].equals(color)) {
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }

    // 결과 print
    private static int result(String[][] map) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    // bfs(i, j, map);
                    dfs(i, j, map);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    // 적록색약 전용 배열 만들기
    private static String[][] copyMap() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                copy[i][j] = (map[i][j].equals("G")) ? "R" : map[i][j];
            }
        }
        return copy;
    }
}