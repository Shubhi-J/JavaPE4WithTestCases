package com.stackroute.javape4;

public class FindOccurrenceOfCharacterInString {
    public String findOccurrenceOfCharacterInString(String inputString,char ch){
        String output="";
        // check if input is not null then find number of occurrence of character
        if(inputString!=null){
            // to count the number of occurrence, subtract the length of string
            // without that char from the original length of string
            int charCount=inputString.length()-inputString.replaceAll(Character.toString(ch),"").length();
            output="Number of occurrence of "+ch+" is "+charCount;
        } else{
            output=null;
        }
        return output;
    }
}
