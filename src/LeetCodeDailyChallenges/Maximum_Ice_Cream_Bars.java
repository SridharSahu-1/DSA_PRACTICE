package LeetCodeDailyChallenges;

class Maximum_Ice_Cream_Bars {
    public int maxIceCream(int[] costs, int coins) {
         Arrays.sort(costs);
        int n = costs.length;
        int answer = 0;
        // Pick ice creams till we can.
        while (answer < n && costs[answer] <= coins) {
            // We can buy this icecream, reduce the cost from the coins. 
            coins -= costs[answer];
            answer += 1;
        }
        return answer;
    }
}