import java.util.Arrays;

public class Sort {


    public static void main(String[] args) {
         int [] data = {9,3,4,1};


        mergeSort(data, 0, data.length - 1);

         System.out.println(Arrays.toString(data));
    }

    public static void mergeSort(int [] data , int start , int end){

        int mid = (start + end )/2;

        if(start < end){
            mergeSort(data,start,mid);
            mergeSort(data,mid+1,end);
            merge(data,start,mid,end);
        }
    }

    public static void merge(int [] data,int start,int mid,int end){

        int temp [] = new int[end - start+1];
        int k = 0;
        int i =start;
        int j = mid +1;

        //Both Left and Right
        while(i<=mid && j<=end){

            if(data [i] <= data[j]){
                temp[k++]=data[i++];
            }else{
                temp[k++]= data[j++];
            }
        }

        while(i<=mid){
            temp[k++] = data[i++];
        }

        while(j<=end){
            temp[k++] = data[j++];
        }

        for(i = start ; i<=end; i++){
            data[i] = temp[i - start];
        }


    }
}
