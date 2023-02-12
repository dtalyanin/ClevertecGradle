package ru.clevertec.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        boolean positiveNumber = false;
        if (NumberUtils.isParsable(str)) {
            double number = Double.parseDouble(str);
            positiveNumber = number > 0;
        }
        return positiveNumber;
    }
}
