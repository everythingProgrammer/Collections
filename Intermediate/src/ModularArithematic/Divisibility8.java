package ModularArithematic;

public class Divisibility8 {
    public static int solve(String A) {

        int num = 0;
        int size = A.length();
        if(size <4){
            num = Integer.parseInt( A  );
        }
        else{
            num = Integer.parseInt( A.substring(size-3) );
        }
        if(num%8 == 0){
            return 1;
        }else {
            return 0;
        }

    }


    public static void main(String[] args) {
        System.out.println(solve("1200"));
    }
}
