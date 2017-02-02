package com.java.training;
import java.io.*;
import java.util.*;


/**
 * Created by anchalmal on 1/31/17.
 */
public class reverseString1 {

        public static void main(String[] args) {
            String input="Anchal";
            //System.out.println("Enter the input string");
            try
            {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                input = br.readLine();
                char[] s= input.toCharArray();
                for (int i=s.length-1;i>=0;i--)
                    System.out.print(s[i]);
            }
            catch (Exception e) {
                System.out.println("try again");
            }
        }}
