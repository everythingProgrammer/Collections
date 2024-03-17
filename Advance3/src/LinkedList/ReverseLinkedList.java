package LinkedList;

public class ReverseLinkedList {


    public static ListNode reverseList(ListNode A) {

        ListNode prev = null;
        ListNode curr = A;
        ListNode forward = A;

        while(curr!=null){
            forward = forward.next;
            curr.next = prev;
            prev = curr;
            curr = forward;


        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode nn = new ListNode(1);
        reverseList(nn);
    }

}
