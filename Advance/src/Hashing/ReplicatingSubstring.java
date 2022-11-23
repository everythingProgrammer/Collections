package Hashing;

public class ReplicatingSubstring {

    /*
     Optimal
     */
    public int solve(int A, String B) {
        // hash array to keep a track of frequency of each character
        int hash[] = new int[26];
        for (int i = 0; i < B.length(); i++) {
            hash[B.charAt(i) - 'a']++;
        }
        int flag = 0;
        for (int i = 0; i < 26; i++) {
            // if the frequency of a charatcer present in the string isn't divisble by A, set a flag which
            // indicates that it will never be possible to represent B as concatenation of A strings
            if (hash[i] % A != 0)
                flag = 1;
        }
        if (flag == 1)
            return -1;
        else
            return 1;
    }
}
