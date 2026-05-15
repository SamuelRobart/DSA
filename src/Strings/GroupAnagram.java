package Strings;

import com.sun.tools.javac.Main;

import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {

        String [] str = {"eat","tea","tan","ate","nat","bat"};



        List<List<String>> list = groupAnagram(str);


        System.out.println(list);

    }


    public static List<List<String>> groupAnagram(String[] str){

        Map<String, List<String>> map = new HashMap<>();

        for(String word : str){

            char[] ch  = word.toCharArray();

            Arrays.sort(ch);

            String key = new String(ch);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
