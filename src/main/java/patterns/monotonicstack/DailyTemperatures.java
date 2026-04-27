package patterns.monotonicstack;

import java.util.Stack;

/*
 * Daily Temperatures (LeetCode #739)
 * https://leetcode.com/problems/daily-temperatures/description/
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> dq = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!dq.isEmpty() && temperatures[i] > temperatures[dq.peek()]) {
                int p = dq.pop();
                res[p] = i - p;
            }

            dq.push(i);

        }
        return res;

    }
}
