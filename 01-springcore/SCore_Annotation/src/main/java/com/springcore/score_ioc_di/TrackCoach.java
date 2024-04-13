/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.score_ioc_di;

/**
 *
 * @author d
 */
public class TrackCoach implements Coach {

    private FortuneService fortuneService;
    
    // add new fields for emailAddress and team
    private String emailAddress;
    private String team;

    public TrackCoach() {

    }

    /*
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    @Override
    public String getDailyWorkout() {
        return "TrackCoach: Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "TrackCoach: Just Do It: " + fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    
    
    
}
