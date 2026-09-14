class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        val map = mutableMapOf('}' to '{',']' to '[',')' to '(')
        for(ch in s){
            if(ch in listOf('[', '(', '{')){
                stack.addLast(ch)
            } else {
                if(stack.isNotEmpty()&& map[ch] == stack.last()) {
                    stack.removeLast()      
                } else return false
                
            }
        }

        return if(stack.isEmpty()) true else false
    }
}
