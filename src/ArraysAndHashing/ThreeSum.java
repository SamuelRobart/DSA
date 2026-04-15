package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

        int [] arr = {-4,-1,2,0,-1,1};

        List<List<Integer>> list = threeSum(arr);

        for(List<Integer> num : list){
            System.out.print(num);
        }

    }

    public static List<List<Integer>> threeSum(int [] arr){

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(arr);

        for(int i=0;i< arr.length-2;i++){

            int left = i+1;
            int right = arr.length-1;

            while(left < right){

                int sum = arr[i] + arr[left] + arr[right];

                if(sum == 0){

                    res.add(Arrays.asList(arr[i],arr[left],arr[right]));

                    while(i > 0 && arr[left] == arr[left +1]) left ++;
                    while(i > 0 && arr[right] == arr[right -1]) right--;

                    left ++;
                    right--;
                }else if(sum < 0){
                    left ++;
                }else{
                    right--;
                }
            }
        }

        return res;
    }
}
