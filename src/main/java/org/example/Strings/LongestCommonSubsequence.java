package org.example.Strings;
//Write a program to find the greatest common subsequence (LCS) in two strings.
// LCS is the maximum sequence of characters that is a subsequence of both strings.
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String str1 = "ABCBDAB";
        String str2 = "BDCAB";

        String lcs = findLCS(str1, str2);

        System.out.println("Maximum sequence of characters " + lcs);
    }

    public static String findLCS(String str1, String str2) {
        return findLCSRecursive(str1, str2, str1.length() - 1, str2.length() - 1);
    }

    public static String findLCSRecursive(String str1, String str2, int m, int n) {
        if (m < 0 || n < 0) {
            return "";
        }

        if (str1.charAt(m) == str2.charAt(n)) {
            return findLCSRecursive(str1, str2, m - 1, n - 1) + str1.charAt(m);
        } else {
            String lcs1 = findLCSRecursive(str1, str2, m - 1, n);
            String lcs2 = findLCSRecursive(str1, str2, m, n - 1);
            return (lcs1.length() > lcs2.length()) ? lcs1 : lcs2;
        }
    }
}