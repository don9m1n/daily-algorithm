package programmers.level1.success;

// 최소 직사각형
public class PG86491 {
    public static void main(String[] args) {
        int solution = solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}});
        System.out.println("solution = " + solution);
    }

    public static int solution(int[][] sizes) {

        int maxWidth = 0;
        int maxHeight = 0;

        for (int i = 0; i < sizes.length; i++) {
            int width = sizes[i][0]; // 가로
            int height = sizes[i][1]; // 세로

            if (height > width) {
                sizes[i][0] = height;
                sizes[i][1] = width;
            }
            maxWidth = Math.max(maxWidth, sizes[i][0]);
            maxHeight = Math.max(maxHeight, sizes[i][1]);
        }

        return maxWidth * maxHeight;
    }
}