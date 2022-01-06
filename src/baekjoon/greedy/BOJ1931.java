package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 회의실 배정
public class BOJ1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        MeetRoom[] rooms = new MeetRoom[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            rooms[i] = new MeetRoom(start, end);
        }

        Arrays.sort(rooms, new Comparator<MeetRoom>(){
            @Override
            public int compare(MeetRoom m1, MeetRoom m2) {
                if (m1.getEnd() == m2.getEnd()) {
                    return m1.getStart() - m2.getStart();
                }
                return m1.getEnd() - m2.getEnd();
            }
        });

        int prevEnd = 0;
        int cnt = 0;
        for (int i = 0; i < rooms.length; i++) {
            if(prevEnd <= rooms[i].getStart()) {
                cnt++;
                prevEnd = rooms[i].getEnd();
            }
        }
        System.out.println(cnt);
    }

    static class MeetRoom {

        private int start;
        private int end;

        public MeetRoom(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        @Override
        public String toString() {
            return "[" + start + ", " + end + "]\n";
        }
    }
}
