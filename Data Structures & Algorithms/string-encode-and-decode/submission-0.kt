class Solution {

    fun encode(strs: List<String>): String {

        val delimiter: Char = '#'
        var output = StringBuilder()
        for(str in strs){
            output.append(str.length)
            output.append(delimiter)
            output.append(str)
        }
        return output.toString()

    }
    //5#hello5#world
    fun decode(str: String): List<String> {

        val result = mutableListOf<String>()
        var i =0
        while(i <str.length){
            var j = i
            while( str[j] != '#'){
                j++
            }

            val len = str.substring(i,j).toInt()
            val start = j+1
            val end = start+len
            result.add(str.substring(start,end))
            i=end
        }
        return result
    }
}
