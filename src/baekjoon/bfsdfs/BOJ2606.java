package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 바이러스
public class BOJ2606 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 컴퓨터의 수
        int m = Integer.parseInt(br.readLine()); // 컴퓨터 쌍의 수

        StringTokenizer st;
        int[][] arr = new int[n + 1][n + 1]; // 인접행렬
        boolean[] visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            arr[v1][v2] = 1;
            arr[v2][v1] = 1;
        }

        int solution = bfs(arr, visited, 1);
        System.out.println("solution = " + solution);
    }

    // bfs-Queue
    private static int bfs(int[][] arr, boolean[] visited, int v) {

        Queue<Integer> q = new LinkedList<>();

        int count = 0; // 바이러스에 걸린 컴퓨터의 개수
        q.add(v);
        visited[v] = true;

        while (!q.isEmpty()) {

            v = q.poll();

            for (int i = 1; i < arr.length; i++) {
                if(arr[v][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                    count++;
                }
            }
        }

        return count;
    }
}
