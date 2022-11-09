package Arrays;

//1365. How Many Numbers Are Smaller Than the Current Number Easy 3170
public class HowManyNoAreSmaller {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int k =0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }}
              ans[k]=count;
                k++;

        }
        return ans;
    }
}
