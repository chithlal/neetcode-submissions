class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortBy{it[0]}
        val res = mutableListOf<MutableList<Int>>()
        res.add(mutableListOf(intervals[0][0],intervals[0][1]))

        for(i in 0..intervals.size-1){

            if(res.isNotEmpty() && res.last()[1] >= intervals[i][0]){
                    res.last()[1] = maxOf(res.last()[1],intervals[i][1])
            }
            else {
                res.add(mutableListOf(intervals[i][0],intervals[i][1]))
            }
        }
    
    return res.map{it.toIntArray()}.toTypedArray()
    }
}
