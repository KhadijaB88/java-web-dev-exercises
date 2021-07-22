package org.launchcode.java.studio2;

import java.util.HashMap;

public class CountingCharacters {

    public static void main(String[] args){
        String inputStr = "";
        char[] charInString = inputStr.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for(char letter : charInString){
            if(charCount.containsKey(letter)){
                charCount.put(letter, charCount.get(letter)+1);
            }
        }

    }
}
