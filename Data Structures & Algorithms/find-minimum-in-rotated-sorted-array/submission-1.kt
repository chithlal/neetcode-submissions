class Solution {
    fun findMin(nums: IntArray): Int {
        var res = nums[0]
        var l = 0
        var r = nums.size - 1

        while(l <= r){

            if(nums[l] < nums[r]){
                res = minOf(res,nums[l])
                break;
            }
            var mid = l + (r - l) /2
            res = minOf(res, nums[mid])
            if(nums[mid] >= nums[l]) {
                l = mid + 1
            }
            else {
                r = mid - 1
            }
        }
        return res
    }
}
