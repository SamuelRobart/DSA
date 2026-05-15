package Strings;

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "racecar";
        String t = "carraco";

        System.out.println(isValid(s,t));

    }

    public static boolean isValid(String s, String t){

        if(s == null || t== null){
            return false;
        }

        if(s.length() != t.length()){
            return false;
        }

        int [] freq = new int [26];

        for(int i =0;i<s.length();i++){

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
