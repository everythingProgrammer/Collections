package LinkedList;

public class LinkedListCycleDetectionPoint {

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                break;
            }
        }
        ListNode startAgain = head;

        while (startAgain != slow) {
            slow = slow.next;
            startAgain = startAgain.next;
        }


        return startAgain;
    }
}
