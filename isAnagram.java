package com.java.training;
import java.util.Arrays;
/**
 * Created by anchalmal on 2/1/17.
 */
public class isAnagram {

    private boolean isAnagram = false;

    public boolean Anagrams(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return isAnagram;
        }

        boolean[] char_set = new boolean[256];
        boolean[] char_set1 = new boolean[256];


        for (int i = 0; i < str1.length(); i++) {

            int val1 = str1.charAt(i);
            int val2 = str2.charAt(i);

            char_set[val1] = true;
            char_set1[val2] = true;
        }

        if (Arrays.equals(char_set, char_set1)) {
            isAnagram = true;
        }


        return isAnagram;
    }


    public static void main(String [] args){

        isAnagram ang = new isAnagram();

        System.out.println(ang.Anagrams("mary","army"));


    }


}
