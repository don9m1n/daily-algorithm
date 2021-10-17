package programmers.weeklychallenge;

// 부족한 금액 계산하기
public class PG82612 {
    public long solution(int price, int money, int count) {

        long sum = 0;
        for(int i = 0; i < count; i++) {
            sum += (long) price * (i+1);
        }

        long result = sum - money;
        return (result > 0) ? result : 0;
    }

    public static void main(String[] args) {
        PG82612 pg = new PG82612();
        long result = pg.solution(3, 20, 4);
        System.out.println("result = " + result);
    }
}
