package Sorting;

class PeakIndexInAMountain {
    public int peakIndexInMountainArray(int[] arr) {
             int start = 0;
        int end =arr.length-1;
        while(start<end){
            int mid = start +(end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }     
        }
         return end;
    }
}
//    2nd Approach
// int start = 0;
//        int end = nums.length-1;
//        while(start <= end){
//            int mid = start + (end-start)/2;
//            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
//                return mid;
//            }else if(nums[mid] > nums[mid-1] && nums[mid] < nums[mid +1]){
//                start = mid + 1;
//            }else if(nums[mid] < nums[mid-1] && nums[mid] > nums[mid +1]){
//                end = mid;
//            }
//        }
//        return -1;
//    }
//}