package com.springtest.aopanno;


//增强类

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect        //生成代理对象
public class UserProxy {

    //前置通知
    @Before(value = "execution(* com.springtest.aopanno.User.add(..))") //切入点表达式
    public void before(){
        System.out.println("before....");
    }
}
