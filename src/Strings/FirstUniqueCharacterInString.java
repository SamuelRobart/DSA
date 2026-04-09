package Strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

    public static void main(String[] args) {

        String str = "pprogramming";

        System.out.println(firstUniqueCharacterInString(str));
        System.out.println(OPTfirstUniqueCharacterInString(str));

    }

    //Sam Logic
    public static int firstUniqueCharacterInString(String str){

        Map<Character,Integer> map = new HashMap<>();

        int len = str.length();
        int i=0;

        while(i<len){

            char ch = str.charAt(i);
            if(!map.containsKey(ch)){

                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }

            i++;
        }

        for(i=0;i<len;i++){

            if(map.get(str.charAt(i)) == 1){
                return i;
            }
        }



        return -1;
    }

    //Optmise Version
    public static int OPTfirstUniqueCharacterInString(String str){

        int [] freq = new int [26];

        for(int i =0;i<str.length();i++){

            freq[str.charAt(i) - 'a']++;
        }

        for(int i=0;i<str.length();i++){

            if(freq[str.charAt(i) - 'a'] == 1){
                return i;
            }
        }

        return -1;
    }
}
