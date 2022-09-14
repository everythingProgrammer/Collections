//package LinkedList;
//
//public class ListNode {
//    class Node {
//        public int val;
//        public Node next;
//
//        Node(int val) {
//            this.val = val;
//            this.next = null;
//        }
//    }
//    Node head;
//    public  Node appendHead( ListNode head, int val){
//        ListNode newHead = new  ListNode(val);
//        newHead.next = head;
//        return newHead;
//    }
//    public   void appendLast( ListNode head  , int val){
//         ListNode newEnd = new  ListNode(val);
////        newEnd.next = null;
//         ListNode temp = head;
//        while(temp.next!=null){
//            temp= temp.next;
//        }
//        temp.next=newEnd;
//    }
//
//    public ListNode addAtIndex(int val  , int index,ListNode head){
//
//        int in = 0;
//        ListNode temp = head;
//        if(index == 0){
//            ListNode newHead = new ListNode(val);
//            newHead.next = head;
//            return newHead;
//        }
//        for(in = 1 ; in<= index-1 ; in++){
//            temp = temp.next;
//        }
//         ListNode newData = new  ListNode(val);
//        newData.next = temp.next;
//        temp.next = newData;
//        return head;
//
//    }
//
//    public  ListNode deleteAtIndex(int index ,  ListNode head){
//         ListNode temp = head;
//        if(index == 0){
//            head = head.next;
//            return head;
//        }
//        for(int i = 1; i<= index-1; i++){
//            temp = temp.next;
//        }
//        temp.next = temp.next.next;
//        return head;
//    }
//}
