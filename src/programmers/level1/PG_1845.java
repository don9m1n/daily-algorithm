package programmers.level1;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

// 폰켓몬
public class PG_1845__O {
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

    // Test Code!
    @Test
    public void test() {
        Assert.assertEquals(2, solution(new int[] {3, 1, 2, 3}));
    }
}
