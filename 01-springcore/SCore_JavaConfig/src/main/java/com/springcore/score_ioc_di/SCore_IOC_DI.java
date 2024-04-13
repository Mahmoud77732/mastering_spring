/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.springcore.score_ioc_di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author d
 */
public class SCore_IOC_DI {

    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(MainConfig.class);
        
        BaseballCoach coach1 = context.getBean("baseballCoach", BaseballCoach.class);
        System.out.println(coach1.getDailyWorkout());
        System.out.println(coach1.getDailyFortune());
        System.out.println(coach1.getEmail());
        System.out.println(coach1.getTeam());
        
        context.close();
        
    }
}
