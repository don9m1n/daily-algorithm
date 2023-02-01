package baekjoon.bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 체스판 다시 칠하기
public class BOJ1018 {

    static boolean[][] board;
    static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        board = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            for (int j = 0; j < m; j++) {
                board[i][j] = str.charAt(j) == 'W';
            }
        }

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                change(i, j);
            }
        }

        System.out.println(min);
    }

    // 체스판 칠하기
    private static void change(int x, int y) {
        int count = 0;
        boolean flag = board[x][y];

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (board[i][j] != flag) {
                    count++;
                }
                flag = !flag;
            }
            flag = !flag;
        }

        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }
}
