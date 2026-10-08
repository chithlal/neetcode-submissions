class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        var freqMap = HashMap<Int, Int>()

        for(n in nums){
            freqMap[n] = (freqMap[n] ?: 0) + 1
         }

         var list = MutableList<MutableList<Int>>(nums.size + 1){mutableListOf()}

         for((k,v) in freqMap){
            list[v].add(k)
         }

        var res = mutableListOf<Int>()
         for(i in list.size-1 downTo 0){

            if(res.size == k) break
            for(n in list[i])
                res.add(n)
         }

         return res.toIntArray()


    }
}
