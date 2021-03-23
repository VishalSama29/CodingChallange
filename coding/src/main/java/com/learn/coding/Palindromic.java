package com.learn.coding;

public class Palindromic {

    public static void main(String[] args) {

        String str = "lajfahfffffffffffffffafhq";
        System.out.println("length of given string is "+ str.length());

        System.out.println(findLongestPalindrome(str));

    }


    public static String findLongestPalindrome(String inputString) {
        if (inputString == null || inputString.length() >= 1000)
            return inputString;

        int length = inputString.length();
        int maxLength = 1;

        boolean[][] booleans = new boolean[length][length];

        String longestPalindromicString = null;
        for (int l = 0; l < inputString.length(); l++) {
            for (int i = 0; i < length - l; i++) {
                int j = i + l;
                if (inputString.charAt(i) == inputString.charAt(j) && (j - i <= 2 || booleans[i + 1][j - 1])) {
                    booleans[i][j] = true;

                    if (j - i + 1 > maxLength) {
                        maxLength = j - i + 1;
                        longestPalindromicString = inputString.substring(i, j + 1);
                    }
                }
            }
        }

        return longestPalindromicString;
    }
}

