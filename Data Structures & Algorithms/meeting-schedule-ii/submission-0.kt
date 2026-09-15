/**
 * Definition of Interval:
 * class Interval(var start: Int, var end: Int) {}
 */

class Solution {
    fun minMeetingRooms(intervals: List<Interval>): Int {
        var res = 0
        var count = 0
        var s = 0
        var e = 0

        val start = intervals.map{ it.start }.sorted()
        val end = intervals.map{ it.end }.sorted()

        while(s<start.size){
            if(start[s] < end[e]){
                count++
                s++
            } else{
                count--
                e++
            }
            res = maxOf(res,count)
        }
        return res
    }
}
