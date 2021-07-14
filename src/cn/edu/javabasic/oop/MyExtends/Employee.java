package cn.edu.javabasic.oop.MyExtends;

public class Employee {
    public int age;
    public String name;

    public Employee() {
        System.out.println("Employee constructor");
    }

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Employee(int age) {
        this.age = age;
    }
    public void show(){
        System.out.println("employee show method");
    }
    public void showA(){
        System.out.println("public method");
    }
    private void showB(){
        System.out.println("private method");
    }
    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
