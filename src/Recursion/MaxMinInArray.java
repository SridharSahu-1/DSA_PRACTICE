package Recursion;

public class MaxMinInArray {
    public static void main(String[] args) {
       int[] arr = {1, 4, 3, -5, -4, 8, 6};
//        min = -5, max = 8
        int n=arr.length;
        int min = min(arr,n);
        int max = max(arr,n);
        System.out.println(min);
        System.out.println(max);

    }
    public static int min(int[] arr,int n){
        if(n==1){
            return arr[0];
        }
        return Math.min(arr[n-1],min(arr,n-1));
    }
    public static int max(int[]arr,int n){
        if(n==1) return arr[0];
        return Math.max(arr[n-1],max(arr,n-1));
    }
}
