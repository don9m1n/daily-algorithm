package programmers.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = {6, 10, 2};
        String result = solution(numbers);
        System.out.println(result);
    }

    public static String solution(int[] numbers){
        String[] result = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            result[i] = String.valueOf(numbers[i]);
        }

        // 정렬
        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ((o2+o1).compareTo(o1+o2));
            }
        });

        if(result[0].equals("0")){
            return "0";
        }

        String answer = "";

        for(String str : result) {
            answer += str;
        }

        return answer;
    }
}
