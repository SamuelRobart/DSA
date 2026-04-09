package ArraysAndHashing;

import java.util.Arrays;

public class KLargest {

    public static void main(String[] args){


        int [] arr = {1, 23, 12, 9, 30, 2, 50 ,11, 5, 12, 9, 44, 17, 2};
        int k = 3;
        System.out.println(Arrays.toString(KLarg(arr,k)));

    }

    public static int[] KLarg(int [] arr ,int k){

        int[] res = new int [k];
        int len = arr.length-1;

        Arrays.sort(arr);

        System.out.println(res.length);


        for(int i = 0;i<k;i++){
            res[i] = arr[len--];
        }

        return res ;

    }
}
