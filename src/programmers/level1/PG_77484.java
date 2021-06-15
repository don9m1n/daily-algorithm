package programmers.level1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

// 로또의 최고 순위와 최저 순위
public class PG_77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] cnt = new int[2];
        for (int lotto : lottos) {
            for (int win_num : win_nums) {
                if (lotto == 0) {
                    cnt[1]++;
                    break;
                }

                if (lotto == win_num) {
                    cnt[0]++;
                    cnt[1]++;
                }
            }
        }

        int[] result = new int[2];
        for(int i=0; i<cnt.length; i++) {
            switch(cnt[i]) {
                case 6:
                    result[i] = 1;
                    break;
                case 5:
                    result[i] = 2;
                    break;
                case 4:
                    result[i] = 3;
                    break;
                case 3:
                    result[i] = 4;
                    break;
                case 2:
                    result[i] = 5;
                    break;
                case 1: case 0:
                    result[i] = 6;
                    break;
            }
        }
        Arrays.sort(result);
        return result;
    }

    @Test
    public void test(){
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};
        Assert.assertEquals(Arrays.toString(new int[] {1, 6}), Arrays.toString(solution(lottos, win_nums)));
    }
}