class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        var resMap = HashMap<String,MutableList<String>>()

        for(s in strs){
            val key = s.toCharArray().sorted().toString()
            if(resMap[key] != null){
                resMap[key]?.add(s)
            } else{
                resMap[key] = mutableListOf(s)
            }
        }

        return resMap.values.toList()
    }
}
