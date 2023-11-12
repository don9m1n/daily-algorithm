package progammers.level2;

// H-Index
public class PG42747 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 0, 6, 1, 5}));

    }

    private static int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;

        while (length > 0) {
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < citations.length; i++) {
                if (citations[i] >= length) {
                    count1++;
                } else {
                    count2++;
                }
            }

            if (count1 >= length && count2 <= length) {
                answer = length;
                break;
            }

            length--;
        }

        return answer;
    }
}
