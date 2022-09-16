package leetcode;

public class L424 {


    public int characterReplacement(String s, int k) {
        if(s.length()==1) return 1;
        int[] array=new int[26];
        // This will be left side of sliding window
        int start=0;
        //max count will accreditation count of single biggest element
        // now single biggest element can appear only once but it will be decisive
        int maxCount=0;
        // ans stores our length value
        int ans=0;
        for(int end=0;end<s.length();end++){
            //freq character at ith index ++
            array[s.charAt(end)-'A']++;
            maxCount=Math.max(array[s.charAt(end)-'A'],maxCount);
            if((end-start+1)-maxCount>k){
                // When our max limit gets out of reach then  move window forward by 1 length ;
                // Any character can be at starting of window , not necessarily max appearing one ...
                array[s.charAt(start)-'A']--;
                start++;
            }
            ans=Math.max(ans,end-start+1);
        }
        return ans;
    }



}
