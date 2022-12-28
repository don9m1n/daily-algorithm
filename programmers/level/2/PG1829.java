package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class PG1829 {

    static int numberOfArea; // 영역의 개수
    static int maxSizeOfOneArea; // 가장 큰 영역의 크기
    static int[][] board;
    static int M, N;
    static boolean[][] visited;

    public static int[] solution(int m, int n, int[][] picture) {
        numberOfArea = 0; // 영역의 개수
        maxSizeOfOneArea = 0;

        M = m;
        N = n;

        board = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = picture[i][j];
            }
        }

        visited = new boolean[M][N];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (!visited[i][j] && board[i][j] != 0) { // 처음 방문하고 색칠된 영역이라면 탐색 시작!
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, bfs(i, j));
                    numberOfArea++;
                }
            }
        }

        return new int[]{numberOfArea, maxSizeOfOneArea};
    }

    private static int bfs(int x, int y) {
        int[] dx = {-1, 0, 1, 0}; // 상우좌하
        int[] dy = {0, 1, 0, -1};

        int count = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll(); // 현재 좌표
            int curX = cur[0];
            int curY = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + curX;
                int ny = dy[i] + curY;

                if (nx >= 0 && nx < M && ny >= 0 && ny < N) { // 다음 좌표가 범위안에 있고
                    if(!visited[nx][ny] && board[nx][ny] == board[curX][curY]) { // 첫 방문이고 이전 좌표의 색과 같다면
                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny});
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
