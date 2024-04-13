/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.score_ioc_di;

/**
 *
 * @author d
 */
public class BaseballCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneService;

    public BaseballCoach() {

    }

    // define a constructor for dependency injection
    public BaseballCoach(FortuneService fortuneService) {
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
    public void doMyStartupStuff() {
        System.out.println("BaseballCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyDestroyStuff() {
        System.out.println("BaseballCoach: inside method doMyDestroyStuff");
    }

}
