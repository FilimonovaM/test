package com.epam.vol1.hw3.farm.birds.duck;

import com.epam.vol1.hw3.farm.birds.duck.Duck;
import com.epam.vol1.hw3.farm.birds.duck.RedHetDuck;
import org.junit.Test;

public class DuckTest {
    Duck duck = new RedHetDuck();

    @Test(expected = NullPointerException.class)
    public void performFlyTest() throws NullPointerException {
        duck.flyBehavior = null;
        duck.performFly();
    }

    @Test(expected = NullPointerException.class)
    public void performQuakTest() throws NullPointerException {
        duck.makeASoundBehavior = null;
        duck.performQuak();
    }

    @Test(expected = NullPointerException.class)
    public void performSwimTest() throws NullPointerException {
        duck.swimBehavior = null;
        duck.performSwim();
    }

    @Test(expected = NullPointerException.class)
    public void setFlyBehaviorTest() throws NullPointerException {
        duck.setFlyBehavior(null);
    }

    @Test(expected = NullPointerException.class)
    public void setQuakBehaviorTest() throws NullPointerException {
        duck.setQuakBehavior(null);
    }

    @Test(expected = NullPointerException.class)
    public void setSwimBehaviorTest() throws NullPointerException {
        duck.setSwimBehavior(null);
    }
}