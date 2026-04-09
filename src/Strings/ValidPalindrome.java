package Strings;

public class ValidPalindrome {

    public static void main(String[] args) {
        String str="abbda";

        System.out.println(validString(str.toLowerCase()));
    }

    public static boolean validString( String str){

        if(str == null)
            return false;

        int left = 0, right = str.length()-1;

        while(left < right){

            while(left < right && !Character.isLetterOrDigit(str.charAt(left)))
                left++;

            while(left < right && !Character.isLetterOrDigit(str.charAt(right)))
                right--;

            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right)))
                return false;

            left ++;
            right --;
        }

        return true;
    }
}
