package prefixsum;

import java.util.HashMap;
import java.util.Map;

/*
 * Leetcode 560: SubArray Sum Equals K
 *
 * */
public class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            // Xử lý riêng subarray bắt đầu từ index 0
            if (sum == k) {
                count++;
            }

            // Xử lý các subarray bắt đầu sau index 0
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
