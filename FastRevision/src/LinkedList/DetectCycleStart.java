package LinkedList;

public class DetectCycleStart {

    public ListNode detectCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
             if(slow == fast){
                 break;
             }
        }
        if(fast == null || fast.next == null){
            // no cycle found
            return null;
        }
        ListNode startAgain = head;
        while(startAgain != slow){
            startAgain = startAgain.next;
            slow = slow.next;
        }
        return startAgain;
    }
}
