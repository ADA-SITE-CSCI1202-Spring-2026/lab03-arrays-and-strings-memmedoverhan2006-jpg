package week05;

import java.util.Arrays;

public class SortString {
    public static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    
    public static void main(String[] args) {
        String input = "Baku";
        System.out.println(sortString(input.toLowerCase())); 
    }
}