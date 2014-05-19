package com.springinaction.springidol;

import com.springinaction.springidol.exceptions.PerformanceException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Performer performer = (Performer) context.getBean("poeticDuke");
        try {
            performer.perform();
        } catch (PerformanceException e) {
            e.printStackTrace();
        }
    }
}
