package baekjoon.bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 체스판 다시 칠하기
public class BOJ1018 {

    static int[] dx = {-1, 0, 1, 0}; // 상우하좌
    static int[] dy = {0, 1, 0, -1}; // 상우하좌
    static Map<String, String> colorMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[][] original = new String[n][m]; // 체스판 크기
        colorMap.put("B", "W");
        colorMap.put("W", "B");

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split("");
            for (int j = 0; j < arr.length; j++) {
                original[i][j] = arr[j];
            }
        }

        /**
         * 얕은 복사: 원본이나 복사본의 값이 변경되면 값이 함께 변경
         * 깊은 복사: 원본이나 복사본의 값이 변경되어도 서로 간의 영향 없음
         */
        String[][] copy = deepCopy(original);
        int start = 0;
        int end = 8;

        int min = 10000; // 최소 횟수
        while (n - start >= 8) { // 내려 갈 수 있는 행이 있을때까지 반복
            while (end <= m) {
                int count = 0;
//                System.out.println("start = " + start);
//                System.out.println("end = " + end);
                for (int i = start; i < start + 8; i++) {
                    for (int j = end - 8; j < end; j++) {
                        String color = copy[i][j];

                        for (int k = 0; k < 4; k++) {
                            int nx = i + dx[k];
                            int ny = j + dy[k];

                            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                                if (copy[nx][ny].equals(color)) {
                                    copy[nx][ny] = colorMap.get(color);
                                    count++;
                                }
                            }
                        }
                    }
                }
                end++;
            }
            start++;
            end = 8;
            copy = original;
        }

    }

    // 2차원 배열 깊은 복사
    private static String[][] deepCopy(String[][] original) {
        String[][] copy = new String[original.length][original[0].length];
        for (int i = 0; i < original.length; i++) {
            System.arraycopy(original[i], 0, copy[i], 0, original[i].length);
        }
        return copy;
    }
}
