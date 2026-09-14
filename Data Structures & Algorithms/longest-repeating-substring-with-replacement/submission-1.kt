class Solution {
    fun characterReplacement(s: String, k: Int): Int {

        val fMap = HashMap<Char,Int>()
        var maxLen = 0
        var maxFreq = 0
        var l = 0
        var r = 0

        while(r < s.length) {

            fMap[s[r]] = fMap.getOrDefault(s[r],0) + 1
            maxFreq = maxOf(maxFreq, fMap[s[r]]!!)
            
            while(((r-l)+1 - maxFreq) > k){
                fMap[s[l]] = fMap[s[l]]!! - 1
                l++
            }
            maxLen = maxOf(maxLen, (r-l)+1)
            r++
        }

    return maxLen
    }
}
