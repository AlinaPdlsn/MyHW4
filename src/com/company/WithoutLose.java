package com.company;

public class WithoutLose {

    public static void main(String[] args) {

        byte byteValue = 123;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        System.out.println(longValue);

        int intValue2 = 127;
        double doubleValue2 = intValue2;
        System.out.println( doubleValue2);

        short shortValue3 = 32_767;
        float floatValue3 = shortValue3;
        double doubleValue3 = floatValue3;
        System.out.println(doubleValue3);

        char charValue4 = 65_535;
        int intValue4 = charValue4;
        System.out.println(intValue4);
    }

}
