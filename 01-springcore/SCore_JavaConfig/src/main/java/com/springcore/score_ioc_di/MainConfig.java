/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.score_ioc_di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author d
 */
@Configuration
@ComponentScan("com.springcore.score_ioc_di")
@PropertySource("classpath:sport.properties")
public class MainConfig {
    
    @Bean
    public FortuneService happyFortuneService(){
        return new HappyFortuneService();
    }
    
    @Bean
    public Coach baseballCoach(){
        BaseballCoach coach = new BaseballCoach(happyFortuneService());
        return coach;
    }
    
    
}
