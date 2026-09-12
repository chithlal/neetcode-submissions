class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if(s.length != t.length) return false
        
        val map = HashMap<Char,Int>()
        for(ch in s){
            map[ch] = (map[ch] ?: 0)+1
        }

        for(ch in t){
            if(map[ch] == null || map[ch]==0)
            return false
            else 
            map[ch] = (map[ch] ?: 1)-1
        }
        return true

       
    }
}
