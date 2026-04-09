package Search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Repeating {

    public static void main(String[] arg){

        int[] arr = {10, 5, 3, 4, 3, 5, 6,6,6};

        System.out.println(duplicate(arr));

    }

    public static Set<Integer> duplicate(int[] arr){

        Set<Integer> list = new HashSet<>();
        int len = arr.length;

        for(int i= 0;i<len;i++){

            for(int j=i+1;j<len;j++){

                if(arr[i] == arr[j]){
                    list.add(arr[j]);
                }
            }
        }

        return  list;
    }
}
