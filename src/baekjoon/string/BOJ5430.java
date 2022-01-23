package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * AC
 * 숫자를 뒤집으면서 풀면 시간초과 ! -> Deque 사용
 */
public class BOJ5430 {

    static Deque<Integer> dq = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            String command = br.readLine();
            int n = Integer.parseInt(br.readLine()); // 배열에 들어갈 숫자의 개수
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");

            dq = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                dq.add(Integer.parseInt(st.nextToken()));
            }
            arrayMethod(command, dq);
        }
        System.out.println(sb);
    }

    private static void arrayMethod(String command, Deque<Integer> dq) throws IOException {

        boolean isRight = true;

        for (char cmd : command.toCharArray()) {
            if (cmd == 'R') {
                isRight = !isRight; // 방향 바꿔주기!
                continue;
            }

            if (isRight) { // D 함수이면서 isRight = true일 경우
                if (dq.pollFirst() == null) {
                    sb.append("error\n");
                    return;
                }
            } else {
                if (dq.pollLast() == null) {
                    sb.append("error\n");
                    return;
                }
            }
        }
        makePrintString(dq, isRight);
    }

    // 결과 메세지 만들기
    private static void makePrintString(Deque<Integer> dq, boolean isRight) {

        sb.append("[");

        if (dq.size() > 0) {
            if (isRight) {
                sb.append(dq.pollFirst());

                while (!dq.isEmpty()) {
                    sb.append(",").append(dq.pollFirst());
                }
            } else {
                sb.append(dq.pollLast());

                while (!dq.isEmpty()) {
                    sb.append(",").append(dq.pollLast());
                }
            }
        }
        sb.append("]").append("\n");
    }
}