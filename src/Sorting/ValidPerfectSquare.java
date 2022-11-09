package Sorting;

class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
      int start = 0;
    int end = num;

    if(num == 1) return true;
    
    while (start <= end){
        long mid = start + (end - start)/2;
        if(mid * mid == num) return true;
        if(num > mid * mid) start = (int)mid + 1;
        if(num < mid * mid) end = (int)mid - 1;
    }
    return false;
}
}