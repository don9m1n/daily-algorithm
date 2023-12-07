package progammers.level1;

// [PCCE 기출문제] 9번 / 이웃한 칸
public class BOJ250125 {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        System.out.println(solution(new String[][]{
                {"blue", "red", "orange", "red"},
                {"red", "red", "blue", "orange"},
                {"blue", "orange", "red", "red"},
                {"orange", "orange", "red", "blue"}
        }, 1 , 1));
    }

    static int solution(String[][] board, int h, int w) {

        int count = 0;

        for (int i = 0; i < 4; i++) {
            int nx = h + dx[i];
            int ny = w + dy[i];

            if (nx >= 0 && nx < board.length && ny >= 0 && ny < board.length) {
                if (board[nx][ny].equals(board[h][w])) {
                    count++;
                }
            }
        }

        return count;
    }

}
