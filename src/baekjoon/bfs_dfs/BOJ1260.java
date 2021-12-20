package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// DFS(깊이 우선 탐색)와 BFS(너비 우선 탐색)
public class BOJ1260 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 정점의 개수 -> 노드
        int m = Integer.parseInt(st.nextToken()); // 간선의 개수 -> 노드와 노드 사이를 연결하는 선
        int v = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점의 번호

        // 인접 행렬
        int[][] a = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            a[v1][v2] = 1;
            a[v2][v1] = 1;
        }

        boolean[] checkBFS = new boolean[n + 1];
        boolean[] checkDFS = new boolean[n + 1];

        String dfs = dfs(a, checkDFS, v);
        String bfs = bfs(a, checkBFS, v);

        System.out.println("dfs = " + dfs);
        System.out.println("bfs = " + bfs);
    }

    // bfs => Queue
    public static String bfs(int[][] a, boolean[] check, int v) {
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        queue.add(v); // [1]
        check[v] = true; // [f,t,f,f,f]

        while (!queue.isEmpty()) {

            v = queue.poll();
            sb.append(v).append(" ");

            for (int i = 1; i < a.length; i++) {

                // 서로 인접해있고 방문하지 않은 정점이라면
                if (a[v][i] == 1 && !check[i]) {
                    queue.add(i);
                    check[i] = true;
                }
            }
        }

        return sb.toString();
    }

    // dfs => Stack
    public static String dfs(int[][] a, boolean[] check, int v) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        stack.push(v);
        check[v] = true;
        sb.append(v).append(" "); // 시작 정점

        while (!stack.isEmpty()) {
            int vv = stack.peek();

            flag = false;

            for (int i = 1; i < a.length; i++) {
                if(a[vv][i] == 1 && !check[i]) { // 서로 인접해있고 방문을 하지 않았다면
                    stack.push(i);
                    sb.append(i).append(" ");

                    check[i] = true;
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                stack.pop();
            }
        }
        return sb.toString();
    }
}
