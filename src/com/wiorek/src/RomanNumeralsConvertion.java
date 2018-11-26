package com.wiorek.src;
public class RomanNumeralsConvertion {
    public static String convertIntToRoman(int number)throws IllegalArgumentException{
        if (number<=0||number>3999){
            throw new IllegalArgumentException("Number must be between 0 and 4000");
            /*
            https://en.wikipedia.org/wiki/Roman_numerals
            Characters "I, X, C, M" can be max 3 next to each other, so we can't write 4000 as MMMMM;
             */
        }
        String result="";
        StringBuilder  resultBuilder = new StringBuilder(result);
        //I used StringBuilder to improve speed of concatenating Strings
        int temp;
        while (number!=0) {
            if (number >= 1000) {
                temp = number / 1000;
                for (int i = 0; i < temp; i++)
                    resultBuilder.append("M");
                number = number - (temp * 1000);
            }
            if (number >= 500) {
                if (number >= 900) {
                    resultBuilder.append("CM");
                    number = number - 900;
                } else {
                    temp = number / 500;
                    if (temp > 3)
                        for (int i = 0; i < temp; i++)
                            resultBuilder.append("D");
                    number = number - (temp * 500);
                }
            }
            if (number >= 100) {
                temp = number / 100;
                if (temp == 4) {
                    resultBuilder.append("CD");
                } else {
                    for (int i = 0; i < temp; i++)
                        resultBuilder.append("C");
                }
                number = number - (temp * 100);
            }
            if (number >= 50) {
                if (number >= 90) {
                    resultBuilder.append("XC");
                    number = number - 90;
                } else {
                    temp = number / 50;
                    for (int i = 0; i < temp; i++)
                        resultBuilder.append("L");
                    number = number - (temp * 50);
                }
            }
            if (number >= 10) {
                temp = number / 10;
                if (temp == 4) {
                    resultBuilder.append("XL");
                } else {
                    for (int i = 0; i < temp; i++)
                        resultBuilder.append("X");
                }
                number = number - (temp * 10);

            }
            if (number >= 5) {
                if (number == 9) {
                    resultBuilder.append("IX");
                    number = number - 9;
                } else {
                    temp = number / 5;
                    for (int i = 0; i < temp; i++)
                        resultBuilder.append("V");
                    number = number - (temp * 5);
                }
            }
            if (number >= 1) {
                temp = number / 1;
                if (temp == 4) {
                    resultBuilder.append("IV");
                } else {
                    for (int i = 0; i < temp; i++)
                        resultBuilder.append("I");
                }
                number = number - temp;
            }
        }
        result=resultBuilder.toString();
        return result;
    }
}
