package Week2;

import java.util.Scanner;

public class RotationGame {




    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int nums[] = new int[n];
        for(int i = 0 ; i<n; i++){
            nums[i] = sr.nextInt();

        }
        int b = sr.nextInt();
        b = b%nums.length;
        //reverse whole array
        int i = 0 ;
        int j = nums.length - 1;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        // reverse front
        i= 0;
        j = b-1;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        i=b;
        j = nums.length-1;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        for(int a: nums){
            System.out.print(a+" ");
        }
    }
}
