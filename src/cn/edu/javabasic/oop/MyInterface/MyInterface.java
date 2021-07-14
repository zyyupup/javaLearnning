package cn.edu.javabasic.oop.MyInterface;

import javax.swing.*;

public interface MyInterface {
    //抽象方法
    public abstract void methodAbs();
    //默认方法,可以用在接口升级,与函数式编程和lambda函数联用
    public default  void show(){
        System.out.println("default interface method");
    };
    //静态方法
    public static void print(){
        System.out.println("static interface method");
    }
    //普通静态方法:java9
//    private void common(){
//        System.out.println();
//    }
    public default void printInfo(){
        System.out.println("myinterface");
    }
}
