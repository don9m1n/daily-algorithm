package progammers.level1;

import java.util.Arrays;

// 바탕화면 정리
public class PG161990 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{".#...", "..#..", "...#."})));
        System.out.println(Arrays.toString(solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."})));
        System.out.println(Arrays.toString(solution(new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."})));
        System.out.println(Arrays.toString(solution(new String[]{"..", "#."})));

    }

    static int[] solution(String[] wallpaper) {
        int top = wallpaper.length - 1;
        int bottom = 0;
        int left = wallpaper[0].length() - 1;
        int right = 0;

        // (상, 좌), (하, 우) 좌표가 최소 드래그 거리가 됨.
        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#")) {
                top = Math.min(top, i);
                bottom = Math.max(bottom, i);

                for (int j = 0; j < wallpaper[i].length(); j++) {
                    if (wallpaper[i].charAt(j) == '#') {
                        left = Math.min(left, j);
                        right = Math.max(right, j);
                    }
                }
            }
        }

        return new int[]{top, left, bottom + 1, right + 1};
    }
}
