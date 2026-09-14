class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
            if(s.isEmpty()) return 0
            val set = HashSet<Char>()
            var maxLength = 0
            var l = 0 
            var r = 0
            var len = 0
            while(l < s.length && r < s.length){
                if(set.contains(s[r])){
                    maxLength = maxOf(len,maxLength)
                    l++
                    r = l
                    len = 0
                    set.clear()
                } 
                else{
                    len++
                    set.add(s[r])
                    r++
                    maxLength = maxOf(len,maxLength)
                }

            }
            
            return maxLength
    }
}
