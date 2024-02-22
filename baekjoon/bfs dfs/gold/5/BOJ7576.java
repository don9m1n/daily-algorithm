package baekjoon.bfs_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 토마토
public class BOJ7576 {

    static int M;
    static int N;
    static int max;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int[][] box;
    static boolean[][] visited;
    static Queue<Tomato> tomatoQueue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        max = 0;
        box = new int[N][M];
        visited = new boolean[N][M];
        tomatoQueue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {

                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1) {
                    tomatoQueue.add(new Tomato(i, j));
                }
            }
        }

        if (isAllCheckOne()) {
            System.out.println(0);
            return;
        }

        System.out.println(bfs());
    }

    static int bfs() {
        while (!tomatoQueue.isEmpty()) {
            Tomato tomato = tomatoQueue.poll();

            int n = tomato.n;
            int m = tomato.m;

            visited[n][m] = true;

            for (int i = 0; i < 4; i++) {
                int nx = n + dx[i];
                int ny = m + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (!visited[nx][ny] && box[nx][ny] == 0) {
                        box[nx][ny] = box[n][m] + 1;
                        max = Math.max(max, box[nx][ny]);
                        visited[nx][ny] = true;
                        tomatoQueue.add(new Tomato(nx, ny));
                    }
                }
            }
        }

        return !isCheckZero() ? max - 1 : -1;
    }

    static boolean isAllCheckOne() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isCheckZero() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    static class Tomato {
        int n;
        int m;

        public Tomato(int n, int m) {
            this.n = n;
            this.m = m;
        }
    }
}
