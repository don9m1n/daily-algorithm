package programmers.level1.success;

import java.util.Arrays;

// [1차] 비밀지도 | 카카오 블라인드
public class PG17681 {

    static String[][] board;

    public static void main(String[] args) {
        String[] solution = solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
        System.out.println(Arrays.toString(solution));

    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {

        board = new String[n][n]; // 해독된 지도 [0 or 1]
        for (String[] b : board) {
            Arrays.fill(b, "");
        }

        String[] result = new String[n];

        int start = 0;
        decode(n, arr1, start);
        decode(n, arr2, start);

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (board[i][j].equals("")) {
                    sb.append(" ");
                }
                sb.append(board[i][j]);
            }
            result[i] = sb.toString();
        }
        return result;
    }

    // 암호 해독 메서드
    private static void decode(int n, int[] arr, int start) {
        for (int num : arr) {
            StringBuilder sb = new StringBuilder();
            while (num > 0) { // 10진수 -> 2진수
                sb.append(num % 2);
                num /= 2;
            }
            if (sb.length() < n) { // 부족한 자릿수 n의 크기만큼 채우기
                sb.append("0".repeat(n - sb.length()));
            }

            drawBoard(start, sb.reverse().toString()); // 배열 채우기
            start++;
        }
    }

    // 해독문 칠하기
    private static void drawBoard(int start, String number) {
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '1') {
                board[start][i] = "#";
            }
        }
    }
}