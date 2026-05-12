package LinkedList;

public class MergeSortedLists {


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list1Head = list1;
        ListNode list2Head = list2;

        ListNode tail = null;
        ListNode mergedHead = null;
        while(list1Head != null && list2Head != null){

            // compare which one is smaller
            if(list1Head.val<list2Head.val){
                if(tail == null){
                    tail = list1Head;
                    mergedHead = tail;
                    list1Head = list1Head.next;
                    tail = tail.next;
                }else {
                    tail.next = list1Head;
                    list1Head = list1Head.next;
                    tail = tail.next;
                }
            }else if(list1Head.val>=list2Head.val){

                if(tail == null){
                    tail = list2Head;
                    mergedHead = tail;
                    list2Head = list2Head.next;
                    tail = tail.next;
                }
                else{
                    tail.next = list2Head;
                    list2Head = list2Head.next;
                    tail = tail.next;
                }
            }

        }
        if(list1Head != null){
            tail.next = list2Head;
        } else {
            tail.next = list1Head;
        }

        return mergedHead;

    }
}
