package cn.edu.javabasic.string;

public class DemoString {
    public static void main(String[] args) {
        String str1 = new String();

        char[] cahrArr = {'a', 'b', 'c'};
        String str2 = new String(cahrArr);

        byte[] byteArr = {97,98,99};
        String str3 = new String(byteArr);
        System.out.println("str1 " + str1);
        System.out.println("str2 " + str2);
        System.out.println("str3 " + str3);

        String str4 = "123";
        String str5 = "123";
        String str6 = new String("123");
        System.out.println(str4 == str5);//true
        System.out.println(str4 == str6);//false
        System.out.println(str4.equals(str6));//true

        System.out.println("hello".equalsIgnoreCase("Hello"));//true

    }
}
