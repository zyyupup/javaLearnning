package cn.edu.javabasic.static_;

public class StaticDemoClass {
    private int val;
    static int staticVal;

    public StaticDemoClass() {
        staticVal++;
    }

    public StaticDemoClass(int val) {
        this.val = val;
        staticVal++;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
    public void method(){
        System.out.println("none static method and val :" + val);
    }
    public static void staticMethod(){
        System.out.println("static method and staticVal" + staticVal);
    }
}
