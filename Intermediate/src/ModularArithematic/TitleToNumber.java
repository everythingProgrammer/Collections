package ModularArithematic;

public class TitleToNumber {


    public static int titleToNumber(String A) {
        long sum = 0;
        for(int i = 0 ; i<A.length(); i++){

            sum = sum +  (A.charAt(i) - 'A'+1 )* (int) Math.pow(26,A.length()-i-1) ;
        }
        return (int)sum;
    }

    public static void main(String[] args) {
        System.out.println( titleToNumber("AZ"));
    }
}
