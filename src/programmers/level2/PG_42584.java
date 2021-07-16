package programmers.level2.solve;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 주식가격
public class PG_42584 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Queue<Integer> stock = new LinkedList<>();
        for(int price : prices) {
            stock.add(price);
        }

        int j = 0;
        while(stock.size() != 0) {
            int price = stock.poll();
            for(int i = prices.length - stock.size(); i < prices.length; i++) {
                if(prices[i] >= price) {
                    answer[j]++;
                }else if(prices[i] < price) {
                    answer[j]++;
                    break;
                }
            }

            j++;
        }

        return answer;
    }

    @Test
    public void test() {
        int[] prices = {1,2,3,2,3,1};

        int[] result = solution(prices);

        Assertions.assertThat(result).isEqualTo(new int[] {5,4,1,2,1,0});
    }
}
