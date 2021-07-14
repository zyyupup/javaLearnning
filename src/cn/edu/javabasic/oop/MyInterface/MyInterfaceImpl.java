package cn.edu.javabasic.oop.MyInterface;

public class MyInterfaceImpl implements MyInterface,MyInterfaceB{
    @Override
    public void methodAbs() {
        System.out.println("interface method");
    }

    @Override
    public void show() {
        super.toString();
        System.out.println("intrface show");
    }

    @Override
    public void printInfo() {
        System.out.println("myinterface impl");
    }
}
