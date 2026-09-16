class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var currMax = -1
        var res = IntArray(arr.size){0}
        for(i in arr.size-1 downTo 0){
            if(arr[i] <= currMax){
                res[i] = currMax
            } else {
                res[i] = currMax
                currMax = arr[i]
            }
        }
        return res
    }
}
