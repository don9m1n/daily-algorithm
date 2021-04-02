package baekjoon.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 크로아티아 알파벳
public class BOJ_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = br.readLine();

        for(int i=0; i<arr.length; i++){
            str = str.replace(arr[i],"!");
            System.out.println(str);
        }

        System.out.println(str.length());




    }
}
