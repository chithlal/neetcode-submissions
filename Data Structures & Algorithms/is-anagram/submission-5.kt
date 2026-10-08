class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        var charMap = IntArray(26){0}
        for(ch in s){
            charMap[ch-'a'] += 1
        }
        for(ch in t){
            charMap[ch-'a'] -= 1
        }
         for(i in charMap){
            if(i != 0) return false
         }

         return true
    }
}
