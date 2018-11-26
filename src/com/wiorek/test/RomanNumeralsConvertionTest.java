package com.wiorek.test;
import com.wiorek.src.RomanNumeralsConvertion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RomanNumeralsConvertionTest {

    @Test
    public void convertFiveToRoman() {
        assertEquals("V", RomanNumeralsConvertion.convertIntToRoman(5));
    }
    @Test
    public void convertNineToRoman(){
        assertEquals("IX", RomanNumeralsConvertion.convertIntToRoman(9));
    }
    @Test
    public void convertFourtyToRoman(){
        assertEquals("XL", RomanNumeralsConvertion.convertIntToRoman(40));
    }
    @Test
    public void convertNinetyToRoman(){
        assertEquals("XC", RomanNumeralsConvertion.convertIntToRoman(90));
    }
    @Test(expected = IllegalArgumentException.class)
    public void convertFourThousandToRoman(){
        RomanNumeralsConvertion.convertIntToRoman(4000);
    }
    @Test(expected = IllegalArgumentException.class)
    public void convertValueLessThanZero(){
        RomanNumeralsConvertion.convertIntToRoman(-2);
    }
    @Test
    public void convertNineHundredToRoman(){
        assertEquals("CM", RomanNumeralsConvertion.convertIntToRoman(900));
    }
    @Test
    public void convertFourHunderToRoman(){
        assertEquals("CD", RomanNumeralsConvertion.convertIntToRoman(400));
    }
}
