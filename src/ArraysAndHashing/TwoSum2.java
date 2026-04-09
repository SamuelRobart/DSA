package ArraysAndHashing;

import java.util.Arrays;

// Sorted Array
public class TwoSum2 {

    public static void main(String[] args) {

        int [] arr = {2,7,11,15};
        int target = 18;

        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    public static int[] twoSum(int [] arr, int target){

        int right = arr.length-1;
        int left = 0;

        while(left < right){

            int sum = arr[left] + arr[right];

            if(sum == target)
                return new int[]{left+1,right+1};

            if(sum < target){
                left++;
            }else if(sum > target){
                right--;
            }

        }

        return new int[]{};
    }
}
