package com.stackroute.javape4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculateMultipleOccurrencesOfAWord {
    public String findMultipleOccurrenceOfGivenWord(String inputString, String givenMatchWord) {
        String outputString = "";
        // variable found to check if the word is in the string or not
        boolean found=false;
        // if input string or given word is null,then return error
        if (inputString == null || givenMatchWord == null) {
            outputString = "input string or given word is null";
        } else {
            // pattern is the given word to be found
            Pattern pattern =Pattern.compile(givenMatchWord);
            // matcher finds the given word in input string
            Matcher matcher = pattern.matcher(inputString);
            while (matcher.find()) {
                outputString = outputString + "Found at " + matcher.start() + "-" + matcher.end() + "\n";
                found=true;
            }
            // if word not found, return not found message
            if(!found){
                outputString="not found";
            }
        }

        return outputString;
    }
}