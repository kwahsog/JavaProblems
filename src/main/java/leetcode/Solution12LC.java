package leetcode;

/** 12. Integer to Roman
 * Convert integer to Roman numerals.
 *
 * URL: https://leetcode.com/problems/integer-to-roman/
 * @author Alex
 *
 */

public class Solution12LC {

    //make arrays of all possible 'special' incrementing values and build roman numerals string
    public static String intToRoman(int num) {

        int[] valArray = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strArray = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        /* Roman numerals:
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
        */
        if (num <= 0) {
            return "";
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < valArray.length; i++) {
            while (num - valArray[i] >= 0) {
                output.append(strArray[i]);
                num = num - valArray[i];
            }
        }
        return output.toString();
    }

    public static void main (String args[]) {

        System.out.println(intToRoman(3));  //III
        System.out.println(intToRoman(4)); //IV
        System.out.println(intToRoman(9)); //IX
        System.out.println(intToRoman(58)); //LVIII
        System.out.println(intToRoman(1994)); //MCMXCIV
    }
}
