package org.launchcode.java.studio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
//        String inputStr = "I love Java!";
        String inputStr = input.nextLine();
        inputStr = inputStr.toUpperCase();
        char[] charInString = inputStr.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for(char letter : charInString){
            if(charCount.containsKey(letter)){
                charCount.put(letter, charCount.get(letter)+1);
            }
            else{
                charCount.put(letter, 1);
            }
        }
        for(Map.Entry<Character, Integer> printChar : charCount.entrySet()){
            System.out.println(printChar.getKey()+ " : " + printChar.getValue());
        }

    }
}
