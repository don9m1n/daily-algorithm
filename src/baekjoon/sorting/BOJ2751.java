package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 수 정렬하기2 (퀵 정렬 저격데이터 있음, Collections.sort()로 풀었다[Timsort -> 합병 or 삽입 정렬])
public class BOJ2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(nums);

        StringBuilder sb = new StringBuilder();
        for (Integer num : nums) {
            sb.append(num).append("\n");
        }

        System.out.println(sb.toString());

    }
}
