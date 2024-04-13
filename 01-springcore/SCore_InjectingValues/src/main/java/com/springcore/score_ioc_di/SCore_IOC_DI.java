/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.springcore.score_ioc_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author d
 */
public class SCore_IOC_DI {

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Coach coach1 = context.getBean("baseballCoach", Coach.class);
        TrackCoach coach2 = context.getBean("trackCoach", TrackCoach.class);
        System.out.println(coach1.getDailyWorkout());
        System.out.println(coach1.getDailyFortune());
        System.out.println(coach2.getDailyWorkout());
        System.out.println(coach2.getDailyFortune());
        System.out.println(coach2.getEmailAddress());
        System.out.println(coach2.getTeam());
        
        context.close();
        
    }
}
