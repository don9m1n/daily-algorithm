package programmers.level1;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

// 실패율
public class PG_42889 {
    public int[] solution(int N, int[] stages) {
        double[][] fail = new double[N][2];

        int level = 1;
        while(level <= N) {
            double failRate = 0; // 실패율
            int player = 0;
            for (int stage : stages) {
                if (stage >= level) {
                    player++;
                }
            }

            int cnt = 0;
            for (int stage : stages) {
                if (stage == level) {
                    cnt++;
                }
            }

            // 해당 stage에 도달한 player가 없는 경우 실패율은 0%
            if(player == 0) {
                fail[level-1][0] = level;
                fail[level-1][1] = 0;
            }else {
                failRate = (double)cnt / player;

                fail[level-1][0] = level;
                fail[level-1][1] = failRate;
            }

            level++;
        }

        // sorting!
        Arrays.sort(fail, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                if(o1[1] == o2[1]) {
                    return Double.compare(o1[0], o2[0]);
                }
                return Double.compare(o2[1], o1[1]);
            }
        });

        int[] answer = new int[fail.length];
        for(int i=0; i<answer.length; i++) {
            answer[i] = Integer.parseInt(String.valueOf(Math.round(fail[i][0])));
        }

        return answer;
    }

    @Test
    public void test(){
        // given
        int N = 4;
        //int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] stages = {4, 4, 4, 4, 4};

        // when
        int[] result = solution(N, stages);

        // then
        //System.out.println(Arrays.toString(result));
    }
}
