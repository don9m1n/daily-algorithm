package baekjoon.bfs_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 토마토
public class BOJ7569 {

    static int M;
    static int N;
    static int H;

    // 상하좌우 위아래
    static int[] dh = {0, 0, 0, 0, 1, -1};
    static int[] dn = {-1, 1, 0, 0, 0, 0};
    static int[] dm = {0, 0, -1, 1, 0, 0};

    static int[][][] box;
    static boolean[][][] visited;
    static Queue<Tomato> tomatoQueue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        box = new int[H][N][M];
        visited = new boolean[H][N][M];
        tomatoQueue = new LinkedList<>();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    box[i][j][k] = Integer.parseInt(st.nextToken());
                    if(box[i][j][k] == 1) {
                        tomatoQueue.add(new Tomato(i, j, k));
                    }
                }
            }
        }

        System.out.println(bfs());
    }

    public static int bfs() {
        while (!tomatoQueue.isEmpty()) {
            Tomato tomato = tomatoQueue.poll();

            int h = tomato.h;
            int n = tomato.n;
            int m = tomato.m;

            visited[h][n][m] = true;

            for (int i = 0; i < 6; i++) {
                int nh = h + dh[i];
                int nn = n + dn[i];
                int nm = m + dm[i];

                if (nh >= 0 && nh < H && nn >= 0 && nn < N && nm >= 0 && nm < M) {
                    if (!visited[nh][nn][nm] && box[nh][nn][nm] == 0) {
                        box[nh][nn][nm] = box[h][n][m] + 1;
                        visited[nh][nn][nm] = true;
                        tomatoQueue.add(new Tomato(nh, nn, nm));
                    }
                }
            }
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (box[i][j][k] == 0) {
                        return -1;
                    }
                    max = Math.max(max, box[i][j][k]);
                }
            }
        }

        return max == 1 ? 0 : max - 1;
    }

    static class Tomato {
        int h;
        int n;
        int m;

        public Tomato(int h, int n, int m) {
            this.h = h;
            this.n = n;
            this.m = m;
        }
    }
}
