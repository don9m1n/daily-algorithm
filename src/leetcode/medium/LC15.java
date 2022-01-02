package leetcode.week12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 3SUM
public class LC15 {

    public static void main(String[] args) {
        List<List<Integer>> solution = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println("solution = " + solution.toString());
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && (nums[i] == nums[i-1])) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {
                    lists.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (nums[left] == nums[left - 1] && left < right) left++;
                    while (nums[right] == nums[right + 1] && left < right) right--;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return lists;
    }
}
