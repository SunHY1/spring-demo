package com.springtest.test;

import com.springtest.entity.Book;
import com.springtest.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();

        book.setUserId("1");
        book.setUsername("java");
        book.setUstatus("a");
        bookService.addBook(book);
    }
}
