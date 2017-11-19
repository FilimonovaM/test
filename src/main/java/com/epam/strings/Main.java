package com.epam.strings;

import com.epam.strings.enigmas.First;
import com.epam.strings.enigmas.Second;
import com.epam.strings.enigmas.Third;
import com.epam.strings.operations.Runner;

import java.io.UnsupportedEncodingException;

public class Main {

    /**
     * uses for loading application.
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        Runner runner = new Runner(new First(), new Second(), new Third());
        runner.run();
    }
}
