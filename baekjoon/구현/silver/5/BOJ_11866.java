package baekjoon.implementation.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 요세푸스 문제 0
public class BOJ_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> answer = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            int index = 1;
            while (true) {
                if (index == k) {
                    answer.add(queue.poll());
                    break;
                }
                queue.add(queue.poll());
                index++;
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!answer.isEmpty()) {
            if (answer.size() == 1) {
                sb.append(answer.poll());
            } else {
                sb.append(answer.poll()).append(", ");
            }
        }

        System.out.printf("<%s>", sb);

    }
}
