package progammers.level1;

// 푸드 파이트 대회
public class PG134240 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 4, 6}));

    }

    static String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int result = food[i] / 2;
            sb.append(String.valueOf(i).repeat(result));
        }

        String answer = sb + "0";
        return answer + sb.reverse();
    }
}
