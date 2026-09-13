class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val out = IntArray(nums.size){1}
        var res = 1
        
        for(i in nums.indices){
            out[i] *= res
            res *= nums[i]
        }

        res = 1
        for(i in nums.size-1 downTo 0){
            out[i] *= res
            res *=  nums[i]
        }


        return out
    }
}