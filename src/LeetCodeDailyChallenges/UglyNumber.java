package LeetCodeDailyChallenges;

class UglyNumber {
    public boolean isUgly(int n) {
        if(n==0) return false;
        if(n==1) return true;

        if(n%2==0){
            n=n/2;
            return isUgly(n);
        }
        
        if(n%3==0){
            n=n/3;
            return isUgly(n);
        }
        
        if(n%5==0){
            n=n/5;
            return isUgly(n);
        }
        return false;
    }
}