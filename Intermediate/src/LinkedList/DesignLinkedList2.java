//package LinkedList;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class DesignLinkedList2 {
//
//    public static ListNode solve(ArrayList<ArrayList<Integer>> A) {
//        ListNode head=null ;
//        ListNode Temp = new ListNode(3);
//        int size = 0;
//        for(int i = 0 ;  i<A.size() ; i++){
//
//            ArrayList<Integer> nums  = A.get(i);
//            int first = nums.get(0);
//            int second = nums.get(1);
//            int third = nums.get(2);
//
//            if(first == 0){
//                head = ListNode.appendHead(null, second);
//                size++;
//            }else if(first == 1){
//                head.appendLast(head,second);
//                size++;
//            }else if(first == 2){
//                if(third <= size) {
//                    head = head.addAtIndex(second, third, head);
//                }
//            }else if ( third == 3){
//                head = head.deleteAtIndex(second,head);
//            }
//        }
//        return  head;
//
//    }
//
//
//    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//        int n = 7;
//        Scanner sr = new Scanner(System.in);
//        for(int i = 0 ; i<n ; i++){
//            ArrayList<Integer> an = new ArrayList<>();
//            for(int j = 0;j<3; j++){
//                an.add(sr.nextInt());
//            }
//            ans.add(an);
//        }
//        solve(ans);
//    }
//
//
//}
