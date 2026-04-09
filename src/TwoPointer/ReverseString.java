package TwoPointer;

public class ReverseString {

    public static void main(String[] args){

        String str = " SAmu,le";

        System.out.println("Reverse String : "+revString(str));
    }

    public static String revString(String str){

        if(str == null){
            return null;
        }

        int i=0,j=str.length()-1;
        char[] ch = str.toCharArray();

        while(i<j){
           char temp = ch[i];
           ch[i] = ch[j];
           ch[j] = temp;

           i++;
           j--;

        }

        return new String(ch);
    }
}
