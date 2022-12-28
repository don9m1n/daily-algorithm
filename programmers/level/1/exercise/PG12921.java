package programmers.level1;

import java.util.ArrayList;
import java.util.List;

// 소수 찾기
public class PG12921 {
    public static void main(String[] args) {
        int solution = solution(10);
        System.out.println("solution = " + solution);
    }

    // 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환
    // 에라토스..
    public static int solution(int n) {
        int count = 0;
        int[] arr = new int[1000000];
        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= n; i++) {
            if(arr[i] == 0) {
                continue;
            }

            for (int j = 2 * i; j <= n; j+=i) {
                arr[j] = 0;
            }
        }

        for (int i = 2; i <= n; i++) {
            if(arr[i] != 0) {
                count++;
            }
        }

        return count;
    }
}
