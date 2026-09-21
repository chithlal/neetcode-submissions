class Solution {
    fun maxArea(heights: IntArray): Int {

        var res = 0
        var l = 0
        var r = heights.lastIndex

        while(l < r){
            val area = minOf(heights[l], heights[r]) * (r-l)
            res = maxOf(res, area)

            if(heights[l] < heights[r]){
                l++
            } else r--
        }

        return res

    }
}
