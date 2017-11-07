package com.epam.hw4.horse.interfaces;

public interface Observer {

    /**
     * uses for calculating a race result for horses.
     */
    int randomizeSpeed();

    /**
     * uses for getting horses name.
     */
    String getName();

    /**
     * uses for getting horses result.
     */
    int getResult();
}
