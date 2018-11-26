package com.wiorek.src;

public class RomanNumeralsExtendedConvertion {
    private static String convertIntToRoman(int number) throws IllegalArgumentException {
        /*
        https://en.wikipedia.org/wiki/Roman_numerals
        Characters "I, X, C, M" can be max 3 next to each other, so we can't write 4000 as MMMMM;
         */
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("Argument must be between 1 and 3999");
        }
        String result = "";
        StringBuilder resultBuilder = new StringBuilder(result);
        //Added two Arrays for String and int representation of Roman basic elements
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] romanNumeralsValue = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        /* for loop iterate through int array and checking if it's higher than Roman basic element, then adding String representation of number to variable result via StringBuilder
        */
        for (int i = 0; i < romanNumeralsValue.length; i++) {
            int currentNumber = number / romanNumeralsValue[i];
            if (currentNumber == 0) {
                continue;
            }
            for (int j = 0; j < currentNumber; j++) {
                resultBuilder.append(romanNumerals[i]);
            }
            number = number % romanNumeralsValue[i];
        }
        result = resultBuilder.toString();
        return result;
    }
    /*
this method checking given value, and return false if is not String with number, and return true when String has number as value.
 */
    private static boolean isNumber(String testedValue) {
        try {
            int intVal = Integer.parseInt(testedValue);
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
            return false;
        }
        return true;

    }

/*
This method receive any argument, and convert it to int.
If argument is type which is instance of Number class then convert it to int type.
If argument is String this method checking if it's number, and if not throws exceptiom, if argument is String with number method parsing String to int.
Else if argument it's other type(other than double, float, long, short, byte, int, String) method also throws exception.
 */
    public static String convert(Object value) throws IllegalArgumentException {
        int number;
        if (value instanceof Number){
            number=((Number) value).intValue();
        }else if (value instanceof String) {
            String numberString = (String) value;
            if (!isNumber(numberString)) {
                throw new IllegalArgumentException("Value must be written as a number");
            }
            number = Integer.parseInt(numberString);
        } else {
            throw new IllegalArgumentException("Value must be written as a number");
        }
        return convertIntToRoman(number);
    }

}