package com.ngunguyen.greatestvalue.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //Pathname may required changes if you Forked this project.
        BufferedReader br = new BufferedReader(new FileReader("/Users/ngunguyen/Documents/" +
                                                            "JavaProjects/GreatestValueBufferedReader/src/com/" +
                                                            "ngunguyen/greatestvalue/resources/ReadFile"));

        String line = "";
        try {
            while((line = br.readLine()) != null){
                getGreatestValue(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getGreatestValue(String line) {
        String[] stringValue = line.split(" ");
        Integer value = Integer.MIN_VALUE;

        for(int i = 0; i < stringValue.length; i++){
            value = Math.max(value, Integer.valueOf(stringValue[i]));
        }
        System.out.println(value);
    }
}
