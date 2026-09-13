class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freq = HashMap<Int,Int>()
        for(num in nums){
            freq[num] = freq.getOrDefault(num, 0) + 1
        }

        val freqList = List(nums.size + 1){mutableListOf<Int>()}

        for((k,v) in freq){
            freqList[v].add(k) 
        }
        val res = mutableListOf<Int>()
        for(i in freqList.size-1 downTo 0){
            
            for(num in freqList[i]){
                if(k == res.size) return res.toIntArray()
                res.add(num)
            }
            
        }
        return res.toIntArray()
    }
}
