package BasicArraysAndStrings100.Arrays;

public class CalculateArraySum {

    public static void main(String[] args) {

        int [] arr = {2,5,4,3,6863,15,547,247,57,55,-20};

        System.out.println(cal(arr));

        int sum = calSum(arr);
        System.out.println(sum);

        System.out.println(findAvg(arr , sum));

    }

    private static int cal(int[] arr){

        if(arr == null || arr.length == 0){
            return 0;
        }

        int sum = 0;

        for(int ar : arr){

            sum +=ar;
        }

        return sum;
    }

    private static int calSum(int[] arr){

        if(arr == null || arr.length == 0){
            return 0;
        }
        int left = 0;
        int right = arr.length-1;
        int sum = 0;

        while(left < right){

            sum += arr[left++] + arr[right--];

        }

        if(left == right){
            sum += arr[left];
        }
        return sum;
    }

    private static float findAvg( int[] arr , int sum){

        if(arr == null || arr.length == 0 || sum == 0){
            return 0;
        }

        return (float) sum / arr.length;
    }
}
