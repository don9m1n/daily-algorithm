package roadmap.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 멀티탭 스케줄링
public class BOJ1700 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> items = new ArrayList<>(); // 전자용품
        List<Integer> power = new ArrayList<>(); // 멀티탭

        int count = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            items.add(Integer.parseInt(st.nextToken()));
        }

        while (!items.isEmpty()) {
            int item = items.remove(0);

            if(power.contains(item)) {
                continue;
            }

            if (power.size() < n) {
                power.add(item);
            } else {
                count++;
                boolean flag = false;
                int index = -1;
                int removeIndex = -1;

                for (int i = 0; i < power.size(); i++) {
                    if (!items.contains(power.get(i))) {
                        power.remove(i);
                        power.add(item);
                        flag = true;
                        break;
                    } else {
                        if (items.indexOf(power.get(i)) > index) {
                            index = items.indexOf(power.get(i));
                            removeIndex = i;
                        }
                    }
                }

                if (!flag) {
                    power.remove(removeIndex);
                    power.add(item);
                }
            }
        }

        System.out.println(count);

    }
}
