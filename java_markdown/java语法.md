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

5. Integer中的-128-127已经被缓存，所有指向该值的Integer对象皆为同一份

# 集合

1. 泛型只能是引用类型

2. 从JDK1.7开始，右侧泛型尖括号可不写内容

   ```java
   ArrayList<Student> arrayList = new ArrayList<>();
   ```

3. 自动拆箱和自动装箱

   - 自动装箱：基本类型-->引用类型
   - 自动拆箱：引用类型-->基本类型

# 字符串

1. 字符串是常量
2. 

