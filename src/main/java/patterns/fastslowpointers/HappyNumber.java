package patterns.fastslowpointers;

import java.util.HashSet;
import java.util.Set;

/*
 * Happy Number (LeetCode #202)
 * https://leetcode.com/problems/happy-number/description/
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfSquare(n);
        }

        return n == 1;
    }

    private int sumOfSquare(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }
}
