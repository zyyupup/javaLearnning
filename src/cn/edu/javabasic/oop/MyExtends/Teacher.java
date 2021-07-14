package cn.edu.javabasic.oop.MyExtends;

public class Teacher extends Employee{
    public int classNum;
    public int age;

    public Teacher() {
    }

    public Teacher(int age, int classNum) {
        System.out.println("Teacher constructor");
        this.classNum = classNum;
        this.age = age;
    }

    public Teacher(int age, String name, int classNum) {
        super(age+1, name);
        this.classNum = classNum;
        this.age = age;
    }
    public void showTeacher(){
        System.out.println("teacher show method");
    }
    @Override
    public String toString() {
        return super.toString()+"Teacher{" +
                "classNum=" + classNum +
                ", age=" + age +
                '}';
    }

}
