package programmers.level1;

import java.util.HashSet;
import java.util.Set;

// 폰켓몬
public class PG_1845 {
    public static void main(String[] args) {
        Solution_1845 s = new Solution_1845();

        int[] nums = {3, 1, 2, 3};
        System.out.println(s.solution(nums));
    }
}

class Solution_1845 {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if(set.size() == (nums.length / 2)) {
                break;
            }
            set.add(num);
        }

        return set.size();
    }
}
