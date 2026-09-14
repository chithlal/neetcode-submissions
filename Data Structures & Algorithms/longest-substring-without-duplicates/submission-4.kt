class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val set = HashSet<Char>()
        var l = 0
        var max = 0
        for( r in s.indices){
            while(set.contains(s[r])){
                set.remove(s[l])
                l++
            }
            set.add(s[r])
            max = maxOf(max, (r-l)+1)
        }
        return max
    }
}
