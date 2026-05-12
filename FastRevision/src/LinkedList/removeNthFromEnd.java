package LinkedList;

public class removeNthFromEnd {


    public ListNode removeNthFromEnd(ListNode head , int n){

       ListNode dummy = new ListNode(-1);
       dummy.next = head;

       ListNode fast = dummy;
       ListNode slow = dummy;

       for(int i = 0 ; i<=n; i++){
           fast = fast.next;
       }
       while(fast!=null){
           fast = fast.next;
           slow = slow.next;

       }
       // delete target.
        slow.next = slow.next.next;

       return dummy.next;

    }
}
