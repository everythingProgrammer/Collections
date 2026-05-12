package Recursion;

public class RecursiveArraySearchingLinearFindFirst {


    public int findFirst( int []arr , int index , int target){

        if(index > arr.length-1){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }
        return findFirst(arr,index+1, target);

    }




}
