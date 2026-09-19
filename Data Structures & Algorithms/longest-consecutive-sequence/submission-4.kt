class Solution {
    fun longestConsecutive(nums: IntArray): Int {

        var res = 0

        val set = nums.toSet()
        
        for(n in nums){
            var streak = 0
            var k = n
            if(!set.contains(k-1))
            while(set.contains(k)){
                streak++
                res = maxOf(streak,res)
                k++
            }
        }

        return res

    }
}
