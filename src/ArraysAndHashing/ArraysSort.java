package ArraysAndHashing;

import java.util.Arrays;

public class ArraysSort {

    public static void main(String[] args) {

        int [] [] arr = {
                {1,3,6},
                {2,1,8},
                {9,4,2}
        };

        int i = 0;

        int [] res = new int [arr.length * arr.length];

        for(int [] temp : arr){

            for(int val : temp){

                res[i++] = val;
            }
        }

        Arrays.sort(res);

        System.out.println(Arrays.toString(res));
    }
}
