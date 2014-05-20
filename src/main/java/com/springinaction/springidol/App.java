package com.springinaction.springidol;

import com.springinaction.springidol.exceptions.PerformanceException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");

        List<Performer> performers = new ArrayList<>();
        performers.add((Performer) context.getBean("duke"));
        performers.add((Performer) context.getBean("poeticDuke"));
        performers.add((Performer) context.getBean("kenny"));

        Stage stage = (Stage) context.getBean("stage");
        Auditorium auditorium = (Auditorium) context.getBean("auditorium");
        try {
            for (Performer performer : performers) {
                performer.perform();
            }

        } catch (PerformanceException e) {
            e.printStackTrace();
        }

        ((ConfigurableApplicationContext) context).close();
    }
}
