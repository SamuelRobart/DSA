package LeetCode;

// Leetcode 247 and Neetcode 51

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {

    public static void main(String[] args){

        List<String> input = new ArrayList<>();
        input.add("hello");
        input.add("world");
        input.add("java");

        // Encode
        String encoded = EncodeAndDecodeStrings.Encode(input);
        System.out.println("Encoded String:");
        System.out.println(encoded);

        List<String> decoded = EncodeAndDecodeStrings.Decode(encoded);

        System.out.println("\nDecoded List:");
        for (String s : decoded) {
            System.out.println(s);
        }

    }

    public static String Encode(List<String> strs){

        StringBuilder build = new StringBuilder();

        for(String str :strs){
            build.append(str.length()).append("#").append(str);
        }



        return build.toString();
    }


    public static List<String> Decode(String str) {

        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {

            int j = i;

            // find '#'
            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));

            String word = str.substring(j + 1, j + 1 + length);

            result.add(word);

            i = j + 1 + length;
        }

        return result;
    }
}
