package programmers.level2;

import java.util.*;

// 프린터 [스택, 큐]
/**
 * 1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
 * 2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
 * 3. 그렇지 않으면 J를 인쇄합니다.
 */
public class PG42587 {

    public static void main(String[] args) {
        int solution = solution(new int[]{2, 1, 3, 2}, 2);
        System.out.println("solution = " + solution);
    }

    // 큐 사용
    public static int solution(int[] priorities, int location) {

        int answer = 0;
        Queue<Document> q = new LinkedList<>(); // 우선순위 저장

        for (int i = 0; i < priorities.length; i++) {
            q.add(new Document(i, priorities[i]));
        }

        int now = 0;
        while (!q.isEmpty()) {
            Document curr = q.poll();
            boolean flag = false;

            for (Document doc : q) {
                if(doc.priority > curr.priority) {
                    flag = true;
                }
            }

            if(flag) {
                q.add(curr);
            }else {
                now++;
                if(curr.location == location) {
                    answer = now;
                }
            }
        }
        return answer;
    }

    static class Document {
        private int location; // 위치
        private int priority; // 값

        public Document(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }
    }
}
