class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        if(s.length == 1) return 1

        var l = 0
        var len = 0

        val set = HashSet<Char>()

       for(r in s.indices){

            while(set.contains(s[r])) {
                set.remove(s[l])
                l++
            }
            
            set.add(s[r])
            len = maxOf(len, (r-l) + 1)
        }
        return len
    }
}
