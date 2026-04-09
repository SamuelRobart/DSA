package SlidingWindow;

//     Longest Substring Without Repeating Characters

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        String str = "zxyzxyz";

        System.out.println(longSubString(str));
    }

    public static int longSubString(String str){

        Set<Character> s = new HashSet<>();

        int left =0 ;
        int max =0;

        for(int i =0;i<str.length();i++){

            while( s.contains(str.charAt(i))){
                s.remove(str.charAt(left));
                left++;
            }

            s.add(str.charAt(i));

            max =Math.max(max , i-left+1);
        }

        return max;
    }
}
