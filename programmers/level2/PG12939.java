package progammers.level2;

// 최댓값과 최솟값
public class PG12939 {
    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4"));
        System.out.println(solution("-1 -2 -3 -4"));
        System.out.println(solution("-1 -1"));
    }

    static String solution(String s) {
        String[] nums = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String str : nums) {
            int num = Integer.parseInt(str);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return min + " " + max;
    }
}
