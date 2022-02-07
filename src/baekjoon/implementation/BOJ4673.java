package baekjoon.implementation;

// 셀프 넘버
public class BOJ4673 {
    public static void main(String[] args) {

        int[] arr = new int[10001];
        int num = 1;
        while (num < 10001) {
            int copy = num;
            int cons = num;

            while(copy > 0) {
                cons += copy % 10;
                copy /= 10;
            }

            arr[num] = cons;
            num++;
        }

        for (int i = 1; i < 10001; i++) {
            boolean flag = false;
            for (int j = 1; j < 10001; j++) {
                if(i == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if(!flag) System.out.println(i);
        }
    }
}
