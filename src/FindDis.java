import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDis {

    public static void main(String[] args){

        int [] nums = {4,3,2,7,8,2,3,1};


        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + findDisappearedNumbers(nums));
        System.out.println();
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        // List<Integer> nSort = new ArrayList<Integer>(Arrays.asList(nums));
        // Collections.sort(nSort);

        // List<Integer> nSort = new ArrayList<>(Arrays.asList(nums));

        // Collections.sort(nSort);


        int len = nums.length;

        // // if(len == 1){
        // //     return len;
        // // }

        // for(int i =0;i<len-1;i++){

        //     if(nums[i] == nums[i+1]){
        //         nSort.add(nums[i+1]);
        //     }
        // }

        int temp=0;
        int[] nArrSort = new int[len];
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){

                if(nums[i]>=nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                }
            }
            nArrSort[i] = nums[i];
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length-1; i++) {
            if (nArrSort[i] == nArrSort[i+1]) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
