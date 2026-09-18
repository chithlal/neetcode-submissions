class MinStack() {
    var stack = mutableListOf<Int>()
   
    var minArray = mutableListOf<Int>()
    


    init{
        stack = mutableListOf<Int>()
    }

    fun push(`val`: Int) {
        stack.add(`val`) 
        if(minArray.isEmpty()) minArray.add(`val`)
        else minArray.add( minOf(minArray.last() ?: 0,`val`))
    }

    fun pop() {
        if(stack!!.isNotEmpty()){
            stack.removeLast()
            minArray.removeLast()
        }
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return minArray.last()
    }
}
