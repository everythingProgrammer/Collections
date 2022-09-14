package BitManipulations;

public class ReverseBits {

    public static long reverse(long a) {
        return toBinary(a);
    }
    public static long toBinary(long decimal){

//        int binary[] = new int[32];
        char bin[] = new char[32];

        for(int i = 0 ; i<32; i++){
            bin[i] = '0';
        }

        int index = 0;
        while(decimal > 0){
//            binary[index++] =(int) decimal&1;
            int ch =(int) (decimal&1) +48;
            bin[index++] = (char)  ( (decimal&1) +48 );
            decimal = decimal/2;
        }

        String str = String.valueOf(bin);



        System.out.println(str);
//
//        int binaryrev[] = new int[32];
//
//        for(int i = 0 ; i<16; i++){
//            binaryrev[i+16] = binary[15-i];
//            binaryrev[15-i] = binary[i+16];
//        }
//        String str = binaryrev.toString();
        System.out.println(Long.parseLong(str,2));
        return Long.parseLong(str,2);
//        for(int i = index-1;i >= 0;i--){
//            System.out.print(binary[i]);
//        }
//        System.out.println();//new line
    }



    /*
        Expected DesignLinkedList.java
     */
    public static long rev(long A){
        long rev = 0;

        for (int i = 0; i < 32; i++) {
            rev <<= 1;
            long temp = rev;
            if ((A & (1 << i)) != 0)
                rev |= 1;
        }
        return rev;
    }

    public static long makeSameNumber(long A){
        long rev = 0;
        for (int i = 0; i < 32; i++) {
//            rev <<= 1;
//            long temp = rev;
            if ((A & (1 << i)) != 0)
                rev |= (1<<i);
        }
        System.out.println(rev);
        return rev;
    }

    public static void main(String[] args) {
        rev(3);
        makeSameNumber(3);
    }

}
