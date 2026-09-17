class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {

        nums.sort()

        if(nums.isEmpty()) return mutableListOf(mutableListOf())

        var res = mutableListOf<List<Int>>()

        for( i in nums.indices){
            if(i > 0 && nums[i] == nums[i-1]) continue
            var j = i+1
            var k = nums.lastIndex

            while(j < k) {
                val sum = nums[i] + nums[j] + nums[k]
                if(sum < 0) {
                    j++
                }
                else if(sum > 0){
                    k--
                }
                else {
                    res.add(listOf(nums[i], nums[j], nums[k]))
                    j++
                    k--

                    while(j < k && nums[j] == nums[j-1]){ 
                    j++
                }
                while(j < k && nums[k] == nums[k+1]){ 
                    k--
                }
                }
                
            }
        }
        return res
    }
}
