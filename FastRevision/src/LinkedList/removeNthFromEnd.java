package LinkedList;

public class removeNthFromEnd {


    public ListNode removeNthFromEnd(ListNode head , int n){

        ListNode nDistanceNode = head;

        for(int i = 1; i<=n; i++){
            nDistanceNode = nDistanceNode.next;
        }

        ListNode headTracker = head;
        ListNode prevHeadTracker = null;

        while(nDistanceNode!=null){
            nDistanceNode = nDistanceNode.next;
            prevHeadTracker = headTracker;
            headTracker = headTracker.next;
        }
        prevHeadTracker.next = headTracker.next;


        return head;
    }
}
