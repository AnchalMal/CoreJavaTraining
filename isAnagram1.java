package com.java.training;

/**
 * Created by anchalmal on 2/1/17.
 */
public class isAnagram1 {


    private static boolean isAnagram(String s1, String s2) {

        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }
        char[] s1Chars = s1.toLowerCase().toCharArray();
        StringBuilder builder = new StringBuilder(s2.toLowerCase());

        for (Character ch : s1Chars) {
            int index = builder.indexOf(String.valueOf(ch));
            if (index == -1) {
                return false;
            }
            builder.delete(index, index + 1);
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "stop";
        String s2 = "tops";
        if (isAnagram(s1, s2)) {
            System.out.println(s2 + " is anagram of " + s1);
        } else {
            System.out.println("Strings are not anagrams.");
        }
    }
}