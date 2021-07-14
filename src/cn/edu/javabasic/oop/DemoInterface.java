package cn.edu.javabasic.oop;

import cn.edu.javabasic.oop.MyInterface.MyInterfaceImpl;

public class DemoInterface {
    public static void main(String[] args) {
        MyInterfaceImpl imp = new MyInterfaceImpl();
        imp.methodAbs();
        imp.show();
        imp.printInfo();
    }
}
