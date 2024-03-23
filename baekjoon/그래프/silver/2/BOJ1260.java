package baekjoon.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// DFS와 BFS
public class BOJ1260 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 정점 개수
        int m = Integer.parseInt(st.nextToken()); // 간선 개수
        int v = Integer.parseInt(st.nextToken()); // 시작 위치

        boolean[] visited = new boolean[n + 1]; // 방문 지점 체크
        // 인접행렬 (배열)
        int[][] matrix = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            matrix[x][y] = 1;
            matrix[y][x] = 1;
        }

        dfs1(v, visited, matrix);
        Arrays.fill(visited, false);
        bfs(v, visited, matrix);
        // dfs2(v, visited, matrix);

    }

    // dfs => 재귀
    private static void dfs2(int v, boolean[] visited, int[][] matrix) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int i = 1; i < matrix.length; i++) {
            if (!visited[i] && matrix[v][i] == 1) {
                dfs2(i, visited, matrix);
            }
        }
    }

    // dfs => stack
    private static void dfs1(int v, boolean[] visited, int[][] matrix) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        boolean flag = true;

        stack.push(v);
        visited[v] = true;
        sb.append(v).append(" ");

        while (!stack.isEmpty()) {
            int vv = stack.peek();
            flag = false; // 인접 노드가 있는지 없는지 체크

            for (int i = 1; i < matrix.length; i++) {
                if (matrix[vv][i] == 1 && !visited[i]) {
                    stack.push(i);
                    visited[i] = true;
                    flag = true; // 인접 노드가 있음!
                    sb.append(i).append(" ");
                    break;
                }
            }

            if (!flag) {
                stack.pop();
            }
        }
        System.out.println(sb.toString());
    }

    // bfs => queue
    private static void bfs(int v, boolean[] visited, int[][] matrix) {
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            int vv = queue.poll();
            sb.append(vv).append(" ");

            for (int i = 1; i < matrix.length; i++) {
                if (!visited[i] && matrix[vv][i] == 1) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
        System.out.println(sb.toString());
    }
}