package org.cadence.config;

import org.cadence.hub.game.Game;
import org.cadence.hub.game.GameImpl;
import org.cadence.hub.message.MessageGenerator;
import org.cadence.hub.message.MessageGeneratorImpl;
import org.cadence.hub.number.NumberGenerator;
import org.cadence.hub.number.NumberGeneratorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(GameConfig.class)
@ComponentScan(basePackages = "org.cadence")
public class AppConfig {

    // == bean methods ==

    @Bean
    public NumberGenerator numberGenerator(){
        return new NumberGeneratorImpl();
    }

    @Bean
    public Game game(){
        return new GameImpl();
    }

    @Bean
    public MessageGenerator messageGenerator(){
        return new MessageGeneratorImpl();
    }
}
