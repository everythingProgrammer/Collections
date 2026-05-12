package Recursion;

public class RecursiveArraySearchingLinearFindLast {

    // A couple of ways to do this problem  ,
    // 1 start the loop from the end
    // 2 start from begining and carry a lastIndex pointer
    // 3 most interesting start searching after the stack is fully built and going down
    public static int findLast(int arr[], int index , int target  ){
            if(index > arr.length-1){
                return -1;
            }

            int last = findLast(arr,index+1, target);

            return last!=-1?last:arr[index]== target?index:last;

    }
    public static void main(String args[]){
        int nums [] = {1 , 2, 3, 4, 5, 6, 7, 8, 9 ,1, 12 , 13, 132,121,131,11,1324,143,12,1,14, 15};
        System.out.println(findLast(nums,0, 1));
    }
}
