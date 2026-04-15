package ArraysAndHashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4};

        System.out.println(Arrays.toString(productOfArrayExceptSelf(arr)));

        System.out.println(Arrays.toString(OptProductOfArrayExceptSelf(arr)));

    }

    //Sam Logic
    public static int[] productOfArrayExceptSelf(int [] arr){



        int [] res =new int[arr.length];

        for(int i =0;i<arr.length;i++){
            int prod =1;
           for(int j =0;j<arr.length;j++){

               if(j!=i){
                   prod *= arr[j];
               }
           }

            res[i] = prod;
        }

        return res;
    }

    //Optimise Logic

    public static int [] OptProductOfArrayExceptSelf(int [] arr){

        int[] res = new int[arr.length];

        res[0] = arr[0];

        for(int i =1;i<arr.length;i++){

            res[i] = res[i-1] * arr[i-1];
        }

        int right =1;

        for (int i =arr.length-1;i>=0;i--){

            res[i] = res[i] * right;
            right  = right * arr[i];
        }

        return res;
    }
}
