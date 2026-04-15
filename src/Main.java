import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter first string: ");
//        String s = input.nextLine();
//
//        System.out.print("Enter second string: ");
//        String t = input.nextLine();
//
//        Anagram solution = new Anagram();
//
//        boolean result = solution.isAnagram(s.toLowerCase(), t.toLowerCase());
//
//        if(result) {
//            System.out.println(s + " and " + t + " are anagrams.");
//        } else {
//            System.out.println(s + " and " + t + " are not anagrams.");
//        }


        // Linked List

//        LinkedList l1 = new LinkedList();
//
//        l1.insertAtBeginning(99);
//        l1.insertAtBeginning(59);
//        l1.insertAtBeginning(98);
//
//        l1.insertAtPos(1,998);
//
//        l1.display();
//
//        l1.rev();
//        System.out.println("After Rev");
//        l1.display();

        // Doubly Linked List

//        DoublyLinkedList l1 = new DoublyLinkedList();
//
//        l1.insertAtBeg(99);
//        l1.insertAtBeg(59);
//        l1.insertAtBeg(98);
//        l1.insertAtPos(2,999999);
//
//
//
//        l1.display();
//
//        System.out.println("After Dis");
////        l1.displayRev();
//
//        l1.deleteAtPos(2);
//
//        l1.display();


        /// Queue

//        Queuew q = new Queuew();
//
//        q.enqueue(10);
//        q.enqueue(20);
//
//        q.enqueue(30);
//        q.enqueue(98);
//        q.enqueue(30);
//        q.enqueue(98);
//
//        q.display();
//
//        q.dequeue();
//
//        q.display();



        //   Linear Search

//        int[] arr = {1,2,3,4,5,6,7,8};
//        String str = "Hello Samuel";
//
//        int [][] twoArr ={
//                {1,8,9,100},
//                {78,67,45,99}
//        };
//
//
//
//        LinearSearch l1 = new LinearSearch();
//
//        int [] result = LinearSearch.sindArr(twoArr,90);
//
//        System.out.println(l1.yind(arr,7));
//        System.out.println(l1.kontains(arr,7));
//        System.out.println(l1.sind(str.toLowerCase(),'s'));
//        System.out.println(Arrays.toString(result));


//        Map<String,Integer> quantity = new HashMap<>();
//
//        quantity.put("Apple",10);
//        quantity.put("Orange",10);
//        quantity.put("papaya",10);
//        quantity.put("Guava",30);
//
//
//        for(String key: quantity.keySet()){
//            System.out.println(key + " -> " +quantity.get(key));
//        }


        // Binary Search

//        int[] arr = {11,12,13,14,15,16,17,18,19,20};
//        int[] arrDesc = { 20,19,18,17,16,15,14,13,12,11,10};
//        BinarySearch b1 = new BinarySearch();
//
//        System.out.println(BinarySearch.Search(arrDesc,15));


        //Selection Sort

//        int[] arr = { 20,19,18,17,16,15,14,13,12,11,10};
//
//        SelectionSort s1 = new SelectionSort();
//
//        s1.ascSort(arr);
//
//        System.out.println(Arrays.toString(arr));

        // BubbleSort
//        int[] arr = {1,8,9,100,78,67,45,99};
//
//        BubbleSort b1 = new BubbleSort();
//
//        b1.kort(arr);
//        System.out.println(Arrays.toString(arr));

        LCzigZag lc = new LCzigZag();

        String s = "PAYPALISHIRING";
        int numRows = 4;

        System.out.println(lc.convert(s,numRows));


    }
}