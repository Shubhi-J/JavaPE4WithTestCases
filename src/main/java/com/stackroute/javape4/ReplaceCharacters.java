package com.stackroute.javape4;

public class ReplaceCharacters {

    public String replaceCharacters(String inputString) {
        // check if the string is null,then return null
        if(inputString!=null){
        String outputString="";
        // replace d with f and then return l with t
        outputString=inputString.replaceAll("d","f").replaceAll("l","t");
        return outputString;
    } else
        return null;
    }
}
