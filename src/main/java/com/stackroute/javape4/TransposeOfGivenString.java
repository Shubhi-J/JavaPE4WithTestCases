package com.stackroute.javape4;

public class TransposeOfGivenString {
    public String findTransposeOfGivenString(String inputString) {
        String outputString="";
        // if input string is null return null
        if(inputString==null) {
            outputString = null;
        }
        // if input string is a single character than return the input string
        else if(inputString.length()==1){
            outputString=inputString;
        // else find transpose
        }else {
            StringBuilder inputStringAsStringBuilder = new StringBuilder();

            // append a string into StringBuilder inputStringAsStringBuilder
            inputStringAsStringBuilder.append(inputString);

            // reverse StringBuilder inputStringAsStringBuilder
            inputStringAsStringBuilder = inputStringAsStringBuilder.reverse();

            // print reversed inputStringAsStringBuilder
            outputString= inputStringAsStringBuilder.toString();
        }
        return outputString;
    }

}
