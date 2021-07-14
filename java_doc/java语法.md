# java内存分布
java程序运行在JVM上，

# 面向对象

## 基本知识

1. java局部变量（方法内部变量没有默认值），成员变量拥有默认值。

2. 基本类型中的bool值get方法为isXxx，如

   ```java
   public void isMale(){
     return male
   }
   ```

 3. 如果没有构造方法，则会有一个空的构造方法，一旦设置一个构造方法，则不会自动生成。

 4. 标准的类(java bean):
    - 所有成员变量都是private
    - 每个成员变量都有一对Setter/Getter
    - 编写一个无参构造方法
    - 编写一个全参数构造方法

5. Integer中的-128--127已经被缓存，所有指向该值的Integer对象皆为同一份

## 继承

1. **java中不支持多重继承**，也就是类只有一个父亲，因为多重继承容易造成二义性
2. java可以多级继承，也就是可以有爷爷类
3. 当父类和子类中存在相同名称的**变量**时，**通过子类对象访问该变量**，所输出的变量为等号左边的类型的变量。当等号对应的类找不到变量时，往上寻找。

```java
Employee t2 = new Teacher(10,20);//Teacher类中的age=10
Employee t3 = new Teacher(10,"zyy",2);//Teacher调用父类Employee中的构造函数，使得父类中的age=10，name="zyy"
System.out.println(t2.age + " "+t2.name + " " + t3.age + " "+t3.name);//0 null 10 zyy

Teacher t = new Teacher(10,20);
Teacher t1 = new Teacher(10,"zyy",2);
System.out.println(t.age + " "+t.name + " " + t1.age + " "+t1.name);//10 null 0 zyy
```

3. 当父类和子类中存在相同名称的**成员方法**时，**通过对象访问该方法**，所输出的方法创建对象的方法。否则，往上寻找。

```
Employee em = new Teacher();
Employee em1 = new Employee();
em.show();//this is child
em1.show();//this is father
```

注意：无论是方法还是变量，当找不到调用的时候，**只会向上找父类，不会向下找子类。**

4. @override为annotation，为注解，是为了检验所写方法是否为重写方法，否则该注解会报错。
5. 子类方法重写时，返回值类型的范围必须小于等于父类方法的返回值，子类方法的权限范围必须大于等于父类方法。

```java
protected String show(); //父类

public String show();//子类 正确
public Object show();//子类 错误 Object类为String类的父类所以报错
private String show();//子类 错误
```

6. 构造方法
   - 子类构造方法中没有显示调用情况下会有一个默认的super()构造方法，此时父类必须实现无参构造函数。
   - 子类中只有构造方法能调用super()函数
   - super()只能调用一次，且只在第一行调用

###  抽象类

1. 抽象方法：加上abstract，以分号结束的类
2. 抽象方法所在的类必须为抽象类

``` java
public abstract class AbstractClass {
    public abstract void abstractMethod();
}
```

3. **抽象类不能直接创建抽象类对象，只能用子类继承，且子类必须覆盖重写（实现）抽象类中的所有抽象方法，去掉关键字abstract。**
4. 抽象类中可以有构造函数

### 接口

1. 接口就是多个类的规范标准 

```java
public interface MyInterface {
}
```

2. 换成interface关键字后，编译生成的字节码文件仍然是：.java-->.class
3. 如果是java 7，接口中包含的内容有：常量和抽象方法。如果是java 8，还可以有默认方法和静态方法。如果是java 9 ，还可以有私有方法
   - 默认方法：可以有方法体，可以在接口升级中使用，即接口中添加新方法不影响已投入使用的实现类
   - **静态方法：不能通过接口实现类的对象来调用接口当中的静态方法**，应该直接调用
   - 私有方法：只能由接口自身使用
     - 普通私有方法：解决多个**默认方法**之间的重复代码问题
     - 静态私有方法：解决多个**静态方法**之间的重复代码问题
4. 接口中的抽象方法，修饰符必须为 public abstract（可省略）
5. **接口不能直接使用，必须有一个类实现该接口，该实现类必须实现所有抽象方法，并去掉abstract关键字。**
6. 如果实现类中没有实现所有的抽象方法，那么这个类就必须是抽象类。
7. 接口中的常量格式为：

```java
 public interface MyInterface {
     public static final int NUM_OF_CLASS = 10;
 }
```

其中，final为c++中的const，即常量，不可修改，且修饰符public static final可省略。此外，**该常量必须赋初值且完全大写**。

8. 注意事项：
   - **接口中没有构造方法和代码块**
   - 一个类只有一个父类，但是可以继承多个接口，多个接口中存在同一个抽象方法，只需要实现一个即可，如果不是抽象方法，就得重写该方法。
   - **一个类如果直接父类的方法和子类的接口方法重合，则优先调用父类方法**
   - 接口与接口之间也允许继承，且**允许多继承**

## 多态

1. 多态：多态性指的是父类引用指向子类对象
2. **成员变量：编译看左，运行看左。成员方法：编译看左，运行看右。没有则向上找，不会向下找。**
3. 向上转型一定安全，向下转型不安全

## 封装

|              | public | protected | default | private |
| ------------ | ------ | --------- | ------- | ------- |
| 同一个类     | YES    | YES       | YES     | YES     |
| 同一个包     | YES    | YES       | YES     | NO      |
| 不同包子类   | YES    | YES       | NO      | NO      |
| 不同包非子类 | YES    | NO        | NO      | NO      |

## 内部类

1. 内部类

```java
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


```

内用外，随意访问，外用内，创建临时对象。

1. 匿名内部类

# 集合

1. 泛型只能是引用类型

2. 从JDK1.7开始，右侧泛型尖括号可不写内容

   ```java
   ArrayList<Student> arrayList = new ArrayList<>();
   ```

3. 自动拆箱和自动装箱

   - 自动装箱：基本类型-->引用类型
   - 自动拆箱：引用类型-->基本类型
    ```
   int a = 1;
   Integer inte_a = a;//自动装箱
   int b = inte_a;//自动拆箱
    ```

# 字符串

1. 字符串是常量，永不可变

2. java中所有双引号字符串都是String类的对象（就算没有new 也是一样）

3. 字符串效果上相当于char[]数组，但是底层原理是byte[]数组(jdk 1.8 之前是char[], jdk 1.9之后是byte[])
    - 原因是开发者发现人们在使用字符串的时候，多数使用的是拉丁文，而拉丁文所占字节数为1。JDK1.8底层实现是使用的char数组，一个char类型所占字节数为2，所以在char数组存储拉丁文的时候浪费了一个字节的内存空间。
      往往我们在使用字符串的时候都是大量使用的，浪费一个字节的内存空间必然会导致GC频繁，性能低下。所以开发者在JDK1.9将char数组改为了byte数组！
    
4. 引用类型的==是地址比较，调用equals是内容比较

5. 直接用双引号生成的字符串存在于常量池中，赋给多个String实例时，该些实例共享同一个地址
    ```
        String str4 = "123";
        String str5 = "123";
        String str6 = new String("123");
        System.out.println(str4 == str5);//true
        System.out.println(str4 == str6);//false
        System.out.println(str4.equals(str6));//true
    ```
    
6. 调用equals时有以下两点：
    - 任何对象都能被接收
    - equals具有对称性，即a.equals(b)和b.equals(a)一样
    - 当比较常量和变量时，应将常量放在前，如"hello".equals(str),此举是为了防止空指针异常
    
7. 在调用split时，当对单独的 "." 进行匹配的时候应该使用"\\\\."，因为split是基于正则匹配，而“."在正则匹配中有特殊含义。同理，"*"也是。

# 关键字

## static

- static方法不能访问非静态成员变量和非方法，因为变量创建时间不同，静态内容会先于非静态方法创建

- 静态方法中不能使用this

- 静态代码块，在类第一次初始化的时候初始化并且只初始化一次，类消失的时候消失。并且，静态代码块比构造函数还要先初始化。
  ```
    public class {
        static{
        }
    }
  ```
## final

  1.final关键字代表最终的，不可改变的，有以下四种用法：

  - 修饰一个类：public final class xxx{}，修饰类时，该类不能被继承
  - 修饰一个方法：public final void method(){}，修饰方法时，该方法不能被覆盖重写
  - 修饰局部变量：只能一次赋值，不能改变。**修饰普通变量时，变量的值不能变，修饰引用变量时，指的是地址不能变。**
  - 修饰一个成员变量：使用final后要么直接手动赋值，要么在**所有构造方法**中复制。 

2. **注意事项：对于类和方法来说，abstract和final不能同时存在**
