class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProf = 0
        var b = 0
        var s = 1
        while(s<prices.size){
            val prof = prices[s] - prices[b]
            maxProf = maxOf(prof, maxProf)
            if(prices[s] < prices[b]){
                b = s
            }
            s++
        }
        return maxProf
    }
}
