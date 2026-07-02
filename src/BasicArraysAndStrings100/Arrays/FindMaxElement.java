package BasicArraysAndStrings100.Arrays;

public class FindMaxElement {

    public static void main(String[] args) {

        int[]  arr = {8,5,4,3,4,5,8};

        System.out.println(findMax(arr));

        System.out.println(findMaxOpt(arr));

    }

    ///  Optimise - Two Pointer

    private static int findMax(int[] arr){

        int left = 0;
        int right = arr.length-1;
        int res = 0;

        while(left < right){

            while(left < right && arr[left] <= arr[right] ) left ++;

            while(left < right && arr[left] >= arr[right]) right --;

            if(arr[left] < arr[right]){
                res = arr[right];
            }else{
                res = arr[left];
            }
            left++;
            right--;
        }

        return res;
    }


    ///  Most Optimise version

    private static int findMaxOpt(int [] arr){

        if(arr == null || arr.length == 0){
            return 0;
        }

        int max = arr[0];

        for(int i =1;i<arr.length;i++){

            if(max < arr [i]){
                max = arr[i];
            }
        }

        return max;
    }


}
