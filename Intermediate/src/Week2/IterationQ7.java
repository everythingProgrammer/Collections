package Week2;

public class IterationQ7 {
    public static void main(String[] args) {
        int N = 4;
        for(int k = 1; k<=N ; k++) {
            int count = 0;
            System.out.print("For N="+k+"  ");
            for (int i = 0; i < (1 << k); i++) {
                int j = i;
                while (j > 0) {
//                    System.out.println("i="+i+"  j="+j);
                    count++;
                    j--;
                }
            }
            System.out.println("iterations = " + count);
        }
    }
}
