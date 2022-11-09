package Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/
//1480. Running Sum of 1d Array
public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int arr[]={1,2,1,2,12,2,1,2};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    static public int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            nums[i] =sum;
        }
        return nums;
    }
}
