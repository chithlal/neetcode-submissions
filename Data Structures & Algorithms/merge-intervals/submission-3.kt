class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val res = mutableListOf<IntArray>()
        intervals.sortBy{it[0]}
        res.add(intArrayOf(intervals[0][0],intervals[0][1]))

        for(time in intervals){
            if(res.last()[1] >= time[0]){
                if(res.last()[1] < time[1]){
                    res.last()[1] = time[1]
                }
            }
            else {
                res.add(intArrayOf(time[0],time[1]))
            }
        }
    return res.toTypedArray()
    }
}
