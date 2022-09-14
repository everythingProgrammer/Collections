package Sorting;

public class Rotate1 {
    public static void rotate(int arr[], int n)
    {
        //Rotate full then rotate with position


        for(int i = 0 ; i<(arr.length/2) ; i++){
            int temp = arr[arr.length -i-1];
            arr[n-1-i]  = arr[i];
            arr[i] = temp;
        }

        // Rotate leaving 1 place

        for(int i = 1; i<= (arr.length/2) ; i++){
            int temp = arr[n -i];
            arr[n-i] = arr[i];
            arr[i] = temp;
        }
        for(int a:arr){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        rotate(arr,3);
    }
}
