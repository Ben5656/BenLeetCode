package src;

import java.util.Arrays;

public class MainBuilder {
    public static void main(String args[]){
        /** Two Sum Test */
        TwoSum twoSum = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println("Two Sum Test - valid output is [0,1]:");
        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));

        /** Message Spacer */
        System.out.println("");

        /** Reverse Integer Test */
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println("Reverse Integer Test - valid output is 321:");
        System.out.println(reverseInteger.reverse(123));

        /** Message Spacer */
        System.out.println("");
        
        /** Palindrome Number Test */
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println("Palindrome Number Test - valid output is false:");
        System.out.println(palindromeNumber.isPalindrome(123));

        /** Message Spacer */
        System.out.println("");

        /** Roman To Integer Test */
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println("Roman To Integer Test - valid output is 3:");
        System.out.println(romanToInteger.romanToInt("III"));

        /** Message Spacer */
        System.out.println("");

        /** Longest Substring Without Repeating Characters Test */
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println("Longest Substring Without Repeating Characters - valid output is 3:");
        System.out.println(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));

        /** Message Spacer */
        System.out.println("");

        /** Longest Common Prefix Test */
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix - valid output is \"fl\":");
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));

    }
}
