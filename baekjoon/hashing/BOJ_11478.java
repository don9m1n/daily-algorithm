package baekjoon.hasing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Set<String> hs = new HashSet<String>();

        for(int i=0; i<str.length(); i++) {
            for(int j=i+1; j<str.length()+1; j++) {
                hs.add(str.substring(i,j));
            }
        }

        System.out.println(hs.size());
    }
}
