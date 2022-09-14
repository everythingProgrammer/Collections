package LinkedList;

import java.util.ArrayList;

public class DesignLinkedList {
  class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
 }

    public ListNode solve(ArrayList<ArrayList<Integer>> A) {
                ListNode head=null ;
        int size = 0;
        for(int i = 0 ;  i<A.size() ; i++){

            ArrayList<Integer> nums  = A.get(i);
            int first = nums.get(0);
            int second = nums.get(1);
            int third = nums.get(2);

            if(first == 0){
                head = appendHead(null, second);
                size++;
            }else if(first == 1){
                appendLast(head,second);
                size++;
            }else if(first == 2){
                if(third <= size) {
                    head = addAtIndex(second, third, head);
                    size++;
                }
            }else if ( first == 3){
                if(second<size){
                    head = deleteAtIndex(second,head);
                    size--;
                }
            }
        }
        return  head;
    }
        public ListNode appendHead(ListNode head,int val){
        ListNode newHead = new ListNode(val);
        newHead.next = head;
        return newHead;
    }
    public void appendLast(ListNode head  , int val){
        ListNode newEnd = new ListNode(val);

        if(head == null){
            head = newEnd;
            return ;
        }

//        newEnd.next = null;
        ListNode temp = head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next=newEnd;
    }

    public ListNode addAtIndex(int val  , int index, ListNode head){

        int in = 0;
        ListNode temp = head;
        if(index == 0){
            ListNode newHead = new ListNode(val);
            newHead.next = head;
            return newHead;
        }
        for(in = 1 ; in<= index-1 ; in++){
            temp = temp.next;
        }
        ListNode newData = new ListNode(val);
        newData.next = temp.next;
        temp.next = newData;
        return head;

    }

    public ListNode deleteAtIndex(   int index , ListNode head){
        ListNode temp = head;
        if(index == 0){
            head = head.next;
            return head;
        }
        for(int i = 1; i<= index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
