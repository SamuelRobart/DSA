package TwoPointer;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int [] arr = {10,34,32,56,78,90,4,56,4,32,78,5};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(removeDuplicate(arr)));

    }

    public static int[] removeDuplicate(int [] arr){

        if(arr.length == 0)
            return new int[0];

        int [] res = new int[arr.length];
        int k =0;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                res[k++] = arr[i];
            }
        }

        res[k++] = arr[arr.length-1];


        return Arrays.copyOf(res,k);
    }
}
