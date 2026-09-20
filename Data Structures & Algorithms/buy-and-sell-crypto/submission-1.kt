class Solution {
    fun maxProfit(prices: IntArray): Int {
        var res = 0
        var b = 0
        for(s in 1..prices.size-1){
            res = maxOf(res,prices[s]-prices[b])
            if(prices[s] < prices[b]){
                b = s
            }
        }
        return res
    }
}
