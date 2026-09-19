class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        val res = IntArray(nums.size)

        var l = 1
        for(i in nums.indices){
            res[i] = l
            l *= nums[i]
        }

        //left pass
        l = 1
        for(i in nums.size-1 downTo 0){
            res[i] *= l
            l *= nums[i]
        }

        return res
    }
}
