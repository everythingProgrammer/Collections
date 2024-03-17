package LinkedList;

public class MiddleElement {


    public int solve(ListNode A) {

        ListNode fast = A;
        ListNode slow = A;
        while(fast != null && fast.next!=null ){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.val;

    }


}
