package BitManipulations;


//Given an integer A. Unset B bits from the right of A in binary

public class UnsetBbits {

    public static  Long solve(Long A, int B) {


        Long num = 1L<<(B );
//        System.out.println(num-1);
        return A& ~(num-1);

    }

    public static void main(String[] args) {
        System.out.println(solve(93L , 4 ));
    }


}
