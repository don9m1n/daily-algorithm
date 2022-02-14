package baekjoon.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 연결 요소의 개수
public class BOJ11724 {

    static int[][] graph;
    static boolean[] visited;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()); // 정점
        int m = Integer.parseInt(st.nextToken()); // 간선

        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        for (int i = 1; i <= n; i++) {
            if(!visited[i]) {
                // bfs(i);
                // dfs(i);
                dfsR(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static void dfsR(int v) {
        visited[v] = true;

        for (int i = 1; i < graph.length; i++) {
            if (!visited[i] && graph[v][i] == 1) {
                dfsR(i);
            }
        }
    }

    private static void dfs(int v) {
        Stack<Integer> stack = new Stack<>();
        stack.push(v);
        visited[v] = true;

        while (!stack.isEmpty()) {
            int vv = stack.peek();
            boolean flag = false; // 검사 노드에 인접한 노드가 있는지 체크하는 변수

            for (int i = 1; i < graph.length; i++) {
                if (!visited[i] && graph[vv][i] == 1) {
                    visited[i] = true;
                    stack.push(i);
                    flag = true; // 인접 노드가 있다면 true
                    break;
                }
            }

            if(!flag) {
                stack.pop();
            }
        }
    }

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            int vv = queue.poll();

            for (int i = 1; i < graph.length; i++) {
                if (!visited[i] && graph[vv][i] == 1) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }
}
