package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 섬의 개수
public class BOJ4963 {
    // 상하좌우 + 대각선 좌표 체크를 위한 배열
    static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};
    static StringTokenizer st;
    static int w;
    static int h;
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if(w == 0 && h == 0) return;

            List<Integer> list = new ArrayList<>();
            map = new int[h][w];
            visited = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int x = 0; x < h; x++) {
                for (int y = 0; y < w; y++) {
                    if (!visited[x][y] && map[x][y] == 1) {
                        list.add(bfs(x, y));
                    }
                }
            }

            System.out.println(list.size());
        }
    }

    private static int bfs(int x, int y) {

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        int count = 1;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int i = 0; i < 8; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if(nx >= 0 && nx < h && ny >= 0 && ny < w) {
                    if (!visited[nx][ny] && map[nx][ny] == 1) {
                        q.add(new int[] {nx, ny});
                        visited[nx][ny] = true;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
