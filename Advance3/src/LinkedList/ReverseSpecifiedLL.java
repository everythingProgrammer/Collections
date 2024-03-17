package LinkedList;

public class ReverseSpecifiedLL {
    public ListNode reverseBetween(ListNode A, int B, int C) {

        ListNode prevNode = A;
        ListNode startNode = A;
        ListNode startBefore = null;
        int i = 1;
        while(i<B){
            i++;
            startBefore = prevNode;
            prevNode = prevNode.next;
            startNode = startNode.next;
        }

        ListNode curr = prevNode.next;
        ListNode forward = curr;
        while(i<C){
            forward = forward.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = forward;
        }
        if(startBefore!=null){
            startBefore .next = prevNode;
            startNode.next = curr;
            return A;
        }

            return prevNode;

    }


    public static ListNode reverseBetween2(ListNode A, int B, int C) {
        ListNode startPrev = null;
        ListNode start = A;
        ListNode end = A ;
        ListNode endNext = null;
        int i = 1 ;
        while(i<B){
            startPrev = start;
            start = start.next;
            i++;
        }
        end = start;
        endNext = end.next;
        while(i<C){
            end = end.next;
            endNext = end.next;
            i++;
        }

        /*
            startPrev == null means reverse from starting
         */
        if(startPrev == null){

            ListNode curr = start;
            ListNode prev = null;
            ListNode forward = start;
            i = B;
            while(i<=C){
                i++;
                forward = forward.next;
                curr.next = prev;
                prev = curr;
                curr = forward;
            }
            if (endNext != null) {
                // endNext != null means there is list after reveresedList , we need to attach  start.next = endNext then return end
                start.next = endNext;
            }
            return end;


        }else{

            ListNode curr = start;
            ListNode prev = null;
            ListNode forward = start;
            i = B ;
            while (i<=C){
                i++ ;
                forward = forward.next;
                curr.next = prev;
                prev = curr;
                curr= forward;
            }
            startPrev.next = end;
            start.next = endNext;
            return A;

        }

    }

/*
    By the Book Solution
 */
    /*
    public ListNode reverseBetween(ListNode A, int m, int n) {
        int i;
        ListNode node = A;
        ListNode prev = null;
        m--;
        n--;
        for (i = 0; i < m; i++) {
            prev = node;
            node = node.next;
        }
        if (prev != null)
            prev.next = reverseList(node, n - m + 1);
        else
            A = reverseList(node, n - m + 1);
        return A;
    }

    public ListNode reverseList(ListNode A, int count) {
        ListNode node, prev, temp, last;
        node = A;
        last = A;
        if (node == null)
            return null;
        prev = null;
        while (node != null && count > 0) {
            temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
            count--;
        }
        last.next = node;
        return prev;
    }

     */
}
