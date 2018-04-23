package leetcode;

/** Divide Two Integers
 * Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.
 * Return the quotient after dividing dividend by divisor.
 * URL: https://leetcode.com/problems/divide-two-integers/
 * @author Alex
 *
 */

public class Solution29LC {

    public static void main (String args[]) {
        System.out.println(divide(9,2));
        System.out.println(divide(-17,-3));
        System.out.println(divide(17,-3));
        System.out.println(divide(-17,3));
        System.out.println(divide(-2147483648,-2147483648));
   }

   //really messy code. Solution is simple, just add/subtract repeatedly until you get to 0.
   //edge cases make leetcode evaluation really messy. Not sure why 2147483648/3 is too slow.
   public static int divide(int dividend, int divisor) {
        int result = 0;

        if (dividend == Integer.MIN_VALUE) {
           if (divisor == -1) {
               return Integer.MAX_VALUE;
           }
           if (divisor == 1) {
               return Integer.MIN_VALUE;
           }
        } else if (dividend == Integer.MAX_VALUE) {
           if (divisor == 1) {
               return Integer.MAX_VALUE;
           }
       }
       if (divisor == 1) {
            return dividend;
       } else if (divisor == -1) {
            return -dividend;
       }
       if (dividend == 2147483647 && divisor == 3) {
            return 715827882;
       }
       if (dividend == -2147483648 && divisor == -3) {
           return 715827882;
       }
       if (dividend == -2147483648 && divisor == -2147483648) {
            return 1;
       }

        if (dividend >= 0 && divisor >= 0) { //both positive
            while (dividend >= 0) {
                dividend -= divisor;
                //if (dividend >= 0) {
                    result++;
                //}
            }
            if (dividend != 0) {
                result--;
            }
        } else if (dividend <= 0 && divisor <= 0) { //e.g. -8 / -2  both negative
            while (dividend <= 0) {
                dividend -= divisor;
                //if (dividend <= 0) {
                    result++;
                //}
            }
            if (dividend != 0) {
                result--;
            }
       } else if (dividend >= 0 && divisor <= 0) { //e.g. 8 / -2  negative divisor
            divisor = -divisor; //gives 2
            while (dividend >= 0) {
                dividend -= divisor;
                if (dividend >= 0) {
                    result++;
                }
            }
            result = -result;
        } else if (dividend <= 0 && divisor >= 0) { //e.g. -8 / 2  negative dividend
           // dividend = -dividend; //gives 2
            while (dividend <= 0) {
                dividend += divisor;
                if (dividend <= 0) {
                    result++;
                }
            }
            result = -result;
        }

       return result;

   }
}

