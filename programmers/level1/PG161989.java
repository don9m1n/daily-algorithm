package progammers.level1;

// 덧칠하기
public class PG161989 {
    public static void main(String[] args) {
        int solution = solution(8, 4, new int[]{2, 3, 6});
        System.out.println("solution = " + solution);
    }

    static int solution(int n, int m, int[] section) {
        int count = 0;
        int roller = 0;

        for (int i = 0; i < section.length; i++) {
            if (section[i] > roller) {
                count++;
                roller = section[i] + m - 1;
            }
        }

        return count;
    }
}
