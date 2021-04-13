package cn.edu.javabasic.random;

import java.util.Random;

public class DemoRandom {
    public static void main(String[] args) {
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(rd.nextInt(100)+  1);
        }
    }
}
