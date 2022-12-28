package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 16진수
public class BOJ_1550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] hex = {"A", "B", "C", "D", "E", "F"};
        String[] num = {"10", "11", "12", "13", "14", "15"};

        int result = createDecimal(str, hex, num);
        System.out.println(result);
    }

    // hex -> Decimal
    static int createDecimal(String str, String[] hex, String[] num){
        int result = 0;
        String[] arr = str.split("");
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<hex.length; j++) {
                if(arr[i].equals(hex[j])) {
                    arr[i] = num[j];
                }
            }
            result += Integer.parseInt(arr[i]) * Math.pow(16, (arr.length-1) - i);
        }
        return result;
    }
}
