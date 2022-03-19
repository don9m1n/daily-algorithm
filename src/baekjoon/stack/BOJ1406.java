package baekjoon.stack;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

// 에디터
public class BOJ1406 {

    static BufferedReader br;
    static BufferedWriter bw;
    static int n;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        linkedList();
        stack();

    }

    // Stack
    private static void stack() {

    }

    // LinkedList
    private static void linkedList() throws IOException {
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        // ListIterator: 양방향 탐색 가능 (Iterator => 단방향 탐색만 지원)
        ListIterator<Character> iter = list.listIterator();
        while (iter.hasNext()) { // 커서를 맨 뒤까지 옮김
            iter.next();
        }

        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            char c = command.charAt(0);
            switch (c) {
                case 'L':
                    if(iter.hasPrevious()) {
                        iter.previous();
                    }
                    break;
                case 'D': // 커서 위치가 맨 뒤가 아닌 경우에만 오른쪽으로 이동
                    if(iter.hasNext()) {
                        iter.next();
                    }
                    break;
                case 'B':
                    if(iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P':
                    iter.add(command.charAt(2));
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : list) {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
