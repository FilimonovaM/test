package com.epam.hw4.horse.types;

import com.epam.hw4.horse.interfaces.Observer;

import java.util.Random;

public class Donkey implements Observer {
    private String name = "Donkey";
    private int result;
    Random random;

    /**
     * uses for calculating a race result for horses.
     *
     * @return result of the race
     */
    @Override
    public int randomizeSpeed() {
        int speed = 5;
        result = speed;
        random = new Random();
        for (int i = 0; i < (10); i++) {
            speed = random.nextInt((speed<=5) ? 10 : 5)+1;
            result +=speed;
        }
        System.out.println(name+ " - " + result);
        return result;
    }

    /**
     * uses for getting horse name.
     *
     * @return horse name
     */
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getResult() {
        return result;
    }
}
