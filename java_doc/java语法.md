# java内存分布
java程序运行在JVM上，

# 面向对象

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

#static
- static方法不能访问非静态成员变量和非方法，因为变量创建时间不同，静态内容会先于非静态方法创建
- 静态方法中不能使用this
- 静态代码块，在类第一次初始化的时候初始化并且只初始化一次，类消失的时候消失。并且，静态代码块比构造函数还要先初始化。
  ```
    public class {
        static{
        }
    }
  ```
