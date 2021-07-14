package cn.edu.javabasic.oop;

import cn.edu.javabasic.oop.MyInnerClass.Body;
import cn.edu.javabasic.oop.MyInterface.MyInterface;

public class DemoInnerClass {
    public static void main(String[] args) {
        Body.HeartA heart = new Body().new HeartA();
        heart.methodA();

        //匿名内部类:可以匿名创建一个接口实现类
        MyInterface myInterface = new MyInterface() {
            @Override
            public void methodAbs() {
                System.out.println("匿名内部类");
            }
        };

    }
}
