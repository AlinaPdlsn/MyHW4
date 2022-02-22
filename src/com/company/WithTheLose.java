package com.company;

public class WithTheLose {
    public static void main(String[] args) {
        int intValue = 214_748_369;
        float floatValue = intValue;
        System.out.println(floatValue);

        int intValue2 = Integer.MAX_VALUE;
        float floatValue2 = intValue2;
        System.out.println(intValue2);
    }

}
