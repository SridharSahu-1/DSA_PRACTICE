package Recursion;

public class Permutation {
    public static void main(String[] args) {
//        1 3 6 2 5 4 3 2 4
        int[] arr = {1,3,6,2,5,4,3,2,4};
        int[] arr1 ={1,23,1,321,324,321,1};
        int target=9;
        System.out.println(countSum(arr,target));
    }

    public static int countSum(int[] arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }
}
