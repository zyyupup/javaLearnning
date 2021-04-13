package cn.edu.javabasic.hello;

public class HelloJava {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(str);
    }
    public static void printArrayAddress(int[] array){
        System.out.println(array);
        array[0] = 10;
    }
    public static void printArray(int[] array){
        for (int i : array) {
            System.out.println(i);
        }
    }
}