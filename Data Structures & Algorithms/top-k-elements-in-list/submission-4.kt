class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val fMap = HashMap<Int,Int>()
        for(num in nums){
           fMap[num] =  fMap.getOrDefault(num, 0) + 1
        }
        val fList = List(nums.size+1) {mutableListOf<Int>()}

        for((k,v) in fMap){
            fList[v].add(k)
        }
        val res = mutableListOf<Int>()
        for(i in fList.size-1 downTo 1){
            for( num in fList[i])
                res.add(num)
            if(res.size == k){
                return res.toIntArray()
            }
        }
        return res.toIntArray()
    }
}
