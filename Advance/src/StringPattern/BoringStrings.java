package StringPattern;

import java.util.Arrays;
public class BoringStrings {

    /*
        The Idea  here is that we don't want  C+1 and C-1 with C ,
        If we see ASCII Values of Characters for eg

        97 98 99 100 101  102  103  104
        a  b  c  d    e   f    g    h

        We can see  if we remove  consecutive elements  b,d,f,h we get a non boring string

        So we can separate on basis of  ASCII values  , odd ASCII values and EVEN ascii values into odd strings and even string

        then we can try doing

        S =  odd+ even
        S = even + odd       and check if these concatenation contains any boring pair

        eg for   S = acef
        odd = ace
        even = f
        S = odd + even  ( will give a boring pair)
        S = even + odd ( will not give a boring pairs)



     */
    public static int solve(String A) {


        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for(int i = 0 ; i<A.length() ; i++){
            if((A.charAt(i)+0) %2 == 1){
                odd.append(A.charAt(i));
            }
            else if( ((A.charAt(i)) +0) %2 == 0){
                even.append(A.charAt(i));
            }
        }
        char [] ar = odd.toString().toCharArray();
        Arrays.sort(ar);
        odd = new StringBuilder( String.valueOf(ar));
//System.out.println ( String.valueOf(ar));
        char []arr = even.toString().toCharArray();
        Arrays.sort(arr);
//        System.out.println ( String.valueOf(arr));
        even = new StringBuilder(String.valueOf(arr));
        StringBuilder tempOdd = new StringBuilder(odd);

        if (check(odd.append( even)))
            return 1;
        else if (check(even.append(tempOdd) ))
            return 1;
        return 0;
    }
    public static boolean check(StringBuilder s) {
        boolean ok = true;
        for (int i = 0; i + 1 < s.length(); ++i)
            ok &= (Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1);
        return ok;
    }

    public static void main(String[] args) {
       System.out.println( solve("hfffgggfhhhgg"));
    }
}
