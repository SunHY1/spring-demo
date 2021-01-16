package com.springtest.testdemo;


import com.springtest.User;
import com.springtest.collectiontype.Book;
import com.springtest.collectiontype.Course;
import com.springtest.collectiontype.Stu;
import com.springtest.factoryrbean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testspring5 {
    @Test
    public void test1(){
        //1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2 获取配置创建的对象
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);
        stu.test();
    }
    @Test
    public void test2(){
        //1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        //2 获取配置创建的对象
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        System.out.println(book1);
        System.out.println(book2);
//        book.test();
    }
    @Test
    public void test3(){
        //1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        //2 获取配置创建的对象
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);

    }
}
