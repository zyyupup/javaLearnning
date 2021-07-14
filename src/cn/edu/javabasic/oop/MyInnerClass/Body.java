package cn.edu.javabasic.oop.MyInnerClass;

public class Body{
    int num = 10;
    //成员内部类：可以用四种修饰符
    //调用方式： Body.Heart heart = new Body().new Heart()
    public class HeartA{
        int num = 20;
        public void methodA(){
            int num = 30;
            System.out.println(num);//30
            System.out.println(this.num);//20
            System.out.println(Body.this.num);//10
        }
    }
    //局部内部类：没有修饰符，访问所在方法的局部变量必须是final的。因为局部内部类在堆中，而局部变量在栈中，局部内部类的生存周期比局部变量长，因此局部变量必须是final的才能被局部内部类调用。
    public void method(){
        final int num = 20;
        class HeartB{
            public void methodB(){
                System.out.println(num);//20
            }
        }
        //调用方式:只能在方法内调用
    }
}
