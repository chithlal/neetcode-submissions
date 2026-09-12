class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val hashSet = HashSet<Int>()
        for (num in nums){
            if(!hashSet.add(num)){
                return true
            }
        }
        return false
    }
}
