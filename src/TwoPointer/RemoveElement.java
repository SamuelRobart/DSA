package TwoPointer;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int[] arr = {2,6,7,3,5,6,4,8,9,1,4,9};
        int val =4;

        System.out.println(Arrays.toString(removeElement(arr,val)));

    }

    public static int[] removeElement(int[] arr,int val){

        int len = arr.length;
        int i=0,k=0;


        while(i<len){
            if(arr[i] != val){
                arr[k++] = arr[i];
            }
            i++;
        }
        return Arrays.copyOf(arr,k);
    }
}
