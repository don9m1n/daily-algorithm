package progammers.level1;

import java.util.Stack;

// 다트 게임
public class PG17682 {
    public static void main(String[] args) {
        System.out.println(solution("1S2D*3T"));
        System.out.println(solution("1D2S#10S"));
        System.out.println(solution("1D2S0T"));
        System.out.println(solution("1S*2T*3S"));
        System.out.println(solution("1D#2S*3S"));
        System.out.println(solution("1T2D3D#"));
        System.out.println(solution("1D2S3T*"));

    }

    static int solution(String dartResult) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            if (ch == 'S' || ch == 'D' || ch == 'T' || ch == '*' || ch == '#') {
                sb.append(ch).append(".");
            } else {
                sb.append(ch);
            }
        }

        String[] arr = sb.toString().split("\\.");

        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("*")) {
                if (stack.size() == 1) {
                    stack.push(stack.pop() * 2);
                } else {
                    double num1 = stack.pop() * 2; // 이전 숫자
                    double num2 = stack.pop() * 2; // 이전전 숫자
                    stack.push(num2);
                    stack.push(num1);
                }
            } else if (arr[i].equals("#")) {
                double num = stack.pop() * -1;
                stack.push(num);
            } else {
                int num = arr[i].length() > 2 ? Integer.parseInt(arr[i].substring(0, 2)) : Integer.parseInt(arr[i].substring(0, 1));
                String command = arr[i].length() > 2 ? arr[i].substring(2, 3) : arr[i].substring(1, 2);

                switch (command) {
                    case "S":
                        stack.push(Math.pow(num, 1));
                        break;
                    case "D":
                        stack.push(Math.pow(num, 2));
                        break;
                    case "T":
                        stack.push(Math.pow(num, 3));
                        break;
                }
            }
        }

        int answer = 0;
        while (!stack.isEmpty()) {
            answer += stack.pop();
        }

        return answer;
    }
}
