class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {


        val map = mutableMapOf<String,MutableList<String>>()

        for(str in strs){
            val s = str.toCharArray().sorted().joinToString("")
            if(map[s] != null){
                map.getOrPut(s){mutableListOf()}.add(str)
            }
            else {
                map[s] = mutableListOf(str)
            }
        }
        return map.values.toList()
    }
}
