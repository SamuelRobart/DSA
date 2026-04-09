package LinkedList;


public class LinkedList {

    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();

        l1.inserAt(87);
        l1.inserAt(98);
        l1.inserAt(875);
        l1.inserAt(198);
        l1.inserAt(877);
        l1.inserAt(9348);
        l1.display();

        System.out.println(" After rev");

        l1.rev();
    }

    class Node{

        int data;
        Node next;

        Node(int val){
            data = val;
            next = null;
        }
    }

    Node head;


    LinkedList(){head = null;}


    public void inserAt(int val){

        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void display(){

        Node temp = head;

        while(temp !=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void rev(){

        Node current = head;
        Node prev = null;
        Node next =null;

        if(head == null){
            System.out.println(" List is Empty");
        }else{

            while(current != null){


            }
        }


    }


}
