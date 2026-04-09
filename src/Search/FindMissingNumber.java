package Search;

import java.util.*;

public class FindMissingNumber {

    public static void main(String[] arg){

        int[] arr = {4, 2, 3, 5,7,9,17};

        System.out.println(Arrays.toString(missingNumber(arr)));

    }

    public static int[] missingNumber(int[] arr){


        int len  = arr.length;

        Arrays.sort(arr);

        int[] miss = new int[len];
        int min = arr[0];
        int max = arr[len-1];
        int j =0;
        int k=1;

        for(int i =0;i<len;i++){

            if(arr[i] != k){
                miss[j] = k;
                k++;
                j++;
            }
            k++;
        }


        return miss;
    }
}
