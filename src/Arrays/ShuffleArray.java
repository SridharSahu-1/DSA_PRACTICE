package Arrays;//https://leetcode.com/problems/shuffle-the-array/

import java.util.Arrays;

public class ShuffleArray {
//   Input: nums = [2,5,1,3,4,7], n = 3
//   Output: [2,3,5,4,1,7]
public static void main(String[] args) {
    int []nums = {2,5,1,3,4,7};
    int n=3;
    System.out.println(Arrays.toString(shuffle(nums, 3)));

}
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int j=0;
        for(int i=0;i<n;i++){
            arr[j]=nums[i];
            arr[j+1]=nums[n+i];
            j+=2;
        }

return arr;
    }

}
