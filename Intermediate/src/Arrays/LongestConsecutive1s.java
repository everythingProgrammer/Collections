package Arrays;

public class LongestConsecutive1s {

    public static  int solve(String A) {

        int count = 0 ;
        int maxCount = 0;
        for(int i = 0 ; i<A.length(); i++){
            if(A.charAt(i) == '1'){
                maxCount++;
            }
        }
        if(maxCount == 0){
            return 0;
        }

        for(int i = 0 ; i<A.length(); i++){

            if(A.charAt(i) == '0') {
                int left = 0;
                int right = 0;
                for (int l = i - 1; l >= 0; l--) {
                    if (A.charAt(l) == '1') {
                        left++;
                    } else {
                        break;
                    }
                }

                for (int r = i + 1; r <  A.length(); r++) {

                    if (A.charAt(r) == '1') {
                        right++;
                    } else {
                        break;
                    }
                }
                count = Math.max(count, left+right+1);
                }
            }
        // This is to check if  The largest subsequence was subsequent
        // that means   110110000 in that case   4 is maximum 1 available and if we have 5 in ans replace with 4...
        //
        if(count > maxCount){
            count = maxCount;
        }else if(count == 0){ // This is case where  11111111  so count will be zero since no 0's present
                                // replace count with maxCount
            count = maxCount;
        }
        return count;
    }

    public static void main(String[] args) {
        String str =  "11010110000000000";
        System.out.println(solve(str));
    }


}
