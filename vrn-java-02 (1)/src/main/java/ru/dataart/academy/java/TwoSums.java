package ru.dataart.academy.java;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        // Task implementation
        int[] resultArr = new int[2];
        boolean stop = false;
        int i = nums.length-1;
        while (!stop) {
            if ((target - nums[i]) <= 0)
                i--;
            if (i == -1 || (target - nums[i]) > nums[i])
                stop = true;
            else {
                for (int j = 0; j < i && !stop; j++) {
                    if (nums[j] == target - nums[i]) {
                        resultArr[0] = nums[j];
                        resultArr[1] = nums[i];
                        stop = true;
                    }
                    if (j == i-1)
                        stop = true;
                }
            }
        }
        if (resultArr[0] != 0 && resultArr[1] != 0)
            return resultArr;
        else
            return new int[]{};
    }
}
