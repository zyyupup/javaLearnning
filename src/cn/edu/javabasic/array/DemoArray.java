package cn.edu.javabasic.array;

import cn.edu.javabasic.oop.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoArray {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("input num: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            arrayList.add(new Student(i,"name-"+i));
        }
        System.out.println("size of arrayList: " + arrayList.size());
        System.out.println("the 5-th item: " + arrayList.get(4));
        arrayList.remove(4);
        for (Student student : arrayList) {
            System.out.println(student);
        }

        ArrayList<Integer> arrayListInt = new ArrayList<>();


    }
}
