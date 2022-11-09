package Arrays;

import java.util.HashMap;

class TwoSum {
//     Bruteforce
    public int[] twoSumBrute(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
       int result = target-nums[i];
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
        }
        }
    return new int[]{};
    }

//    Optimal Solution 
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int result=target-nums[i];
        if(map.containsKey(result)){
         return new int[]{map.get(result),i};
        }
        else{
            map.put(nums[i],i); }
        }
    return new int[]{};
    }
}



