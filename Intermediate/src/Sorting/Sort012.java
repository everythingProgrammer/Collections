package Sorting;

public class Sort012 {
    public static void sort012(int a[], int n)
    {
        int low = 0;
        int high = n-1;
        int mid = 0;

        while(low < high && mid<high){

            if(a[mid] == 0){
                int temp = 0;
                a[mid] = a[low];
                a[low] = temp;
                mid++;
                low++;
            }
            else if(a[mid]==1 ){

                mid++;

            }else if(a[mid] == 2 ){
                int temp = 2;
                a[mid] = a[high];
                a[high] = 2;
                high --;
            }


        }
          for(int num:a){
              System.out.print(num+" ");
          }


    }

    public static void main(String[] args) {
        int arr [] = {1,1,1,0,0,0,2,2,2,1,1,2};
        sort012(arr,arr.length);
    }
}
