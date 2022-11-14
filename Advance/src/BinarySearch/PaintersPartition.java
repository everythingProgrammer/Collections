package BinarySearch;

import java.util.ArrayList;

public class PaintersPartition {

    public static int paint(int A, int B, ArrayList<Integer> C) {

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0  ; i<C.size(); i++){
            if(C.get(i)>max){
                max = C.get(i);
            }
            sum = sum+C.get(i);
        }
        int l = max;
        int r = sum;

        int mid = 0;
        long ans = 0;
        while(l<=r){
            mid = (l+r)/2;
            //  here mid =  l + ((r-l)/2); will also work just fine ..

            if(check(C,A,mid)){
                ans = mid ;

                r = mid-1;
            }else{

                l = mid+1;
            }

        }

    return   (int) (( (ans%10000003) * (B%10000003))%10000003);
//    return (int) (  (ans%10000003) *(B%10000003))%10000003;
    }



    public static boolean check(ArrayList<Integer> C , int A , int mid){

        int current = 0;
        int painters_assigned = 1;
        for(int i = 0 ; i<C.size(); i++){

            if(current + C.get(i) <= mid){
                current += C.get(i);
            }else{
                painters_assigned++;
                current = C.get(i);
                if(painters_assigned > A){
                    return false;
                }
            }
        }
        return  true;
    }


    public static void main(String[] args) {


        ArrayList<Integer> C = new ArrayList<>();
//        C.add(185);
//        C.add(186);
//        C.add(938);
//        C.add(558);
//        C.add(655);
//        C.add(461);
//        C.add(441 );
//        C.add( 234);
//        C.add( 902);
//        C.add(681 );

        C.add(1000000);
        C.add(1000000);
//        System.out.println(paint(3,10,C));
        System.out.println(paint(1,1000000,C));

    }

}
