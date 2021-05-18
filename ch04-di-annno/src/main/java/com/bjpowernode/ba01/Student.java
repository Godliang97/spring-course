package com.bjpowernode.ba01;


import org.springframework.stereotype.Component;


/**
 * @Component:创建对象的，等同于<bean>的功能 属性：value 就是对象的名称，也就是bean的id值
 * value的值是唯一的，创建的对象在整个spring容器中就一个
 * 位置：在类的上面
 * @Component(value = "myStudent")等同于
 * <bean id="myStudent" class="com.bjpowernode.ba01.Student"/>
 */
//使用value属性，指定对象名称
//@Component(value = "myStudent")

//省略value
@Component("myStudent")

//不指定对象名称，由spring提供默认名称：类名的首字母小写
//@Component
public class Student {
    private String name;
    private Integer age;

    public Student() {
        System.out.println("===student无参数构造方法===");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
