package org.example;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        //number format class is abstracts and cannot be created into an instance
        //the dao
        String result = NumberFormat.getPercentInstance().format(22345.435);
        System.out.println(result);
        //returning a currency format
    }
}
