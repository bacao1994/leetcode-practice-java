package patterns.twopointers;

/*
* Leetcode 167: Two Sum II - Input Array Is Sorted
*
* */

class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length -1;

        while (l < r){
            if (numbers[l] + numbers[r] > target) {
                r --;
            } else if (numbers[l] + numbers[r] < target) {
                l++;
            } else {
                return new int[] {l+1, r+1};
            }
        }
        return null;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
