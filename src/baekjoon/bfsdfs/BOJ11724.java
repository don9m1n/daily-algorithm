package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 연결 요소의 개수 || 연결요소: 나누어진 각각의 그래프
public class BOJ11724 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()); // 정점
        int m = Integer.parseInt(st.nextToken()); // 간선

        boolean[] visited = new boolean[n + 1]; // 체크 배열
        int[][] graph = new int[n + 1][n + 1]; // 연결 리스트

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            graph[v1][v2] = 1;
            graph[v2][v1] = 1;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(!visited[i]) list.add(bfs(graph, visited, i));
            // if(!visited[i]) list.add(dfs(graph, visited, i));
        }

        System.out.println(list.size());

    }

    // 스택, 재귀
    private static int dfs(int[][] graph, boolean[] visited, int v) {

        Stack<Integer> stack = new Stack<>();
        stack.push(v);
        visited[v] = true;

        int cnt = 1;
        while (!stack.isEmpty()) {
            v = stack.peek();

            boolean flag = false;

            for (int i = 1; i < graph.length; i++) {
                if(!visited[i] && graph[v][i] == 1) {
                    stack.push(i);
                    visited[i] = true;
                    flag = true;
                    cnt++;
                    break;
                }
            }

            if(!flag) {
                stack.pop();
            }
            System.out.println("스택 변화: " + stack.toString());
        }

        return cnt;
    }

    // 큐
    private static int bfs(int[][] graph, boolean[] visited, int v) {

        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;

        int cnt = 1; // 연결 노드의 개수 (자신을 포함하기 때문에 1로 초기화)
        while (!q.isEmpty()) {
            v = q.poll(); // 1
            System.out.print(v + " ");

            for (int i = 1; i < graph.length; i++) {
                if(!visited[i] && graph[v][i] == 1) {
                    q.add(i);
                    visited[i] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
