class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val visited = mutableMapOf<Int, Int>()
        val result = IntArray(2)
        for(i in nums.indices) {
            val req = target - nums[i]
            if(visited[req] == null){
                visited[nums[i]] = i 
            }
            else {
                result[0] = visited[req] ?: 0
                result[1] = i
            }
        }
        return result

    }
}
