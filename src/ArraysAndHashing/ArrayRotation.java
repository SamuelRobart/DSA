package ArraysAndHashing;

import java.util.Arrays;

public class ArrayRotation {

    public static void main(String [] args){

        int[] arr = {87,90,56,34,12,45};
        int k =3;

        System.out.println(Arrays.toString(letfRotation(arr)));
        System.out.println(Arrays.toString(kRotation(arr,k)));
    }

    public static int[] letfRotation(int [] arr){
        int first = arr[0];
        int len = arr.length;
        for(int i =0;i<len-1;i++){
            arr[i] = arr[i+1];
        }
        arr[len-1] = first;
        return arr ;
    }
    public static int[] rightRotation(int [] arr){
        int len = arr.length;
        int first = arr[len-1];
        for(int i =len-1;i>0;i--){
            arr[i] = arr[i-1];

        }
        arr[0] = first;
        return arr ;
    }
    public static int[] kRotation(int[] arr,int k){
        int len = arr.length-1;
        for(int i=0;i<k;i++){
            int first =arr[0];
            for(int j=0;j<len;j++){
                arr[j] = arr[j+1];
            }
            arr[len] = first;
        }
        return arr;
    }
}
