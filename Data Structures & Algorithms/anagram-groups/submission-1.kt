class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val aMap = HashMap<String, MutableList<String>>()

        for(str in strs){
            val sortedStr = str.toCharArray().sorted().toString()
            if(aMap[sortedStr] != null){
                aMap.getOrPut(sortedStr){mutableListOf()}.add(str)
            } else {
                aMap[sortedStr] = mutableListOf(str)
            }
        }
        return aMap.values.toList()
    }
}
