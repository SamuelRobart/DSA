package LinkedList;

public class RemoveNthFromEnd {
    ListNode head;

    class ListNode{

        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            next = null;
        }
    }


    RemoveNthFromEnd(){ }



    public static void main(String[] args) {

        RemoveNthFromEnd l1 = new RemoveNthFromEnd();

        l1.insertAt(10);
        l1.insertAt(20);
        l1.insertAt(25);
        l1.insertAt(45);;
        l1.insertAt(56);
        l1.insertAt(57);
        l1.insertAt(100);
        l1.insertAt(200);
        l1.insertAt(250);
        l1.insertAt(456);;
        l1.insertAt(560);
        l1.insertAt(574);

        l1.displ();

        l1.removeNthFromEnd(l1.head,8);
        System.out.println(" After Remove");
        l1.displ();


    }

    public void insertAt(int data){

        ListNode newNode = new ListNode(data);

        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void displ(){
        ListNode temp = head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n ){

        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode fast = temp;
        ListNode slow = temp;

        for(int i =0 ;i<=n;i++){

            fast = fast.next;
        }

        while(fast != null){

            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return temp.next;

    }
}
