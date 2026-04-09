package Strings;

public class FindDuplicateCharacters {

    public static void main(String[] args) {

        String str ="Pprogramming";

        System.out.println(findDuplicateCharacters(str.toLowerCase()));
    }

    public static String findDuplicateCharacters(String str){

        int [] freq = new int [26];

        StringBuilder res = new StringBuilder();

        for(int i =0;i<str.length();i++){
            freq[str.charAt(i) - 'a']++;
        }

        for(int i=0;i<str.length();i++){

            if(freq[str.charAt(i) - 'a'] >1){
                res.append(str.charAt(i));
                freq[str.charAt(i) - 'a'] =0;
            }
        }

        return res.toString();
    }
}
