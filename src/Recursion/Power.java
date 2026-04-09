package Recursion;

public class Power {

    public static void main(String[] args) {

        int n =2;
        int pow =6;

        System.out.println(power(n,pow));
    }

//    public static int power(int n,int pow){
//
//        if(pow==0){
//            return 1;
//        }
//
//        return power(n,pow-1)*n;
//    }

    public static int power(int n,int pow){

        if( pow == 0){
            return 1;
        }

        int half = power(n,pow/2);

        if(pow %2 == 0){
            return half * half;
        }else{
            return n* half * half;
        }
    }
}
