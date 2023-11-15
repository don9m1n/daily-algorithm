package progammers.level2;

import java.util.Stack;

// 택배 상자
public class PG131704 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 3, 1, 2, 5}));
    }

    static int solution(int[] order) {
        int[] priority = new int[order.length];

        for(int i = 0; i < order.length; i++){
            priority[order[i] - 1] = i;
        }

        Stack<Integer> stack = new Stack<>();
        int target = 0;

        for(int i = 0; i < priority.length; i++){
            if(priority[i] == target){
                target++;
            }else{
                stack.push(priority[i]);
            }

            while(!stack.isEmpty() && stack.peek() == target){
                stack.pop();
                target++;
            }
        }

        return target;
    }
}
