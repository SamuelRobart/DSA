package TwoPointer;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int [] arr = {7,9,8,3,2,9,7,8};

        System.out.println(containerMostWater(arr));

    }

    public static int containerMostWater(int[] arr){

       int left = 0;
       int right = arr.length-1;
       int MaxArea = 0;

       while (left < right){

           int h = Math.min(arr[left],arr[right]);
           int width = right - left;
           int area =  h * width;

           MaxArea = Math.max(MaxArea,area);

           System.out.println(" Height ->  " +h +" Right  -> " +right + " left -> " +left +" Width -> " + width +"  Area -> "+ area +" MaxArea -> " +MaxArea +" ");


           if(arr[left] < arr[right]){
               left++;
           }else{
               right --;
           }

       }


        return MaxArea;
    }
}
