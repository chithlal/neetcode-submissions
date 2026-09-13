class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val aMap = HashMap<String, MutableList<String>>() // aux space O(n)

        for(str in strs){ // O(n)
            val sortedStr = str.toCharArray().sorted().toString() //O(mlogm)
            aMap.getOrPut(sortedStr){mutableListOf()}.add(str)
        }
        return aMap.values.toList()
    }
}

//O(nxmlogm)
//O(n)
