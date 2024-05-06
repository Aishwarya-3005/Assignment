package org.practice7;

public class Uppercase {
    public static void toUpperCase(char str) {
        if (isLower(str) && isLetter(str)) {
            System.out.println((char) (str - 32));
        }
    }
    public static boolean isLetter(char str) {
        if ((str >= 65 && str <= 90) || (str >= 97 && str <= 127)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isLower(char str) {
        if (str >= 97 && str <= 127) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        toUpperCase('a');
    }
}

