package Strings;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    public static void main(String[] args) {

        String digits ="";

        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits){


        List<String> res = new LinkedList<>();

        Map<Character,String> map = new HashMap<>();

        int digit =0;
        while( digit < digits.length()){

            switch(digits.charAt(digit)){

                case '2' : map.put('2',"abc");
                    break;
                case '3' : map.put('3',"def");
                    break;
                case '4' : map.put('4',"ghi");
                    break;
                case '5' : map.put('5',"jkl");
                    break;
                case '6' : map.put('6',"mno");
                    break;
                case '7' : map.put('7',"pqrs");
                    break;
                case '8' : map.put('8',"tuv");
                    break;
                case '9' : map.put('9',"wxyz");
                    break;

            }

            digit++;
        }

        for(Map.Entry<Character,String> tmap : map.entrySet()){
            System.out.println(map.entrySet());
        }


        return res;
    }
}
