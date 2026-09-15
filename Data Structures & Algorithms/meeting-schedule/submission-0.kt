/**
 * Definition of Interval:
 * class Interval(var start: Int, var end: Int) {}
 */

class Solution {
    fun canAttendMeetings(intervals: List<Interval>): Boolean {
        val sortedInterval = intervals.sortedBy{it.start}
        var prevS = -1
            var prevE = -1
        for( iv in sortedInterval){
            if( prevE > iv.start) return false
            prevE = iv.end
        }
        return true
    }
}
