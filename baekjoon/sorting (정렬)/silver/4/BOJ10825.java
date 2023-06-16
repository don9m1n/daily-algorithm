package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Student[] students =  new Student[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            students[i] = new Student(name, korean, english, math);
        }
        
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getKorean() == o2.getKorean() && o1.getEnglish() == o2.getEnglish() && o1.getMath() == o2.getMath()) {
                    return o1.getName().compareTo(o2.getName());
                } else if (o1.getKorean() == o2.getKorean() && o1.getEnglish() == o2.getEnglish()) {
                    return o2.getMath() - o1.getMath();
                } else if(o1.getKorean() == o2.getKorean()) {
                    return o1.getEnglish() - o2.getEnglish();
                } else {
                    return o2.getKorean() - o1.getKorean();
                }
            }
        });

        for (Student student : students) {
            System.out.println(student.getName());
        }
        
    }

    static class Student {
        private final String name;
        private final int korean;
        private final int english;
        private final int math;

        public Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }

        public String getName() {
            return name;
        }

        public int getKorean() {
            return korean;
        }

        public int getEnglish() {
            return english;
        }

        public int getMath() {
            return math;
        }
    }
}
