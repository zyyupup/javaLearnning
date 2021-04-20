package cn.edu.javabasic.string;

public class Demo02String {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str + " world");
        System.out.println(str.indexOf("llo2"));
        System.out.println(str.charAt(2));
        System.out.println(str.substring(2));

        String str1 = "xxx*yyy*zzz";
        String[] strArr = str1.split("\\*");
        for (String s : strArr) {
            System.out.println(s);
        }
    }
}
