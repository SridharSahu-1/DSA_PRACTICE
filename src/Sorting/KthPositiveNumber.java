package Sorting;

class KthPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        
       for( int j=0; j<arr.length; j++){
            if(arr[j]<=k){ 
                k++;
            }
            else {
                break;
            }
        }
        return k;
    }
}