package programmers.level1;

// 키패드 누르기
public class PG67256 {

    public static void main(String[] args) {
        String solution = solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");
        System.out.println("solution = " + solution);
    }

    public static String solution(int[] numbers, String hand) {

        int currLeft = 10; // *
        int currRight = 12; // #

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 3 == 1) { // 1, 4, 7
                sb.append("L");
                currLeft = numbers[i];
            }else if(numbers[i] % 3 == 0 && numbers[i] != 0) { // 3, 6, 9
                sb.append("R");
                currRight = numbers[i];
            }else { // 2, 5, 8, 0(11)
                int disOfLeft = getLength(currLeft, numbers[i]);
                int disOfRight = getLength(currRight, numbers[i]);

                if (disOfLeft > disOfRight) {
                    sb.append("R");
                    currRight = numbers[i];
                } else if(disOfRight > disOfLeft) {
                    sb.append("L");
                    currLeft = numbers[i];
                } else {
                    if(hand.equals("left")) {
                        sb.append("L");
                        currLeft = numbers[i];
                    }else {
                        sb.append("R");
                        currRight = numbers[i];
                    }
                }
            }
        }
        return sb.toString();
    }

    public static int getLength(int currNum, int number) {

        currNum = (currNum == 0) ? 11 : currNum;
        number = (number == 0) ? 11 : number;

        int x = (currNum - 1) / 3;
        int y = (currNum - 1) % 3;
        int numberX = number / 3;
        int numberY = 1; // 2,5,8,0 라인은 y 좌표가 1이기 때문에 1로 고정

        return Math.abs(x - numberX) + Math.abs(y - numberY);
    }
}
