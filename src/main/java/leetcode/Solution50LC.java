package leetcode;

/** LeetCode Problem 50. Pow(x, n)
 * Implement pow(x, n), which calculates x raised to the power n (xn).
 * URL: https://leetcode.com/problems/powx-n/
 * @author Alex
 *
 */

public class Solution50LC {

    public static void main(String[] args) {
        System.out.println(myPow(2,2));
        System.out.println(myPow(2,10));
        System.out.println(myPow(2,-2));
        System.out.println(myPow(0.00001,2147483647));

    }

    public static double myPow(double x, int n) {

        return Math.pow(x,n);

        /* This code large works apart from edge cases.
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            x = 1/x;
            n = -n;
        }

        int counter = 1;
        double temp = x;
        while (counter < n) {
            temp = temp*x;
            counter++;
        }
        return temp;
        */
    }
}
