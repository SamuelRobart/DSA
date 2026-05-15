package TwoPointer;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int [] arr = {7,9,8,3,2,9,7,8};

        System.out.println(containerMostWater(arr));

    }

    public static int containerMostWater(int[] arr){

        int left =0;
        int right = arr.length-1;
        int maxArea =0;

        while(left < right){

            int height = Math.min(arr[left],arr[right]);

            int width = right -left;

            int area = height * width;

            maxArea = Math.max(maxArea,area);

            if(arr[left] < arr[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxArea;
    }


}
