package Strings;

public class ValidPalindrome {

    public static void main(String[] args) {
        String str="tab a cat";

        System.out.println(isValid(str.toLowerCase()));
    }

    public static boolean isValid(String str){

        int left = 0;
        int right = str.length()-1;

        while(left < right){

           while(left < right && !Character.isLetterOrDigit(str.charAt(left)))
               left++;

           while(left < right && !Character.isLetterOrDigit(str.charAt(right)))
               right--;

           if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){
               return false;
           }

            left++;
            right--;
        }

        return true;
    }


}
