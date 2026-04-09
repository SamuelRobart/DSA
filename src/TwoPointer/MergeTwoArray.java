package TwoPointer;

import java.util.Arrays;

public class MergeTwoArray {

    public static void main(String[] args){

        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};


        System.out.println(Arrays.toString(mergeSort(arr1,arr2)));

    }

    public static int[] mergeSort(int[] arr1, int[] arr2){

        int len1 = arr1.length;
        int len2 = arr2.length;

        int len = len1 + len2;




        int [] res = new int[len];
        int i=0,j=0;

        int k=0;

        while(i<len1 && j<len2){

            if(arr1[i] < arr2[j]){
                if(arr1[i] != 0){
                    res[k++] = arr1[i++];
                }else{
                    i++;
                }

            }else {
                if(arr2[j] != 0){
                    res[k++] = arr2[j++];
                }else{
                    j++;
                }
            }
        }

        while(i<len1){
            if(arr1[i] != 0){
                res[k++] = arr1[i++];
            }else{
                i++;
            }
        }

        while(j<len2){
            if(arr2[j] != 0){
                res[k++] = arr2[j++];
            }else{
                j++;
            }
        }





        return Arrays.copyOf(res,k);
    }
}
