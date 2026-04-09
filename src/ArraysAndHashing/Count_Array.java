package ArraysAndHashing;


//Given a binary array arr[] of size n, which is sorted in non-increasing order, count the number of 1's in it.
//
//Examples:
//
//Input: arr[] = [1, 1, 0, 0, 0, 0, 0]
//Output: 2
//Explanation: Count of 1's in the given array is 2.
//
//Input: arr[] = [1, 1, 1, 1, 1, 1, 1]
//Output: 7
//
//Input: arr[] = [0, 0, 0, 0, 0, 0, 0]
//Output: 0

public class Count_Array {

    public static void main(String[] args){


        int [] arr = {5, 1, 5, 4, 7, 5, 9};
        int target = 5;
        System.out.println(count(arr,target));

    }

    public static int count(int [] arr ,int target){
        int count = 0;

        for(int i =0 ;i<arr.length;i++){

            if(arr[i] == target){
                count++;
            }
        }

        return count;

    }
}
