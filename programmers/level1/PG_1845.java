package progammers.level1;

import java.util.HashSet;
import java.util.Set;

// 폰켓몬
public class PG_1845 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,1,2,3}));
    }

    static int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        return Math.min(set.size(), nums.length / 2);
    }

}
