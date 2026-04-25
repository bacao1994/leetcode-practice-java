package slidingwindow;

/*
* Maximum Average Subarray I (LeetCode #643)
* https://leetcode.com/problems/maximum-average-subarray-i/description/
* */
public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int curSum = 0;
        for (int i = 0; i < k; i++) {
            curSum += nums[i];
        }
        int max = curSum;

        for (int j = k; j < nums.length; j++) {
            max = Math.max(max, curSum - nums[j - k] + nums[j]);
            curSum = curSum - nums[j - k] + nums[j];
        }

        return (double) max / k;
    }
}
