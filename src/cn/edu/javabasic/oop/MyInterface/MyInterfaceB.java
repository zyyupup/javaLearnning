package cn.edu.javabasic.oop.MyInterface;

public interface MyInterfaceB {
    void methodAbs();
    default void printInfo(){
        System.out.println("myinterface B");
    }
}
