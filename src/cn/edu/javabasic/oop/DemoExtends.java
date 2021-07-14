package cn.edu.javabasic.oop;

import cn.edu.javabasic.oop.MyExtends.Employee;
import cn.edu.javabasic.oop.MyExtends.MathTeacher;
import cn.edu.javabasic.oop.MyExtends.Teacher;

public class DemoExtends {
    public static void main(String[] args) {
        Teacher t = new Teacher(10,20);
        Teacher t1 = new Teacher(10,"zyy",2);
        System.out.println(t.toString());
        System.out.println(t1.toString());
        System.out.println(t.age + " "+t.name + " " + t1.age + " "+t1.name);

        Employee t2 = new Teacher(10,20);
        Employee t3 = new Teacher(10,"zyy",2);
        System.out.println(t2.age + " "+t2.name + " " + t3.age + " "+t3.name);

        Employee em = new Teacher();
        Employee em1 = new Employee();
        em.show();
        em1.show();

        MathTeacher mt = new MathTeacher(10,"zyy",2);
        mt.show();
    }


}
