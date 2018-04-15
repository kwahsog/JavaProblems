package leetcode;

/** Implement strStr().
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * URL: https://leetcode.com/problems/implement-strstr/
 * @author Alex
 *
 */
public class Solution28LC {

    public static void main (String args[]) {

        System.out.println(implementStrstr("hello","ll")); //2
        System.out.println(implementStrstr("mississippi","pi")); //9
    }

    //simple for loop calculating substring at each index.
    public static int implementStrstr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i < haystack.length() + 1 - needle.length(); i++) {
            //System.out.println(haystack.substring(i, i+needle.length()));
            if (haystack.substring(i, i+needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
