package Strings;

import java.util.HashMap;
import java.util.Map;

public class FindFrequency {

    public static void main(String[] args) {

        String str = "Programming";

        Map<Character,Integer> map = findFrequency(str);

        System.out.println(map);
    }

    public static Map<Character,Integer> findFrequency(String str){

        Map<Character,Integer> res = new HashMap<>();

        int len = str.length();

        int i=0;

        while(i<len){

            char ch =str.charAt(i);

            if(res.containsKey(ch)){
                res.put(ch,res.get(ch)+1);
            }else{
                res.put(ch,1);
            }

            i++;
        }

        return res;
    }
}
