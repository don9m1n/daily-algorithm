package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

// 2007년
public class BOJ_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        Calendar cal = Calendar.getInstance();
        cal.set(2007, x-1, y);

        int result = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(day[result-1]);
    }
}
