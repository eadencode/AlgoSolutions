/*
 * Given a sorted array of n integers, find the starting 
 * and ending position of a given target value.

If the target is not found in the array, return [-1, -1].

Example
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].

Challenge
O(log n) time.
 */
public class SearchForARange {

    /** 
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        int[] result = new int[2];
        int low = 0;
        int high = A.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A[mid] == target) {
                break;
            }
        }
    }

    public int findFirstTarget(int[] A, target) {
        int low = 0;
        int high = A.length - 1;
    }

}
