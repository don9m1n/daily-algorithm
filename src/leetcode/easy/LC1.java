package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Two Sum
public class LC1 {

    public static void main(String[] args) {
        int[] solution = twoSumFollowUp(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(solution));
    }

    /**
     * follow up!
     * O(n^2)보다 복잡도가 더 적은 알고리즘으로 풀어보기
     * HashMap || O(n)
      */
    public static int[] twoSumFollowUp(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if(map.containsKey(num)){
                System.out.println(i);
                return new int[]{map.get(num), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }


    // 시간복잡도: O(n^2)
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
