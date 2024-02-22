package baekjoon.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 바이러스
public class BOJ2606 {

    static int[][] computers;
    static boolean[] visited;
    static int v = 1; // 시작점
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        computers = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        StringTokenizer st;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            computers[x][y] = 1;
            computers[y][x] = 1;
        }

        // int cnt = bfs(v);
        // int cnt = dfs1(v);
        int cnt = dfs2(v);
        System.out.println(cnt);
    }

    // dfs => 재귀
    private static int dfs2(int v) {
        visited[v] = true;

        for (int i = 1; i < computers.length; i++) {
            if (!visited[i] && computers[v][i] == 1) {
                count++;
                dfs2(i);
            }
        }
        return count;
    }

    // dfs => stack
    private static int dfs1(int v) {
        Stack<Integer> stack = new Stack<>();
        stack.push(v);
        visited[v] = true;

        int cnt = 0;
        while (!stack.isEmpty()) {
            int vv = stack.peek();
            boolean flag = false;

            for (int i = 1; i < computers.length; i++) {
                if (!visited[i] && computers[vv][i] == 1) {
                    visited[i] = true;
                    stack.push(i);
                    cnt++;
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                stack.pop();
            }
        }
        return cnt;
    }

    private static int bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visited[v] = true;

        int cnt = 0;
        while (!queue.isEmpty()) {
            int vv = queue.poll();

            for (int i = 1; i < computers.length; i++) {
                if (!visited[i] && computers[vv][i] == 1) {
                    visited[i] = true;
                    queue.offer(i);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
