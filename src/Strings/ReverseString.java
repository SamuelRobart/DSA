package Strings;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Samuel";

        System.out.println(rev(str));
    }

    public static String rev (String str){


        if(str.isEmpty())
            return null;

        int left =0;
        int right = str.length()-1;

        char[] ch = str.toCharArray();

        while(left < right){

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left ++;
            right--;
        }




        return new String(ch);
    }
}
