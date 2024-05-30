package com.jtc;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

import java.util.*;
public class App {
    public static void main(String[] args) {
        String input = "India is best";
        char[] inputArray = input.toCharArray();
        char[] result = new char[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }
        int j = result.length - 1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != ' ') {
                if (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        System.out.println(input + " --> " + String.valueOf(result));
    }
}


