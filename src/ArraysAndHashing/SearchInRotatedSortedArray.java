package ArraysAndHashing;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {

        int [] arr = {4,5,6,7,0,1,2,3};
        int target = 0;

        System.out.println(searchInRotatedSortedArray(arr,target));

    }

    public static int searchInRotatedSortedArray(int [] arr,int target){

        int left =0;
        int right= arr.length-1;

        while(left < right){

            int mid = left + (right - left)/2;

            if(arr[mid] == target){

                return mid;
            }

            if(arr[left] <= arr[mid]){

                if(arr[left] <= target && target < arr[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{

                if(arr[right] >= target && arr[mid] < target){

                    left = mid+1;
                }else {
                    right = mid - 1;
                }
            }
        }


        return -1;
    }
}
