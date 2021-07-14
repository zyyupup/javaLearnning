package cn.edu.javabasic.oop.MyExtends;

public class Student {
    private int age;
    private String name;
    private boolean male;

    public Student(int age, String name) {

        this.age = age;
        this.name = name;
    }

    public Student(int age, String name, boolean male) {
        this.age = age;
        this.name = name;
        this.male = male;
    }
    public Student(){

    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
