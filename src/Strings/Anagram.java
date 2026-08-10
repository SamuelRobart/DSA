package Strings;


//optimise also -> hashmap


import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {


        String str1 = "!samam";
        String str2 = "masam!";

        System.out.println(valid(str1,str2));
    }

    public static boolean isAnagram(String s, String t) {


        if(s.length() != t.length() || s.isEmpty())
            return false;

        int[] freq = new int [26];
        for(int i=0;i<s.length();i++){

            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int j : freq) {

            if (j != 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean valid(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();


        for (int i=0;i<s.length();i++){

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            map.put(c1,map.getOrDefault(c1,0)+1);
            map.put(c2,map.getOrDefault(c2,0)-1);
        }

        for(int count : map.values()){
            if(count != 0)
                return false;
        }

        return true;
    }
}
