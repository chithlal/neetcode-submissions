class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        var res = IntArray(temperatures.size)
        val stack = ArrayDeque<Int>()

        for(i in temperatures.indices){

            while(stack.isNotEmpty() && temperatures[i] > temperatures[stack.last()]){

                val day = stack.removeLast()
                res[day] = i - day
            }
            stack.addLast(i)
        }
        return res
    }
}
