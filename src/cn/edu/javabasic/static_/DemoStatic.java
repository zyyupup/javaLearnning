package cn.edu.javabasic.static_;

public class DemoStatic {
    public static void main(String[] args) {
        StaticDemoClass st1 = new StaticDemoClass();
        System.out.println(StaticDemoClass.staticVal);
        StaticDemoClass st2 = new StaticDemoClass(10);
        System.out.println(StaticDemoClass.staticVal);
        StaticDemoClass st3 = st2;
        System.out.println(StaticDemoClass.staticVal);
    }
}
