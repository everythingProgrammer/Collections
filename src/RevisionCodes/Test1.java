package RevisionCodes;

public class Test1 {
    public static int MaximumIndex(int steps, int badIndex) {
        int s = 0;
        for (int i = 1; i <= steps; i++) {
            s += i;
            if (s == badIndex) {

                int sum_of_natural_nos = steps * (steps + 1) / 2;
                return sum_of_natural_nos -1 ;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int steps = 40;
        int badIndex = 10;
        System.out.println(MaximumIndex(steps, badIndex)); // Call the function and print the result.
    }
}
