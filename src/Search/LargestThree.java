package Search;

import java.util.Arrays;

public class LargestThree {

    public static void main(String[] args){

        int [] arr = {10,20,4,200,202,204};

        System.out.println(Arrays.toString(largestThree(arr)));


    }

    public static int[] largestThree(int [] arr){

        int len = arr.length;

        for(int i =0 ; i<len;i++){
            int temp =0;

            for(int j = i+1;j<len;j++){

                if(arr[i]> arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }


        return new int []{arr[len-1],arr[len-2],arr[len-3]};
    }
}
