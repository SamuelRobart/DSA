package TwoPointer;

import java.util.Arrays;

public class first {

    public static void main(String [] args){

        int[] arr ={5,3,6,0,1,3,0,9,0};




        System.out.println(Arrays.toString(moveFront(arr)));
        System.out.println(Arrays.toString(moveEnd(arr)));

    }

    public static int[] moveFront(int[] arr){
        int index = 0;
        for(int i =0 ;i<arr.length;i++){

            if(arr[i]!=0){
                arr[index++] = arr[i];

            }
        }

        while(index< arr.length){
            arr[index++] = 0;
        }

        return arr;
    }

    public static int[] moveEnd(int[] arr){
        int index = arr.length-1;
        for(int i =arr.length-1 ;i>=0;i--){

            if(arr[i]!=0){
                arr[index--] = arr[i];

            }
        }

        while(0<=index){
            arr[index--] = 0;
        }

        return arr;
    }
}
