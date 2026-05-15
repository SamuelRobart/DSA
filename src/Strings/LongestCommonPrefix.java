package Strings;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] str =  {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(str));

    }

    public static String longestCommonPrefix(String[] str){

       String res="";

       for(int i=0;i<str[0].length();i++){

           char ch = str[0].charAt(i);

           for(int  j=1;j< str.length;j++){

               if(i >= str[j].length() || ch != str[j].charAt(i)){
                   return res;
               }
           }

           res+=ch;
       }


       return res;
    }
}
