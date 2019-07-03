package com.stackroute.javape4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindHarryInAString {
    public boolean findHarryInGivenString(String inputString) {
        // if inpur string is null, return false
        if(inputString!=null){
            // pattern that means Harry is within the boundary
            String pattern=".*\\bHarry\\b.*";
            // return true if Harry is in the input string or return false
            return inputString.matches(pattern);
         }
        else{
            return false;
        }
    }
}
