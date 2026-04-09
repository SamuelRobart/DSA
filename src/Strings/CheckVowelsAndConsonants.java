package Strings;

import java.util.Arrays;

public class CheckVowelsAndConsonants {

    public static void main(String[] args) {

        String str = "Sam ";


        int [] res = checkVowelsAndConsants(str);

        System.out.println(" Vowels : " + res[0]);
        System.out.println(" Consonants : " + res[1]);



    }

    public static int[] checkVowelsAndConsants(String str){
        if(str == null)
            return new int[]{0,0};

        int vow =0,con =0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(Character.isLetter(ch)){

                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vow ++;
                }else {
                    con++;
                }
            }
        }

        return new int[]{vow,con};
    }
}
