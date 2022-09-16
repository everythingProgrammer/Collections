package leetcode;

public class L125 {

    public static boolean isPalindrome(String s) {
            s = s.toLowerCase();
            int i = 0;
            int j = s.length()-i-1;
            while(i<=j){
                char aj = s.charAt(j);
                char ai = s.charAt(i);
                if(   ( s.charAt(j)-'a'>25 || s.charAt(j)-'a'<0) && (s.charAt(j)-'0'<0 || s.charAt(j)-'9'>0) ){
                    j--;
                    continue;
                }
                else if( ( s.charAt(i)-'a'>25 || s.charAt(i)-'a'<0) && (s.charAt(i)-'0'<0 || s.charAt(i)-'9'>0)){
                    i++;
                    continue;
                }
                else if(s.charAt(i) != s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P0"));
    }

}
