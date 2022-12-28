package programmers.level1;

import java.util.Stack;

// 크레인 인형뽑기 게임 [2019 카카오 인턴쉽]
public class PG64061 {

    public static void main(String[] args) {
        int solution = solution(new int[][]{{0, 0, 0, 0, 0},
                                            {0, 0, 1, 0, 3},
                                            {0, 2, 5, 0, 1},
                                            {4, 2, 4, 4, 2},
                                            {3, 5, 1, 3, 1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4});

        System.out.println("solution = " + solution);
    }

    public static int solution(int[][] board, int[] moves) {

        Stack<Integer> stack = new Stack<>(); // 인형을 담을 바구니
        int countOfDolls = 0;
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[j][moves[i] - 1] != 0) { // 해당 라인의 인형을 집었을 때
                    if(!stack.isEmpty() && board[j][moves[i] - 1] == stack.peek())  { // 바구니에 인형이 있고 그 전의 인형과 같은 인형이라면 인형 터트림(+2)
                        countOfDolls += 2;
                        stack.pop();
                    }else { // 바구니가 비어있거나 현재 인형이 바구니 가장 위에 있는 인형과 다르면 바구니에 현재 인형 추가!!
                        stack.push(board[j][moves[i] - 1]);
                    }

                    board[j][moves[i] - 1] = 0; // 뽑은 인형은 빈칸 처리
                    break;
                }
            }
        }
        return countOfDolls;
    }
}
