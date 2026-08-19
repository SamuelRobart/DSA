package ArraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Unsorted Array
public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 18;

        System.out.println(Arrays.toString(twoSum(arr,target)));
        System.out.println(Arrays.toString(optTwoSum(arr,target)));

    }

    public static int[] twoSum(int []arr , int target) {

        for(int i=0;i< arr.length;i++){

            for(int j=i+1;j< arr.length;j++){

                if(arr[i] + arr[j] == target){

                    return new int []{i,j};
                }
            }
        }

        return new int [] {};
    }

    private static int[] optTwoSum(int [] arr, int target){

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            int complement = target - arr[i];

            if(map.containsKey(complement)){

                return new int[]{map.get(complement),i};
            }

            map.put(arr[i],i);
        }
        return  new int []{-1,-1};
    }
}
