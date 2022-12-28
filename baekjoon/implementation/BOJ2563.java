package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 색종이
public class BOJ2563 {

    static int[][] board = new int[100][100]; // 도화지
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int maxX = 0;
        int maxY = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            maxX = Math.max(maxX, x + 10);
            maxY = Math.max(maxY, y + 10);

            paint(x, y); // 도화지에 색종이 붙이기
        }

        int count = getWidth(maxX, maxY);
        System.out.println(count);
    }

    // 넓이 구하기
    private static int getWidth(int maxX, int maxY) {
        int count = 0;
        for (int i = 0; i < maxX; i++) {
            for (int j = 0; j < maxY; j++) {
                if(board[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    // 도화지에 색종이 붙이기!
    // 도화지의 길이가 10 x 10 이기 때문에 +10
    private static void paint(int x, int y) {
        for (int i = x; i < (x + 10); i++) {
            for (int j = y; j < (y + 10); j++) {
                if(board[i][j] == 1) {
                    board[i][j] = 0;
                }
                board[i][j] = 1;
            }
        }
    }
}
