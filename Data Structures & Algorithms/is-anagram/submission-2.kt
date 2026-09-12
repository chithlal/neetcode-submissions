class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val map  = HashMap<Char, Int>()
        if(s.length != t.length) return false
        for(c in s){
            map[c] = (map[c] ?: 0) + 1
        }

        for(c in t){
            if(map[c] == null || map[c] == 0) return false

            map[c] = (map[c] ?: 1) - 1

        }

        return true
        
    }
}
