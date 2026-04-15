import java.util.*;


public class Anagram {

    public static void main(String[] args) {

        String str1 = "samuel";
        String str2 = "leumas";
        System.out.println(isAnagram(str1 ,str2));
    }



    public static boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            int[ ]freq = new int[26];
            for(int i=0;i<s.length();i++){

                freq[s.charAt(i) - 'a']++;
                freq[t.charAt(i) - 'a']--;

            }

            for(int count : freq){

                if(count != 0){
                    return false;
                }
            }

            return true;
        }

}