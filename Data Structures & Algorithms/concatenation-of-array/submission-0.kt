class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        var res = IntArray(nums.size*2){0}

        for(i in nums.indices){
            res[i] = nums[i]
            res[i+nums.size] = nums[i]
        }
    return res
    }
}
