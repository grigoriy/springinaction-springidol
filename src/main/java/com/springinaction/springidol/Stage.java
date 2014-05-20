package com.springinaction.springidol;

/**
 * Created by Grigoriy Alexeev on 20 May 2014.
 */
public class Stage {

    private Stage() {
    }

    private static class StageSingletonHolder {
        static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingletonHolder.instance;
    }
}
