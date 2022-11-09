package Arrays;

public class WaterTrapping {
    /*
Given an array of N non-negative integers arr[] representing an elevation map where
 the width of each bar is 1, compute how much water it is able to trap after raining.
Examples:
Input: arr[] = {2, 0, 2}
Output: 2
Explanation: The structure is like below.
We can trap 2 units of water in the middle gap.
Input: arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}
Output: 6
Explanation: The structure is like below.
Trap “1 unit” between first 1 and 2, “4 units” between
first 2 and 3 and “1 unit” between second last 1 and last 2
     */
    public static void main(String[] args) {
        int[] arr = {2, 0, 2};
        int[] arr1 ={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int ans = trap(arr);
        int ans1=trap(arr1);
        System.out.println(ans);
        System.out.println(ans1);
    }
    static int trap(int[] arr){
        int l=0;
        int r=arr.length-1;
        int sum=0;
        int lmax=0;
        int rmax=0;
        while(l<=r){
            lmax = Math.max(lmax,arr[l]);
            rmax = Math.max(rmax,arr[r]);
        if(lmax<rmax){
            sum+=lmax-arr[l];
            l++;
        }
        else{
            sum+=rmax - arr[r];
            r--;
        }
        }
        return sum;
    }
}
