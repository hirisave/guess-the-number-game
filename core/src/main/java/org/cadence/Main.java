package org.cadence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("guess-the-number-game");

        //create context (container)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //get the numberGenerator bean from context (container)
        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

        //call method next() to get random number
        int number = numberGenerator.next();
        log.info("number = {}", number);

        //get the game bean from context (container)
        Game game = context.getBean(Game.class);

        //call reset method
        //game.reset();

        //close context (container)
        context.close();


    }
}
