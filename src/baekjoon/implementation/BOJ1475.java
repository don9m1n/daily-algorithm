package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 방 번호
public class BOJ1475 {

    static int count = 1;
    static int[] number;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        number = new int[10];
        Arrays.fill(number, 1);

        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 48;
            if (num == 9) {
                check(num, 6);
            } else if (num == 6) {
                check(num, 9);
            } else {
                if(number[num] == 0) {
                    plus(number);
                    number[num]--;
                    count++;
                } else {
                    number[num]--;
                }
            }
        }
        System.out.println(count);
    }

    private static void check(int main, int sub) {
        if (number[main] == 0 && number[sub] == 0) {
            plus(number);
            count++;
        }
        if(number[main] > 0) {
            number[main]--;
        } else if(number[main] == 0 && number[sub] > 0) {
            number[sub]--;
        }
    }

    // 세트 추가 메서드
    private static void plus(int[] number) {
        for (int i = 0; i < number.length; i++) {
            number[i]++;
        }
    }
}