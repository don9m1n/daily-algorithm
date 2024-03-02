package progammers.level3;

import java.util.*;
import java.util.stream.Collectors;

// 베스트 앨범
public class PG_42579 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500})));
    }

    static int[] solution(String[] genres, int[] plays) {

        Map<String, List<Song>> songByGenre = new HashMap<>(); // 장르별 노래 목록
        Map<String, Integer> playByGenre = new HashMap<>(); // 장르별 재생 횟수

        for (int i = 0; i < genres.length; i++) {
            List<Song> list = songByGenre.getOrDefault(genres[i], new ArrayList<>());
            list.add(new Song(i, plays[i]));

            songByGenre.put(genres[i], list);
            playByGenre.put(genres[i], playByGenre.getOrDefault(genres[i], 0) + plays[i]);
        }


        Set<Map.Entry<String, Integer>> entries = playByGenre.entrySet()
                .stream().sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .collect(Collectors.toCollection(LinkedHashSet::new));;

        // 1. 총 재생 횟수가 가장 높은 장르부터 선택
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entries) {
            List<Song> songs = songByGenre.get(entry.getKey());
            songs.sort((o1, o2) -> o2.getPlayCount() - o1.getPlayCount());

            // 2. 해당 장르에서 재생 횟수가 높은 2개의 곡 선택
            // 3. 재생 횟수가 같은 경우에는 고유 번호가 낮은 곡부터 수록
            for (int i = 0; i < Math.min(2, songs.size()); i++) {
                result.add(songs.get(i).getIndex());
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;

    }

    static class Song {
        private final int index;
        private final int playCount;

        public Song(int index, int playCount) {
            this.index = index;
            this.playCount = playCount;
        }

        public int getIndex() {
            return index;
        }

        public int getPlayCount() {
            return playCount;
        }
    }
}
