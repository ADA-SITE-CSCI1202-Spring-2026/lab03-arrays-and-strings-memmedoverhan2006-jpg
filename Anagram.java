package week05;

import java.util.Arrays;

public class Anagram {
    public static boolean areAnagrams(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
    
    public static void main(String[] args) {
        String str1 = "baku";
        String str2 = "ukab";
        System.out.println(areAnagrams(str1, str2));
    }
}