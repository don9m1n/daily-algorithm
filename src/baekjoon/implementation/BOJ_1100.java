package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 하얀 칸
public class BOJ_1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] board = new String[8][8];
        int cnt = 0;
        for(int i=0; i<board.length; i++) {
            String[] arr = br.readLine().split("");
            /*
            for(int j=0; j<board[i].length; j++) {
                board[i][j] = arr[j];
            }
            */
            System.arraycopy(arr, 0, board[i], 0, board[i].length);
        }
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                    if(board[i][j].equals("F")) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
