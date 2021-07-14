package cn.edu.javabasic.oop;

import cn.edu.javabasic.oop.MyExtends.Employee;
import cn.edu.javabasic.oop.MyExtends.Teacher;
import cn.edu.javabasic.oop.MyMulti.Assistance;


import java.util.ArrayList;

public class DemoMulti {
    public static void main(String[] args) {
        ArrayList<Employee> emList = new ArrayList<>();
        emList.add(new Assistance());
        emList.add(new Teacher());
        emList.add(new Employee());
        for (Employee employee : emList) {
            show(employee);
        }
    }
    public static void show(Employee em){

        if(em instanceof Assistance){
            ((Assistance) em).showAssistance();
        }else if(em instanceof Teacher){
            ((Teacher) em).showTeacher();
        }else{
            em.show();
        }
    }
}
