import java.util.Arrays;
import java.util.Scanner;

public class DynamicArray {

    static Scanner sc = new Scanner(System.in);
    static int size =0,pos=0;
    static int maxArrSize = 10;
    static int capacity = maxArrSize;
    static int[] arr = new int[maxArrSize];

    public static void main(String[] args){



        while(true){

            System.out.println(" \n\n *************************************************************");

            System.out.println(" 1 : Insert at Beginning " );
            System.out.println(" 2 : Insert at Position " );
            System.out.println(" 3 : Update the Number " );
            System.out.println(" 4 : Delete a Number " );
            System.out.println(" 5 : Display " );
            System.out.println(" 6 : Exit " );
            System.out.print(" \n\n Enter your choice : ");

            int choice = sc.nextInt();
            int val = 0;

            switch(choice){

                case 1 :    System.out.print("Enter your Number : ");
                            val = sc.nextInt();
                            insert(val);break;

                case 2 :    System.out.print("Enter the Postion : ");
                            pos = sc.nextInt();
                            System.out.print("Enter the Value : ");
                            val= sc.nextInt();
                            insertPos(pos,val);break;
              case 3 :    update(); break;
                case 4 :    delete();break;
                case 5 :    display(); break;
                case 6 :    System.exit(0);
                default:    System.out.println("Error on your Input");
            }
        }
    }

    public static void expand(){
        capacity *=2;
        arr = Arrays.copyOf(arr,capacity);
    }

    public static void insert(int val){
        if(size == capacity){
            expand();
        }
         arr[size++]= val;
    }

    public static void insertPos(int pos, int val){
        if(size == capacity){
            expand();
        }
        if(arr.length == 0){
            insert(val);
        }else{

            for(int i=size-1;i>=pos;i--){
                arr[i+1] = arr[i];
            }
            arr[pos]=val;
            size++;
        }
    }

    public static void update(){
        System.out.print("Enter the Postion : ");
        pos = sc.nextInt();
        System.out.print("Enter the Value : ");
        int val = sc.nextInt();

        arr[pos] = val;
    }

    public static void delete(){
        if(size == 0){
            System.out.println(" Array is Empty ");
        }else{
            System.out.print("Enter the Postion : ");
            pos = sc.nextInt();

            for(int i =pos;i<size;i++){
                arr[i] = arr[i+1];
            }
            size--;
        }
    }

    public static void display(){

        if(size == 0){
            System.out.println(" Array is Empty ");
        }else{

            System.out.print("\n  --->    ");
            for(int i=0;i<size;i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
