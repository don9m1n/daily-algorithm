package baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 요세푸스 문제
public class BOJ1158 {

    static int n;
    static int k;
    static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        System.out.println(solve2());
    }

    private static String solve1() {
        List<Integer> result = new ArrayList<>();
        int count = 1;
        while (!queue.isEmpty()) {
            if (count == k) {
                result.add(queue.poll());
                count = 1; // count 초기화
            } else {
                queue.add(queue.poll());
                count++;
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append("<");
        for (int i = 0; i < result.size(); i++) {
            if (i == result.size() - 1) {
                sb.append(result.get(i));
            } else {
                sb.append(result.get(i)).append(", ");
            }
        }

        sb.append(">");
        return sb.toString();
    }

    /**
     * 좀 더 깔끔한 풀이
     */
    private static String solve2() {

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                queue.add(queue.poll());
            }
            sb.append(queue.poll()).append(" ");
        }
        return sb.toString();
    }
}