package com.springinaction.springidol;

import com.springinaction.springidol.exceptions.PerformanceException;

/**
 * Created by Grigoriy Alexeev on 19 May 2014.
 */
public class Juggler implements Performer {

    private int beanBags = 3;


    public Juggler() {}

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() throws PerformanceException {

        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}
