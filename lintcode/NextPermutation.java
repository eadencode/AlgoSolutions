/*
 * Given a list of integers, which denote a permutation.

Find the next permutation in ascending order.

Example
For [1,3,2,3], the next permutation is [1,3,3,2]

For [4,3,2,1], the next permutation is [1,2,3,4]

Note
The list may contains duplicate integers.
 */
public class NextPermutation {

    /**
     * @param nums: an array of integers
     * @return: return nothing (void), do not return anything, modify nums in-place instead
     */
    public int[] nextPermutation(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums;
        }
        int i = nums.length - 1;
        if (nums[i - 1] < nums[i]) {
            swap(nums, i - 1, i);
        } else {
            while (i > 0 && nums[i - 1] >= nums[i]) {
                i--;
            }
            if (i == 0) {
                for (; i < nums.length / 2; ++i) {
                    swap(nums, i, nums.length - 1 - i);
                }
            } else {
                for (int j = nums.length - 1; j >= 0; --j) {
                    if (nums[j] > nums[i]) {
                        swap(nums, i, j);
                        break;
                    }
                }
                for (int j = 0; j < (nums.length - i) / 2; ++j) {
                    swap(nums, i + j, nums.length - 1 - j);
                }
            }
        }
        return nums;
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
