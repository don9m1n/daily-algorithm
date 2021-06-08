package baekjoon.implementation;

import java.text.SimpleDateFormat;
import java.util.Date;

// 오늘 날짜
public class BOJ_10699 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(today));
    }
}
