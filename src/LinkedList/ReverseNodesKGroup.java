package LinkedList;

public class ReverseNodesKGroup {

    class Node {

        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head;

    ReverseNodesKGroup(){}


    public static void main(String[] args) {

        ReverseNodesKGroup r = new ReverseNodesKGroup();

        r.add(10);
        r.add(20);
        r.add(30);
        r.add(40);
        r.add(50);

        r.disp();

        r.reverse();

        System.out.println();
        r.disp();

    }

    public void add(int data){


        Node newNode = new Node(data);


        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null){

            temp = temp.next;
        }

        temp.next = newNode;
    }

    public Node reverseNodesKGroup(int k){

//        Node dummy = new Node(-1);
//        Node current = dummy;



        return head;
    }

    public void reverse(){

        Node current = head;
        Node prev = null;
        Node next = null;

        while(current != null){

            next  = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }

        head = prev;
    }

    public void disp(){

        Node temp = head;

        if(head == null){
            System.out.println("List is Empty");
        }

        while(temp != null){

            System.out.print(temp.data + "  -> ");

            temp = temp.next;
        }
    }
}
