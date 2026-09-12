class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val arrayTable = IntArray(26){0}
        if(s.length != t.length) return false

        for(i in s.indices){
            arrayTable[s[i] - 'a']++
            arrayTable[t[i] - 'a']--
        }

        for(i in arrayTable){
            if(i != 0 ) return false
        }
        return true
    }
}
