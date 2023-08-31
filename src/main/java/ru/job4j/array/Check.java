package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean checkIndex = data[0];
        for (boolean node : data) {
            if (checkIndex != node) {
                return !result;
            }
        }
        return result;
    }
}
