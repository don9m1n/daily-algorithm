package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// ATM
public class BOJ11399 {
    static BufferedReader br;
    static int n;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        int[] time = new int[n];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < time.length; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }

        int solution = normalSort(time);
        System.out.println(countingSort(time));
    }

    private static int countingSort(int[] nums) {
        int[] counting = new int[1001];
        int[] result = new int[n];

        // 1. 요소 카운팅
        for (int i = 0; i < nums.length; i++) {
            counting[nums[i]]++;
        }

        // 2. 누적합 세팅
        for (int i = 1; i < counting.length; i++) {
            counting[i] += counting[i - 1];
        }

        // 3. result 배열 채우기
        for (int i = n - 1; i >= 0; i--) {
            int value = nums[i];
            counting[value]--;
            result[counting[value]] = value;
        }

        // 4. 누적 시간 구하기
        int sub = 0;
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sub += result[i];
            sum += sub;
        }
        return sum;
    }


    // Arrays.sort() 정렬
    private static int normalSort(int[] nums) throws IOException {

        Arrays.sort(nums);

        int subSum = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            subSum += nums[i];
            sum += subSum;
        }
        return sum;
    }
}
