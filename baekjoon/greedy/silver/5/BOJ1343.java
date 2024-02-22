package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 폴리오미노
public class BOJ1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();

        board = board.replaceAll("XXXX", "AAAA");
        board = board.replaceAll("XX", "BB");

        if (board.contains("X")) {
            System.out.println(-1);
        } else {
            System.out.println(board);
        }
    }
}
