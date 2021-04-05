package cn.edu.javabasic;

public class helloJava {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        String str = "123";
        String strHeap = new String("123");
        String strCopy = str;
        strCopy = "456";
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