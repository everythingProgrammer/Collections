package RevisionCodes;

public class L424 {

    public int characterReplacement(String s , int k){
        int freq[] = new int[s.length()];
        int maxCount = 0;
        int ans=0;
        int start = 0;

        for(int end = 0; end<s.length(); end++){
            char ch = s.charAt(end);
            freq[ch-'A'] = freq[ch-'A']+1;
            if(freq[ch-'A'] > maxCount ){
                maxCount = freq[ch-'A'];
            }
            if( (end-start+1)-maxCount >k  ){
                freq[s.charAt(start)-'A']= freq[s.charAt(start)-'A'] -1;
                start++;
            }
            ans = Math.max(ans, (end-start+1));
        }
        return ans;
    }


}
