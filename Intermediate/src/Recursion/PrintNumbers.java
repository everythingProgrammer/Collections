package Recursion;

public class PrintNumbers {


    public static void printNumbers(int n) {
        if(n == 0)
            return ;

        for(int i =n ; i>0; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        printNumbers(n-1);

        for(int i = 1; i<= n ; i++)
            System.out.print(i+" ");

        System.out.println();
    }

    public static void main(String args[]) {
        printNumbers(5);
    }
}
