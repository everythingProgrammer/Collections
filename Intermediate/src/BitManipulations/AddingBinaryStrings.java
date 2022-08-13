package BitManipulations;

public class AddingBinaryStrings {

    public static String addBinary(String A, String B) {

        int diff = Math.abs(A.length() -  B.length());
        String temp = "";
        for(int i = 0 ; i<diff ; i++){
            temp+="0";
        }

        if(A.length()<B.length()){
            A= temp+A;
        }else if(B.length() < A.length()){
            B= temp+B;
        }
//        System.out.println(A.length()==B.length());
//        System.out.println(A);
//        System.out.println(B);
        int sum = 0;
        String res="";
        for(int i = A.length()-1 ; i>=0 || sum ==1 ; i--){
            sum+= i>=0? A.charAt(i)-'0':'0';
            sum+= i>=0? B.charAt(i)-'0':'0';
            res = (char) (sum%2 +'0')+res;
            sum/=2;

        }
//        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        addBinary("1110000000010110111010100100111","101001");
    }

}
