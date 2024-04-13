/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.score_ioc_di;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author d
 */
@Component("baseballCoach")
@Scope("singleton")
public class BaseballCoach implements Coach {

    // define a private field for the dependency
    // @Autowired
    private FortuneService fortuneService;

    public BaseballCoach() {

    }

    // define a constructor for dependency injection
    /*
    @Autowired
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // add an init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("BaseballCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    @PreDestroy
    public void doMyDestroyStuff() {
        System.out.println("BaseballCoach: inside method doMyDestroyStuff");
    }

}
