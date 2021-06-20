package programmers.level1;

// 소수 만들기
public class PG_12977 {
    public int solution(int[] nums) {
        int answer = 0; // PrimeNum counting!
        boolean isCheck = false;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int primeNum = nums[i] + nums[j] + nums[k];
                    if(primeNum >= 2) {
                        isCheck = isPrimeNum(primeNum);
                    }

                    if(isCheck) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public boolean isPrimeNum(int num) {
        boolean check = true;
        if(num == 2) {
            return true;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}
