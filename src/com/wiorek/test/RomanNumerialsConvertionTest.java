package com.wiorek.test;
import com.wiorek.src.RomanNumerialsConvertion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RomanNumerialsConvertionTest {

    @Test
    public void convertFiveToRoman() {
        assertEquals("V", RomanNumerialsConvertion.convertIntToRoman(5));
    }
    @Test
    public void convertNineToRoman(){
        assertEquals("IX", RomanNumerialsConvertion.convertIntToRoman(9));
    }
    @Test
    public void convertFourtyToRoman(){
        assertEquals("XL", RomanNumerialsConvertion.convertIntToRoman(40));
    }
    @Test
    public void convertNinetyToRoman(){
        assertEquals("XC", RomanNumerialsConvertion.convertIntToRoman(90));
    }
    @Test(expected = IllegalArgumentException.class)
    public void convertFourThousandToRoman(){
        RomanNumerialsConvertion.convertIntToRoman(4000);
    }
    @Test(expected = IllegalArgumentException.class)
    public void convertValueLessThanZero(){
        RomanNumerialsConvertion.convertIntToRoman(-2);
    }
    @Test
    public void convertNineHundredToRoman(){
        assertEquals("CM", RomanNumerialsConvertion.convertIntToRoman(900));
    }
    @Test
    public void convertFourHunderToRoman(){
        assertEquals("CD", RomanNumerialsConvertion.convertIntToRoman(400));
    }
}
