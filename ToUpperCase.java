package org.practice7;

public class ToUpperCase {
    public static String UpperCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                result += (char) (str.charAt(i) - 32);
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }

    //testcase for single lower character
    public static boolean tc1SingleLowerCharacter() {
        String expected = "A";
        String input = "a";
        if (UpperCase(input).equals(expected)) {
            return true;
        }
        return false;
    }

    //testcase for string of lower characters
    public static boolean tc2LowerCharacterOfString() {
        String expected = "WORLD";
        String input = "world";
        if (UpperCase(input).equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    //testcase for single upper character
    public static boolean tc3SingleUpperCharacter() {
        String expected = "A";
        String input = "A";
        if (UpperCase(input).equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //testcase for combination of lower and upper character
    public static boolean tc4CombinationOfLowerAndUpperCharacter() {
        String input = "HelloWorld";
        String expected = "HELLOWORLD";
        if (UpperCase(input).equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //test case for combination of lower,upper,special,Digits character
    public static boolean tc5StringHavingUpperLowerSpecialCharcters() {
        String input = "ABcd@123";
        String expected = "ABCD@123";
        if (UpperCase(input).equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    //test case for null
    public static boolean tc6StringHavingNull() {
        String input = null;
        String expected = null;
        if (UpperCase(input).equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        System.out.println(tc1SingleLowerCharacter());
        System.out.println(tc2LowerCharacterOfString());
        System.out.println(tc3SingleUpperCharacter());
        System.out.println(tc4CombinationOfLowerAndUpperCharacter());
        System.out.println(tc5StringHavingUpperLowerSpecialCharcters());
        System.out.println(tc6StringHavingNull());
    }
}
