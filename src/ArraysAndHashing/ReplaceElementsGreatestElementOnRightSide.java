package ArraysAndHashing;

import java.util.Arrays;

// Replace Elements With Greatest Element On Right Side

// You are given an array arr,
// replace every element in that array with the greatest element among the elements to its right,
// and replace the last element with -1.

public class ReplaceElementsGreatestElementOnRightSide {

    public static void main(String[] args) {
        int [] arr = {2,4,5,3,1,2};

        System.out.println(Arrays.toString(replaceElementsGreatestElementOnRightSide(arr)));
    }

    public static int[] replaceElementsGreatestElementOnRightSide(int[] arr){

        int[] res = new int[arr.length];
        int right = arr.length-1;
        int j = right-1;
        int max = arr[right];

        while(right > 0){

            max = Math.max(arr[right] ,max);
            res[j--] = max;
            right--;
        }

        res[arr.length-1] = -1;

        return res;
    }
}
