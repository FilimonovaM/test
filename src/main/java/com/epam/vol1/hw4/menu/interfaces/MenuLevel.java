package com.epam.vol1.hw4.menu.interfaces;

import com.epam.vol1.hw4.menu.configuration.AnswerReader;

import java.io.IOException;

public interface MenuLevel {
    /**
     * uses for creating logic of the different menu levels.
     *
     * @param answerReader - produce an access to the preparing object of BufferedReader
     */
    MenuLevel run(AnswerReader answerReader) throws IOException;
}
