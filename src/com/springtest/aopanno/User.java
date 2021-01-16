package com.springtest.aopanno;

//被增强类

import org.springframework.stereotype.Component;

@Component
public class User {
    public void add(){
        System.out.println("add.....");
    }
}
