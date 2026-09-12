class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val map = HashMap<Int, Int>()
        for(num in nums){
            map[num] = (map[num] ?: 0) + 1
    }
     if(map.size == nums.size){
                return false
            }
            else return true
        
}
}
