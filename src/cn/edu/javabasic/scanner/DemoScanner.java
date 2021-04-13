package cn.edu.javabasic.scanner;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("num: " + num);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("sc2: ");
        System.out.println(sc1.nextInt());

        System.out.println("sc: ");
        String str = sc.next();
        System.out.println("str: " + str);
    }
}
