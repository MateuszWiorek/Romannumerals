package com.wiorek.test;

import com.wiorek.src.RomanNumeralsExtendedConvertion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsExtendedConvertionTest {

    //testing negative cases
    @Test (expected = IllegalArgumentException.class)
    public void convertFiveThousandToRoman(){
        RomanNumeralsExtendedConvertion.convert(5000);
    }


    @Test (expected = IllegalArgumentException.class)
    public void convertNumberUnderZero(){
        RomanNumeralsExtendedConvertion.convert(-2);
    }
    // tests converting numbers like 4, 9 to check corectness of method
    @Test
    public void convertNinetyNineToRoman(){
        assertEquals("XCIX", RomanNumeralsExtendedConvertion.convert(99));
    }

    @Test
    public void convertFourToRoman(){
        assertEquals("IV", RomanNumeralsExtendedConvertion.convert(4));
    }

    //testing "normal" cases
    @Test
    public void convertFourtyNineToRoman(){
        assertEquals("XLIX", RomanNumeralsExtendedConvertion.convert(49));
    }

    @Test
    public void convertStringToRoman(){
        assertEquals("V", RomanNumeralsExtendedConvertion.convert("5"));
    }

    @Test
    public void convertDoubleToROman(){
        assertEquals("III", RomanNumeralsExtendedConvertion.convert(3.25D));
    }

    @Test
    public void convertFloatToRoman(){
        assertEquals("V", RomanNumeralsExtendedConvertion.convert(5.15F));
    }

    @Test
    public void convertOneToRoman(){
        assertEquals("I", RomanNumeralsExtendedConvertion.convert(1));
    }

    @Test
    public void convertMaxNumberToRoman(){
        assertEquals("MMMCMXCIX", RomanNumeralsExtendedConvertion.convert(3999));

    }
}
