package TwoPointer;

public class ValidPalindrome {


    public static void main(String[] args){

        String str = "Ma:La,yAlAm";

        System.out.println(isValidOrNot(str.toLowerCase()));
    }

    ///  SAM Method
//    public static boolean isValidOrNot(String str){
//
//        if(str == null || str.isEmpty()){
//            return false;
//        }
//
//        int i=0,j=str.length()-1;
//
//        while(i<j){
//            if(str.charAt(i) != str.charAt(j)){
//                return false;
//            }
//            i++;
//            j--;
//        }
//
//
//
//
//        return true;
//    }


//      ChatGpt Optimise Method

    public static boolean isValidOrNot(String str) {

        if(str == null){
            return false;
        }

        int i =0,j = str.length()-1;

        while(i<j){


            while(i<j && !Character.isLetterOrDigit(str.charAt(i)))
                i++;
            while(i<j && !Character.isLetterOrDigit(str.charAt(j)))
                j--;

            if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j)))
                return false;

            i++;
            j--;
        }


        return true;
    }

}
