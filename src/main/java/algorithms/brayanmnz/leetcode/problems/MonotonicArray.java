package algorithms.brayanmnz.leetcode.problems;


public class MonotonicArray {


    /**
    * An array is monotonic if it is either monotone increasing or monotone decreasing.
     *
     * An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
     *
     * Given an integer array nums, return true if the given array is monotonic, or false otherwise.
    *
    * */
    public static boolean isMonotonic(int[] nums) {
        return ascending(nums) || descending(nums);
       // return validation(nums);
    }

    public static boolean validation(int[] nums) {
        if(nums.length == 1){
            return true;
        }

        if(nums[0] == nums[nums.length -1] && nums[0] == nums[nums.length/2]){
            return true;
        }
        if(nums[0]<nums[nums.length-1]){
            return ascending(nums);
        }else {
            return descending(nums);
        }
    }

    public static boolean ascending(int[] nums){
        int i =0;
        while(i<(nums.length -1)){
            if(nums[i] <= nums[i+1]) {
                i++;
                continue;
            }else {return false;}
        }
        return true;
    }


    public static boolean descending(int[] nums){
        int i =0;
        while(i<(nums.length -1)){
            if(nums[i] >= nums[i+1]) {
                i++;
                continue;
            }else {return false;}
        }
        return true;
    }
}
