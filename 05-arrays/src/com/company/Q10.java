package com.company;

import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
        // Question: Check if the Sentence Is Pangram
        // Link: https://leetcode.com/problems/check-if-the-sentence-is-pangram/

        // Solution:
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean paragram = checkIfPangram(sentence);

        if (paragram){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    static boolean checkIfPangram(String sentence) {
        int len = sentence.length();
        if (len < 26){
            return false;
        }
        int[] alphabets = new int[26];
        int count = 0;
        for (int i = 0; i < len; i++){
            int letter = sentence.charAt(i) - 'a';
            if(alphabets[letter] != 1){
                count += 1;
                alphabets[letter] = 1;
            }

        }
        return count == 26;
    }
}
