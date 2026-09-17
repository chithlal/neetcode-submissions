class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var i =  0
        var j = numbers.size - 1
        var res = IntArray(2){0}
        while( i < j){
            if(i > 0 && numbers[i] == numbers[i - 1]) i++

            val sum = numbers[i] + numbers[j]

            if(sum < target) {
                 i++
            } else if(sum > target){
                j--
            }
            else{
                res[0] = i + 1
                res[1] = j + 1
                break
            }
        }
        return res
    }
}
