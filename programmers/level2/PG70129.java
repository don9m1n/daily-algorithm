package progammers.level2;

import java.util.Arrays;

// 이진 변환 반복하기
public class PG70129 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("110010101001")));
        System.out.println(Arrays.toString(solution("01110")));
        System.out.println(Arrays.toString(solution("1111111")));
    }

    static int[] solution(String s) {

        int[] result = new int[2];
        int binaryCount = 0;
        int zeroCount = 0;

        while (!s.equals("1")) {
            if (s.contains("0")) {
                int length = s.length();
                s = s.replace("0", "");
                zeroCount += length - s.length();
            }

            s = Integer.toBinaryString(s.length());
            binaryCount++;
        }

        result[0] = binaryCount;
        result[1] = zeroCount;

        return result;
    }
}
