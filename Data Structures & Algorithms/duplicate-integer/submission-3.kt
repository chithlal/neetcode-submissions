class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val map = nums.toSet()
        if(map.size == nums.size) return false
        else return true
    }
}
