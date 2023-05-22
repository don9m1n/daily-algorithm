package baekjoon.bfs_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ11725 {

    static int n;
    static List<ArrayList<Integer>> map = new ArrayList<>();
    static int[] parent;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        // 인접 행렬

        for (int i = 0; i < n; i++) {
            map.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int v1 = Integer.parseInt(st.nextToken()) - 1;
            int v2 = Integer.parseInt(st.nextToken()) - 1;

            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }

        visited = new boolean[n];
        parent = new int[n];

        bfs(0);
    }

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            v = queue.remove();
            for (int node : map.get(v))
                if (!visited[node]) {
                    visited[node] = true;
                    queue.add(node);
                    parent[node] = v;
                }
        }

        for (int i = 1; i < n ; i++) {
            System.out.println(parent[i] + 1);
        }
    }
}
