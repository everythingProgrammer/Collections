package Strings;

public class ReverseString {


    public static String reverse(String st ){

        StringBuilder str  = new StringBuilder();

        for(int i = st.length()-1; i>=0; i--){
            str.append(st.charAt(i));
        }
        return str.toString();
    }

    public static  String solve(String A) {

        String rev = reverse(A.trim());
        StringBuilder st = new StringBuilder();

        int prevIndex = 0;
        for(int i = 0; i<=rev.length(); i++){
            if(i == rev.length()){
                st.append(reverse(rev.substring(prevIndex,i)));
                break;
            }
            if(rev.charAt(i) == ' '){
                st.append( reverse(rev.substring(prevIndex,i)) );
                prevIndex = i+1;
            }
        }
        return st.toString();
    }


    /*
            Optimal Solution - same tc and sc
     */
    public String optimal(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder buf = new StringBuilder();

        for(int i = s.length()-1; i>=0; i--)
        {
            char c = s.charAt(i);
            if(c!=' ') buf.append(c);
            else create(res, buf);
        }

        create(res, buf);
        return res.toString();
    }

    private void create(StringBuilder res, StringBuilder buf)
    {
        int i = buf.length()-1;

        while(i>=0){
            if(i==buf.length()-1 && res.length()>0) res.append(' ');
            res.append(buf.charAt(i));
            i--;
        }
        buf.setLength(0);
    }

    public static void main(String args[]){
        String st = "aa bbb dd fffffff ssssssss ff gg wwwwwwwwww";
//        System.out.println(reverse(st));
        System.out.println(solve(st));

    }

}
