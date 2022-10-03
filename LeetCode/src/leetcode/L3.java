package leetcode;
import java.util.*;
public class L3 {

    public int lengthOfLongestSubstring(String s) {

        int chars [] = new int[256]; // To keep track of window indexes
        Arrays.fill(chars, -1);
        int i = 0;
        int maxLength = 0;
        for(int j = 0; j<s.length();  j++){
            char ch = s.charAt(j);

            i = Math.max(j, chars[ch]+1);

            if( i-j+1 > maxLength ){
                maxLength = i-j+1;
            }

            chars[ch] = j;

        }

        return maxLength;

    }
}
