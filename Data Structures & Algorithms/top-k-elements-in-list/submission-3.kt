class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val freq = HashMap<Int,Int>()

        for(num in nums){
            freq[num]=freq.getOrDefault(num,0)+1
        }

        val bucket = Array(nums.size+1){mutableListOf<Int>()}

        for((num,count) in freq){
            bucket[count].add(num)
        }

        val result = mutableListOf<Int>()
      
        for(count in bucket.indices.reversed()){
            if(bucket[count].isNotEmpty()){
                result.addAll(bucket[count]) 
                println("count: $count , bucket = ${bucket[count]}")
            }
            
            if(result.size == k)
                break
            
        }
        return result.toIntArray()
    
    }
}
