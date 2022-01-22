package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// AC
public class BOJ5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] fnc = br.readLine().split("");
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String[] arr = str.substring(1, str.length() - 1).split(",");

            if(n == 0) {
                System.out.println("error");
                continue;
            }

            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                list.add(Integer.parseInt(arr[j]));
            }

            boolean orderCheck = false;
            for (int j = 0; j < fnc.length; j++) {
                switch (fnc[j]){
                    case "R": // 뒤집기
                        if(!orderCheck) {
                            list.sort(Collections.reverseOrder());
                            orderCheck = true;
                        }else {
                            Collections.sort(list);
                        }
                        break;
                    case "D": // 배열의 첫 번째 수 버리기
                        if(list.size() > 0) {
                            list.remove(0);
                        }else {
                            break;
                        }
                        break;
                }
            }
            if (list.isEmpty()) {
                System.out.println("error");
            }else {
                System.out.println(list.toString());
            }
        }
    }
}
