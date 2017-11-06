package com.epam.hw4.menu.levels;

import com.epam.hw4.answer.phrases.Answer;
import com.epam.hw4.menu.config.AnswerReader;
import com.epam.hw4.menu.interfaces.MenuLevel;
import com.epam.hw4.wallet.Wallet;

public class EnterMenuLevel implements MenuLevel {
    char answer;
    MenuLevel newLevel;
    Wallet wallet = new Wallet();

    @Override
    public MenuLevel runner(AnswerReader answerReader) {
        newLevel = null;
        if (wallet.getPlayerBalance() > 0) {
            System.out.println(Answer.WELCOME.toString(-1));
            while (answer != '2') {
                System.out.println(Answer.WELCOME.toString(1));
                answer = answerReader.read();
                if (answer == '1') {
                    return new HorseMenuLevel();
                }
            }
        }
        return null;
    }
}