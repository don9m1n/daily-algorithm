package programmers.level1;

// 소수 만들기
public class PG12977 {
    public static void main(String[] args) {
        int solution = solution(new int[]{1, 2, 7, 6, 4});
        System.out.println("solution = " + solution);
    }

    public static int solution(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (checkPrimeNumber(nums[i] + nums[j] + nums[k])) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static boolean checkPrimeNumber(int num) {

        if(num == 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
