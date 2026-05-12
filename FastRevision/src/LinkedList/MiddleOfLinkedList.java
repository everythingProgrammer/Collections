package LinkedList;

public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode slowpointer = head;
        ListNode fastPointer = head.next;


        while(fastPointer!=null && fastPointer.next !=null){
            slowpointer = slowpointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowpointer;
    }
}
