package com.springinaction.springidol;

import com.springinaction.springidol.exceptions.PerformanceException;

/**
 * Created by Grigoriy Alexeev on 19 May 2014.
 */
public interface Performer {

    void perform() throws PerformanceException;
}
