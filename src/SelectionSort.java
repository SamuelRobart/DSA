import java.util.Arrays;

public class SelectionSort {


    public static void main(String [] args){


        int[] arr = { 20,19,18,17,16,15,14,13,12,11,10};

        SelectionSort s1 = new SelectionSort();

        s1.ascSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void ascSort(int[] arr){
        int k= 0,temp =0;
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]>=arr[j]){

                     temp = arr[i];
                     arr[i] =arr[j];
                     arr[j] = temp;

                }
            }
        }
    }
}
