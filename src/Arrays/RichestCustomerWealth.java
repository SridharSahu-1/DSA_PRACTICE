package Arrays;

//1672. Richest Customer Wealth
//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = -99999999;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
}
