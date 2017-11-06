package com.epam.hw4.game.play;

import com.epam.hw4.answer.phrases.Answer;
import com.epam.hw4.game.interfaces.Subject;
import com.epam.hw4.horse.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class RaceManager implements Subject {
    private List<Observer> horses;
    private Observer winner;
    private  static Observer chosenHorse;

    /**
     *
     */
    public RaceManager() {
        horses = new ArrayList<>();
        winner = null;
    }

    @Override
    public void addHorse(Observer... horse) {
        for (Observer observer : horse) {
            horses.add(observer);
        }
    }

    @Override
    public String race() {
        int winScore = 0;
        int horseSpeed = 0;
        for (Observer horse : horses) {
            horseSpeed = horse.randomizeSpeed();
            if (winScore <= horseSpeed) {
                winScore = horseSpeed;
                winner = horse;
            }
        }
        return Answer.RACE.toString(1) + winner.getName();
    }

    @Override
    public boolean isWin() {
        return (chosenHorse.getName().equalsIgnoreCase(winner.getName()) ? true : false);
    }

    @Override
    public String setChosenHorse(int i) {
        chosenHorse = horses.get(i - 1);
        return (chosenHorse.getName());
    }

    @Override
    public String getChosenHorse() {
        return chosenHorse.getName();
    }
}