class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val set = nums.toSet()
        var curr = 0
        var res = 0
        for(num in nums){
            
            var streak = 0
            curr = num
            if(!set.contains(curr-1)){
            while(set.contains(curr)){
                streak++
                curr++
            }
            res = maxOf(res, streak)
        }
        }
        return res
    }
}
