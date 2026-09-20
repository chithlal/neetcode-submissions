class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        var map = HashMap<Char,Int>()
        var l = 0
        var r = 0
        var maxFrq = 0
        var res = 0

        while(r < s.length){
            map[s[r]] = map.getOrDefault(s[r],0) + 1
            maxFrq = maxOf(maxFrq, map[s[r]]!!)

            while(((r-l)+1) - maxFrq > k){
                map[s[l]] = (map[s[l]] ?: 0) - 1
                l++
            }
            res = maxOf(((r-l) + 1), res)
            r++
        }

        return res
    }
}
