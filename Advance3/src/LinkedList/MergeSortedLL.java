package LinkedList;

import java.util.ArrayList;

public class MergeSortedLL {

//    public ListNode mergeTwoLists(ListNode A, ListNode B) {
//        ListNode apointer = A;
//        ListNode bpointer = B;
//
//        ListNode H3 = apointer.val < bpointer.val? apointer:bpointer;
//        boolean aline = apointer.val<bpointer.val?true:false;
//        if(aline ){
//            apointer = apointer.next;
//        }else{
//            bpointer = bpointer.next;
//        }
//
//        ListNode head = H3;
//
//        if(apointer == null || bpointer == null){
//            H3.next =  apointer!= null? apointer : bpointer;
//        }
//
//        while(H3.next != null && apointer!=null && bpointer != null){
//            if(aline){
//                if(apointer.val>bpointer.val){
//                    H3.next = bpointer;
//                    bpointer = bpointer.next;
//                    H3 = H3.next;
//                }else{
//                    H3 = H3.next;
//                    apointer = apointer.next;
//
//                }
//                aline = !aline;
//            }else{
//                if(bpointer.val> apointer.val){
//                    H3.next = apointer;
//                    apointer = apointer.next;
//                    H3 = H3.next;
//
//                }else{
//                    H3 = H3.next;
//                    bpointer = bpointer.next;
//                }
//                aline = !aline;
//            }
//        }
//        if(bpointer == null && apointer != null){
//            H3.next = apointer;
//        }else if(apointer == null && bpointer!=null){
//            H3.next = bpointer;
//        }
//
//        return head;
//    }


    public static  ListNode mergeTwoLists(ListNode A, ListNode B) {

        ListNode H1 = A;
        ListNode H2 = B;
        ListNode H3 = null;
        ListNode tail = null;

        H3 = A.val < B.val? A:B;
        tail = H3;
        if(H1.val<H2.val){
            H1 = H1.next;
        }else{
            H2 = H2.next;
        }
        while(H1!=null && H2 != null){
            if(H1.val < H2.val){
                H3.next = H1;
                H3 = H3.next;
                H1 = H1.next;
            }else{
                H3.next = H2;
                H3 = H3.next;
                H2 = H2.next;
            }
        }
        if(H1!=null){
            H3.next = H1;
        }else if (H2!= null){
            H3.next = H2;
        }
        return tail;


    }

    public ListNode mergeTwoLists2(ListNode A, ListNode B) {
        ListNode H1 = A;
        ListNode H2 = B;
        ListNode H3 = null;
        if(A== null || B== null){
            return A!=null?A:B;
        }
        if(H1.val<H2.val){
            H3 = H1;
            H1 = H1.next;

        }else{
            H3 = H2;
            H2 = H2.next;
        }
        ListNode Head = H3;
        while(H2!=null && H1 != null){
            if(H1.val<H2.val){
                H3.next = H1;
                H1 = H1.next;
                H3 = H3.next;
            }else{
                H3.next = H2;
                H2 = H2.next;
                H3 = H3.next;
            }
        }
        if(H2!= null){
            H3.next = H2;
        } else if (H1!= null) {
            H3.next = H1;
        }
        return Head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        a.next = new ListNode(12);
        a.next.next = new ListNode (14);
        ListNode b = new ListNode(11);
        b.next = new ListNode(13);
        mergeTwoLists(a,b);
    }
}
