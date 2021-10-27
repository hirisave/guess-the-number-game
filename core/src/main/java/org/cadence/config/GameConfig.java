package org.cadence.config;

import org.cadence.qualifiers.GuessCount;
import org.cadence.qualifiers.MaxNumber;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {
    // == fields ==
    private int maxNumber = 25;

    private int guessCount = 8;

    // == bean methods ==
    @Bean
    @MaxNumber
    // Autowire only happens if the method name and field name are same, hence this qualifier,
    // method name can now be changed, and it'll still work
    public int maxNumber(){
        return maxNumber;
    }

    @Bean
    @GuessCount
    // Autowire only happens if the method name and field name are same, hence this qualifier,
    // method name can now be changed, and it'll still work
    public int guessCount1(){
        return guessCount;
    }
}
