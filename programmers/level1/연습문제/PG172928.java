package progammers.level1;

import java.util.Arrays;

// 공원 산책
public class PG172928 {
    public static void main(String[] args) {
        int[] solution = solution(new String[]{"OSO","OOO","OXO","OOO"}, new String[]{"E 2","S 3","W 1"});
        System.out.println(Arrays.toString(solution));
    }

    static int[] solution(String[] park, String[] routes) {
        int size = park[0].length();
        String[][] map = new String[park.length][size];

        for (int i = 0; i < park.length; i++) {
            String[] arr = park[i].split("");
            for (int j = 0; j < size; j++) {
                map[i][j] = arr[j];
            }
        }

        int x = 0, y = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j].equals("S")) {
                    x = i;
                    y = j;
                }
            }
        }

        for (String route : routes) {
            String command = route.split(" ")[0];
            int move = Integer.parseInt(route.split(" ")[1]);

            boolean flag = true;
            switch (command) {
                case "E" -> {
                    for (int i = 1; i <= move; i++) {
                        if (y + i >= size || map[x][y + i].equals("X")) {
                            flag = false;
                            break;
                        }
                    }

                    if (flag) {
                        y += move;
                    }
                }

                case "W" -> {
                    for (int i = 1; i <= move; i++) {
                        if (y - i < 0 || map[x][y - i].equals("X")) {
                            flag = false;
                            break;
                        }
                    }

                    if (flag) {
                        y -= move;
                    }
                }

                case "S" -> {
                    for (int i = 1; i <= move; i++) {
                        if (x + i >= map.length || map[x + i][y].equals("X")) {
                            flag = false;
                            break;
                        }
                    }

                    if (flag) {
                        x += move;
                    }
                }

                case "N" -> {
                    for (int i = 1; i <= move; i++) {
                        if (x - i < 0 || map[x - i][y].equals("X")) {
                            flag = false;
                            break;
                        }
                    }

                    if (flag) {
                        x -= move;
                    }
                }
            }
        }

        return new int[]{x, y};
    }
}
