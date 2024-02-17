package com.example.StringCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


// String Calculator Class
public class StringCalculator {

    public int add(String numbers) {

        // Empty String
        if (numbers.isEmpty()) {
            return 0;
        }

        // custom delimiter
        List<Integer> negatives = new ArrayList<>();
        int sum = 0;
        String delimiter = ",";
        String[] parts = numbers.split("\n");
        if (parts[0].startsWith("//")) {
            delimiter = parts[0].substring(2);
            parts = parts[1].split(delimiter);
        } else {
            parts = numbers.split("[,\n]");
        }

        for (String part : parts) {
            int num = Integer.parseInt(part);
            if (num < 0) {
                negatives.add(num);
            }
            sum += num;
        }

        // negative Numbers
        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + negatives);
        }

        return sum;
    }
 }

