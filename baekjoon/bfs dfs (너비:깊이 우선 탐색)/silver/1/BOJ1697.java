package baekjoon.bfs_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 숨바꼭질
public class BOJ1697 {

    static int[] dx = {-1, 1, 2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[100001];
        int[] pos = new int[100001];
        bfs(n, k, visited, pos);
    }

    static void bfs(int n, int k, boolean[] visited, int[] pos) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(n);
        visited[n] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll(); // 현재 위치
            for (int i = 0; i < 3; i++) {
                int nx = (i == 2) ? (x * dx[i]) : (x + dx[i]);
                if (nx >= 0 && nx < 100001 && !visited[nx]) {
                    visited[nx] = true;
                    queue.offer(nx);
                    pos[nx] = pos[x] + 1;
                }
            }
        }
        System.out.println(pos[k]);
    }
}
