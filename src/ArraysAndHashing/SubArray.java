package ArraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class SubArray {

//    [1,2,2,9,3,6,5,6,4]  into [[1,2],[2,9],[3,6],[5,6,4]]
    public static void main(String[] args){

        int [] arr = {1,2,2,9,3,6,5,6,4};

        System.out.println(convertSubArray(arr));

    }

    public static List<List<Integer>> convertSubArray(int [] arr){

        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<arr.length;i+=2){

            List<Integer> sub = new ArrayList<>();

            sub.add(arr[i]);

            if(i+1 < arr.length){
                sub.add(arr[i+1]);
            }

            res.add(sub);
        }


        return  res;
    }
}
