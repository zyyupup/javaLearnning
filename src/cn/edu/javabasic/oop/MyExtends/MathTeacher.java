package cn.edu.javabasic.oop.MyExtends;
public class MathTeacher extends Teacher{
    int age;

    public MathTeacher(int age) {
        this.age = age;
    }

    public MathTeacher(int age, String name, int classNum) {
        super(age+1, name, classNum);
        this.age = age;
    }

    public void show(){
        System.out.println(age);
        System.out.println(super.age);
    }
}
