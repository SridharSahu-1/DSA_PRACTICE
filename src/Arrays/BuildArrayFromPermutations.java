package Arrays;// Q.1920  Build Array from Permutation
//https://leetcode.com/problems/build-array-from-permutation/

public class BuildArrayFromPermutations {

    public static int[] buildArray(int[] nums) {
        int n= nums.length;
        int[] ans = new int[n];
        for(int i=0;i<nums.length;i++){
            ans[i]= nums[nums[i]];
        }
        return ans;
    }
}

