package TwoPointer;

import java.util.Arrays;

public class SquaresOfSortArray {

    public static void main(String[] args) {

        int [] arr = {23,45,2,-5,78,21,-8,-3,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(squareSort(arr)));

    }
//  Sam's Logic
//    public static int[] squareSort(int [] arr){
//
//
//
//        for (int i =0;i<arr.length;i++){
//            arr[i] = arr[i] * arr[i];
//        }
//
//        Arrays.sort(arr);
//        return arr;
//    }


    public static int[] squareSort(int [] arr){

        int len = arr.length;
        int [] res = new int [len];

        int left = 0;
        int right = len-1;
        int k = len-1;

        while(left <= right){

            int leftSq = arr[left] * arr[left];
            int rightSq = arr[right] * arr[right];

            if(leftSq > rightSq){
                res[k--] = leftSq;
                left++;
            }else{
                res[k--] = rightSq;
                right--;
            }
        }
        return res;
    }
}
