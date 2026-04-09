package Strings;

public class FindLength {

    public static void main(String[] args) {

        String str = "FindLength";

        System.out.println(findLength(str));
    }

    public static int findLength(String str){

        int count =0;

        try{
            while(true){
                str.charAt(count);
                count++;
            }
        }catch (Exception e){

        }

        return count;
    }
}
