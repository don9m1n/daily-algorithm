package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 단지번호붙이기
 */
public class BOJ2667 {

    static int[] dx = {-1, 0, 1, 0}; // 상좌하우
    static int[] dy = {0, 1, 0, -1};
    static int n;
    static int[][] board;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        visited = new boolean[n][n]; // 방문체크 배열

        // board 채우기
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                board[i][j] = s.charAt(j) - '0';
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 우선순위큐: 작은 수가 우선순위가 더 높음!

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 1 && !visited[i][j]) {
                    pq.add(bfs(i, j));
                }
            }
        }
        System.out.println(pq.size());
        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }

    private static int bfs(int x, int y) {

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        int count = 1;
        while (!q.isEmpty()) {

            int[] curr = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = curr[0] + dx[i]; // 다음 x좌표
                int ny = curr[1] + dy[i]; // 다음 y좌표
                System.out.println("현재 좌표 : (" + curr[0] + ", " + curr[1] + ")");
                System.out.println("nx = " + nx + "  ny = " + ny);
                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    if (!visited[nx][ny] && board[nx][ny] == 1) {
                        q.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
