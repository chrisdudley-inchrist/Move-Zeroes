/**
 * Given an array nums, write a function to move all 0's to the
 * end of it while maintaining the relative order of the non-zero
 * elements.
 * <p>
 * Example:
 * <p>
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 * <p>
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */

public class Main {

    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});

    }

    public static void moveZeroes(int[] nums) {
        int numZeroes = 0;
        int numNonZeros = 0;

        for (int i = 0; i < nums.length; i++) {
            if (numZeroes + numNonZeros >= nums.length) {
                break;
            }

            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }

                numZeroes++;
                nums[nums.length - numZeroes] = 0;
                i--;
            } else {
                numNonZeros++;
            }
        }
    }

}



