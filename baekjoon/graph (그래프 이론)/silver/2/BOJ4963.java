package baekjoon.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 섬의 개수
public class BOJ4963 {

    static int w;
    static int h;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            // 0이 2개 입력되면 프로그램 종료
            if (w == 0 && h == 0) {
                break;
            }

            map = new int[h][w];
            visited = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt = 0; // 각 케이스 별 섬의 개수
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visited[i][j] && map[i][j] == 1) {
                        // bfs(i, j);
                        // dfs(i, j);
                        recursion(i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    // dfs(재귀)
    private static void recursion(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < h && ny >= 0 && ny < w) {
                if (!visited[nx][ny] && map[nx][ny] == 1) {
                    recursion(nx, ny);
                }
            }
        }
    }

    // dfs(스택)
    private static void dfs(int x, int y) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{x, y});
        visited[x][y] = true;

        while (!stack.isEmpty()) {
            int[] cur = stack.peek();
            int curX = cur[0];
            int curY = cur[1];
            boolean flag = false; // 해당 노드에 인접 노드가 있는지 체크(없으면 스택에서 제거할거임)

            for (int i = 0; i < 8; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && nx < h && ny >= 0 && ny < w) {
                    if (!visited[nx][ny] && map[nx][ny] == 1) {
                        stack.push(new int[]{nx, ny});
                        flag = true;
                        visited[nx][ny] = true;
                    }
                }
            }

            if (!flag) { // 해당 노드에 인접 노드가 없는 경우 스택에서 해당 노드 제거
                stack.pop();
            }
        }
    }

    // bfs(큐)
    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true; // 방문처리

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            // 현재 좌표를 상하좌우로 탐색
            for (int i = 0; i < 8; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && nx < h && ny >= 0 && ny < w) {
                    if (!visited[nx][ny] && map[nx][ny] == 1) {
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }
}
