package com.epam.strings.operarions;

import com.epam.strings.interfases.Enigma;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Runner {
    Locale currentLocale;
    List<Enigma> enigmaList = new ArrayList();

    public Runner(Enigma... enigmas) {
        for (Enigma enigma : enigmas) {
            enigmaList.add(enigma);
        }
        currentLocale = Enigma.ENG;
    }

    public void run() {
        for (Enigma enigma : enigmaList) {
            currentLocale = enigma.ask(currentLocale);
        }
        Reader.getInstance().close();
    }
}
