class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        if(k > nums.size) return intArrayOf()
        val frq = HashMap<Int, Int>()

        for(n in nums){
            frq[n] = (frq[n] ?: 0) + 1
        }

        val freqList = List(nums.size + 1){mutableListOf<Int>()}

        for((k,v) in frq){
            freqList[v].add(k)
        }
        var res = mutableListOf<Int>()
        for(i in freqList.size-1 downTo 0){
            for(n in freqList[i]){
                if(res.size == k) return res.toIntArray()
                res.add(n)
            }
                
        }
        return res.toIntArray()
    }
}
