package Bitwise;

public class AddBinaryStrings {

    public static  String addBinary(String A, String B) {

        int i = A.length() -1;
        int j = B.length() -1;

        int carry = 0;
        int num =0;
        String binary = "";
        int bit = 1;
        while( Math.min(i,j)>=0){

            int sum = (A.charAt(i)-48 )+ (B.charAt(j)-48) + carry ;
            carry = sum/2;
            if(sum%2==1){
                num= num|bit;
                binary ="1"+binary;
            }else {
                binary ="0"+binary;
            }
            bit = bit <<1;
            i--;
            j--;
        }
        while(i >= 0 ){

            int sum = (A.charAt(i)-48)+carry ;
            carry = sum/2;
            if(sum%2 == 1){
                num = num|bit;
                binary ="1"+binary;
            }else {
                binary ="0"+binary;
            }
            bit = bit <<1;
            i --;
        }
        while(j >= 0){
            int sum = (B.charAt(j)-48)+carry ;
            carry = sum/2;
            if(sum%2 == 1){
                num = num|bit;
                binary ="1"+binary;
            }else {
                binary ="0"+binary;
            }
            bit = bit <<1;
            j--;
        }
        if(carry == 1){
            binary = 1+binary;
        }

        return binary;

    }


    public static void main(String[] args) {
        System.out.println(addBinary("1010110111001101101000","1000011011000000111100110") );
        System.out.println("1001110001111010101001110" );
    }

}
