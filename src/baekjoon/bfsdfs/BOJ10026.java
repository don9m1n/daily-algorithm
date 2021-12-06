package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 적록색약
public class BOJ10026 {

    static int n;
    static Queue<Integer> xq;
    static Queue<Integer> yq;
    static int[][] temp = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static int[][] board;
    static boolean[][] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        check = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < n; j++) {
                if(s.charAt(j) == 'R') {
                    board[i][j] = 1;
                }else if(s.charAt(j) == 'G') {
                    board[i][j] = 2;
                }else {
                    board[i][j] = 3;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!check[i][j]) {
                    bfs(i, j);
                    cnt++;
                }
            }
        }

        System.out.println(cnt + " ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2)
                    board[i][j] = 1;
            }
        }

        check = new boolean[n][n];

        cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!check[i][j]) {
                    bfs(i, j);
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
    }

    private static void bfs(int x, int y) {
        xq = new LinkedList<>();
        yq = new LinkedList<>();

        xq.add(x);
        yq.add(y);
        check[x][y] = true;

        while (!xq.isEmpty() && !yq.isEmpty()) {
            int currentX = xq.poll();
            int currentY = yq.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = currentX + temp[i][0];
                int nextY = currentY + temp[i][1];

                if ((nextX >= 0 && nextX < n) && ((nextY >= 0 && nextY < n))) { // 좌표가 보드의 범위에 있을 때!
                    if(!check[nextX][nextY] && board[currentX][currentY] == board[nextX][nextY]) {
                        check[nextX][nextY] = true;
                        xq.add(nextX);
                        yq.add(nextY);
                    }
                }
            }
        }
    }
}
