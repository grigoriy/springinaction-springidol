package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Grigoriy Alexeev on 20 May 2014.
 */
public class Ticket {

    @Value("500")
    private float price;
}
