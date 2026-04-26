package patterns.slidingwindow;

import java.util.HashSet;
import java.util.Set;

/*
 * Longest Substring Without Repeating Characters (LeetCode #3)
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;

        int l = 0, r = 0;
        int max = 0;
        Set<Character> st = new HashSet<>();

        while (r < s.length()) {
            if (st.contains(s.charAt(r))) {
                st.remove(s.charAt(l));
                l++;
            } else {
                st.add(s.charAt(r));
                max = Math.max(max, st.size());
                r++;
            }

        }
        return max;
    }
}
