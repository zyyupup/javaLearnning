package cn.edu.javabasic.hello;

import cn.edu.javabasic.oop.MyExtends.Student;

public class HelloGit {
    public static void main(String[] args) {
        System.out.println("hello git");
        String str = "1234";
        Student st = new Student(18,"hello");
        new HelloGit().modifiStr(str,0,'0');

        method(st);
        System.out.println(st);

        char[] chars = {'1','2','3','4'};
        method1(chars);
        System.out.println(chars);

        method2();
    }
    public void modifiStr(String str,int index, char ch){
        StringBuilder strBuillder = new StringBuilder(str);
        if (!str.isEmpty()) {
            strBuillder.setCharAt(index,ch);
        }
    }
    public static void method(Student st){
        st.setAge(20);
    }
    public static void method1(char[] str){
        str[0] = '0';
    }
    public static void method2(){
        int num =  0;
        System.out.println(num);
    }
}
