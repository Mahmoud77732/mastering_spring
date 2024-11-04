package com.springguru.di_ioc;

import com.springguru.di_ioc.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiIocApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiIocApplication.class, args);
        MyController controller = ctx.getBean(MyController.class);
        System.out.println("In main()");
        System.out.println(controller.sayHello());
    }

}
