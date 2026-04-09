package Strings;
// ConvertLowerCaseToUpperCase
// ConvertToUpperCaseToUpperCase
public class ToggleCase {

    public static void main(String[] args) {

        String str ="convert to lowercase to uppercase";
        String str1 = "CONVERT TO UPPERCASE TO LOWERCASE";

        System.out.println(covertLowerCaseToUpperCase(str));
        System.out.println(convertUpperCaseToLowerCase(str1));
    }

    public static String covertLowerCaseToUpperCase(String str){

        StringBuilder res = new StringBuilder();

        for(int i =0;i<str.length();i++){

           char ch =str.charAt(i);

           if(ch >= 'a' && ch <='z'){
               res.append((char)(ch &'_'));
//               res.append((char)(ch- 'a' + 'A'));
           }else{
               res.append(ch);
           }
        }


        return res.toString();
    }


    public static String convertUpperCaseToLowerCase(String str){

        StringBuilder res = new StringBuilder();

        for(int  i =0;i<str.length();i++){

            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                res.append((char) (ch |' '));
//              res.append((char) (ch - 'A' +'a'));
            }else{
                res.append(ch);
            }
        }

        return res.toString();
    }
}
