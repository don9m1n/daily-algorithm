package programmers.level1;

// 음양 더하기 [월간 코드 챌린지 시즌2]
public class PG76501 {

    public static void main(String[] args) {
        int solution = solution(new int[]{4, 7, 12}, new boolean[]{true, false, true});
        System.out.println("solution = " + solution);
    }

    public static int solution(int[] absolutes, boolean[] signs) {

        int sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            sum += (signs[i] ? absolutes[i] : -absolutes[i]);
        }
        
        return sum;
    }
}
