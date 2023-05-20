package baekjoon.bfs_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 나이트의 이동
public class BOJ7562 {

    static int n;
    static int l;
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
    static StringTokenizer st;
    static int startX;
    static int startY;
    static int endX;
    static int endY;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            l = Integer.parseInt(br.readLine());
            board = new int[l][l];
            visited = new boolean[l][l];

            st = new StringTokenizer(br.readLine());
            startX = Integer.parseInt(st.nextToken());
            startY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            endX = Integer.parseInt(st.nextToken());
            endY = Integer.parseInt(st.nextToken());

            System.out.println(bfs(startX, startY));
        }
    }

    private static int bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});

        visited[startX][startY] = true;

        loop:
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int currX = curr[0];
            int currY = curr[1];

            for (int i = 0; i < 8; i++) {
                int nx = currX + dx[i];
                int ny = currY + dy[i];

                if (nx >= 0 && nx < l && ny >= 0 && ny < l && !visited[nx][ny]) {
                    queue.add(new int[]{nx, ny});
                    board[nx][ny] = board[currX][currY] + 1;
                    visited[nx][ny] = true;
                }

                if (nx == endX && ny == endY) {
                    break loop;
                }
            }
        }

        return board[endX][endY];
    }
}
