package progammers.level2;

import java.util.ArrayList;
import java.util.List;

// [1차] 캐시
public class PG17680 {
    public static void main(String[] args) {
        System.out.println(solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}));
    }

    static int solution(int cacheSize, String[] cities) {

        List<String> cache = new ArrayList<>();

        int time = 0;
        for (String city : cities) {
            if (cache.isEmpty() || !cache.contains(city.toLowerCase())) {
                cache.add(0, city.toLowerCase());
                time += 5;

                if (cache.size() > cacheSize) {
                    cache.remove(cacheSize);
                }
            } else {
                cache.remove(city.toLowerCase());
                cache.add(0, city.toLowerCase());
                time += 1;
            }
        }

        return time;
    }
}
