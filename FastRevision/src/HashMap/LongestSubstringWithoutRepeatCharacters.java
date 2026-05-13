package HashMap;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatCharacters {

    public static int lengthOfLongestSubstringMyVersion(String s) {


        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = left + 1;
        set.add(s.charAt(left));
        int longestLength = 1;

        int currentLength = 1;
        while (left <= right && left < s.length() && right < s.length()) {

            if (set.contains(s.charAt(right))) {

                if (left == right) {
                    right++;
                } else if (left < right) {
                    set.remove(s.charAt(left));
                    left++;
                }
            } else {
                // if set does not contains the element at right
                currentLength = (right-left)+1;
                longestLength = Math.max(longestLength, currentLength);
                right++;
                if(right>=s.length()){
                    break;
                }
                set.add(s.charAt(right));

            }


        }
        return longestLength;

    }

    public static int lengthOfLongestSubstring(String s) {

        if(s.length() == 0){
            return 0;
        }

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int longestLength = 0;

        for(int right = 0; right < s.length(); right++){

            // shrink until duplicate removed
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            // now safe to add
            set.add(s.charAt(right));

            longestLength = Math.max(longestLength, right - left + 1);
        }

        return longestLength;
    }
    public static void main(String args[]){
        String s = "abcdefgh";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
