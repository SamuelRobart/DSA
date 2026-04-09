package ArraysAndHashing;


// Best Time to Buy and Sell Stock


//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        int[] arr = {7,1,5,3,6,4};

        System.out.println(maxProfit(arr));

        System.out.println(OptMaxProfit(arr));

    }


    // Sam Logic
    public static int maxProfit(int [] arr){

        int max =0;

        for(int i =0;i<arr.length;i++){
            int sum =0;
            for (int j = i+1;j<arr.length;j++){

                sum = arr[j] - arr[i];

                max = Math.max(max , sum);
            }
        }

        if(max <0 )
            return 0;

        return max;
    }


    //Optmise Logic

    public static int OptMaxProfit(int[] arr){

        int max = 0;
        int current = 0;

        int min  = arr[0];

        for(int i = 1;i<arr.length;i++){

            if( min > arr[i]){
                min = arr[i];
            }else{

                current = arr[i] - min;

                max = Math.max(current, max);
            }
        }

        if( max < 0){

            return 0;
        }

        return max;
    }
}
