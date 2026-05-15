package Stack;

import java.util.Arrays;
import java.util.Stack;

public class CarFleet {

    public static void main(String[] args) {

        int target = 12;
        int[] positon = {10,8,0,5,3};
        int [] speed = {2,4,1,1,3};

        System.out.println(fleet(target,positon,speed));

    }

    public static int fleet(int target, int [] position,int[] speed ){

        int n = position.length;
        Stack<Integer> stack = new Stack<>();

        int[][] cars = new int[n][2];

        for(int i=0;i<n;i++ ){

            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }


        Arrays.sort(cars,(a,b) -> b[0] - a[0]);

        int fleet =0;
        double prevTime = 0;

        for(int [] car : cars){

            double time = (double) (target - car[0])/ car[1];

            if(time > prevTime){

                fleet++;
                prevTime = time;
            }

        }

        return fleet;
    }
}
