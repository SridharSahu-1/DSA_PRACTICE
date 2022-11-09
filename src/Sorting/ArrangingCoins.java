package Sorting;

class ArrangingCoins {
    public int arrangeCoins(int n) {
        int t=0;
if(n==1)
return 1;
while(n>t)
{
t++;
n=n-t;
}
return t;
}
   }
