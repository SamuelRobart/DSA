package Matrix;

import java.util.Arrays;

public class MatrixSort {


    public static void main(String[] args){


        int [][] matrix = {
                {0, 20, 30, 40},
                {15, 25, 35, 45},
                {24, 29, 37,56},
                {32, 33, 39, 50},
                {0, 20, 30, 40},
        };

        int row = matrix.length;
        int col = matrix[0].length;

        System.out.println(row);
        System.out.println(col);
        System.out.println(row * col);

        int[] temp = new int[row*col];
        int k =0;

        for(int i =0 ;i<row;i++){

            for(int j =0;j<col;j++){
                temp[k++] = matrix[i][j];
            }
        }

        Arrays.sort(temp);

        System.out.println(Arrays.toString(temp));




    }



}
