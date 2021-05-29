package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

// 2007년
public class BOJ_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        LocalDate date = LocalDate.of(2007, x, y);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("e");
        String result = date.format(df);
        System.out.println(day[Integer.parseInt(result) - 1]);
    }
}
