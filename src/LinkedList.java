public class LinkedList {

    Node head;
    class Node{
        int data;
        Node next;

        Node (int val){
            data = val;
            next = null;
        }
    }

    LinkedList(){
        head = null;
    }



    public void insertAtBeginning(int val){

        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;

        }
    }

    public void insertAtPos(int pos,int val){
        Node newNode = new Node(val);
        Node temp =head;

        if(head == null | pos == 0){
            insertAtBeginning(val);
        }else{
            for(int i = 1;i<pos;i++){
                temp= temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void deleteAtPos(int pos){
        Node temp = head;

        if(head == null ){
            System.out.println(" List is Empty");
        }else{
            for(int i=1;i<pos;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("List Empty");
        }else{
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void rev(){
        Node current = head;
        Node prev = null;
        Node next = null;

        if(head == null){
            System.out.println("List Empty");
        }else{
            while(current != null){

                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            head = prev;
        }
    }
}
