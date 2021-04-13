package cn.edu.javabasic.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoStudent {
    public static void main(String[] args) {
        Student st = new Student(20,"demo");
        System.out.println(st.toString());
        Student st1 = st;
        st1.setAge(30);
        System.out.println(st);
        System.out.println(new Student(10,"1"));

        Scanner sc = new Scanner(System.in);
        System.out.println("input num: ");
        int num = sc.nextInt();
        ArrayList<Student> arrStu = new ArrayList<Student>();
        for (int i = 0; i < num; i++) {
            arrStu.add(new Student(i,"name" + i));
        }
        for (Student student : arrStu) {
            System.out.println(student.toString());
        }

    }
}
