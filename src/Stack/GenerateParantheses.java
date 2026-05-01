package Stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {

    public static void main(String[] args) {

        int n=2;

        List <String> res = generateParantheses(n);

        for(String elem : res){
            System.out.println(elem);
        }

    }

    public static List<String> generateParantheses(int n){

        List<String> result = new ArrayList<>();

        int open =0,close =0;
        String curent="";

        backtrack(n,curent,open,close,result);

        return result;
    }

    public static void backtrack(int n,String current,int open,int close,List<String> result){

        if(current.length() == n*2){

            result.add(current);

            return;
        }

        if(open < n){

            backtrack(n,current+"(",open+1,close,result);
        }

        if(close < open){

            backtrack(n,current+")",open,close+1,result);
        }
    }
}
