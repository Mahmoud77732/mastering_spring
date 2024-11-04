package com.springguru.di_ioc;

import com.springguru.di_ioc.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DiIocApplicationTests {
    
    @Autowired
    ApplicationContext applicationContext;
    
    @Autowired
    MyController myController;
    
    
    @Test
    void testAutowiredControllertx(){
        //MyController myController = applicationContext.getBean(MyController.class);
        
        System.out.println(myController.sayHello());
    }
    
    @Test
    void testGetControllerFromCtx(){
        MyController myController = applicationContext.getBean(MyController.class);
        
        System.out.println(myController.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
