import java.util.*;

public class LongestConsecutiveSubsequence {



    /*
        Using HashSet
        TC O(n)
        SC O(1)
     */
    static int findLongestConseqSubseq(int arr[], int N)
    {
        // ArrayList<Integer> freq = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0 ; i<arr.length; i++){
            hs.add(arr[i]);
        }

        int maxCount = 0;
        int count =0;


        for(int i = 0  ; i<arr.length; i++){

            // checking for everyElement how much length chain it can form
            // checking for only starting elments
            // checking if it's starting element
            if(!hs.contains(arr[i]-1)){
                int j = arr[i];
                while(hs.contains(j)){
//                    count++;
                    j++;
                }
                if(j-arr[i]>maxCount){
                    maxCount = j-arr[i];
                }
            }


        }


	   return maxCount;

    }
/*
    Using Tree Map for Solution
    TC unknown
    SC O(n)
 */
    static int findLongestConseqSubseq2(int arr[], int N)
    {
        // ArrayList<Integer> freq = new ArrayList<>();
        Set<Integer> hs = new TreeSet<>();

        for(int i = 0 ; i<arr.length; i++){
            hs.add(arr[i]);
        }
//        Arrays.sort(arr);
//        System.out.println(arr);
        Iterator it = hs.iterator();

        int maxCount = 1;
        int count =1;
        int sequence = (int) it.next();
        while(it.hasNext()){
            int n = (int) it.next();
            if(n == sequence+1){
                sequence++;
                count++;
            }else{
                sequence = n;
                count = 1;
            }
            if(count>maxCount){
                maxCount = count;
            }
        }
        return maxCount;

    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();
        int nums[] = new int[N];
        for(int i = 0 ; i<N; i++){
            nums[i]  = sr.nextInt();
        }
        System.out.println(findLongestConseqSubseq2(nums,N));
    }

}
