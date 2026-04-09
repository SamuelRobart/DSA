package Search;

public class LargestInArray {

    public static void main(String[] args){

        int [] arr = {10,20,4,200};

        System.out.println(largest(arr));


    }

    public static int largest(int[] arr){

        int len = arr.length;
        int largest =0;

        for(int i =0;i<len;i++){

            if(arr[i] > largest){
                largest = arr[i];
            }

        }

        return largest;
    }
}
