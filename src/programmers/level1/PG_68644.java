package programmers.level1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 두 개 뽑아서 더하기
public class PG_68644 {
    public int[] solution (int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[set.size()];
        Iterator<Integer> it = set.iterator();
        for(int i = 0; i < answer.length; i++) {
            answer[i] = it.next();
        }

        Arrays.sort(answer);

        return answer;
    }

    @Test
    public void test(){
        // given
        int[] numbers = {5, 0, 2, 7};

        // when
        int[] result = solution(numbers);

        // then
        Assert.assertEquals(new int[]{2, 3, 4, 5, 6, 7}, result);
    }
}
