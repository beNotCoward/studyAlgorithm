package com.lentouqin.od2024;

import java.util.*;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/25.
 */
public class 智能成绩表 {


    // 存储学生信息和成绩的结构体
    static class Student {
        String name; // 学生名字
        List<Integer> scores; // 每门课成绩
    }

    static Student[] students = new Student[10004]; // 存储学生信息的数组
    static int keyIndex; // 要排序的课程名的下标

    // 自定义排序函数
    static Comparator<Student> studentComparator = new Comparator<Student>() {
        @Override
        public int compare(Student a, Student b) {
            if (!a.scores.get(keyIndex).equals(b.scores.get(keyIndex))) {
                return b.scores.get(keyIndex) - a.scores.get(keyIndex);
            }
            return a.name.compareTo(b.name);
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] courseNames = new String[1000]; // 课程名数组
        int n, m; // 学生数量和课程数量
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            courseNames[i] = sc.next(); // 读入课程名字
        }
        for (int i = 1; i <= n; i++) {
            students[i] = new Student();
            students[i].name = sc.next(); // 读取学生名字
            int sum = 0;
            students[i].scores = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                int score = sc.nextInt();
                students[i].scores.add(score); // 读取每门课成绩
                sum += score;
            }
            students[i].scores.add(sum); // 将总分放入成绩数组末尾
        }
        String key = sc.next(); // 要排序的课程名
        keyIndex = m; // 若没找到，赋值为最后一个位置，也就是总分
        for (int i = 0; i < m; i++) { // 寻找这个课程名的下标
            if (courseNames[i].equals(key)) {
                keyIndex = i;
                break;
            }
        }

        Arrays.sort(students, 1, n + 1, studentComparator); // 排序
        for (int i = 1; i <= n; i++) {
            System.out.print(students[i].name);
            if (i == n) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }


}
