package programmers.level2.practice;

// 점 찍기
public class PG140107 {
    public static void main(String[] args) {
        System.out.println(solution(1, 5));
    }

    public static long solution(int k, int d) {
        long count = 0;

        for (int x = 0; x <= d; x += k) {
            long maxY = (long) Math.sqrt((long) Math.pow(d, 2) - (long) Math.pow(x, 2));
            count += (maxY / k) + 1;
        }
        return count;
    }
}
