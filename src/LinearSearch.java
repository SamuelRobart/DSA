public class LinearSearch {

    public static int yind(int[] arr,int target){

        for(int i=0;i<arr.length;i++){

            if(arr[i] == target){
                return i;
            }
        }


        return -1;
    }

    public static boolean kontains(int[] arr,int target){

        for(int i=0;i<arr.length;i++){

            if(arr[i] == target){
                return true;
            }
        }


        return false;
    }

    public static int sind(String str,char target){


        for(int i=0;i<str.length();i++){

            if(str.charAt(i) == target ){
                return i;
            }
        }

        return -1;
    }

    public static int[] sindArr(int [][] twoArr,int target){

        for(int i=0;i< twoArr.length;i++){

            for(int j=0;j< twoArr[i].length;j++){

                if(twoArr[i][j] == target){
                    return new int[] {i,j};
                }
            }
        }

        return new int[] {-1,-1};
    }


}
