package com.java.training;

import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String s="Anchal";
        StringBuilder s1 = new StringBuilder();
        s1.append(s);
        s1=s1.reverse();
        for (int i=0;i<s1.length();i++)
            System.out.print(s1.charAt(i));
    }}

