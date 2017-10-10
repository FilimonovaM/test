package com.epam.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operations {
    StringBuilder stringBuilder;
    public StringBuilder read() throws IOException {
        stringBuilder = new StringBuilder();
        try {
            stringBuilder.setLength(0);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return  stringBuilder.append(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            return stringBuilder;
        }
    }

    public boolean isNum(StringBuilder num){
        try {
            Long.parseLong(num.toString());
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }

    public int parseToInt(StringBuilder num){
        try {
            return Integer.parseInt(num.toString());
        } catch (NumberFormatException e){
            return 0;
        }
    }
}
