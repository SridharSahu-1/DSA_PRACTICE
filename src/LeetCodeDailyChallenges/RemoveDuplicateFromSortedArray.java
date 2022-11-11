package LeetCodeDailyChallenges;

import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums){
        HashSet<Integer> hs = new HashSet<>();
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                continue;
            }
            else{
                hs.add(nums[i]);
            }
            nums[index] = nums[i];
            index++;
        }
        return hs.size();
    }
}
