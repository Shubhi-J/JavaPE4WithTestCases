package com.stackroute.javape4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortWordsOfString {

    public String sortWordsInParagraph(String inputString) {
        String output="";
        String[] ParaToWords={};
        if(inputString!=null) {
        // split input string at space and keep it in an array
        ParaToWords=inputString.split(" ");

           for(int innerLoopIndex=0;innerLoopIndex<ParaToWords.length;innerLoopIndex++) {
               // sort paragraph using collections.sort irrespective of case
               Collections.sort(Arrays.asList(ParaToWords), String.CASE_INSENSITIVE_ORDER);

                // create object of StringBuilder class
                StringBuilder sb = new StringBuilder();

                // Appends words one by one
                sb.append(Arrays.asList(ParaToWords));

                // convert in string
                output = sb.toString().replaceAll(",|\\[|\\]","");
            }
        } else output=null;
        return output;
    }
}
