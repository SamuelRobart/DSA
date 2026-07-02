package LinkedList;

public class ReOrderList {

    class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
            next =null;
        }
    }

    Node head;

    ReOrderList(){}


    public static void main(String[] args) {

        ReOrderList r1 = new ReOrderList();

        r1.add(10);
        r1.add(20);
        r1.add(30);
        r1.add(40);
        r1.add(50);
        r1.add(60);
        r1.add(70);
        r1.add(80);
        r1.add(90);

        r1.display();

        r1.reOrderList();

        System.out.println(" After Reorder ");

        r1.display();

    }
    public void add(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp =head;

        while(temp.next != null) {

            temp = temp.next;

        }
            temp.next  = newNode;
    }


    public void reOrderList(){

        if(head == null || head.next == null){
            return;
        }

        Node slow = head;
        Node fast = head;


        while(fast.next != null && fast.next.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }

        Node preMid = slow.next;
        slow.next = null;

        Node prev = null;

        while(preMid != null){

            Node current = preMid.next;
            preMid.next = prev;
            prev = preMid;
            preMid = current;
        }


        Node first = head;
        Node secondHalf = prev;

        while(secondHalf != null){

           Node temp1 = first.next;
           Node temp2 = secondHalf.next;

           first.next = secondHalf;
           secondHalf.next = temp1;

           first = temp1;
           secondHalf = temp2;
        }
    }

    public void display(){
        Node temp = head;

        while(temp != null){

            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
}
