package Arrays;

class Find_N_UniqueIntegerSumUpToZero {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if(n%2==0){
            for(int i=0;i<n-1;i=i+2){
            ans[i+1]=-i;
                ans[i]=i;}
        }
        
        else{
            for(int j=0;j<n-1;j=j+2){
                ans[j+1]= -(j+1);
                ans[j]=j+1;
            }
            ans[n-1]=0;
        }
    return ans;}
}