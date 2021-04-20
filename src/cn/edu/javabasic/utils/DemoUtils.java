package cn.edu.javabasic.utils;

import java.util.Arrays;

public class DemoUtils {
    public static void main(String[] args) {
        int[] intArr = {2, 3, 6, 4, 5, 7, 8, 9};
        Arrays.sort(intArr);
        String intArrStr = Arrays.toString(intArr);
        System.out.println(intArrStr);

        double num = -1.12;
        System.out.println(Math.abs(num));
        System.out.println(Math.floor(num));
        System.out.println(Math.ceil(num));
        System.out.println(Math.round(num));
    }
}
