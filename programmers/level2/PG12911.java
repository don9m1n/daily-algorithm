package progammers.level2;

// 다음 큰 숫자
public class PG12911 {
    public static void main(String[] args) {
        System.out.println(solution(78));
        System.out.println(solution(15));
    }

    static int solution(int n) {

        String binary = Integer.toBinaryString(n);
        int count = 0;
        count = getCount(binary, count);

        int answer = 0;
        for (int i = n + 1; i <= 1000000; i++) {
            String binaryNumber = Integer.toBinaryString(i);

            int count2 = 0;
            count2 = getCount(binaryNumber, count2);

            if (count == count2) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    private static int getCount(String binary, int count) {
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
