class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val arr = nums.sorted()
        val res = mutableListOf<List<Int>>()
        
        for(i in arr.indices){
            if(i>0 && arr[i] == arr[i-1] ) continue
            var j = i + 1
            var k = arr.size-1
            while(j < k){
                val sum = arr[i]+arr[j]+arr[k]
                if(sum<0){
                    j++
                }
                else if(sum >0){
                    k--
                }
                else if(sum == 0){
                    res.add(listOf(arr[i],arr[j], arr[k]))
                    j++
                    k--
                    while(j < k && arr[j] == arr[j-1]) j++
                    while(j < k && arr[k] == arr[k+1]) k--
                }
            }
        }
        return res
    }
}
