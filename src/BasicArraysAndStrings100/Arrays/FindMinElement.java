package BasicArraysAndStrings100.Arrays;

public class FindMinElement {

    public static void main(String[] args) {

        int [] arr = {2,5,4,3,6863,547,247,57,55,-20};

        System.out.println(findMin(arr));
    }

    // most Optimise

    private static int findMin(int [] arr){

        if(arr == null || arr.length == 0){
            return 0;
        }

        int min = 0;

        for(int i=1;i<arr.length;i++){

            if(min > arr[i]){
                min = arr[i];
            }
        }

        return min;
    }
}
