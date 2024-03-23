package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 프린터 큐
public class BOJ_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            List<Document> list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                list.add(new Document(Integer.parseInt(st.nextToken()), j));
            }

            int count = 0;
            while (!list.isEmpty()) {
                boolean flag = true;
                Document document = list.remove(0);
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j).getPriority() > document.getPriority()) {
                        list.add(document);
                        flag = false;
                        break;
                    }
                }

                // 중요도가 높은 문서가 없는 경우
                if (flag) {
                    if (document.getIndex() == m) {
                        count++;
                        break;
                    } else {
                        count++;
                    }
                }
            }

            System.out.println(count);

        }
    }

    static class Document {
        private final int priority;
        private final int index;

        public Document(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }

        public int getPriority() {
            return priority;
        }

        public int getIndex() {
            return index;
        }
    }
}
