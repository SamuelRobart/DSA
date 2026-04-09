package Strings;

public class RemoveSpaces {

    public static void main(String[] args) {

        String str = "remove spaces in the string";

        System.out.println(removeSpaces(str));
    }

    public static String removeSpaces(String str){

        StringBuilder res = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch != ' '){
                res.append(ch);
            }
        }


        return res.toString();
    }
}
