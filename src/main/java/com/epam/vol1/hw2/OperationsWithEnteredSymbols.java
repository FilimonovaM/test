package com.epam.vol1.hw2;

public class OperationsWithEnteredSymbols {
    private int enteredInt;

    /**
     * uses for checking of status of the stringBuilder object.
     *
     * @return lse it return a selected number without some changes. Can returning a negative digit if lineWithSelectedNumber include a negative digit,
     * another symbol or is empty.
     */
    int check(String lineWithSelectedNumber) {
        try {
            enteredInt = Integer.parseInt(lineWithSelectedNumber);
            System.out.println((enteredInt < 0) ? "It is a negative number" : "Selected number is " + enteredInt);
        } catch (NumberFormatException e) {
            System.err.println("It is not a number =====> " + e.getMessage());
            enteredInt = -1;
        }
        return enteredInt;
    }
}
