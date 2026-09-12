class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int,Int>()
        var ind1 = -1
        var ind2 = -1
        for(i in nums.indices){
        if(map[target - nums[i]] != null){
            ind1 = map[target - nums[i]]!!
            ind2 = i
        }
        else {
            map[nums[i]] = i
        }
        }
        return intArrayOf(ind1,ind2)
    }
}
