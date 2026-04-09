package Strings;

public class FindLengthOfLastWord {

    public static void main(String[] args) {

        String str = " a        ";

        System.out.println(findLengthOfLastWord(str));
    }

    public static int findLengthOfLastWord(String str){

        int right = str.length()-1;
        int count =0;

        while(right >= 0 ){

            if( str.charAt(right) != ' '){
                count++;
            }

            if(count >0 && str.charAt(right) == ' '){
                return count;
            }

            right --;
        }

        return 0;
    }
}
