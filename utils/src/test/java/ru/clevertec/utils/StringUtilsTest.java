package ru.clevertec.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        String correctPositiveIntStr = "3";
        String correctNegativeIntStr = "-3";
        String correctZeroIntStr = "0";
        String correctPositiveDoubleStr = "3.58";
        String correctNegativeDoubleStr = "-3.58";
        String correctDoubleStr = "0.00000000001";
        String correctZeroDoubleStr = "0.00";
        String str = "abc";
        String wrongNumber = "3f";
        String wrongDelimiter = "3,3";
        assertTrue(StringUtils.isPositiveNumber(correctPositiveIntStr));
        assertFalse(StringUtils.isPositiveNumber(correctNegativeIntStr));
        assertFalse(StringUtils.isPositiveNumber(correctZeroIntStr));
        assertTrue(StringUtils.isPositiveNumber(correctPositiveDoubleStr));
        assertFalse(StringUtils.isPositiveNumber(correctNegativeDoubleStr));
        assertTrue(StringUtils.isPositiveNumber(correctDoubleStr));
        assertFalse(StringUtils.isPositiveNumber(correctZeroDoubleStr));
        assertFalse(StringUtils.isPositiveNumber(wrongNumber));
        assertFalse(StringUtils.isPositiveNumber(wrongDelimiter));
        assertFalse(StringUtils.isPositiveNumber(str));
    }
}