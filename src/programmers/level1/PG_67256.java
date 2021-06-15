package programmers.level1;

import org.junit.Assert;
import org.junit.Test;

// [카카오 인턴] 키패드 누르기
public class PG_67256 {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        int leftIndex = 10;
        int rightIndex = 12;

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                leftIndex = number;
            }else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                rightIndex = number;
            }else { // [2, 5, 8, 0]
                int leftLength = getLength(leftIndex, number);
                int rightLength = getLength(rightIndex, number);

                if(leftLength > rightLength) {
                    answer.append("R");
                    rightIndex = number;
                }else if(leftLength < rightLength) {
                    answer.append("L");
                    leftIndex = number;
                }else {
                    if(hand.equals("right")) {
                        answer.append("R");
                        rightIndex = number;
                    }else {
                        answer.append("L");
                        leftIndex = number;
                    }
                }
            }
        }

        return answer.toString();
    }

    static int getLength(int index, int number) {

        index = (index == 0) ? 11 : index;
        number = (number == 0) ? 11 : number;

        int x = (index - 1) / 3;
        int y = (index - 1) % 3;
        int numberX = number / 3;
        int numberY = 1;

        return Math.abs(x - numberX) + Math.abs(y - numberY);
    }

    @Test
    public void test(){
        // given (준비)
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";

        // when (실행)
        String result = solution(numbers, hand);

        // then (검증)
        Assert.assertEquals("LRLLRRLLLRR", result);
    }
}
