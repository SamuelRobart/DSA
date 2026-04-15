public class DoublyLinkedList {
    Node head;
    Node tail;

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int val){
            data = val;
            next = null;
            prev=null;
        }

    }

    DoublyLinkedList(){
        head = null;
        tail = null;

    }


    public void insertAtBeg(int val){
        Node newNode = new Node(val);



        newNode.next = head;

        if(head == null){
            tail = newNode;
        }else{
            head.prev = newNode;
        }

        head = newNode;
    }

    public void insertAtPos(int pos,int val){
        Node newNode = new Node(val);
        Node temp = head;

        if(head == null | pos == 0){
            insertAtBeg(val);
        }else{
            for(int i =1;i<pos;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev=temp;


            if(temp == tail){
                tail = newNode;
            }else{
                temp.next.prev = newNode;
            }

            temp.next = newNode;
        }
    }

    public void deleteAtPos(int pos){

        Node temp= head;
        Node prev = null;
       if(head == null){
           throw new IndexOutOfBoundsException("List is Empty");
       }

       if(pos == 0){
           head= head.next;

           if(head == null){
               tail = null;
           }else{
               head.prev = null;
           }

           return;
       }

       for(int i = 1;i<=pos;i++){
           prev = temp;
           temp = temp.next;

           if(temp == null)
               throw new IndexOutOfBoundsException(" List is Empty ");
       }

       prev.next = temp.next;

       if(temp.next == null){
           tail = prev;

       }else{
           temp.next.prev = prev;
       }


    }

    public void displayRev(){

        if(head == null)
            System.out.println("List is Empty");

        Node temp= tail;

            while(temp != null){
                System.out.println(temp.data);
                temp = temp.prev;

            }
    }

    public void display(){

        Node temp= head;
        if(head == null){
            System.out.println("List is Empty");
        }else{
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
