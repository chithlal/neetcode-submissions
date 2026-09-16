class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var res = -1
        var l = 0
        var r = nums.size - 1

        while(l <= r){

            var mid = (l+r)/2
            if(nums[mid] == target){
                res = mid
                break
            }
            if(nums[l] <= nums[mid]){
                if(nums[l] <= target && target <= nums[mid]){
                    r = mid -1
                }
                else {
                    l = mid + 1
                }
            }
            else {
                if(nums[mid] <= target && target <= nums[r]){
                    l = mid + 1
                }
                else {
                    r = mid -1
                }
            }
        }

    return res
    }
}
