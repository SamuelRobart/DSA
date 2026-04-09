package Search;

public class LinearSearch {


    public static void main(String[] args){

        Lsearch lsearch = new Lsearch();

        int [] arr  ={10, 20, 4};
        int target = 200;

        System.out.println(lsearch.search(arr,target));

    }


}

 class Lsearch{
    public static int search(int[] arr,int target){

        int len = arr.length;

        for(int i =0;i<len;i++){

            if(arr[i] == target){

                return i;
            }
        }

        return -1;
    }
}
