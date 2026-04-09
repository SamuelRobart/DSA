package Strings;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "pprogramming";

        System.out.println(findFirstNonRepeatingCharacter(str));
    }

    public static char findFirstNonRepeatingCharacter(String str){

        Map<Character,Integer> map = new HashMap<>();

        int len  = str.length();
        int i=0;
        while(i<len){

            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }

            i++;
        }

        for(i=0;i<len;i++){

            if(map.get(str.charAt(i)) ==1){
                return str.charAt(i);
            }
        }

        return ' ';
    }
}
